package cn.xhuww.adb.receiver

import cn.xhuww.adb.ADB_MESSAGE_TITLE
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class GetTopActivityReceiver(
    val messageReceiverDone: (packageName: String, activityName: String) -> Unit
) : ADBReceiver() {
    override fun done(log: String) {
        val array = log.split("/")
        if (array.size == 2) {
            val packageName = array[0].split(" ").last()
            val activityName = array[1].replace("}", "")
            messageReceiverDone(packageName, activityName)
        } else {
            MessageDialog(
                log,
                ADB_MESSAGE_TITLE,
                arrayOf(Messages.CANCEL_BUTTON),
                0,
                Messages.getInformationIcon()
            ).show()
        }
    }
}
