// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackListParamsTest {

    @Test
    fun create() {
        TrackListParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .additionalTypes("additional_types")
            .fields("items(added_by.id,track(name,href,album(name,href)))")
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TrackListParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TrackListParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .additionalTypes("additional_types")
                .fields("items(added_by.id,track(name,href,album(name,href)))")
                .limit(10L)
                .market("ES")
                .offset(5L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("additional_types", "additional_types")
                    .put("fields", "items(added_by.id,track(name,href,album(name,href)))")
                    .put("limit", "10")
                    .put("market", "ES")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TrackListParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
