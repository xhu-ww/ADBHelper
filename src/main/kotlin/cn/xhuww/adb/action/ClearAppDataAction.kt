package cn.xhuww.adb.action

import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.receiver.NormalADBReceiver
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.intellij.openapi.actionSystem.AnActionEvent

class ClearAppDataAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        projectRunData.run {

            val packageName = AndroidModuleModel.get(facet)?.applicationId ?: error("Could not get the package name")
            try {
                val shell = "pm clear $packageName"
                device.executeShellCommand(shell, NormalADBReceiver(project))
            } catch (e: Exception) {
                error(e)
            }
        }
    }
}
