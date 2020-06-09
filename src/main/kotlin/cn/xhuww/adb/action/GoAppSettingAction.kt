package cn.xhuww.adb.action


import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import cn.xhuww.adb.showErrorDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class GoAppSettingAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        projectRunData.run {
            if (packageName == null) {
                showErrorDialog("Unable to get package name")
                return
            }
            val shell = "am start -a android.settings.APPLICATION_DETAILS_SETTINGS -d package:${packageName}"
            device.executeShellCommand(shell, NormalADBReceiver(projectRunData.project))
        }
    }
}
