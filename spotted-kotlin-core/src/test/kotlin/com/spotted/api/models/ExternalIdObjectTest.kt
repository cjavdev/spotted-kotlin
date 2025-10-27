// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalIdObjectTest {

    @Test
    fun create() {
        val externalIdObject = ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build()

        assertThat(externalIdObject.ean()).isEqualTo("ean")
        assertThat(externalIdObject.isrc()).isEqualTo("isrc")
        assertThat(externalIdObject.upc()).isEqualTo("upc")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalIdObject = ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build()

        val roundtrippedExternalIdObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalIdObject),
                jacksonTypeRef<ExternalIdObject>(),
            )

        assertThat(roundtrippedExternalIdObject).isEqualTo(externalIdObject)
    }
}
