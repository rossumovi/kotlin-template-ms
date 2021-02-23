dependencies {
    testImplementation(project(":app"))
    testImplementation(project(":client"))
    testImplementation(project(":common"))
    testImplementation(project(":domain"))

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.mock-server:mockserver-netty:5.15.0")
    testImplementation("org.mock-server:mockserver-client-java:5.15.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mock-server:mockserver-junit-jupiter:5.15.0")
    runtimeOnly("com.h2database:h2")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}