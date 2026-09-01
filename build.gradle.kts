plugins {
    // 8.7.2 -> 9.0.1, matching phpnitro/phpnitro's own bump (Play Store's
    // API 36 target requirement, 31/08/2026 deadline) — AGP 8.9.x caps
    // out at compileSdk 35. No org.jetbrains.kotlin.android plugin: AGP
    // 9.0+ bundles Kotlin support directly ("built-in Kotlin") — applying
    // the separate plugin on top throws "Cannot add extension with name
    // 'kotlin', as there is an extension already registered with that
    // name" (confirmed against a real CI run in the monorepo). See
    // developer.android.com/build/migrate-to-built-in-kotlin.
    id("com.android.library") version "9.0.1" apply false
}
