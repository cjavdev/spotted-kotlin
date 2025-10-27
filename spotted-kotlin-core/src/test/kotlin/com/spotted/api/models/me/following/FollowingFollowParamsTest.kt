// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.following

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingFollowParamsTest {

    @Test
    fun create() {
        FollowingFollowParams.builder()
            .queryIds("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
            .type(FollowingFollowParams.Type.ARTIST)
            .addBodyId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FollowingFollowParams.builder()
                .queryIds("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingFollowParams.Type.ARTIST)
                .addBodyId("string")
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

    @Test
    fun body() {
        val params =
            FollowingFollowParams.builder()
                .queryIds("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingFollowParams.Type.ARTIST)
                .addBodyId("string")
                .build()

        val body = params._body()

        assertThat(body.bodyIds()).containsExactly("string")
    }
}
