package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import cn.xhuww.adb.showErrorDialog
import com.android.tools.idea.run.activity.DefaultActivityLocator
import com.intellij.openapi.actionSystem.AnActionEvent

class GetAppStartTimeAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        projectRunData.run {
            if (packageName == null) {
                showErrorDialog("Unable to get package name")
                return
            }
            val defaultActivity = DefaultActivityLocator(facet).getQualifiedActivityName(device)
            val shell = "am start -W $packageName/$defaultActivity"
            device.executeShellCommand(shell, NormalADBReceiver(project))
        }
    }
}
