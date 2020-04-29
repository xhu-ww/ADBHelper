package cn.xhuww.adb.receiver

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class StartActivityReceiver(private val project: Project) : ADBMessageReceiver() {
    override fun done(message: String) {
        MessageDialog(
                project,
                message,
                "ADB信息",
                arrayOf(Messages.CANCEL_BUTTON),
                0, Messages.getInformationIcon(),
                true
        ).show()
    }
}