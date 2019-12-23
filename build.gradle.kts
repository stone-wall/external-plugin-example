buildscript {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    java
    kotlin("jvm") version "1.3.61"
}

group = "dev.openosrs"
version = "0.0.1"

repositories {
    mavenCentral()
    jcenter()
    mavenLocal()
    maven( "https://dl.bintray.com/oprs/")
}

dependencies {
    annotationProcessor("org.pf4j:pf4j:3.2.0")
    annotationProcessor("org.projectlombok:lombok:1.18.10")
    implementation("com.google.inject:guice:4.0")
    api("org.pf4j:pf4j:3.2.0")
    api("org.projectlombok:lombok:1.18.10")
    implementation("open-osrs:runelite-api:1.5.44")
    implementation("open-osrs:runelite-client:1.5.44")
    implementation("org.slf4j:slf4j-api:1.7.29")
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
