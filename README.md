# phpnitro/android-engine

The [PhpNitro](https://github.com/phpnitro/phpnitro) framework's native render engine, compiled as a real Android library (AAR) — the Android-side equivalent of `phpnitro/ui` and friends on the PHP side. A project scaffolded with `phpx new` depends on this the way a Flutter project depends on the Flutter SDK: referenced, never copied into the project as source.

This repo is a read-only mirror, extracted from the main [phpnitro/phpnitro](https://github.com/phpnitro/phpnitro) monorepo (`android/engine/`) — contribute there, not here.

## What's in it

`PhpServer` (the embedded PHP interpreter), `NativeCanvasView` (the Canvas-based draw-command renderer — no WebView), `NativeRenderPocActivity` (the app's real entry point), `MainActivity`'s WebView fallback pipeline for the handful of not-yet-portable capabilities, device bridges (biometric, billing, geofencing, background tasks, NFC), and every native dependency (`libphp.so`, `libsqlite3.so`) the framework needs.

## Installation

Add JitPack and the dependency:

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        maven("https://jitpack.io")
    }
}
```

```kotlin
// app/build.gradle.kts
dependencies {
    implementation("com.github.phpnitro:android-engine:v1.4.0")
}
```

Your own `AndroidManifest.xml` references `com.phpnitro.engine.MainActivity` / `com.phpnitro.engine.NativeRenderPocActivity` by fully-qualified name — see [phpnitro/phpnitro](https://github.com/phpnitro/phpnitro)'s own `android/app/src/main/AndroidManifest.xml` for the reference shape (deep links, the dynamic-icon activity-alias, and capability-specific permissions all live in YOUR app's manifest, merged on top of this library's).
