// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowseGetNewReleasesParamsTest {

    @Test
    fun create() {
        BrowseGetNewReleasesParams.builder().limit(10L).offset(5L).build()
    }

    @Test
    fun queryParams() {
        val params = BrowseGetNewReleasesParams.builder().limit(10L).offset(5L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("offset", "5").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrowseGetNewReleasesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
