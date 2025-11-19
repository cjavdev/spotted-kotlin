// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistListAlbumsParamsTest {

    @Test
    fun create() {
        ArtistListAlbumsParams.builder()
            .id("0TnOYISbd1XYRBk9myaseg")
            .includeGroups("single,appears_on")
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ArtistListAlbumsParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()

        assertThat(params._pathParam(0)).isEqualTo("0TnOYISbd1XYRBk9myaseg")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ArtistListAlbumsParams.builder()
                .id("0TnOYISbd1XYRBk9myaseg")
                .includeGroups("single,appears_on")
                .limit(10L)
                .market("ES")
                .offset(5L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_groups", "single,appears_on")
                    .put("limit", "10")
                    .put("market", "ES")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ArtistListAlbumsParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
