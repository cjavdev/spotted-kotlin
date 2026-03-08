// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.images

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageUpdateParamsTest {

    @Test
    fun create() {
        ImageUpdateParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .body("Example data")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ImageUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .body("Example data")
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
                .body("Example data")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("Example data")
    }
}
