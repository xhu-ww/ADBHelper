package cn.xhuww.adb.action

import cn.xhuww.adb.ProjectManager
import com.android.ddmlib.MultiLineReceiver
import com.android.tools.idea.gradle.project.model.AndroidModuleModel
import com.android.tools.idea.run.activity.DefaultActivityLocator
import com.google.common.base.Joiner
import com.google.common.base.Strings
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import java.util.ArrayList
import java.util.concurrent.TimeUnit

class GetAppStartTimeAction : ADBAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        val projectRunData = ProjectManager(project).getProjectRunData()
        val facet = projectRunData.facet
        val device = projectRunData.device
        val packageName = AndroidModuleModel.get(facet)?.applicationId ?: error("Could not get the package name")
        try {
            val activityName = DefaultActivityLocator(facet).getQualifiedActivityName(device)
            val shell = "am start -W $packageName/$activityName"
            device.executeShellCommand(shell, StartActivityReceiver(project), 10, TimeUnit.SECONDS)
        } catch (e: Exception) {
            error(e)
        }
    }
}

class StartActivityReceiver(private val project: Project) : MultiLineReceiver() {
    var message = "Nothing Received"
    var currentLines: MutableList<String?> = ArrayList()
    override fun processNewLines(strings: Array<String>) {
        for (s in strings) {
            if (!Strings.isNullOrEmpty(s)) {
                currentLines.add(s)
            }
        }
        message = Joiner.on("\n").join(currentLines)
    }

    override fun isCancelled(): Boolean {
        return false
    }

    override fun done() {
        super.done()
        Messages.showMessageDialog(project,
                message,
                "ADB信息",
                Messages.getQuestionIcon()
        )
    }
}