# OpenAPI

Generated Kotlin client for the XingZhi library HTTP API.

Coordinates: `com.xingzhi:api:1.1.0`

```kotlin
maven {
    url = uri("https://maven.pkg.github.com/OpenXingZhi/OpenAPI")
    credentials(PasswordCredentials::class)
}

implementation("com.xingzhi:api:1.1.0")
```

GitHub Packages requires a username and a token with `read:packages`
(`GitHubPackagesUsername` / `GitHubPackagesPassword`, or `GITHUB_ACTOR` /
`GITHUB_TOKEN`).

The package version defaults to `1.1.0`. Override it with `-Pversion=`.

## Code generation

`doc/swagger.yaml` is the OpenAPI document. The root project applies
`org.openapi.generator` 7.25.0:

- `openApiValidate` checks the spec.
- `openApiGenerate` writes a Kotlin JVM Retrofit client (coroutines,
  kotlinx.serialization) under `build/generated/openapi`.
  Packages are `com.xingzhi.robot.api` and `com.xingzhi.robot.model`.
- `:api:compileKotlin` and `:api:sourcesJar` depend on `openApiGenerate`.

```bash
./gradlew openApiValidate
./gradlew openApiGenerate
./gradlew :api:build
```

Java 17 is the Gradle toolchain. Published bytecode targets Java 11.
The jar also ships `proguard/api.pro` for the generated serializers.

## Publishing

This repository publishes through GitHub Actions
(`OpenXingZhi/AndroidCI/.github/workflows/gradle-library.yml`).

```bash
./gradlew build
./gradlew publishToMavenLocal
```

Tag releases as `v*.*.*` to publish `com.xingzhi:api` to GitHub Packages.
The tag (without the `v` prefix) must match the Gradle `version`.
