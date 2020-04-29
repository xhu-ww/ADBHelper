package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import cn.xhuww.adb.receiver.GetTopActivityReceiver
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import java.util.concurrent.TimeUnit

class GetTopActivityAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        val device = ProjectManager(project).getConnectedDevice() ?: error("Currently no device is connected")
        try {
            val shell = "dumpsys window | grep mCurrentFocus"
            device.executeShellCommand(shell, GetTopActivityReceiver(), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
    }
}
