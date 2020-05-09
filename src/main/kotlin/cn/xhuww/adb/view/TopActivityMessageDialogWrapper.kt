package cn.xhuww.adb.view

import cn.xhuww.adb.TopActivityMessageDialog
import cn.xhuww.adb.data.FragmentInfo
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.Action
import javax.swing.ImageIcon
import javax.swing.JComponent
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeCellRenderer
import javax.swing.tree.DefaultTreeModel

class TopActivityMessageDialogWrapper(
        private val packageName: String,
        private val activityName: String,
        private val fragmentInfos: ArrayList<FragmentInfo>?
) : DialogWrapper(true) {
    init {
        init()
    }

    private fun createTreeNode(
            parentNode: DefaultMutableTreeNode,
            fragmentInfo: FragmentInfo
    ) {
        val node = DefaultMutableTreeNode(fragmentInfo.name)
        for (childFragment in fragmentInfo.childFragment) {
            createTreeNode(node, childFragment)
        }
        parentNode.add(node)
    }

    override fun createCenterPanel(): JComponent? {
        val dialog = TopActivityMessageDialog()
        dialog.textPackageName.text = packageName
        dialog.textActivityName.text = activityName

        if (fragmentInfos?.isNotEmpty() == true) {
            val rootNode = DefaultMutableTreeNode(activityName)
            for (fragmentInfo in fragmentInfos) {
                createTreeNode(rootNode, fragmentInfo)
            }
            dialog.fragmentTree.apply {
                val render = cellRenderer as DefaultTreeCellRenderer
                render.closedIcon = ImageIcon("icons/ic_add.png")
                render.openIcon = ImageIcon("icons/ic_minus.png")
                model = DefaultTreeModel(rootNode)
            }
        } else {
            dialog.fragmentTree.isVisible = false
        }

        return dialog.root
    }

    override fun createActions(): Array<Action> {
        val action = cancelAction.apply { putValue(DEFAULT_ACTION, true) }
        return arrayOf(action)
    }
}
