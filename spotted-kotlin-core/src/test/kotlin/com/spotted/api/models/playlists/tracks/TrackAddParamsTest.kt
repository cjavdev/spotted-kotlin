// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackAddParamsTest {

    @Test
    fun create() {
        TrackAddParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .queryPosition(0L)
            .queryUris("spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M")
            .bodyPosition(0L)
            .addBodyUris("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TrackAddParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TrackAddParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .queryPosition(0L)
                .queryUris(
                    "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M"
                )
                .bodyPosition(0L)
                .addBodyUris("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("position", "0")
                    .put(
                        "uris",
                        "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M",
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TrackAddParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            TrackAddParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .queryPosition(0L)
                .queryUris(
                    "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M"
                )
                .bodyPosition(0L)
                .addBodyUris("string")
                .build()

        val body = params._body()

        assertThat(body.bodyPosition()).isEqualTo(0L)
        assertThat(body.bodyUris()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackAddParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
