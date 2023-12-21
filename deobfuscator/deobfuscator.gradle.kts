/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    id("com.github.hauner.jarTest") version "1.0.1"
}

val deobjars: Configuration = configurations.create("deobjars")

configurations {
    testImplementation.get().extendsFrom(deobjars)
}

dependencies {
    deobjars(group = "net.runelite.rs", name = "vanilla", version = ProjectVersions.rsversion.toString())
    deobjars(project(":runescape-client"))

    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    implementation(project(":runelite-api"))
    implementation(project(":runescape-api"))
    implementation(project(":cache"))
    implementation(group = "org.jetbrains", name = "annotations", version = "22.0.0")
    implementation(group = "org.ow2.asm", name = "asm", version = "9.0")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "9.0")
    implementation(group = "net.runelite", name = "fernflower", version = "07082019")
    implementation(group = "com.google.code.gson", name = "gson", version = "2.8.6")
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
    implementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.32")
    implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.2.9")

    testImplementation(group = "junit", name = "junit", version = "4.12")
    testImplementation(group = "org.mockito", name = "mockito-core", version = "3.1.0")
}

tasks {
    test {
        exclude("**/*")
    }

    val tokens = mapOf(
            "rs.version" to ProjectVersions.rsversion.toString(),
            "vanilla.jar" to deobjars.find { it.name.startsWith("vanilla") }.toString().replace("\\", "/"),
            "rs.client" to deobjars.find { it.name.startsWith("runescape-client") }.toString().replace("\\", "/")
    )

    processResources {
        inputs.properties(tokens)

        filesMatching("deob.properties") {
            filter(ReplaceTokens::class, "tokens" to tokens)
            filteringCharset = "UTF-8"
        }
    }

    processTestResources {
        inputs.properties(tokens)

        filesMatching("deob-test.properties") {
            filter(ReplaceTokens::class, "tokens" to tokens)
            filteringCharset = "UTF-8"
        }
    }

    // TODO: Enable assertions on all 3
    register<JavaExec>("Downloader\$main()") {
        group = "gamepack"

        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("net.runelite.gamepack.Downloader")
    }

    register<JavaExec>("Deob\$main()") {
        group = "gamepack"

        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("net.runelite.deob.Deob")
        args = listOf(
            "${System.getProperty("user.home")}/gamepack/gamepack.jar",
            "$buildDir/libs/deobfuscated-$version.jar"
        )
    }

    register<JavaExec>("UpdateMappings\$main()") {
        group = "gamepack"

        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("net.runelite.deob.updater.UpdateMappings")
        args = listOf(
            "${buildDir.toString().replace("deobfuscator", "runescape-client")}/libs/runescape-client-$version.jar",
            "$buildDir/libs/deobfuscated-$version.jar",
            "$buildDir/libs/updated-$version.jar"
        )
    }

    // Run with --args
    // Path is relative to package root
    register<JavaExec>("ClientVersion\$main()") {
        group = "gamepack"

        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("net.runelite.deob.clientver.ClientVersionMain")
    }
}

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        register("asd", MavenPublication::class) {
            from(components["java"])
        }
    }
}