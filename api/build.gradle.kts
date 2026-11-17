import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    `java-library`
    `maven-publish`
}

group = rootProject.group
version = rootProject.version

val generatedSrc = rootProject.layout.buildDirectory.dir("generated/openapi/src/main/kotlin")

kotlin {
    jvmToolchain(17)
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
        javaParameters.set(true)
    }
    sourceSets.named("main") {
        kotlin.srcDir(generatedSrc)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
    withJavadocJar()
}

val generateClient = rootProject.tasks.named("openApiGenerate")
tasks.withType<KotlinCompile>().configureEach {
    dependsOn(generateClient)
}
tasks.named("sourcesJar") {
    dependsOn(generateClient)
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
    api("com.squareup.retrofit2:retrofit:3.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.4.0")
    implementation("com.squareup.retrofit2:converter-kotlinx-serialization:3.0.0")
    implementation("com.squareup.retrofit2:converter-scalars:3.0.0")
}

tasks.jar {
    metaInf {
        from(layout.projectDirectory.file("proguard-rules.pro"))
        into("proguard/")
        rename("proguard-rules.pro", "api.pro")
    }
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/OpenXingZhi/OpenAPI")
            credentials {
                username = providers.gradleProperty("GitHubPackagesUsername")
                    .orElse(providers.environmentVariable("GITHUB_ACTOR"))
                    .getOrElse("")
                password = providers.gradleProperty("GitHubPackagesPassword")
                    .orElse(providers.environmentVariable("GITHUB_TOKEN"))
                    .getOrElse("")
            }
        }
    }
    publications {
        create<MavenPublication>("library") {
            artifactId = "api"
            from(components["java"])
        }
    }
}
