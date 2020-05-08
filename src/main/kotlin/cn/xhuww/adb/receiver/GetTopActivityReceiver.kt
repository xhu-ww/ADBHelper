package cn.xhuww.adb.receiver

import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class GetTopActivityReceiver(
        val messageReceiverDone: (packageName: String, activityName: String) -> Unit
) : ADBMessageReceiver() {
    override fun done(message: String) {
        val array = message.split("/")
        if (array.size == 2) {
            val packageName = array[0].split(" ").last()
            val activityName = array[1].replace("}", "")
            messageReceiverDone(packageName, activityName)
        } else {
            MessageDialog(message,
                    "ADB Message",
                    arrayOf(Messages.CANCEL_BUTTON),
                    0,
                    Messages.getInformationIcon()
            ).show()
        }
    }
}
