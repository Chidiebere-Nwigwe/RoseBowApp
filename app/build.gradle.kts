@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

plugins {
    id("com.android.application")  version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.gms.google-services")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android") version "2.38.1" apply false
    id("org.jetbrains.kotlin.kapt") version "1.8.0" apply false
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.kleine"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // Core + UI
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.fragment:fragment-ktx:1.4.1")

    // Navigation & Safe Args
    val navVersion = "2.4.1"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    // Firebase
    implementation("com.google.firebase:firebase-firestore:24.0.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.0.1")
    implementation("com.google.firebase:firebase-auth-ktx:21.0.1")
    implementation("com.google.firebase:firebase-storage")
    implementation("com.google.firebase:firebase-storage-ktx:20.0.0")
    implementation("com.google.firebase:firebase-common-ktx:20.0.0")
    implementation("com.google.firebase:firebase-messaging-ktx:23.0.0")
    implementation("com.firebaseui:firebase-ui-auth:4.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.38.1")
    kapt("com.google.dagger:hilt-compiler:2.38.1")

    // Google Play Services
    implementation("com.google.android.gms:play-services-auth:20.1.0")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.13.0")

    // UI Extras
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("br.com.simplepass:loading-button-android:2.2.0")
    implementation("com.github.ibrahimsn98:SmoothBottomBar:1.7.9")
    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")
    implementation("com.shuhart.stepview:stepview:1.5.1")

    // Intuit sdp/ssp
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    // Lifecycle
    implementation("android.arch.lifecycle:extensions:1.1.0")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
