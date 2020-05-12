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

    override fun createCenterPanel(): JComponent? {
        val dialog = TopActivityMessageDialog()
        dialog.textPackageName.text = packageName
        dialog.textActivityName.text = activityName

        if (fragmentInfos?.isNotEmpty() == true) {
            val rootNode = DefaultMutableTreeNode(activityName)

            fragmentInfos.forEach { rootNode.add(getChildNode(it)) }
            dialog.fragmentTree.apply {
                val render = cellRenderer as DefaultTreeCellRenderer
                render.closedIcon = ImageIcon("icons/ic_add.png")
                render.openIcon = ImageIcon("icons/ic_minus.png")
                model = DefaultTreeModel(rootNode)
            }

            dialog.fragmentTree.model = DefaultTreeModel(rootNode)
        } else {
            dialog.fragmentTree.isVisible = false
        }

        return dialog.root
    }

    override fun createActions(): Array<Action> {
        val action = cancelAction.apply { putValue(DEFAULT_ACTION, true) }
        return arrayOf(action)
    }

    private fun getChildNode(fragment: FragmentInfo): DefaultMutableTreeNode {
        val node = DefaultMutableTreeNode(fragment.name)
        for (childFragment in fragment.childFragments) {
            val childNode = getChildNode(childFragment)
            node.add(childNode)
        }
        return node
    }
}
