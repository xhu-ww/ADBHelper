package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.receiver.ADBReceiver
import cn.xhuww.adb.receiver.GetTopActivityReceiver
import cn.xhuww.adb.view.AppInfoDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class GetAppInfoAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        val receiver = GetTopActivityReceiver { packageName, _ ->
            var versionName = ""
            val versionNameShell = "dumpsys package $packageName | grep versionName"
            val versionCodeShell = "dumpsys package $packageName | grep versionCode"

            val versionCodeReceiver = object : ADBReceiver() {
                override fun done(message: String) {
                    super.done(message)
                    val version = "${versionName.trim()}  ${message.trim()}"
                    AppInfoDialog(packageName, version).show()
                }
            }

            val versionNameReceiver = object : ADBReceiver() {
                override fun done(message: String) {
                    super.done(message)
                    versionName = message
                    projectRunData.device.executeShellCommand(versionCodeShell, versionCodeReceiver)
                }
            }
            projectRunData.device.executeShellCommand(versionNameShell, versionNameReceiver)
        }

        val shell = "dumpsys window | grep mCurrentFocus"
        projectRunData.device.executeShellCommand(shell, receiver)
    }
}
