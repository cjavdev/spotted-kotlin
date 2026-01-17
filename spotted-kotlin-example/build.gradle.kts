plugins {
    id("spotted.kotlin")
    application
}

dependencies {
    implementation(project(":spotted-kotlin-core"))
    implementation(project(":spotted-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :spotted-kotlin-example:run` to run `Main`
    // Use `./gradlew :spotted-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "dev.cjav.spotted.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
