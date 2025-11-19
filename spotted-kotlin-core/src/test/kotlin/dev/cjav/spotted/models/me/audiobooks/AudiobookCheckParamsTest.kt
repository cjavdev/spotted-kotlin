// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.audiobooks

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookCheckParamsTest {

    @Test
    fun create() {
        AudiobookCheckParams.builder()
            .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AudiobookCheckParams.builder()
                .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe",
                    )
                    .build()
            )
    }
}
