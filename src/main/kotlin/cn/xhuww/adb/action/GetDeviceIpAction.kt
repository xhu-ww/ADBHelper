package cn.xhuww.adb.action

import cn.xhuww.adb.ADB
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project

class GetDeviceIpAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        ADB.getDeviceIp(project)
    }
}