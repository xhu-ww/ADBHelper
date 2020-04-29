package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import java.util.concurrent.TimeUnit

class GetTopActivityAndFragmentAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        val projectRunData = ProjectManager(project).getProjectRunData()
        val facet = projectRunData.facet
        val device = projectRunData.device
        val packageName = AndroidModuleModel.get(facet)?.applicationId ?: error("Could not get the package name")
        try {
            val shell = "dumpsys activity $packageName"
            device.executeShellCommand(shell, StartActivityReceiver(project), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
    }
}
