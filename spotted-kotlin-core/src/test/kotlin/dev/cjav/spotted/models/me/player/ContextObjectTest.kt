// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.ExternalUrlObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContextObjectTest {

    @Test
    fun create() {
        val contextObject =
            ContextObject.builder()
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .published(true)
                .type("type")
                .uri("uri")
                .build()

        assertThat(contextObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(contextObject.href()).isEqualTo("href")
        assertThat(contextObject.published()).isEqualTo(true)
        assertThat(contextObject.type()).isEqualTo("type")
        assertThat(contextObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contextObject =
            ContextObject.builder()
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .published(true)
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
