plugins {
    kotlin("jvm") version "2.1.21"
    application
}

group = "io.cursedfunction"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.4.0")
}

kotlin {
    jvmToolchain(17)
}
