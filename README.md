## GdxLearningGame
An Android and Desktop game created as a prototype to help myself learn to use IntelliJ IDEA, the Android SDK, and libGDX.

### Contributing

1. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download), [Eclipse](https://www.eclipse.org/downloads/), [Android Studio](https://developer.android.com/studio), or any IDE of your choice 
2. (Optional) Install the [Android SDK](https://developer.android.com/studio/releases/sdk-tools) (if not already installed by your IDE)
3. Clone this repository `git clone https://github.com/qwertysam/GdxLearningGame.git`
4. Open it as a Gradle project, and sync Gradle to download all the dependencies

Now you can run this game!

#### When exporting as a JAR file

You may need to do the following
- Copy the files from `./GdxLearningGame/android/assets/` into the JAR archive
- In the JAR archive, edit `META-INF/MANIFEST.MF` and add the following line if it doesn't exist `Main-Class: net.qwertysam.desktop.DesktopLauncher`
