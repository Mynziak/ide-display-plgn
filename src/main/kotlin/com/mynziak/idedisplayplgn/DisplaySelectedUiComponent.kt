package com.mynziak.idedisplayplgn

import com.intellij.openapi.actionSystem.*

import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.ui.Messages


class DisplaySelectedUiComponent : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return showErrorMessage("Please open a project!")
        val fileEditorManager = FileEditorManager.getInstance(project)

        val guiEditor =
            fileEditorManager.selectedEditor ?: return showErrorMessage("Open a file with UI components in editor!")

        val contentPane = guiEditor.preferredFocusedComponent?.rootPane?.contentPane

        if (contentPane != null) {
            Messages.showInfoMessage("Selected UI Component: $contentPane", "UI Component Info")
        } else {
            showErrorMessage("UI Component is not selected!")
        }
    }

    private fun showErrorMessage(message: String) {
        Messages.showWarningDialog(message, "Error")
    }
}
