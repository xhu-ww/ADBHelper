package cn.xhuww.adb

import com.intellij.openapi.ui.Messages

const val ADB_MESSAGE_TITLE = "ADB Message"
const val ERROR_TITLE = "Error Message"

fun showErrorDialog(message: String) {
    Messages.showErrorDialog(message, ERROR_TITLE)
}