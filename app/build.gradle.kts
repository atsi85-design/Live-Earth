plugins { id("com.android.application") }

android {
    namespace = "com.liveearth.ultimate"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.liveearth.ultimate"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
    buildTypes { release { isMinifyEnabled = false; proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") } }
}
