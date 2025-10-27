// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse.categories

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryGetPlaylistsParamsTest {

    @Test
    fun create() {
        CategoryGetPlaylistsParams.builder().categoryId("dinner").limit(10L).offset(5L).build()
    }

    @Test
    fun pathParams() {
        val params = CategoryGetPlaylistsParams.builder().categoryId("dinner").build()

        assertThat(params._pathParam(0)).isEqualTo("dinner")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CategoryGetPlaylistsParams.builder().categoryId("dinner").limit(10L).offset(5L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("offset", "5").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CategoryGetPlaylistsParams.builder().categoryId("dinner").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
