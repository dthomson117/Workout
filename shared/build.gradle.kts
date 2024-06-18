plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("app.cash.sqldelight") version "2.0.1"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation("com.chrynan.colors:colors-core:1.1.0")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
            implementation("com.benasher44:uuid:0.8.4")
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }

    sourceSets.androidMain.dependencies {
        implementation("app.cash.sqldelight:android-driver:2.0.1")
    }

    // or iosMain, windowsMain, etc.
    sourceSets.nativeMain.dependencies {
        implementation("app.cash.sqldelight:native-driver:2.0.1")
    }

    sourceSets.jvmMain.dependencies {
        implementation("app.cash.sqldelight:sqlite-driver:2.0.1")
    }
}

android {
    namespace = "com.workout"
    compileSdk = 34
    defaultConfig {
        minSdk = 26
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

sqldelight {
    databases {
        create("AppDatabase") {
            packageName.set("com.data")
        }
    }
}
