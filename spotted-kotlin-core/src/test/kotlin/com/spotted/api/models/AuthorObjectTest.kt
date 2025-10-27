// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorObjectTest {

    @Test
    fun create() {
        val authorObject = AuthorObject.builder().name("name").build()

        assertThat(authorObject.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorObject = AuthorObject.builder().name("name").build()

        val roundtrippedAuthorObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorObject),
                jacksonTypeRef<AuthorObject>(),
            )

        assertThat(roundtrippedAuthorObject).isEqualTo(authorObject)
    }
}
