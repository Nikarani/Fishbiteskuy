plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 34 // Ganti dengan versi SDK yang sesuai

    namespace = "com.example.fishbiteskuy" // Namespace

    defaultConfig {
        applicationId = "com.example.fishbiteskuy" // ID aplikasi Anda
        minSdk = 21 // Versi minimum
        targetSdk = 34 // Versi target
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false // Gunakan ProGuard atau R8 jika diperlukan
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.google.firebase:firebase-auth-ktx:24.3.1") // Firebase Authentication
    implementation("com.google.firebase:firebase-firestore-ktx:24.3.1") // Firebase Firestore
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // ConstraintLayout
    implementation("com.google.gms:google-services:4.3.15")
    implementation(libs.appcompat)
    implementation(libs.firebase.auth) // Google Services
}

// Pastikan untuk menambahkan Google Services ke dalam file build.gradle proyek (root) Anda
// classpath("com.google.gms:google-services:4.3.15")
