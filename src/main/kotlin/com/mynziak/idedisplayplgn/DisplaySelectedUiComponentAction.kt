package com.mynziak.idedisplayplgn

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.ui.Messages
import javax.swing.JComponent

class DisplaySelectedUiComponentAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        val project = e.getData(CommonDataKeys.PROJECT)
        val fileEditor = FileEditorManager.getInstance(project!!).getSelectedEditor()
        if (fileEditor != null) {
            // Get the focused component within the file editor:
            val focusedComponent = fileEditor.preferredFocusedComponent

            if (focusedComponent != null) {
                val uiInfo = extractUiComponentInfo(focusedComponent)
                Messages.showInfoMessage(uiInfo, "Selected UI Component Information")
            } else {
                Messages.showInfoMessage("No UI component found at the selected location.", "UI Component Information")
            }
        } else {
            Messages.showInfoMessage(
                "No editor is currently active.",
                "UI Component Information"
            )
        }
    }

    private fun extractUiComponentInfo(component: JComponent): String {
        val componentInfo = StringBuilder()
        componentInfo.append("Component class name: ${component.javaClass.name}\n")
        componentInfo.append("uiClassID: ${component.uiClassID}\n")
        componentInfo.append("TooltipText: ${component.toolTipText}\n")

        return componentInfo.toString()
    }
}

