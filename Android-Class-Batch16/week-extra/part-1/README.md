# Week Extra Part 1 - Coding Style

## Assignment

1. Implement [ktlint](https://ktlint.github.io/) in STYLiSH.

    We use the officially recommended plugin option for the project

    [**jlleitschuh/ktlint-gradle**](https://github.com/JLLeitschuh/ktlint-gradle) Gradle plugin that automatically creates check and format tasks for project Kotlin sources, supports different kotlin plugins and Gradle build caching.

    - Step 1: `build.gradle` of Project
    ```
      buildscript {
          ext {
              version_ktlint = '10.2.0'
          }

          repositories {
              mavenCentral()
              maven {
                  url "https://plugins.gradle.org/m2/"
              }
          }

          dependencies {
              classpath("org.jlleitschuh.gradle:ktlint-gradle:$version_ktlint")
          }
      }

      allprojects {
          repositories {
              google()
              mavenCentral()
          }
      }
    ```
    - Step 2: `build.gradle` of Module
    ```
      plugins {
          id("org.jlleitschuh.gradle.ktlint")
      }

      ktlint {
          android.set(true)
          outputColorName.set("RED")
      }
    ```
    - Step 3: Open terminal in Android Studio and running `./gradlew ktlintFormat`

2. Optimize your Coding Style.
