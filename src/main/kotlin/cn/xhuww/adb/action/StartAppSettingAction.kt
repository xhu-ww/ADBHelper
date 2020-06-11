package cn.xhuww.adb.action


import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.GetTopActivityReceiver
import cn.xhuww.adb.receiver.MessageReceiver
import com.intellij.openapi.actionSystem.AnActionEvent

class StartAppSettingAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val device = projectRunData.device
        val receiver = GetTopActivityReceiver { packageName, _ ->
            //2. 启动App设置画面
            val shell = "am start -a android.settings.APPLICATION_DETAILS_SETTINGS -d package:${packageName}"
            device.executeShellCommand(shell, MessageReceiver())
        }

        //1. 获取当前App 包名
        val shell = "dumpsys window | grep mCurrentFocus"
        device.executeShellCommand(shell, receiver)
    }
}
