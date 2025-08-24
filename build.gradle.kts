plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinxSerialization) apply false
    alias(libs.plugins.kmpNativeCoroutines) apply false
    alias(libs.plugins.ksp) apply false

    // ✅ Apply SonarQube plugin here (without `apply false`)
    alias(libs.plugins.sonarqube)
}

sonarqube {
    properties {
        property("sonar.projectKey", "kmp-sq_project")
        property("sonar.organization", "kmp-sq")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.language", "kotlin") // ✅ Add this for KMP projects
        property("sonar.sources", "src")    // ✅ Define sources if needed
    }
}
