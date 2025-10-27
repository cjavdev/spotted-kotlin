// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.shows

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowCheckParamsTest {

    @Test
    fun create() {
        ShowCheckParams.builder().ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ").build()
    }

    @Test
    fun queryParams() {
        val params =
            ShowCheckParams.builder().ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .build()
            )
    }
}
