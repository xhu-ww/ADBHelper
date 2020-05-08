package cn.xhuww.adb.receiver

import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.messages.MessageDialog

class GetActivityFragmentsReceiver() : ADBMessageReceiver() {
    override fun done(message: String) {
        super.done(message)
        parsingMessage(message)


    }

    fun parsingMessage(log: String) {
        val list = getAddedFragments(log)
        val fragments = ArrayList<String>()
        val len = list.size - 1
        for (i in 0..len) {
            val startIndex = log.lastIndexOf(list[i])
            val endIndex = if (i == len) log.lastIndex else log.lastIndexOf(list[i + 1])
            if (startIndex == -1 || endIndex == -1 || startIndex >= endIndex) return
            val fragmentLog = log.substring(startIndex, endIndex)
            fragments.addAll(getAddedFragments(fragmentLog))
        }

        MessageDialog(fragments.joinToString { "\n" },
                "ADB Message",
                arrayOf(Messages.CANCEL_BUTTON),
                0,
                Messages.getInformationIcon()
        ).show()
    }

    private fun getAddedFragments(log: String): List<String> {
        val startIndex = log.lastIndexOf("Added Fragments:")
        val endIndex = log.lastIndexOf("FragmentManager misc state:")
        if (startIndex == -1 || endIndex == -1 || startIndex >= endIndex) return emptyList()

        val addedFragmentMessage = log.substring(startIndex, endIndex)
        val map = LinkedHashMap<String, String>()
        Regex("#[0-9]:.*")
                .findAll(addedFragmentMessage)
                .toList()
                .flatMap { matchResult: MatchResult -> matchResult.groupValues }
                .map {
                    val array = it.split(": ")
                    Pair(array.first(), it)
                }
                .forEach {
                    val key = it.first
                    if (!map.containsKey(key)) {
                        map[key] = it.second
                    }
                }
        return map.values.toList()
    }
}
