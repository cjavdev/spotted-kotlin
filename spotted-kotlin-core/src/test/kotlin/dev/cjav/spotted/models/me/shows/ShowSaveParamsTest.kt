// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.shows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowSaveParamsTest {

    @Test
    fun create() {
        ShowSaveParams.builder().addId("string").published(true).build()
    }

    @Test
    fun body() {
        val params = ShowSaveParams.builder().addId("string").published(true).build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
        assertThat(body.published()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ShowSaveParams.builder().build()

        val body = params._body()
    }
}
