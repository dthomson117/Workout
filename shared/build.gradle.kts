plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.sqlDelight)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    task("testClasses")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.colors.core)
            implementation(libs.kotlinx.datetime)
            implementation(libs.uuid)
            implementation(libs.koin)
            implementation(libs.androidx.lifecycle.viewmodel.ktx)
            implementation(libs.kotlinx.coroutines)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.koin.test)
        }
    }

    sourceSets.androidMain.dependencies {
        implementation(libs.android.driver)
        implementation(libs.koin.android)
        implementation(libs.koin.androidx.workmanager)
        implementation(libs.koin.androidx.compose)
        implementation(libs.androidx.core.splashscreen)
    }

    // or iosMain, windowsMain, etc.
    sourceSets.nativeMain.dependencies {
        implementation(libs.native.driver)
    }

    sourceSets.jvmMain.dependencies {
        implementation(libs.sqlite.driver)
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
            packageName.set("com.workout")
            generateAsync.set(true)
        }
    }
}
