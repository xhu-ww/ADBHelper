package cn.xhuww.adb.receiver

import com.android.ddmlib.MultiLineReceiver

open class ADBMessageReceiver : MultiLineReceiver() {
    private var messageLines: MutableList<String> = ArrayList()
    override fun processNewLines(strings: Array<out String>) {
        messageLines.addAll(strings)
    }

    override fun isCancelled(): Boolean = false

    override fun done() {
        super.done()
        val message = if (messageLines.isEmpty()) "No message" else messageLines.joinToString(separator = "")
        done(message)
    }

    open fun done(message: String) {}
}
