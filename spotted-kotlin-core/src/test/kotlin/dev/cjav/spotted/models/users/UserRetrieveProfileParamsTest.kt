// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveProfileParamsTest {

    @Test
    fun create() {
        UserRetrieveProfileParams.builder().userId("smedjan").build()
    }

    @Test
    fun pathParams() {
        val params = UserRetrieveProfileParams.builder().userId("smedjan").build()

        assertThat(params._pathParam(0)).isEqualTo("smedjan")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
