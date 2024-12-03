plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "io.cursedfunction"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5")
}

kotlin {
    jvmToolchain(17)
}
