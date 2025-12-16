// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.following

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.FollowersObject
import dev.cjav.spotted.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingBulkRetrieveResponseTest {

    @Test
    fun create() {
        val followingBulkRetrieveResponse =
            FollowingBulkRetrieveResponse.builder()
                .artists(
                    FollowingBulkRetrieveResponse.Artists.builder()
                        .cursors(
                            FollowingBulkRetrieveResponse.Artists.Cursors.builder()
                                .after("after")
                                .before("before")
                                .published(true)
                                .build()
                        )
                        .href("href")
                        .addItem(
                            ArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .followers(
                                    FollowersObject.builder()
                                        .href("href")
                                        .published(true)
                                        .total(0L)
                                        .build()
                                )
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
                                        .published(true)
                                        .build()
                                )
                                .name("name")
                                .popularity(0L)
                                .published(true)
                                .type(ArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .limit(0L)
                        .next("next")
                        .published(true)
                        .total(0L)
                        .build()
                )
                .build()

        assertThat(followingBulkRetrieveResponse.artists())
            .isEqualTo(
                FollowingBulkRetrieveResponse.Artists.builder()
                    .cursors(
                        FollowingBulkRetrieveResponse.Artists.Cursors.builder()
                            .after("after")
                            .before("before")
                            .published(true)
                            .build()
                    )
                    .href("href")
                    .addItem(
                        ArtistObject.builder()
                            .id("id")
                            .externalUrls(
                                ExternalUrlObject.builder()
                                    .published(true)
                                    .spotify("spotify")
                                    .build()
                            )
                            .followers(
                                FollowersObject.builder()
                                    .href("href")
                                    .published(true)
                                    .total(0L)
                                    .build()
                            )
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
                                    .published(true)
                                    .build()
                            )
                            .name("name")
                            .popularity(0L)
                            .published(true)
                            .type(ArtistObject.Type.ARTIST)
                            .uri("uri")
                            .build()
                    )
                    .limit(0L)
                    .next("next")
                    .published(true)
                    .total(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followingBulkRetrieveResponse =
            FollowingBulkRetrieveResponse.builder()
                .artists(
                    FollowingBulkRetrieveResponse.Artists.builder()
                        .cursors(
                            FollowingBulkRetrieveResponse.Artists.Cursors.builder()
                                .after("after")
                                .before("before")
                                .published(true)
                                .build()
                        )
                        .href("href")
                        .addItem(
                            ArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .followers(
                                    FollowersObject.builder()
                                        .href("href")
                                        .published(true)
                                        .total(0L)
                                        .build()
                                )
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
                                        .published(true)
                                        .build()
                                )
                                .name("name")
                                .popularity(0L)
                                .published(true)
                                .type(ArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .limit(0L)
                        .next("next")
                        .published(true)
                        .total(0L)
                        .build()
                )
                .build()

        val roundtrippedFollowingBulkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followingBulkRetrieveResponse),
                jacksonTypeRef<FollowingBulkRetrieveResponse>(),
            )

        assertThat(roundtrippedFollowingBulkRetrieveResponse)
            .isEqualTo(followingBulkRetrieveResponse)
    }
}
