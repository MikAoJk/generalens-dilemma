import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("application")
    kotlin("jvm") version "2.1.0"
}

group = "io.github.mikaojk"
version = "0.0.1"

repositories {
    mavenCentral()
}

application {
    mainClass.set("io.github.mikaojk.MainKt")
}


kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}