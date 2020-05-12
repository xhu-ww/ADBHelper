package cn.xhuww.adb.data

data class FragmentInfo(
        val name: String,
        val childFragments: ArrayList<FragmentInfo>
) {
    var parentFragment: FragmentInfo? = null
}