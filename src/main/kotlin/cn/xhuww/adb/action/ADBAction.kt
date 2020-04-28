package cn.xhuww.adb.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project

abstract class ADBAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        e.getData(PlatformDataKeys.PROJECT)?.let { actionPerformed(e, it) }
    }

    abstract fun actionPerformed(e: AnActionEvent, project: Project)
}