package cn.xhuww.adb

import cn.xhuww.adb.receiver.StartActivityReceiver
import com.android.tools.idea.gradle.project.model.AndroidModuleModel

import com.android.tools.idea.run.activity.DefaultActivityLocator
import com.intellij.openapi.project.Project
import java.util.concurrent.TimeUnit

object ADB {
    fun startActivity(project: Project, runDebug: Boolean = false) {
        val projectManager = ProjectManager(project)

        if (projectManager.isGradleSyncInProgress()) return
        val facet = projectManager.getAndroidFacet() ?: return
        val device = projectManager.getConnectedDevice() ?: return
        val packageName = AndroidModuleModel.get(facet)?.applicationId ?: return
        try {
            val activityName = DefaultActivityLocator(facet).getQualifiedActivityName(device)
            val shell = ShellCommand.startAppAndWaitComplete(packageName, activityName)
            device.executeShellCommand(shell, StartActivityReceiver(project), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
    }

    fun getDeviceIp(project: Project) {
        val projectManager = ProjectManager(project)
        val device = projectManager.getConnectedDevice() ?: return
        try {
            device.executeShellCommand("ifconfig", StartActivityReceiver(project), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
    }
}

object ShellCommand {

    fun startAppAndWaitComplete(packageName: String, activityName: String) = "am start -W $packageName/$activityName"

    fun startActivity(
            packageName: String,
            activityName: String,
            runDebug: Boolean = false
    ): String {
        val debug = if (runDebug) "-D " else ""
        return "am start $debug $packageName/$activityName"
    }
}