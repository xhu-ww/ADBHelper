package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import cn.xhuww.adb.data.ProjectRunData
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

abstract class ADBAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: error("project is error")
        actionPerformed(e, ProjectManager(project).getProjectRunData())
    }

    abstract fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData)
}