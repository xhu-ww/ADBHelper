package cn.xhuww.adb.data

data class FragmentInfo(
        val number: String,
        val name: String,
        val childFragments: ArrayList<FragmentInfo>
) {
    var parentFragment: FragmentInfo? = null

    fun addChildFragment(fragmentInfo: FragmentInfo) {
        val contain = childFragments.any { it.number == fragmentInfo.number }
        if (!contain) childFragments.add(fragmentInfo)
    }
}