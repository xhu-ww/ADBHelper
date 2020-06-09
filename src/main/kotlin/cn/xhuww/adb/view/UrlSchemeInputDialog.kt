package cn.xhuww.adb.view

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.openapi.ui.Messages
import javax.swing.Action

class UrlSchemeInputDialog(
    message: String?, title: String?,
    val performTest: (urlScheme: String) -> Unit
) : Messages.InputDialog(message, title, null, null, null) {
    override fun createActions(): Array<Action> {
        val action = okAction.apply {
            setOKButtonText("Test")
            putValue(DialogWrapper.DEFAULT_ACTION, true)
        }
        return arrayOf(action)
    }

    override fun doOKAction() {
        val urlScheme = myField.text?.trim() ?: return
        performTest(urlScheme)
    }
}
