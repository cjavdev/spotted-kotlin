// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.search

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchQueryParamsTest {

    @Test
    fun create() {
        SearchQueryParams.builder()
            .q("remaster%20track:Doxy%20artist:Miles%20Davis")
            .addType(SearchQueryParams.Type.ALBUM)
            .includeExternal(SearchQueryParams.IncludeExternal.AUDIO)
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SearchQueryParams.builder()
                .q("remaster%20track:Doxy%20artist:Miles%20Davis")
                .addType(SearchQueryParams.Type.ALBUM)
                .includeExternal(SearchQueryParams.IncludeExternal.AUDIO)
                .limit(10L)
                .market("ES")
                .offset(5L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "remaster%20track:Doxy%20artist:Miles%20Davis")
                    .put("type", listOf("album").joinToString(","))
                    .put("include_external", "audio")
                    .put("limit", "10")
                    .put("market", "ES")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SearchQueryParams.builder()
                .q("remaster%20track:Doxy%20artist:Miles%20Davis")
                .addType(SearchQueryParams.Type.ALBUM)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "remaster%20track:Doxy%20artist:Miles%20Davis")
                    .put("type", listOf("album").joinToString(","))
                    .build()
            )
    }
}
