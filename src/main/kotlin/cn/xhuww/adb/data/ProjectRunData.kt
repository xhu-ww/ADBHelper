package cn.xhuww.adb.data

import com.android.ddmlib.IDevice
import org.jetbrains.android.facet.AndroidFacet

data class ProjectRunData(val facet: AndroidFacet, val device: IDevice)