// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalUrlObjectTest {

    @Test
    fun create() {
        val externalUrlObject = ExternalUrlObject.builder().spotify("spotify").build()

        assertThat(externalUrlObject.spotify()).isEqualTo("spotify")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalUrlObject = ExternalUrlObject.builder().spotify("spotify").build()

        val roundtrippedExternalUrlObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalUrlObject),
                jacksonTypeRef<ExternalUrlObject>(),
            )

        assertThat(roundtrippedExternalUrlObject).isEqualTo(externalUrlObject)
    }
}
