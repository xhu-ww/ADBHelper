package cn.xhuww.adb.receiver

class GetTopActivityFragmentReceiver(val handleMessage: (message: String) -> Unit) : ADBMessageReceiver() {
    override fun done(message: String) {
        handleMessage(message)
    }
}
