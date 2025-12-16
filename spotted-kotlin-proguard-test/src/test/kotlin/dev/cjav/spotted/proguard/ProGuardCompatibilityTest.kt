// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.AlbumRestrictionObject
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalIdObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.LinkedTrackObject
import dev.cjav.spotted.models.SimplifiedArtistObject
import dev.cjav.spotted.models.SimplifiedTrackObject
import dev.cjav.spotted.models.TrackRestrictionObject
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/spotted-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            SpottedOkHttpClient.builder()
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.albums()).isNotNull()
        assertThat(client.artists()).isNotNull()
        assertThat(client.shows()).isNotNull()
        assertThat(client.episodes()).isNotNull()
        assertThat(client.audiobooks()).isNotNull()
        assertThat(client.me()).isNotNull()
        assertThat(client.chapters()).isNotNull()
        assertThat(client.tracks()).isNotNull()
        assertThat(client.search()).isNotNull()
        assertThat(client.playlists()).isNotNull()
        assertThat(client.users()).isNotNull()
        assertThat(client.browse()).isNotNull()
        assertThat(client.audioFeatures()).isNotNull()
        assertThat(client.audioAnalysis()).isNotNull()
        assertThat(client.recommendations()).isNotNull()
        assertThat(client.markets()).isNotNull()
    }

    @Test
    fun albumRetrieveResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val albumRetrieveResponse =
            AlbumRetrieveResponse.builder()
                .id("2up3OPMp9Tb4dAKM2erWXQ")
                .albumType(AlbumRetrieveResponse.AlbumType.COMPILATION)
                .availableMarkets(listOf("CA", "BR", "IT"))
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .published(true)
                        .build()
                )
                .name("name")
                .releaseDate("1981-12")
                .releaseDatePrecision(AlbumRetrieveResponse.ReleaseDatePrecision.YEAR)
                .totalTracks(9L)
                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                .addArtist(
                    SimplifiedArtistObject.builder()
                        .id("id")
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
                        )
                        .href("href")
                        .name("name")
                        .published(true)
                        .type(SimplifiedArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .addCopyright(
                    CopyrightObject.builder().published(true).text("text").type("type").build()
                )
                .externalIds(
                    ExternalIdObject.builder()
                        .ean("ean")
                        .isrc("isrc")
                        .published(true)
                        .upc("upc")
                        .build()
                )
                .addGenre("string")
                .label("label")
                .popularity(0L)
                .published(true)
                .restrictions(
                    AlbumRestrictionObject.builder()
                        .published(true)
                        .reason(AlbumRestrictionObject.Reason.MARKET)
                        .build()
                )
                .tracks(
                    AlbumRetrieveResponse.Tracks.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            SimplifiedTrackObject.builder()
                                .id("id")
                                .addArtist(
                                    SimplifiedArtistObject.builder()
                                        .id("id")
                                        .externalUrls(
                                            ExternalUrlObject.builder()
                                                .published(true)
                                                .spotify("spotify")
                                                .build()
                                        )
                                        .href("href")
                                        .name("name")
                                        .published(true)
                                        .type(SimplifiedArtistObject.Type.ARTIST)
                                        .uri("uri")
                                        .build()
                                )
                                .addAvailableMarket("string")
                                .discNumber(0L)
                                .durationMs(0L)
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .isLocal(true)
                                .isPlayable(true)
                                .linkedFrom(
                                    LinkedTrackObject.builder()
                                        .id("id")
                                        .externalUrls(
                                            ExternalUrlObject.builder()
                                                .published(true)
                                                .spotify("spotify")
                                                .build()
                                        )
                                        .href("href")
                                        .published(true)
                                        .type("type")
                                        .uri("uri")
                                        .build()
                                )
                                .name("name")
                                .previewUrl("preview_url")
                                .published(true)
                                .restrictions(
                                    TrackRestrictionObject.builder()
                                        .published(true)
                                        .reason("reason")
                                        .build()
                                )
                                .trackNumber(0L)
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .published(true)
                        .build()
                )
                .build()

        val roundtrippedAlbumRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(albumRetrieveResponse),
                jacksonTypeRef<AlbumRetrieveResponse>(),
            )

        assertThat(roundtrippedAlbumRetrieveResponse).isEqualTo(albumRetrieveResponse)
    }
}
