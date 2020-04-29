package cn.xhuww.adb.receiver

import cn.xhuww.adb.view.TopActivityMessageDialogWrapper

import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class GetTopActivityReceiver : ADBMessageReceiver() {
    override fun done(messageLines: List<String>) {
        val message = if (messageLines.isEmpty()) "No message" else messageLines.joinToString(separator = "")
        val array = message.split("/")
        if (array.size == 2) {
            val packageName = array[0].split(" ").last()
            val activityName = array[1].replace("}", "")
            TopActivityMessageDialogWrapper(packageName, activityName).show()
        } else {
            MessageDialog(message,
                    "ADB Message",
                    arrayOf(Messages.CANCEL_BUTTON),
                    0,
                    null
            ).show()
        }
    }
}