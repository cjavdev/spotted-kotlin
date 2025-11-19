// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiofeatures

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureBulkRetrieveParamsTest {

    @Test
    fun create() {
        AudioFeatureBulkRetrieveParams.builder()
            .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AudioFeatureBulkRetrieveParams.builder()
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
