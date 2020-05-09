package cn.xhuww.adb.data

data class FragmentInfo(
        val name: String,
        val childFragment: ArrayList<FragmentInfo>
)