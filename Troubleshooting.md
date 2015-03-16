

# Linux #

## Missing resources ##

Even if you installed the game via the Launcher, sometimes the game doesn't recognize its files. The reasons for that are unknown at the moment, but you might check the following things:

  * The game has read access to all of its files
  * The game can create files and directories under its directory
  * You run the game from its directory (i.e., the working directory)

## Audio and/or game hangs ##

Several bugs exist in OpenJDK (6, 7) audio subsystem: PulseAudio.

Possible resolutions:

  * Update to the latest JDK version available
  * Switch to JDK 7 if not already done
  * Uninstall OpenJDK and Oracle JDK completely. Then reinstall just one
  * Use Oracle JDK.
  * Try running the game from command line with the `padsp` prefix: `padsp java -Xmx768M -jar open-ig-NNNN.jar -memonce`.
  * Alternatively, try running the game from command line with the `aoss` prefix: `aoss java -Xmx768M -jar open-ig-NNNN.jar -memonce`.
  * Try the workarounds from [this blog](http://www.realitysend.com/kirbj/devlog/linuxsound).

# Mac #

## Audio and/or game hangs ##

Either the Java or the operating system has some issues with its audio subsystem and even the standard tutorial and example programs coming with the Java distribution might hang as well.

Possible resolutions:

  * Use Oracle Java 7 (only 64 bit is available)

## Slow cutscenes/videos ##

This appears to be a known deficiency in Java 7 and 8 and most likely there won't be a fix for this Java bug.

Possible resolutions:

  * Use Oracle Java 9 (beta/early access) as it doesn't seem to suffer from this problem anymore.

# Windows #

## Flickering of desktop when run on fullscreen ##

Some players reported that when switching to fullscreen, the game starts flickering and the desktop appears underneath it. This might or might not relate to laptops with hybrid graphics; the exact reasons are unknown at the moment.

  * **Windows 7+**: press CTRL+ALT+DEL then click the Cancel button or press ESC.
  * If the machine has a hybrid graphics card settings, make sure java.exe and javaw.exe are associated with the discrete, high performance card. If doesn't work, associate it with the integrated, low performance card.
  * **Windows 7**: disable Aero.
  * Make sure no always-on-screen window is obstructing the game view.
  * Update graphics drivers if possible.

## Crash due to unsupported format ##

Sometimes, pretty standard WAV files won't play on Windows (XP). This can be attributed to either out-of-date drivers or corrupted install. You may want to:

  * Reinstall or update your sound card drivers.
  * Reinstall or repair your [DirectX](http://www.microsoft.com/en-us/download/details.aspx?id=35).
  * Change the hardware acceleration level for your sound card.

## JAR files won't run on double click ##
Rarely, file associations get corrupted, usually by a compression software which associates itself with JAR; or software uninstalling unrelated associations. You can attempt to fix this by:

  * uninstalling all java JRE and JDK, then installing them again, but higher versions first (i.e., Java 8u25 then 7u72)
  * use a tool called [JarFixer](http://johann.loefflmann.net/en/software/jarfix/index.html), but read first about the options to avoid wrong version associations.