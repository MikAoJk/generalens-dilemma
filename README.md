# generalens-dilemma


## Technologies used
* JDK 21
* Kotlin
* Gradle

## Getting started

### Prerequisites
Make sure you have the Java JDK 21 installed
You can check which version you have installed using this command:
``` bash
java -version
```

### Running the application locally

#### Run with gradle
To run the application, you can simply use this gradle command
``` bash
./gradlew run
```
or on windows `gradlew.bat run`

### Run in your favoritt IDE(Intellij)
Go to src/main/kotlin/io/github/mikaojk/Main.kt and run the main method

### Upgrading the gradle wrapper
Find the newest version of gradle here: https://gradle.org/releases/ Then run this command:
(Remeber to repealce $gradleVersjon with newest version)
```shell script
./gradlew wrapper --gradle-version $gradleVersjon
```