package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.MessageReceiver
import cn.xhuww.adb.view.UrlSchemeInputDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class UrlSchemeTestAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val testUrlScheme: (urlScheme: String) -> Unit = {
            val shell = "am start -a android.intent.action.VIEW -d $it"
            projectRunData.device.executeShellCommand(shell, MessageReceiver(projectRunData.project))
        }

        UrlSchemeInputDialog(
            "Click the test button after entering the url scheme.",
            "URL Scheme Test",
            testUrlScheme
        ).show()
    }
}
