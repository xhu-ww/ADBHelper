package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectRunData
import cn.xhuww.adb.view.DeviceMessageDialog
import com.intellij.openapi.actionSystem.AnActionEvent

class GetDeviceInfoAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, projectRunData: ProjectRunData) {
        DeviceMessageDialog(projectRunData.device).show()
    }
}
