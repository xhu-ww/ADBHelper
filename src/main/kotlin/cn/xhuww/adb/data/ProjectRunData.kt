package cn.xhuww.adb.data

import com.android.ddmlib.IDevice
import org.jetbrains.android.facet.AndroidFacet

data class ProjectRunData(
    val device: IDevice,
    val facet: AndroidFacet,
    val packageName: String
)