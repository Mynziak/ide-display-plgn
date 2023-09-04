# Custom Intellij IDEA Plugin 

## Description
This custom IntelliJ IDEA plugin is developed for version 2023.2 using the Kotlin programming language. The plugin provides three distinct actions accessible from the `Tools` dropdown menu to display various information within the IDE.

## Implemented Actions
- [ ] Action 1: Click on `Display Kotlin plugin version` in the `Tools` menu and verify the displayed Kotlin plugin version.

- [ ] Action 2: Open a file with Gutter Icons, click on `Display Gutter Icons` in the `Tools` menu, and ensure that all Gutter Icons present in the file are displayed.

- [ ] Action 3: Select a UI Component within the editor, click on `Display UI Component Info` in the `Tools` menu, and confirm that relevant information about the selected UI Component is shown.

- [ ] Action 4: Click on `Display Breakpoints` in the `Tools` menu and verify that the displayed list of all breakpoints in the currently opened project.

## Installation and Usage

To install and test this plugin:

1. Clone or download this repository to your local machine.
2. Make sure you have [IntelliJ IDEA](https://www.jetbrains.com/idea/) version 2023.2 or later installed.
3. The plugin requires Java SDK 17 for compilation and execution.
4. Verify plugin compatibility by following the steps outlined in the [Verifying Plugin Compatibility](https://plugins.jetbrains.com/docs/intellij/verifying-plugin-compatibility.html) guide. This ensures that the plugin is compatible with your IntelliJ IDEA version.
5. Open and build the project in IntelliJ IDEA.
6. Run the plugin by going to `Gradle` -> `Run Configurations` -> `Run Plugin`. This will open a new instance of IntelliJ IDEA.

### Setting Up Sample Project

- In the new IntelliJ IDEA instance with the loaded plugin, create or open a project.

### Action 1: Display Installed Kotlin Plugin Version

1. Open any project.
2. Go to `Tools` > `Display Kotlin plugin version`.
3. Popup will show the installed Kotlin plugin version.

### Action 2: Display Gutter Icons

1. Open the file which contains Gutter Icons like `run` or `overriding methods`.
2. Go to `Tools` > `Display Gutter Icons`.
3. Popup will show the list of the gutter icon names in the file.

### Action 3: Display UI Component Info

1. Open the file which contains UI components.
2. Select any UI component in the editor (e.g., checkbox, button).
3. Go to `Tools` > `Display UI Component Info`.
4. A dialog will show its class name, `uiClassID`, and tooltip.

### Action 4: Display Breakpoints

1. Open any project with files that have breakpoints set.
2. Go to `Tools` > `Display Breakpoints`.
3. A dialog will show a list of all breakpoints in the currently opened project.

## Checklist for Validating Plugin Functionality
Refer to the [CHECKLIST.md](docs/CHECKLIST.md) for detailed test scenarios.



#### Useful Information
For guidance on plugin development for IntelliJ IDEA, refer to the official documentation at [IntelliJ IDEA Plugin Development Documentation](https://plugins.jetbrains.com/docs/intellij/welcome.html).

Additionally, explore the classes `AnActionEvent`, `CommonDataKeys`, `PluginManager`, `FileEditorManager`, `DaemonCodeAnalyzerImpl`, `XDebuggerManager` to understand and utilize the provided tools for your development process.
