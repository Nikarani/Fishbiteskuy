plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    compileSdk = 34

    namespace = "com.example.fishbiteskuy"
    defaultConfig {
        applicationId = "com.example.fishbiteskuy"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // Menambahkan dukungan untuk vector drawable pada perangkat dengan API level di bawah 21
        vectorDrawables.useSupportLibrary = true
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
}

dependencies {
    // AndroidX Libraries
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Material Design Components
    implementation("com.google.android.material:material:1.8.0")

    // Dependency Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation(libs.ext.junit)
    implementation(libs.activity)

    // Dependency untuk unit testing
    testImplementation("junit:junit:4.13.2") // Menambahkan JUnit untuk unit testing
}


// Repositori didefinisikan di build.gradle tingkat proyek
