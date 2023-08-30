package com.mynziak.idedisplayplgn

import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.extensions.PluginId
import com.intellij.openapi.ui.Messages

class DisplayVersion : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val kotlinPlugin = PluginManagerCore.getPlugin(PluginId.getId("org.jetbrains.kotlin"))
        val version = kotlinPlugin?.version ?: "Not installed"
        Messages.showInfoMessage("Installed Kotlin plugin version: $version", "Kotlin Plugin Version")
    }
}