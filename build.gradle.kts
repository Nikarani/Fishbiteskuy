// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Apply the Android application plugin
    alias(libs.plugins.android.application) apply false
    // Apply the Kotlin plugin
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false // Ganti dengan versi terbaru
    // Apply the Google Services plugin
    id("com.google.gms.google-services") version "4.4.2" apply false
}

allprojects {
    repositories {
        google() // Repositori untuk library dari Google
        mavenCentral() // Repositori Maven pusat untuk library lainnya
    }
}
