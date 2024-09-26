// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10" apply false
}

buildscript {
    extra.apply{
        val koinVersion by extra("3.4.0")
        val ktorVersion by extra("2.3.4")
        val kotlinCoroutinesVersion by extra("1.6.4")
    }
}
