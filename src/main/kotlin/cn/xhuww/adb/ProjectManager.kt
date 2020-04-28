package cn.xhuww.adb

import com.android.ddmlib.AndroidDebugBridge
import com.android.ddmlib.IDevice
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

    private val androidFacets: List<AndroidFacet> by lazy {
        AndroidUtils.getApplicationFacets(project)
    }

    fun bridgeIsReady(): Boolean = androidBridge?.let { it.isConnected && it.hasInitialDeviceList() } ?: false

    fun isGradleSyncInProgress(): Boolean {
        return try {
            GradleSyncState.getInstance(project).isSyncInProgress
        } catch (t: Throwable) {
            error("Couldn't determine if a gradle sync is in progress")
        }
    }

    fun getAndroidFacet(): AndroidFacet? {
        //TODO may need to add a selector
        return AndroidUtils.getApplicationFacets(project).firstOrNull()
    }

    fun getConnectedDevice(): IDevice? {
        if (connectedDevices.size > 1) {
            val facet = getAndroidFacet() ?: return null
            return DeviceSelectionUtils.chooseRunningDevice(facet, UsbDeviceFilter(), DeviceCount.SINGLE)?.firstOrNull()
        } else {
            return connectedDevices.firstOrNull()
        }
    }
}