package cn.xhuww.adb.action

import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.receiver.StartActivityReceiver
import com.intellij.openapi.actionSystem.AnActionEvent

class GetDeviceIpAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val shell = "ifconfig"
        projectRunData.run {
            try {
                device.executeShellCommand(shell, StartActivityReceiver(project))
            } catch (e: Exception) {
                error(e)
            }
        }
    }
}
