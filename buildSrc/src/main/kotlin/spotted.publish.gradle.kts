import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Spotify Web API with fixes and improvements from sonallux")
        description.set("You can use Spotify's Web API to discover music and podcasts, manage your\nSpotify library, control audio playback, and much more. Browse our available Web\nAPI endpoints using the sidebar at left, or via the navigation bar on top of\nthis page on smaller screens.\n\nIn order to make successful Web API requests your app will need a valid access\ntoken. One can be obtained through\n<a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth\n2.0</a>.\n\nThe base URI for all Web API requests is `https://api.spotify.com/v1`.\n\nNeed help? See our\n<a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API\nguides</a> for more information, or visit the\n<a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify\nfor Developers community forum</a> to ask questions and connect with other\ndevelopers.")
        url.set("https://spotted.cjav.dev")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Spotted")
                email.set("wave@cjav.dev")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/cjavdev/spotted-kotlin.git")
            developerConnection.set("scm:git:git://github.com/cjavdev/spotted-kotlin.git")
            url.set("https://github.com/cjavdev/spotted-kotlin")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
