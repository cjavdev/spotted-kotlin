// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.shows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.CopyrightObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.ShowBase
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowBulkRetrieveResponseTest {

    @Test
    fun create() {
        val showBulkRetrieveResponse =
            ShowBulkRetrieveResponse.builder()
                .addShow(
                    ShowBase.builder()
                        .id("id")
                        .addAvailableMarket("string")
                        .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                        .description("description")
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .htmlDescription("html_description")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .addLanguage("string")
                        .mediaType("media_type")
                        .name("name")
                        .publisher("publisher")
                        .totalEpisodes(0L)
                        .type(ShowBase.Type.SHOW)
                        .uri("uri")
                        .build()
                )
                .build()

        assertThat(showBulkRetrieveResponse.shows())
            .containsExactly(
                ShowBase.builder()
                    .id("id")
                    .addAvailableMarket("string")
                    .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                    .description("description")
                    .explicit(true)
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .htmlDescription("html_description")
                    .addImage(
                        ImageObject.builder()
                            .height(300L)
                            .url(
                                "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                            )
                            .width(300L)
                            .build()
                    )
                    .isExternallyHosted(true)
                    .addLanguage("string")
                    .mediaType("media_type")
                    .name("name")
                    .publisher("publisher")
                    .totalEpisodes(0L)
                    .type(ShowBase.Type.SHOW)
                    .uri("uri")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val showBulkRetrieveResponse =
            ShowBulkRetrieveResponse.builder()
                .addShow(
                    ShowBase.builder()
                        .id("id")
                        .addAvailableMarket("string")
                        .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                        .description("description")
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .htmlDescription("html_description")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .addLanguage("string")
                        .mediaType("media_type")
                        .name("name")
                        .publisher("publisher")
                        .totalEpisodes(0L)
                        .type(ShowBase.Type.SHOW)
                        .uri("uri")
                        .build()
                )
                .build()

        val roundtrippedShowBulkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showBulkRetrieveResponse),
                jacksonTypeRef<ShowBulkRetrieveResponse>(),
            )

        assertThat(roundtrippedShowBulkRetrieveResponse).isEqualTo(showBulkRetrieveResponse)
    }
}
