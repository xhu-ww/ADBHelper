package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import cn.xhuww.adb.data.ProjectRunData
import cn.xhuww.adb.showErrorDialog
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

abstract class ADBAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.project?.run {
            actionPerformed(e, ProjectManager(this).getProjectRunData())
        } ?: showErrorDialog("project is error")
    }

    abstract fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData)
}