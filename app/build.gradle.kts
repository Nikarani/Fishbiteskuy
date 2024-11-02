plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services") // Google Services Plugin
}

android {
    compileSdk = 34 // Versi SDK yang sesuai

    namespace = "com.example.fishbiteskuy" // Namespace

    defaultConfig {
        applicationId = "com.example.fishbiteskuy" // ID aplikasi Anda
        minSdk = 21 // Versi minimum
        targetSdk = 34 // Versi target
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false // ProGuard atau R8 jika diperlukan
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // AndroidX Libraries
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1") // Ganti dengan versi terbaru jika perlu
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0") // Ganti dengan versi terbaru jika perlu

    // Material Design Components
    implementation("com.google.android.material:material:1.8.0") // Ganti dengan versi terbaru jika perlu

    // Dependency Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}
