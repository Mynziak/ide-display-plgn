package com.mynziak.idedisplayplgn

import com.intellij.ide.plugins.PluginManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class DisplayVersion : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val kotlinPlugins = PluginManager.getPlugins().filter { it.pluginId.idString == "org.jetbrains.kotlin" }

        if (kotlinPlugins.isNotEmpty()) {
            val kotlinPlugin = kotlinPlugins.first()
            val version = kotlinPlugin.version ?: "Not installed!"
            Messages.showInfoMessage("Installed Kotlin plugin version: $version", "Kotlin Plugin Version")
        } else {
            Messages.showInfoMessage("Kotlin plugin is not installed!", "Kotlin Plugin Version")
        }
    }
}