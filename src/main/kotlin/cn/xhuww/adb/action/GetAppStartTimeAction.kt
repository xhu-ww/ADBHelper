package cn.xhuww.adb.action

import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import cn.xhuww.adb.showErrorDialog
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.android.tools.idea.run.activity.DefaultActivityLocator
import com.intellij.openapi.actionSystem.AnActionEvent

class GetAppStartTimeAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        projectRunData.run {
            AndroidModuleModel.get(facet)?.applicationId?.run {
                try {
                    val activityName = DefaultActivityLocator(facet).getQualifiedActivityName(device)
                    val shell = "am start -W $this/$activityName"
                    device.executeShellCommand(shell, NormalADBReceiver(project))
                } catch (e: Exception) {
                    error(e)
                }
            } ?: showErrorDialog("Unable to get package name")
        }
    }
}
