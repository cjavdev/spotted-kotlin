// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NarratorObjectTest {

    @Test
    fun create() {
        val narratorObject = NarratorObject.builder().name("name").build()

        assertThat(narratorObject.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val narratorObject = NarratorObject.builder().name("name").build()

        val roundtrippedNarratorObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(narratorObject),
                jacksonTypeRef<NarratorObject>(),
            )

        assertThat(roundtrippedNarratorObject).isEqualTo(narratorObject)
    }
}
