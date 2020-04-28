package cn.xhuww.adb.receiver

import com.android.ddmlib.MultiLineReceiver
import com.google.common.base.Joiner
import com.google.common.base.Strings
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import java.util.ArrayList

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