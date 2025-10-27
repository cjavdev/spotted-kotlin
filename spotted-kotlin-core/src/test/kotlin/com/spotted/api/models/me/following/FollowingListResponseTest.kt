// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.following

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingListResponseTest {

    @Test
    fun create() {
        val followingListResponse =
            FollowingListResponse.builder()
                .artists(
                    FollowingListResponse.Artists.builder()
                        .cursors(
                            FollowingListResponse.Artists.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .href("href")
                        .addItem(
                            ArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                        .limit(0L)
                        .next("next")
                        .total(0L)
                        .build()
                )
                .build()

        assertThat(followingListResponse.artists())
            .isEqualTo(
                FollowingListResponse.Artists.builder()
                    .cursors(
                        FollowingListResponse.Artists.Cursors.builder()
                            .after("after")
                            .before("before")
                            .build()
                    )
                    .href("href")
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
                    .limit(0L)
                    .next("next")
                    .total(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followingListResponse =
            FollowingListResponse.builder()
                .artists(
                    FollowingListResponse.Artists.builder()
                        .cursors(
                            FollowingListResponse.Artists.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .href("href")
                        .addItem(
                            ArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                        .limit(0L)
                        .next("next")
                        .total(0L)
                        .build()
                )
                .build()

        val roundtrippedFollowingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followingListResponse),
                jacksonTypeRef<FollowingListResponse>(),
            )

        assertThat(roundtrippedFollowingListResponse).isEqualTo(followingListResponse)
    }
}
