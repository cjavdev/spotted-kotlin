// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumCheckParamsTest {

    @Test
    fun create() {
        AlbumCheckParams.builder()
            .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AlbumCheckParams.builder()
                .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
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
}
