package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.MessageReceiver
import cn.xhuww.adb.view.UrlSchemeInputDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class UrlSchemeTestAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val testUrlScheme: (urlScheme: String) -> Unit = {
            val urlScheme = if (!it.contains("://")) "https://$it" else it
            val shell = "am start -a android.intent.action.VIEW -d $urlScheme"
            projectRunData.device.executeShellCommand(shell, MessageReceiver())
        }

        UrlSchemeInputDialog(
            "Click the test button after entering the url scheme.",
            "URL Scheme Test",
            testUrlScheme
        ).show()
    }
}
