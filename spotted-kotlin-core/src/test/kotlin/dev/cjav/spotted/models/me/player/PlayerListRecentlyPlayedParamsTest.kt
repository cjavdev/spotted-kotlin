// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerListRecentlyPlayedParamsTest {

    @Test
    fun create() {
        PlayerListRecentlyPlayedParams.builder().after(1484811043508L).before(0L).limit(10L).build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerListRecentlyPlayedParams.builder()
                .after(1484811043508L)
                .before(0L)
                .limit(10L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "1484811043508")
                    .put("before", "0")
                    .put("limit", "10")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerListRecentlyPlayedParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
