package cn.xhuww.adb.receiver

import com.android.ddmlib.MultiLineReceiver

open class ADBMessageReceiver : MultiLineReceiver() {
    private var logLines: MutableList<String> = ArrayList()
    override fun processNewLines(strings: Array<out String>) {
        logLines.addAll(strings)
    }

    override fun isCancelled(): Boolean = false

    override fun done() {
        super.done()
        done(logLines)
        val log = if (logLines.isEmpty()) "No message" else logLines.joinToString(separator = "\n")
        done(log)
    }

    open fun done(logLines: List<String>) {}

    open fun done(log: String) {}
}
