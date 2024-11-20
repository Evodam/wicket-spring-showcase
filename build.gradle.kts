plugins {
    kotlin("jvm") version "2.0.0"
}

group = "de.evodam.playground"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val wicketVersion by extra("10.0.0")

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.4")

    implementation("com.giffing.wicket.spring.boot.starter:wicket-spring-boot-starter:4.0.0")
    implementation("org.apache.wicket", "wicket-core", wicketVersion)
    implementation("org.apache.wicket", "wicket-tester", wicketVersion)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

// add
sourceSets {
    main {
        java {
            srcDir("src/main/kotlin")
        }
// Is needed to detect the html files
        resources {
            srcDir("src/main/kotlin")
        }
    }

    test {
        java {
            srcDir("src/main/kotlin")
        }
        resources {
            srcDir("src/main/kotlin")
        }
    }
}
