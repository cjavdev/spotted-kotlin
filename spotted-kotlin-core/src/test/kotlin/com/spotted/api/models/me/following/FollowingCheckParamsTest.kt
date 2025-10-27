// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.following

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingCheckParamsTest {

    @Test
    fun create() {
        FollowingCheckParams.builder()
            .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
            .type(FollowingCheckParams.Type.ARTIST)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FollowingCheckParams.builder()
                .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingCheckParams.Type.ARTIST)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "ids",
                        "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6",
                    )
                    .put("type", "artist")
                    .build()
            )
    }
}
