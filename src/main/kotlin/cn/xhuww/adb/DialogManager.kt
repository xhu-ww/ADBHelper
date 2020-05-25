package cn.xhuww.adb

import com.intellij.openapi.ui.Messages

fun showErrorDialog(message: String, throwsException: Boolean = false) {
    Messages.showErrorDialog(message, "Error Tip")
    if (throwsException) {
        error(message)
    }
}