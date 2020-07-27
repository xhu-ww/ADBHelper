package cn.xhuww.adb.view

import cn.xhuww.adb.TwoTextFieldMessageDialog
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.Action
import javax.swing.JComponent

class AppInfoDialog(
    private val packageName: String,
    private val versionInfo: String
) : DialogWrapper(true) {

    init {
        init()
    }

    override fun createCenterPanel(): JComponent? {
        return TwoTextFieldMessageDialog().apply {
            label1.text = "Package Name"
            label2.text = "Version Information"
            text1.text = packageName
            text2.text = versionInfo
        }.root
    }

    override fun createActions(): Array<Action> {
        val action = cancelAction.apply { putValue(DEFAULT_ACTION, true) }
        return arrayOf(action)
    }
}