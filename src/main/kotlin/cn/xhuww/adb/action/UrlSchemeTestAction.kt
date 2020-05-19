package cn.xhuww.adb.action

import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import cn.xhuww.adb.view.UrlSchemeInputDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class UrlSchemeTestAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {

        val testUrlScheme: (urlScheme: String?) -> Unit = {
            try {
                it ?: error("urlScheme is null")
                val shell = "am start -a android.intent.action.VIEW -d$it"
                projectRunData.device.executeShellCommand(shell, NormalADBReceiver(projectRunData.project))
            } catch (e: Exception) {
                error(e)
            }
        }

        UrlSchemeInputDialog("UrlSchemeTest", "UrlSchemeTest", testUrlScheme).show()
    }
}
