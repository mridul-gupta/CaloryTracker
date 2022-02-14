object ProjectConfig {
    const val compileSdk = 31
    const val appId = "com.mg.calorytracker"
    const val minSdk = 21
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val gradle = "3.5.0"
    const val kotlin = "1.3.50"
    const val appcompat = "1.0.2"

    /* test */
    const val junit = "4.12"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
}

object Compose {
    const val composeVersion = "1.1.0-rc01"
    const val composeCompilerVersion = "1.1.0-rc02"
}