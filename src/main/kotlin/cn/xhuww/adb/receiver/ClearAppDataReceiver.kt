package cn.xhuww.adb.receiver

import cn.xhuww.adb.ADB_MESSAGE_TITLE
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class ClearAppDataReceiver(
    private val project: Project,
    private val packageName: String?
) : ADBReceiver() {
    override fun done(message: String) {
        MessageDialog(
            project,
            "Clear $packageName Data $message",
            ADB_MESSAGE_TITLE,
            arrayOf(Messages.CANCEL_BUTTON),
            0, Messages.getInformationIcon(),
            true
        ).show()
    }
}
