// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.top

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopListTopArtistsPageResponseTest {

    @Test
    fun create() {
        val topListTopArtistsPageResponse =
            TopListTopArtistsPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
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
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .build()

        assertThat(topListTopArtistsPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(topListTopArtistsPageResponse.items())
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
        assertThat(topListTopArtistsPageResponse.limit()).isEqualTo(20L)
        assertThat(topListTopArtistsPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(topListTopArtistsPageResponse.offset()).isEqualTo(0L)
        assertThat(topListTopArtistsPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(topListTopArtistsPageResponse.total()).isEqualTo(4L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topListTopArtistsPageResponse =
            TopListTopArtistsPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
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
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .build()

        val roundtrippedTopListTopArtistsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topListTopArtistsPageResponse),
                jacksonTypeRef<TopListTopArtistsPageResponse>(),
            )

        assertThat(roundtrippedTopListTopArtistsPageResponse)
            .isEqualTo(topListTopArtistsPageResponse)
    }
}
