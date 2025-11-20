// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.followers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowerFollowParamsTest {

    @Test
    fun create() {
        FollowerFollowParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .componentsSchemasPropertiesPublished(true)
            .build()
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
                .componentsSchemasPropertiesPublished(true)
                .build()

        val body = params._body()

        assertThat(body.componentsSchemasPropertiesPublished()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FollowerFollowParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
