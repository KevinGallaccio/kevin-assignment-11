# Assignment 11 Starter

To use this template:

- Click on the green `Use this template` button.

- Name your new project `Assignment11` or whatever convention you use to name your assignment projects.

- This will create a repository on github for your assignment. Clone this remote repository down to your local computer, as you would clone any other repository. Place it on your computer in the same folder as your other coderscampus assignments.

- Import into Eclipse or open with VSCode or IntelliJ as you would any other Spring boot maven project.

__You now have the starting code for Assignment 11. Follow instructions in the assignment definition to complete this project.__

## CAUTION!!!

This assignment currently has a bug - sorta.

All of the java packages are `com.codercampus...` instead of `com.coderscampus...` 

This is technically a valid package name, but it throws students off, because everything else in the bootcamp is `com.coderscampus...`

To keep yourself from spending hours wondering why your code is not working, please use `com.codercampus...` for your package name, rather than `com.coderscampus...`

## Troubleshooting

This project is entirely dependent upon a _binary_ file cleverly named `doNotTouch`. If this file is moved, renamed, or even changed, then `Transaction.java` will not work and the project will fail to run as intended.

You can always test this by running the unit test provided. If it fails to run green then the file may have been moved or renamed. This unit test will not fail, however, if you change the internals of this binary file.

The rest of this project should conform to your normal expectations for any Spring Boot web project.