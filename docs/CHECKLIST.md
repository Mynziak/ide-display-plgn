# Plugin Functionality Validation Checklist

### Common Checks for All Actions

- [ ] Verify that all actions are accessible from the `Tools` dropdown menu.
- [ ] Confirm that clicking on the implemented actions from the `Tools` dropdown menu opens a dialog box.
- [ ] Verify that the actions in the `Tools` dropdown menu are ordered as follows:
     1. Display Kotlin plugin version.
     2. Display Gutter Icons.
     3. Display UI Component Info.
     4. Display Breakpoints.

### Action 1: Display the Installed Version of the Kotlin Plugin

- [ ] Verify that `Display Kotlin plugin version.` action opens a dialog box that displays the installed version of the Kotlin plugin.
- [ ] Verify that `Display Kotlin plugin version.`action opens a dialog box with an Error message: `Kotlin plugin is not installed!` for project without installed Kotlin Plugin.
- [ ] Verify that `Display Kotlin plugin version.`action displays the installed version of the Kotlin plugin when no specific file is opened.

### Action 2: Display Gutter Icons

- [ ] Verify that `Display Gutter Icons` action in the Tools dropdown menu displays the line number and the type of each gutter icon in the opened file.
- [ ] Confirm that the list of gutter icons in the dialog matches the icons in the opened file, even when parts of the code are collapsed (gutters are not visible).
- [ ] Verify that the plugin collects all types of gutter icons for different types of classes and files (e.g., Java and Kotlin).
- [ ] Confirm that the list of gutter icons displayed in the `Display Gutter Icons` dialog is updated when gutter icons are added or removed within the currently opened file.
- [ ] Don't open any class in the editor and check if an error message is displayed for the `Display Gutter Icons` action.
- [ ] Verify that an appropriate message is displayed when there are no gutter icons present in the currently opened file.
- [ ] Confirm that an error message is displayed for the `Display Gutter Icons` action on a file that doesn't support gutter icons (e.g., .md or .form).

### Action 3: Display UI Component Info

- [ ] Verify that `Display UI Component Info` action displays information about the currently selected UI component.
- [ ] Confirm that the displayed information is relevant to the selected UI component.
- [ ] Verify that an error message is displayed for the `Display UI Component Info` action when no UI component is selected.
- [ ] Verify that an error message is displayed for the `Display UI Component Info` action when no file is opened.
- [ ] Verify that an error message is displayed for the `Display UI Component Info` action when the opened file does not support UI components (e.g., a non-GUI class/.form file).
- [ ] Verify that the `Display UI Component Info` action handles multiple selected UI components.

### Action 4: Display Breakpoints

- [ ] Verify that `Display Breakpoints` action opens a dialog box displaying a list of all breakpoints in opened project, including class name, line number, and breakpoint type.
- [ ] Verify that the `Display Breakpoints` action displays all breakpoints in the entire project when no specific file is opened.
- [ ] Verify that the `Display Breakpoints` action handles scenarios where no breakpoints are set, displaying a message `No breakpoints set in the project.`
- [ ] Confirm that the list of breakpoints displayed in the `Display Breakpoints` dialog is updated when breakpoints are added or removed within the current project.