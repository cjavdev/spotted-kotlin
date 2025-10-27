// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse.categories

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryRetrieveParamsTest {

    @Test
    fun create() {
        CategoryRetrieveParams.builder().categoryId("dinner").locale("sv_SE").build()
    }

    @Test
    fun pathParams() {
        val params = CategoryRetrieveParams.builder().categoryId("dinner").build()

        assertThat(params._pathParam(0)).isEqualTo("dinner")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = CategoryRetrieveParams.builder().categoryId("dinner").locale("sv_SE").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "sv_SE").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CategoryRetrieveParams.builder().categoryId("dinner").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
