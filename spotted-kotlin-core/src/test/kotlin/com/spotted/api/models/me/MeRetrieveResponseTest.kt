// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveResponseTest {

    @Test
    fun create() {
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .id("id")
                .country("country")
                .displayName("display_name")
                .email("email")
                .explicitContent(
                    MeRetrieveResponse.ExplicitContent.builder()
                        .filterEnabled(true)
                        .filterLocked(true)
                        .build()
                )
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .product("product")
                .type("type")
                .uri("uri")
                .build()

        assertThat(meRetrieveResponse.id()).isEqualTo("id")
        assertThat(meRetrieveResponse.country()).isEqualTo("country")
        assertThat(meRetrieveResponse.displayName()).isEqualTo("display_name")
        assertThat(meRetrieveResponse.email()).isEqualTo("email")
        assertThat(meRetrieveResponse.explicitContent())
            .isEqualTo(
                MeRetrieveResponse.ExplicitContent.builder()
                    .filterEnabled(true)
                    .filterLocked(true)
                    .build()
            )
        assertThat(meRetrieveResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(meRetrieveResponse.followers())
            .isEqualTo(FollowersObject.builder().href("href").total(0L).build())
        assertThat(meRetrieveResponse.href()).isEqualTo("href")
        assertThat(meRetrieveResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(meRetrieveResponse.product()).isEqualTo("product")
        assertThat(meRetrieveResponse.type()).isEqualTo("type")
        assertThat(meRetrieveResponse.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .id("id")
                .country("country")
                .displayName("display_name")
                .email("email")
                .explicitContent(
                    MeRetrieveResponse.ExplicitContent.builder()
                        .filterEnabled(true)
                        .filterLocked(true)
                        .build()
                )
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .product("product")
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedMeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meRetrieveResponse),
                jacksonTypeRef<MeRetrieveResponse>(),
            )

        assertThat(roundtrippedMeRetrieveResponse).isEqualTo(meRetrieveResponse)
    }
}
