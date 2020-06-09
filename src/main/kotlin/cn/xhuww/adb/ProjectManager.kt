package cn.xhuww.adb

import com.android.ddmlib.AndroidDebugBridge
import com.android.ddmlib.IDevice
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.android.tools.idea.gradle.project.sync.GradleSyncState
import com.android.tools.idea.run.DeviceCount
import com.android.tools.idea.run.DeviceSelectionUtils
import com.android.tools.idea.run.TargetDeviceFilter.UsbDeviceFilter
import com.intellij.openapi.project.Project
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.android.sdk.AndroidSdkUtils
import org.jetbrains.android.util.AndroidUtils

class ProjectManager(private val project: Project) {
    private val androidBridge: AndroidDebugBridge? by lazy {
        AndroidSdkUtils.getDebugBridge(project)
    }

    private val connectedDevices: List<IDevice> by lazy {
        androidBridge?.devices?.asList() ?: emptyList()
    }

    private fun getAndroidFacet(): AndroidFacet? {
        return AndroidUtils.getApplicationFacets(project).firstOrNull()
    }

    private fun getConnectedDevice(): IDevice? {
        return if (connectedDevices.size > 1) {
            getAndroidFacet()?.let {
                DeviceSelectionUtils.chooseRunningDevice(it, UsbDeviceFilter(), DeviceCount.SINGLE)?.firstOrNull()
            }
        } else {
            connectedDevices.firstOrNull()
        }
    }

    fun getProjectRunData(): ProjectRunData? {
        if (GradleSyncState.getInstance(project).isSyncInProgress) {
            showErrorDialog("Gradle sync task is running,Please wait for it to finish")
            return null
        }

        val facet = getAndroidFacet()
        val device = getConnectedDevice()
        if (facet == null) {
            showErrorDialog("Project was not compiled successfully")
            return null
        }
        if (device == null) {
            showErrorDialog("No device connected")
            return null
        }
        return ProjectRunData(project, facet, device)
    }
}

data class ProjectRunData(
    val project: Project,
    val facet: AndroidFacet,
    val device: IDevice
) {
    var packageName: String? = null
        get() = AndroidModuleModel.get(facet)?.applicationId
        private set
}
