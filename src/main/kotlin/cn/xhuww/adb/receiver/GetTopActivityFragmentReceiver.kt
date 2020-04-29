package cn.xhuww.adb.receiver

import com.android.ddmlib.MultiLineReceiver

class GetTopActivityFragmentReceiver(done: (messageLines: List<String>) -> Unit) : MultiLineReceiver() {

    override fun processNewLines(p0: Array<out String>?) {

    }

    override fun isCancelled(): Boolean = false

    override fun done() {
        done()
    }
}