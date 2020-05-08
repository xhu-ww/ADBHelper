package cn.xhuww.adb.data

import com.android.ddmlib.IDevice
import com.intellij.openapi.project.Project
import org.jetbrains.android.facet.AndroidFacet

data class ProjectRunData(val project: Project, val facet: AndroidFacet, val device: IDevice)