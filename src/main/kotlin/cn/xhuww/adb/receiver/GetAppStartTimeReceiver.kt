package cn.xhuww.adb.receiver

import cn.xhuww.adb.ADB_MESSAGE_TITLE
import com.intellij.openapi.ui.Messages

class GetAppStartTimeReceiver : ADBReceiver() {
    override fun done(message: String) {
        val mainMessage = message.reader()
            .readLines()
            .filter { !it.startsWith("Starting: Intent") }
            .joinToString("\n")

        Messages.showDialog(
            mainMessage,
            ADB_MESSAGE_TITLE,
            arrayOf(Messages.CANCEL_BUTTON),
            0,
            Messages.getInformationIcon()
        )
    }
}