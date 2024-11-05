plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33 // Sesuaikan dengan SDK yang Anda gunakan

    defaultConfig {
        applicationId = "com.example.yourapp" // Ganti dengan ID aplikasi Anda
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            // Anda bisa menambahkan konfigurasi untuk build debug di sini jika diperlukan
        }
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // AndroidX Libraries
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Material Design Components
    implementation("com.google.android.material:material:1.8.0")

    // Dependency untuk unit testing
    testImplementation("junit:junit:4.13.2") // Menambahkan JUnit untuk unit testing
}

// Repositori didefinisikan di build.gradle tingkat proyek
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
