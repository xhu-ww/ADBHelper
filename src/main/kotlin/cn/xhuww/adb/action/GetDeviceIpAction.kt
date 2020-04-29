package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import cn.xhuww.adb.receiver.StartActivityReceiver
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern

class GetDeviceIpAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        val device = ProjectManager(project).getConnectedDevice() ?: error("Currently no device is connected")
        try {
            val shell = "ifconfig"
            device.executeShellCommand(shell, StartActivityReceiver(project), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
//        Pattern.compile("(?<=\\[(service\\.adb\\.tcp\\.port).: \\[)([^\\]]+)(?=\\])")
    }
}
