plugins {
    // Apply the Kotlin JVM plugin for building JVM applications
    kotlin("jvm") version "1.9.23" // Use a compatible Kotlin version
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // Standard Kotlin library for JDK 8+
    testImplementation("org.jetbrains.kotlin:kotlin-test") // Kotlin testing library
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit") // JUnit integration for Kotlin tests
}

tasks.withType<Wrapper> {
    // Configure the Gradle Wrapper to ensure consistent builds
    gradleVersion = "9.0" // Use a compatible Gradle version
    distributionType = Wrapper.DistributionType.BIN
}