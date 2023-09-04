package com.mynziak.idedisplayplgn

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ui.Messages
import com.intellij.xdebugger.XDebuggerManager
import com.intellij.xdebugger.breakpoints.XLineBreakpoint

class DisplayBreakpoints : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.getRequiredData(CommonDataKeys.PROJECT)
        val debuggerManager = XDebuggerManager.getInstance(project)

        // Collect All breakpoints:
        val breakpoints = debuggerManager.breakpointManager.allBreakpoints.toList()
        val validBreakpoints = breakpoints.filterIsInstance<XLineBreakpoint<*>>()

        if (validBreakpoints.isNotEmpty()) {
            Messages.showInfoMessage(breakpointsMessage(validBreakpoints), "Breakpoints:")
        } else {
            Messages.showInfoMessage("No breakpoints set in the project.", "Breakpoints:")
        }
    }

    private fun breakpointsMessage(breakpoints: List<XLineBreakpoint<*>>): String {
        return breakpoints.joinToString("\n") { breakpoint ->
            "File: ${breakpoint.shortFilePath}, Line ${breakpoint.line + 1} : ${breakpoint.type}"
        }
    }
}



