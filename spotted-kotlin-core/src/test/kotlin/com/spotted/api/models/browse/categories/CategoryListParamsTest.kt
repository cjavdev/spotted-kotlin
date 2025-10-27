// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse.categories

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryListParamsTest {

    @Test
    fun create() {
        CategoryListParams.builder().limit(10L).locale("sv_SE").offset(5L).build()
    }

    @Test
    fun queryParams() {
        val params = CategoryListParams.builder().limit(10L).locale("sv_SE").offset(5L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("locale", "sv_SE")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CategoryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
