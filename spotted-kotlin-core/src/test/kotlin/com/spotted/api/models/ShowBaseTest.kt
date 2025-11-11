// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowBaseTest {

    @Test
    fun create() {
        val showBase =
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
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .isExternallyHosted(true)
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .publisher("publisher")
                .totalEpisodes(0L)
                .uri("uri")
                .build()

        assertThat(showBase.id()).isEqualTo("id")
        assertThat(showBase.availableMarkets()).containsExactly("string")
        assertThat(showBase.copyrights())
            .containsExactly(CopyrightObject.builder().text("text").type("type").build())
        assertThat(showBase.description()).isEqualTo("description")
        assertThat(showBase.explicit()).isEqualTo(true)
        assertThat(showBase.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(showBase.href()).isEqualTo("href")
        assertThat(showBase.htmlDescription()).isEqualTo("html_description")
        assertThat(showBase.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(showBase.isExternallyHosted()).isEqualTo(true)
        assertThat(showBase.languages()).containsExactly("string")
        assertThat(showBase.mediaType()).isEqualTo("media_type")
        assertThat(showBase.name()).isEqualTo("name")
        assertThat(showBase.publisher()).isEqualTo("publisher")
        assertThat(showBase.totalEpisodes()).isEqualTo(0L)
        assertThat(showBase.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val showBase =
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
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .isExternallyHosted(true)
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .publisher("publisher")
                .totalEpisodes(0L)
                .uri("uri")
                .build()

        val roundtrippedShowBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showBase),
                jacksonTypeRef<ShowBase>(),
            )

        assertThat(roundtrippedShowBase).isEqualTo(showBase)
    }
}
