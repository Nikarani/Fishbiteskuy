pluginManagement {
    repositories {
        google() // Repositori untuk plugin Google
        mavenCentral() // Repositori Maven pusat
    }
}

dependencyResolutionManagement {
    repositories {
        google() // Repositori untuk library dari Google
        mavenCentral() // Repositori Maven pusat untuk library lainnya
    }
}

rootProject.name = "Fishbiteskuy" // Ganti dengan nama proyek Anda
include(":app") // Menyertakan modul aplikasi utama
