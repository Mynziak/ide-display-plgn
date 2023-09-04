package com.mynziak.idedisplayplgn

import com.intellij.ide.plugins.PluginManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class DisplayKotlinVersion : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val kotlinPlugins = PluginManager.getPlugins().filter { it.pluginId.idString == "org.jetbrains.kotlin" }

        if (kotlinPlugins.isNotEmpty()) {
            val version = kotlinPlugins.first().version
            Messages.showInfoMessage("Installed Kotlin plugin version: $version", "Kotlin Plugin Version")
        } else {
            Messages.showWarningDialog("Kotlin plugin is not installed!", "Error")
        }
    }
}