// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopyrightObjectTest {

    @Test
    fun create() {
        val copyrightObject = CopyrightObject.builder().text("text").type("type").build()

        assertThat(copyrightObject.text()).isEqualTo("text")
        assertThat(copyrightObject.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copyrightObject = CopyrightObject.builder().text("text").type("type").build()

        val roundtrippedCopyrightObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copyrightObject),
                jacksonTypeRef<CopyrightObject>(),
            )

        assertThat(roundtrippedCopyrightObject).isEqualTo(copyrightObject)
    }
}
