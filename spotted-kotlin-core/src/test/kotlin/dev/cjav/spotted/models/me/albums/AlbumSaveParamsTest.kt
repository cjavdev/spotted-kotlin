// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.albums

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumSaveParamsTest {

    @Test
    fun create() {
        AlbumSaveParams.builder().addId("string").build()
    }

    @Test
    fun body() {
        val params = AlbumSaveParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AlbumSaveParams.builder().build()

        val body = params._body()
    }
}
