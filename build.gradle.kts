plugins {
	java
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.kit"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.xerial:sqlite-jdbc:3.45.1.0")
	implementation("org.hibernate.orm:hibernate-community-dialects:6.4.4.Final")
	implementation("org.hibernate:hibernate-validator:8.0.1.Final")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	runtimeOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
