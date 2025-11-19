// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.following

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingBulkRetrieveParamsTest {

    @Test
    fun create() {
        FollowingBulkRetrieveParams.builder()
            .type(FollowingBulkRetrieveParams.Type.ARTIST)
            .after("0I2XqVXqHScXjHhk6AYYRe")
            .limit(10L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FollowingBulkRetrieveParams.builder()
                .type(FollowingBulkRetrieveParams.Type.ARTIST)
                .after("0I2XqVXqHScXjHhk6AYYRe")
                .limit(10L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("type", "artist")
                    .put("after", "0I2XqVXqHScXjHhk6AYYRe")
                    .put("limit", "10")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FollowingBulkRetrieveParams.builder()
                .type(FollowingBulkRetrieveParams.Type.ARTIST)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("type", "artist").build())
    }
}
