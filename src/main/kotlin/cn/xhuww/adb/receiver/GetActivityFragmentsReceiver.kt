package cn.xhuww.adb.receiver

import cn.xhuww.adb.data.FragmentInfo
import com.jetbrains.rd.util.firstOrNull

class GetActivityFragmentsReceiver(
        val messageReceiverDone: (fragmentInfos: ArrayList<FragmentInfo>?) -> Unit
) : ADBMessageReceiver() {
    override fun done(log: String) {
        val list = ArrayList<String>()
        var hasFragments = false
        log.reader().readLines().forEach {
            if (hasFragments) {
                if (it.contains(Regex("#[0-9]:"))) list.add(it)
            } else {
                hasFragments = it.contains(Regex("Local FragmentActivity.*State:"))
            }
        }

        // To get rid of duplicate content
        val map = LinkedHashMap<Int, ArrayList<Pair<String, FragmentInfo>>>()

        val firstLog = list.first()
        val pair = getFragmentName(firstLog)
        var lastSpace = getLeftSpaceNum(firstLog)
        var lastFragment = FragmentInfo(pair.second, ArrayList())
        map[lastSpace] = arrayListOf(Pair(pair.first, lastFragment))

        for (i in 1..list.lastIndex) {
            val log = list[i]
            val space = getLeftSpaceNum(log)
            val logPair = getFragmentName(log)
            val fragment = FragmentInfo(logPair.second, ArrayList())
            if (map.containsKey(space)) {
                map[space]?.add(Pair(logPair.first, fragment))
            } else {
                map[space] = arrayListOf(fragment)
            }

            when {
                space > lastSpace -> {
                    fragment.parentFragment = lastFragment
                    lastFragment.childFragments.add(fragment)
                }
                space < lastSpace -> {
                    map[space]?.lastOrNull()?.second?.parentFragment?.childFragments?.add(fragment)
                }
                else -> {
                    lastFragment.parentFragment?.childFragments?.add(fragment)
                }
            }
            lastSpace = space
            lastFragment = fragment
        }

        messageReceiverDone(map.firstOrNull()?.value)
    }

    private fun getLeftSpaceNum(string: String): Int {
        var spaceNum = 0
        val len = string.length
        for (i in 0..len) {
            if (string[i] == ' ') spaceNum++ else break
        }
        return spaceNum
    }

    /**
     * first is number
     * second is name
     */
    private fun getFragmentName(log: String): Pair<String, String> {
        val array = log.split(": ")
        return Pair(array.first(), array.last())
    }
}
