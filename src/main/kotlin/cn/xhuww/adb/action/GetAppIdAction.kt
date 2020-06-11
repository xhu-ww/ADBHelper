package cn.xhuww.adb.action

import cn.xhuww.adb.ADB_MESSAGE_TITLE
import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.GetTopActivityReceiver
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class GetAppIdAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val receiver = GetTopActivityReceiver { packageName, _ ->
            Messages.showDialog(
                packageName,
                ADB_MESSAGE_TITLE,
                arrayOf(Messages.CANCEL_BUTTON),
                0,
                Messages.getInformationIcon()
            )
        }

        val shell = "dumpsys window | grep mCurrentFocus"
        projectRunData.device.executeShellCommand(shell, receiver)
    }
}
