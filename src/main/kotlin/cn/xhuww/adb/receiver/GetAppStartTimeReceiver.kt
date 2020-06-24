package cn.xhuww.adb.receiver

import cn.xhuww.adb.view.AppStartTimeMessageDialog

class GetAppStartTimeReceiver : ADBReceiver() {
    override fun done(message: String) {
        var activityName = ""
        var time = ""

        message.reader()
            .readLines()
            .forEach {
                if (it.startsWith("Activity:")) {
                    activityName = it.split(": ").last()
                } else if (it.startsWith("TotalTime:")) {
                    time = it.split(": ").last() + " ms"
                }
            }

        AppStartTimeMessageDialog(activityName, time).show()
    }
}