// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.followers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowerFollowParamsTest {

    @Test
    fun create() {
        FollowerFollowParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").public_(false).build()
    }

    @Test
    fun pathParams() {
        val params = FollowerFollowParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FollowerFollowParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .public_(false)
                .build()

        val body = params._body()

        assertThat(body.public_()).isEqualTo(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FollowerFollowParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
