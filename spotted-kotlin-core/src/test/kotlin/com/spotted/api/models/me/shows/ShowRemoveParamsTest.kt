// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.shows

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowRemoveParamsTest {

    @Test
    fun create() {
        ShowRemoveParams.builder()
            .queryIds("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
            .market("ES")
            .addBodyId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ShowRemoveParams.builder()
                .queryIds("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                .market("ES")
                .addBodyId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .put("market", "ES")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ShowRemoveParams.builder()
                .queryIds("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            ShowRemoveParams.builder()
                .queryIds("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                .market("ES")
                .addBodyId("string")
                .build()

        val body = params._body()

        assertThat(body.bodyIds()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ShowRemoveParams.builder()
                .queryIds("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                .build()

        val body = params._body()
    }
}
