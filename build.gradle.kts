// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

val environmentFlavorDimension = "environment"
val productFlavorDimension = "product"

configure(subprojects) {
    plugins.withType<com.android.build.gradle.BasePlugin>().configureEach {
        extensions.findByType<com.android.build.gradle.BaseExtension>()?.apply {
            flavorDimensions(
                environmentFlavorDimension,
                productFlavorDimension,
            )

            productFlavors {
                create("dev") {
                    dimension = environmentFlavorDimension
                }

                create("rc") {
                    dimension = environmentFlavorDimension
                }

                create("prod") {
                    dimension = environmentFlavorDimension
                }

                create("product1") {
                    dimension = productFlavorDimension
                }

                create("product2") {
                    dimension = productFlavorDimension
                }
            }
        }
    }
}