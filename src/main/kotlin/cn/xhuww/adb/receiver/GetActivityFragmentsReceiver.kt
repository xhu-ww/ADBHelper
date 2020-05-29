package cn.xhuww.adb.receiver

class GetActivityFragmentsReceiver(val messageReceiverDone: (fragmentMessage: String) -> Unit) : ADBMessageReceiver() {
    override fun done(log: String) {
        val list = ArrayList<String>()
        val map = LinkedHashMap<String, String>()

        log.split(Regex("Local FragmentActivity.*State:"))
                .lastOrNull()?.run {
                    var lastSpace = -1
                    var addFragment = false
                    reader().readLines()
                            .filter { it.contains(Regex(" {2}#[0-9]:")) || it.contains("Added Fragments:") }
                            .forEach {
                                val space = getLeftSpaceNum(it)
                                if (it.contains("Added Fragments:")) {
                                    if (addFragment) map.clear()
                                    addFragment = true
                                }
                                if (space < lastSpace && !it.contains("Added Fragments:")) {
                                    addFragment = false
                                }
                                if (addFragment) {
                                    val key = it.split(": ").first()
                                    if (!map.containsKey(key)) {
                                        map[key] = it
                                        list.add(it)
                                    }
                                } else {
                                    map.clear()
                                }
                                lastSpace = space
                            }
                }

        messageReceiverDone(list.joinToString("\n"))
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
