package cn.xhuww.adb.action

import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import cn.xhuww.adb.showErrorDialog
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.intellij.openapi.actionSystem.AnActionEvent

class ClearAppDataAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        projectRunData.run {
            AndroidModuleModel.get(facet)?.applicationId?.run {
                try {
                    val shell = "pm clear $this"
                    device.executeShellCommand(shell, NormalADBReceiver(project))
                } catch (e: Exception) {
                    error(e)
                }
            } ?: showErrorDialog("Unable to get package name")
        }
    }
}
