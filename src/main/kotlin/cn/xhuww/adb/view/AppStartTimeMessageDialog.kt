package cn.xhuww.adb.view

import cn.xhuww.adb.TwoTextFieldMessageDialog
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.Action
import javax.swing.JComponent

class AppStartTimeMessageDialog(
    private val activityName: String,
    private val time: String
) : DialogWrapper(true) {
    init {
        init()
    }

    override fun createCenterPanel(): JComponent? {
        return TwoTextFieldMessageDialog().apply {
            label1.text = "Activity Name"
            label2.text = "Total Time"
            text1.text = activityName
            text2.text = time
        }.root
    }

    override fun createActions(): Array<Action> {
        val action = cancelAction.apply { putValue(DEFAULT_ACTION, true) }
        return arrayOf(action)
    }
}