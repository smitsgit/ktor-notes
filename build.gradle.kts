val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.5.30"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("com.example.ApplicationKt")
}

repositories {
    mavenCentral()
    maven("https://kotlin.bintray.com/ktor")
    maven ("https://kotlin.bintray.com/kotlin-js-wrappers")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-websockets:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")


    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")

    implementation ("io.ktor:ktor-auth:$ktor_version")
    implementation ("io.ktor:ktor-gson:$ktor_version")
    implementation ("org.litote.kmongo:kmongo:4.0.2")
    implementation ("org.litote.kmongo:kmongo-coroutine:4.0.2")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation ("commons-codec:commons-codec:1.14")
    implementation ("io.ktor:ktor-network-tls:$ktor_version")
    implementation ("io.ktor:ktor-freemarker:$ktor_version")
}