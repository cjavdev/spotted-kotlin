// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.tracks

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackBulkRetrieveParamsTest {

    @Test
    fun create() {
        TrackBulkRetrieveParams.builder()
            .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
            .market("ES")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TrackBulkRetrieveParams.builder()
                .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                .market("ES")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B",
                    )
                    .put("market", "ES")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TrackBulkRetrieveParams.builder()
                .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B",
                    )
                    .build()
            )
    }
}
