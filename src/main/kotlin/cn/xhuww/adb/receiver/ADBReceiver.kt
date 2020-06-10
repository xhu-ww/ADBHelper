package cn.xhuww.adb.receiver

import com.android.ddmlib.IShellOutputReceiver
import com.google.common.base.Charsets

open class ADBReceiver : IShellOutputReceiver {
    private val stringBuffer = StringBuilder()

    override fun addOutput(data: ByteArray, offset: Int, length: Int) {
        val s = String(data, offset, length, Charsets.UTF_8)
        stringBuffer.append(s)
    }

    override fun flush() {
        done(stringBuffer.toString())
    }

    override fun isCancelled(): Boolean = false

    open fun done(message: String) {}
}
