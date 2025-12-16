// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorObjectTest {

    @Test
    fun create() {
        val authorObject = AuthorObject.builder().name("name").published(true).build()

        assertThat(authorObject.name()).isEqualTo("name")
        assertThat(authorObject.published()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorObject = AuthorObject.builder().name("name").published(true).build()

        val roundtrippedAuthorObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorObject),
                jacksonTypeRef<AuthorObject>(),
            )

        assertThat(roundtrippedAuthorObject).isEqualTo(authorObject)
    }
}
