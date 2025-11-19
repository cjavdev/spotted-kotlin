// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.shows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowRemoveParamsTest {

    @Test
    fun create() {
        ShowRemoveParams.builder().addId("string").build()
    }

    @Test
    fun body() {
        val params = ShowRemoveParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ShowRemoveParams.builder().build()

        val body = params._body()
    }
}
