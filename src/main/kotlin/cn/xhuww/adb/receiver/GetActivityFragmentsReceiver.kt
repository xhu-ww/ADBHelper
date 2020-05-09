package cn.xhuww.adb.receiver

import cn.xhuww.adb.data.FragmentInfo

class GetActivityFragmentsReceiver(
        val messageReceiverDone: (fragmentInfos: ArrayList<FragmentInfo>?) -> Unit
) : ADBMessageReceiver() {
    override fun done(logLines: List<String>) {
        val fragmentLogs = ArrayList<String>()
        var hasFragments = false
        for (line in logLines) {
            if (hasFragments) {
                if (line.contains(Regex("#[0-9]:"))) fragmentLogs.add(line)
            } else {
                hasFragments = line.contains(Regex("Local FragmentActivity.*State:"))
            }
        }

        var lastSpaceNum = -1
        var currentLevel = -1
        val map = LinkedHashMap<Int, ArrayList<FragmentInfo>>()

        for (fragment in fragmentLogs.toSet()) {
            val spaceNum = getLeftSpaceNum(fragment)
            if (spaceNum > lastSpaceNum)
                currentLevel++
            else if (spaceNum < lastSpaceNum)
                currentLevel--

            val fragmentInfo = FragmentInfo(fragment, ArrayList())

            if (map.containsKey(currentLevel)) {
                map[currentLevel]?.add(fragmentInfo)
            } else {
                map[currentLevel] = arrayListOf(fragmentInfo)
            }
            if (currentLevel > 0) {
                map[currentLevel - 1]?.lastOrNull()?.childFragment?.add(fragmentInfo)
            }
            lastSpaceNum = spaceNum
        }
        messageReceiverDone(map[0])
    }

    private fun getLeftSpaceNum(string: String): Int {
        var spaceNum = 0
        val len = string.length
        for (i in 0..len) {
            if (string[i] == ' ') spaceNum++ else break
        }
        return spaceNum
    }
}
