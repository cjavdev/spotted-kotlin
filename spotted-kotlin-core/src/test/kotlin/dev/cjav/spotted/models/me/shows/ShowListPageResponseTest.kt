// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.shows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ShowBase
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowListPageResponseTest {

    @Test
    fun create() {
        val showListPageResponse =
            ShowListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    ShowListResponse.builder()
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .published(true)
                        .show(
                            ShowBase.builder()
                                .id("id")
                                .addAvailableMarket("string")
                                .addCopyright(
                                    CopyrightObject.builder()
                                        .published(true)
                                        .text("text")
                                        .type("type")
                                        .build()
                                )
                                .description("description")
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .htmlDescription("html_description")
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
                                .isExternallyHosted(true)
                                .addLanguage("string")
                                .mediaType("media_type")
                                .name("name")
                                .publisher("publisher")
                                .totalEpisodes(0L)
                                .uri("uri")
                                .published(true)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        assertThat(showListPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(showListPageResponse.limit()).isEqualTo(20L)
        assertThat(showListPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(showListPageResponse.offset()).isEqualTo(0L)
        assertThat(showListPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(showListPageResponse.total()).isEqualTo(4L)
        assertThat(showListPageResponse.items())
            .containsExactly(
                ShowListResponse.builder()
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .published(true)
                    .show(
                        ShowBase.builder()
                            .id("id")
                            .addAvailableMarket("string")
                            .addCopyright(
                                CopyrightObject.builder()
                                    .published(true)
                                    .text("text")
                                    .type("type")
                                    .build()
                            )
                            .description("description")
                            .explicit(true)
                            .externalUrls(
                                ExternalUrlObject.builder()
                                    .published(true)
                                    .spotify("spotify")
                                    .build()
                            )
                            .href("href")
                            .htmlDescription("html_description")
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
                            .isExternallyHosted(true)
                            .addLanguage("string")
                            .mediaType("media_type")
                            .name("name")
                            .publisher("publisher")
                            .totalEpisodes(0L)
                            .uri("uri")
                            .published(true)
                            .build()
                    )
                    .build()
            )
        assertThat(showListPageResponse.published()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val showListPageResponse =
            ShowListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    ShowListResponse.builder()
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .published(true)
                        .show(
                            ShowBase.builder()
                                .id("id")
                                .addAvailableMarket("string")
                                .addCopyright(
                                    CopyrightObject.builder()
                                        .published(true)
                                        .text("text")
                                        .type("type")
                                        .build()
                                )
                                .description("description")
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .htmlDescription("html_description")
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
                                .isExternallyHosted(true)
                                .addLanguage("string")
                                .mediaType("media_type")
                                .name("name")
                                .publisher("publisher")
                                .totalEpisodes(0L)
                                .uri("uri")
                                .published(true)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        val roundtrippedShowListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showListPageResponse),
                jacksonTypeRef<ShowListPageResponse>(),
            )

        assertThat(roundtrippedShowListPageResponse).isEqualTo(showListPageResponse)
    }
}
