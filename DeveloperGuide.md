

# Introduction #

The page aims to detail how to start developing in the Open Imperium Galactica project.

# Setting up the development environment #

## Hardware requirements ##

  * 64 bit CPU/operating system and at least 4GB RAM recommended.

## Main software requirements ##

Download and install the latest [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (JDK), version 7 or later, from Oracle. 64 bit recommended

Download and install the latest [Eclipse Integrated Development Environment](http://eclipse.org/downloads/) (IDE), version 4.4 as of now. The standard **Eclipse IDE for Java Developers** version is enough. 64 bit recommended.

## Eclipse plugins ##

You'll need a plugin to interact with the SVN of the project. I recommend using the [Subclipse plugin](http://subclipse.tigris.org/servlets/ProjectProcess?pageID=p4wYuA), version 1.8 (I had trouble with newer versions). If you are using the 64 bit, install the plugin with the SVNKit because the JavaHL has many limitations.

The [Eclipse-CS](http://eclipse-cs.sourceforge.net/downloads.html) plugin is required to ensure the coding style in the project.

## SVN checkout ##

Checkout the project from http://open-ig.googlecode.com/svn/trunk/open-ig into your workspace. You should now see the `src`, `audio`, `data` and other directories in the project.

To add the game videos, create a new directory named `video` in the project root. Download all open-ig-video named files from the project's [download page](https://code.google.com/p/open-ig/downloads/list) or better yet, install the game by the usual means into some directory by using the Launcher. Extract the zip files into the new `video` directory. You should see the `en`, `hu`, `generic`, etc. subdirectories.

## Activating Checkstyle ##

For the development, the style checking plugin needs to be setup and activated. To do so, right click on the project name in the project view, and chose **Properties**.

Locate the **Checkstyle** entry and on the right, chose **Local Checkstyle Configurations** tab. Here, click on **New...**, chose **Project relative configuration** from **Type:** dropdown, give it a name and click on **Browse...** and locate the `checkstyle.xml` inside the project root folder. Click **OK** buttons until you get back to the project properties dialog.

Now chose the main **Main** tab of the Checkstyle settings, and from the **Simple - ...** dropdown box, chose the name you specified before.

Click **OK** again, right click on the project root and chose **Checkstyle** > **Activate Checkstyle**.

## Running and debugging the game ##

The game's main entry point is the `hu.openig.Startup` class. Using **Debug as Java application** won't work properly unless you specify some JVM and application parameters.

First, run the class `hu.openig.Startup` and you should see the main menu pop up. Quit, then, select **Debug configurations...** from the debug icon's dropdown menu. Locate the **Java Application** node and a **Startup** below that which was just created.

On the right, switch to **Arguments** and enter `-memonce` into the **Program arguments** text field, and enter `-Xmx1G` into the **VM** arguments.

Now if you set a breakpoint in `Startup.main`, you should get the application stop there.

Note that the current requirements for the game is to run with **768MB** Java memory. When doing code changes while debugging the game, that amount is usually inadequate, thus the 1GB. Generally, if you do developments that increase the memory consumption of the game, you should always test the game with the **-Xmx768M** settings.

# Points of interest #

This is a simple list of where things can be found in the source code. I'll omit the package names here. The `CTRL+SHIFT+T` in Eclipse lets you find the classes easily.

| **Purpose** | **Classes** |
|:------------|:------------|
| Game settings. | Configuration |
| Main entry point. | Startup |
| The game's main window. | GameWindow |
| Main rendering surface. | GameWindow.ScreenRenderer |
| General UI images and sound. | CommonResources, `*`GFX |
| Game main object | World |
| Interesting game world objects | Player, Planet, Fleet, InventoryItem, ResearchType |
| Game model objects | BuildingModel, PlanetSurface, BattleModel |
| Battle objects | SpacewarStructure, GroundwarUnit, GroundwarGun |
| Statusbar | StatusbarScreen |
| Various screens | `*`Screen |
| Drawing text | TextRenderer |
| User interface | UIComponent, UIContainer, UIMouse, ScreenBase |
| General keyboard management | GameKeyManager |
| Game mechanics | Simulator, !Radar |
| AI | AI, AITrader, AIPirate, AIUser, `*`Planner |
| Main campaign scripts | Mission`*` |