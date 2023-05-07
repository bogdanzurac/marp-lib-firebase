plugins {
    alias(libs.plugins.marp.core)
    alias(libs.plugins.marp.koin)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.lib.flagging.firebase"
}

dependencies {
    implementation(libs.firebase.config)

    implementation(libs.marp.core)
}