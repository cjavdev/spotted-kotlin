// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistObjectTest {

    @Test
    fun create() {
        val artistObject =
            ArtistObject.builder()
                .id("id")
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .followers(FollowersObject.builder().href("href").published(true).total(0L).build())
                .addGenre("Prog rock")
                .addGenre("Grunge")
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
                .popularity(0L)
                .published(true)
                .type(ArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        assertThat(artistObject.id()).isEqualTo("id")
        assertThat(artistObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(artistObject.followers())
            .isEqualTo(FollowersObject.builder().href("href").published(true).total(0L).build())
        assertThat(artistObject.genres()).containsExactly("Prog rock", "Grunge")
        assertThat(artistObject.href()).isEqualTo("href")
        assertThat(artistObject.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .published(true)
                    .build()
            )
        assertThat(artistObject.name()).isEqualTo("name")
        assertThat(artistObject.popularity()).isEqualTo(0L)
        assertThat(artistObject.published()).isEqualTo(true)
        assertThat(artistObject.type()).isEqualTo(ArtistObject.Type.ARTIST)
        assertThat(artistObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artistObject =
            ArtistObject.builder()
                .id("id")
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .followers(FollowersObject.builder().href("href").published(true).total(0L).build())
                .addGenre("Prog rock")
                .addGenre("Grunge")
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
                .popularity(0L)
                .published(true)
                .type(ArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        val roundtrippedArtistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artistObject),
                jacksonTypeRef<ArtistObject>(),
            )

        assertThat(roundtrippedArtistObject).isEqualTo(artistObject)
    }
}
