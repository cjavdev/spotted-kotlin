// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumRemoveParamsTest {

    @Test
    fun create() {
        AlbumRemoveParams.builder()
            .queryIds("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
            .addBodyId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AlbumRemoveParams.builder()
                .queryIds("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .addBodyId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc",
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AlbumRemoveParams.builder()
                .queryIds("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc",
                    )
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            AlbumRemoveParams.builder()
                .queryIds("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .addBodyId("string")
                .build()

        val body = params._body()

        assertThat(body.bodyIds()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlbumRemoveParams.builder()
                .queryIds("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .build()

        val body = params._body()
    }
}
