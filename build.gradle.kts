buildscript {
  repositories {
    google()
    maven("https://plugins.gradle.org/m2/")
  }
}

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.compose.compiler) apply false
  alias(libs.plugins.android.test) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  alias(libs.plugins.ksp) apply false
  alias(libs.plugins.hilt) apply false
  alias(libs.plugins.google.secrets) apply false
  alias(libs.plugins.baseline.profile) apply false
  alias(libs.plugins.spotless) apply false
}
