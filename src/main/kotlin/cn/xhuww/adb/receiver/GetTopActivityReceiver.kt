package cn.xhuww.adb.receiver

import cn.xhuww.adb.ADB_MESSAGE_TITLE
import com.intellij.openapi.ui.Messages

class GetTopActivityReceiver(
    val messageReceiverDone: (packageName: String, activityName: String) -> Unit
) : ADBReceiver() {
    override fun done(message: String) {
        val array = message.split("/")
        if (array.size == 2) {
            val packageName = array[0].split(" ").last()
            val activityName = array[1].replace("}", "")
            messageReceiverDone(packageName, activityName)
        } else {
            Messages.showDialog(
                message,
                ADB_MESSAGE_TITLE,
                arrayOf(Messages.CANCEL_BUTTON),
                0,
                Messages.getInformationIcon()
            )
        }
    }
}
