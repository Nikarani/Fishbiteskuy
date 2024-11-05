// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Mendeklarasikan plugin Android untuk aplikasi
    alias(libs.plugins.android.application) version "8.5.2" apply false // Sesuaikan dengan versi terbaru
    // Menambahkan plugin Kotlin untuk Android
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false // Perbarui versi sesuai kebutuhan
    // Menambahkan plugin Google Services untuk Firebase dan lainnya
    id("com.google.gms.google-services") version "4.4.2" apply false
}

allprojects {
    repositories {
        google() // Repositori untuk library dari Google
        mavenCentral() // Repositori Maven pusat untuk library lainnya
    }
}
