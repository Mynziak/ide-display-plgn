package com.mynziak.idedisplayplgn

import com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerImpl

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.ui.Messages

class DisplayGutterIcons : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getRequiredData(CommonDataKeys.EDITOR)
        val document = editor.document
        val project = e.getRequiredData(CommonDataKeys.PROJECT)

        val editorGutter = editor.gutter //TODO: It contains all gutters (including breakpoints) in myLineToGutterRenderers

        val lineMarkers = DaemonCodeAnalyzerImpl.getLineMarkers(document, project)
        val iconNames = lineMarkers.mapNotNull { lineMarker ->
            lineMarker.icon?.toString()?.substringAfterLast("/")?.substringBeforeLast(".") // Extract icon name
        }

        if (iconNames.isNotEmpty()) {
            val message = iconNames.joinToString("\n")
            Messages.showInfoMessage(message, "Gutter Icons in currently opened file:")
        } else {
            Messages.showInfoMessage("Gutter Icons are absent in opened file!", "Gutter Icons")
        }
    }
}



