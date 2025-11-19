// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.followers

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowerCheckParamsTest {

    @Test
    fun create() {
        FollowerCheckParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .ids("jmperezperez")
            .build()
    }

    @Test
    fun pathParams() {
        val params = FollowerCheckParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FollowerCheckParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .ids("jmperezperez")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("ids", "jmperezperez").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FollowerCheckParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
