// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiofeatures

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureListParamsTest {

    @Test
    fun create() {
        AudioFeatureListParams.builder()
            .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AudioFeatureListParams.builder()
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
