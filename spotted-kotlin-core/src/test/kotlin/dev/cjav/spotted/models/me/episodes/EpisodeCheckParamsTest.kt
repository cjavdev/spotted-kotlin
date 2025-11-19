// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeCheckParamsTest {

    @Test
    fun create() {
        EpisodeCheckParams.builder().ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf").build()
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeCheckParams.builder()
                .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .build()
            )
    }
}
