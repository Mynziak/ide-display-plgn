package com.mynziak.idedisplayplgn

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ui.Messages


class DisplaySelectedUIComponentAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val componentUi = e.getData(CommonDataKeys.EDITOR)?.component?.ui
        if (componentUi != null) {
            "Selected UI Component: ${componentUi}"
        } else {
            "No UI Component is currently selected."
        }
        Messages.showMessageDialog(componentUi.toString(), "Selected UI Component", null)
    }
}