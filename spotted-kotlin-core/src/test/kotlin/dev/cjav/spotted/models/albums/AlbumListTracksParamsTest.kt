// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.albums

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumListTracksParamsTest {

    @Test
    fun create() {
        AlbumListTracksParams.builder()
            .id("4aawyAB9vmqN3uQ7FjRGTy")
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AlbumListTracksParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").build()

        assertThat(params._pathParam(0)).isEqualTo("4aawyAB9vmqN3uQ7FjRGTy")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AlbumListTracksParams.builder()
                .id("4aawyAB9vmqN3uQ7FjRGTy")
                .limit(10L)
                .market("ES")
                .offset(5L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("market", "ES")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AlbumListTracksParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
