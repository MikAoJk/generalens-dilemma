group = "io.github.mikaojk"
version = "1.0.0"

val junitJupiterVersion = "6.0.1"

plugins {
    kotlin("jvm") version "2.2.21"
    id("application")
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("io.github.mikaojk.MainKt")
}

kotlin {
    jvmToolchain(21)
}

dependencies {

    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks {
    withType<Test> {
        useJUnitPlatform {}
        testLogging {
            showStandardStreams = true
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }

}
