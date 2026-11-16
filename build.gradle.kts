import org.openapitools.generator.gradle.plugin.extensions.OpenApiGeneratorGenerateExtension
import org.openapitools.generator.gradle.plugin.extensions.OpenApiGeneratorValidateExtension

plugins {
    id("org.openapi.generator") version "7.25.0"
    kotlin("jvm") version "2.4.0" apply false
    kotlin("plugin.serialization") version "2.4.0" apply false
}

group = "com.xingzhi"
version = providers.gradleProperty("version").orElse("1.1.0").get()

// https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin
// https://openapi-generator.tech/docs/generators
configure<OpenApiGeneratorValidateExtension> {
    inputSpec.set(layout.projectDirectory.file("doc/swagger.yaml"))
}

configure<OpenApiGeneratorGenerateExtension> {
    generatorName.set("kotlin")
    inputSpec.set(layout.projectDirectory.file("doc/swagger.yaml"))
    outputDir.set(layout.buildDirectory.dir("generated/openapi"))
    groupId.set(project.group.toString())
    id.set("api")
    version.set(project.version.toString())
    packageName.set("com.xingzhi.robot")
    apiPackage.set("com.xingzhi.robot.api")
    modelPackage.set("com.xingzhi.robot.model")
    generateApiDocumentation.set(false)
    generateModelDocumentation.set(false)
    generateApiTests.set(false)
    generateModelTests.set(false)
    configOptions.set(
        mapOf(
            "library" to "jvm-retrofit2",
            "useCoroutines" to "true",
            "serializationLibrary" to "kotlinx_serialization",
            "dateLibrary" to "threetenbp-localdatetime",
            "omitGradleWrapper" to "true",
            "useSettingsGradle" to "true",
        ),
    )
}

tasks.named("openApiGenerate") {
    dependsOn("openApiValidate")
}
