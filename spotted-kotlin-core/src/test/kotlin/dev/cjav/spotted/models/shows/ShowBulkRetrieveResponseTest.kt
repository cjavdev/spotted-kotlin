// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ShowBase
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
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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

        assertThat(showBulkRetrieveResponse.shows())
            .containsExactly(
                ShowBase.builder()
                    .id("id")
                    .addAvailableMarket("string")
                    .addCopyright(
                        CopyrightObject.builder().published(true).text("text").type("type").build()
                    )
                    .description("description")
                    .explicit(true)
                    .externalUrls(
                        ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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

        val roundtrippedShowBulkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showBulkRetrieveResponse),
                jacksonTypeRef<ShowBulkRetrieveResponse>(),
            )

        assertThat(roundtrippedShowBulkRetrieveResponse).isEqualTo(showBulkRetrieveResponse)
    }
}
