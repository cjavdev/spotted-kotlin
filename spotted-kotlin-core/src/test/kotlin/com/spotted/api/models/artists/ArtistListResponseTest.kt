// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.artists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistListResponseTest {

    @Test
    fun create() {
        val artistListResponse =
            ArtistListResponse.builder()
                .addArtist(
                    ArtistObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .followers(FollowersObject.builder().href("href").total(0L).build())
                        .addGenre("Prog rock")
                        .addGenre("Grunge")
                        .href("href")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .name("name")
                        .popularity(0L)
                        .type(ArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .build()

        assertThat(artistListResponse.artists())
            .containsExactly(
                ArtistObject.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .followers(FollowersObject.builder().href("href").total(0L).build())
                    .addGenre("Prog rock")
                    .addGenre("Grunge")
                    .href("href")
                    .addImage(
                        ImageObject.builder()
                            .height(300L)
                            .url(
                                "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                            )
                            .width(300L)
                            .build()
                    )
                    .name("name")
                    .popularity(0L)
                    .type(ArtistObject.Type.ARTIST)
                    .uri("uri")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artistListResponse =
            ArtistListResponse.builder()
                .addArtist(
                    ArtistObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .followers(FollowersObject.builder().href("href").total(0L).build())
                        .addGenre("Prog rock")
                        .addGenre("Grunge")
                        .href("href")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .name("name")
                        .popularity(0L)
                        .type(ArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .build()

        val roundtrippedArtistListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artistListResponse),
                jacksonTypeRef<ArtistListResponse>(),
            )

        assertThat(roundtrippedArtistListResponse).isEqualTo(artistListResponse)
    }
}
