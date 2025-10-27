// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.images

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageListParamsTest {

    @Test
    fun create() {
        ImageListParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()
    }

    @Test
    fun pathParams() {
        val params = ImageListParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
