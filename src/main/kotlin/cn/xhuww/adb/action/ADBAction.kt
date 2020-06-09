package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.showErrorDialog
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

abstract class ADBAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.project?.run {
            val projectRunData = ProjectManager(this).getProjectRunData() ?: return
            actionPerformed(e, projectRunData)
        } ?: showErrorDialog("project is error")
    }

    abstract fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData)
}