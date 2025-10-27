// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ExternalUrlObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContextObjectTest {

    @Test
    fun create() {
        val contextObject =
            ContextObject.builder()
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        assertThat(contextObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(contextObject.href()).isEqualTo("href")
        assertThat(contextObject.type()).isEqualTo("type")
        assertThat(contextObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contextObject =
            ContextObject.builder()
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedContextObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contextObject),
                jacksonTypeRef<ContextObject>(),
            )

        assertThat(roundtrippedContextObject).isEqualTo(contextObject)
    }
}
