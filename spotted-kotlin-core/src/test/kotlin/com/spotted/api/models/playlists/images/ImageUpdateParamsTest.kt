// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.images

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageUpdateParamsTest {

    @Test
    fun create() {
        ImageUpdateParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .body("some content")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ImageUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .body("some content")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ImageUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .body("some content")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("some content")
    }
}
