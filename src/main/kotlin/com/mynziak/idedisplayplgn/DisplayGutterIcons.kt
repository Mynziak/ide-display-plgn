package com.mynziak.idedisplayplgn

import com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerImpl

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.ui.Messages

class DisplayGutterIcons : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.getRequiredData(CommonDataKeys.PROJECT)
        val editor = e.getData(CommonDataKeys.EDITOR)
        val document = editor?.document

        // Display error if no project or no gutter-supported file is opened in the editor
        if (editor == null || document == null) {
            return Messages.showWarningDialog("Please open the file which supports Gutters!", "Error")
        }

        // Retrieve Gutter Icons information for the currently opened file
        val lineMarkers = DaemonCodeAnalyzerImpl.getLineMarkers(document, project)

        val gutterInfoList = lineMarkers.mapNotNull { lineMarker ->
            val lineNumber = editor.offsetToLogicalPosition(lineMarker.startOffset).line + 1

            // Extract Gutter Icon's name
            val iconName = lineMarker.icon?.toString()?.substringAfterLast("/")?.substringBeforeLast(".")
            iconName?.let { "Line $lineNumber: $it" }
        }

        if (gutterInfoList.isNotEmpty()) {
            val message = gutterInfoList.joinToString("\n")
            Messages.showInfoMessage(message, "Gutter Icons in currently opened file:")
        } else {
            Messages.showInfoMessage("Gutter Icons are absent in opened file!", "Gutter Icons")
        }
    }
}


