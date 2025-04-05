plugins {
    id("java")
    id("org.springframework.boot") version "3.4.4"
}
apply(plugin = "io.spring.dependency-management")

group = "com.lipanre.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven {
        url = uri("https://maven.aliyun.com/repository/public/")
    }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}