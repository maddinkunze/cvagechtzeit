plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 36

    defaultConfig {
        applicationId = "com.maddin.cvagechtzeit"
        minSdk = 21
        targetSdk = compileSdk
        versionCode = 11
        versionName = "2.2.0"
        multiDexEnabled = true

        vectorDrawables {
            useSupportLibrary = true
        }
        proguardFiles
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            multiDexKeepProguard = file("multidex-config.pro")
            resValue("string", "appVersion", "${defaultConfig.versionName}")
        }
        debug {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            multiDexKeepProguard = file("multidex-config.pro")
            resValue("string", "appVersion", "${defaultConfig.versionName}-debug")
        }
    }

    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    namespace = defaultConfig.applicationId
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra.get("kotlinVersion")}")
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("androidx.startup:startup-runtime:1.2.0")
    implementation(project(path=":echtzeyt"))
    implementation(project(path=":transportapi"))
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
}