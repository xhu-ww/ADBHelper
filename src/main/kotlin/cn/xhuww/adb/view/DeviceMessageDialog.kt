package cn.xhuww.adb.view

import cn.xhuww.adb.TwoTextFieldMessageDialog
import com.android.ddmlib.IDevice
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.Action
import javax.swing.JComponent

class DeviceMessageDialog(private val device: IDevice) : DialogWrapper(true) {

    init {
        init()
    }

    override fun createCenterPanel(): JComponent? {
        return TwoTextFieldMessageDialog().apply {
            label1.text = "Device"
            label2.text = "Device ABIs"
            device.run {
                text1.text = "$name    $version    ${density}dpi"
                text2.text = abis.joinToString()
            }
        }.root
    }

    override fun createActions(): Array<Action> {
        val action = cancelAction.apply { putValue(DEFAULT_ACTION, true) }
        return arrayOf(action)
    }
}