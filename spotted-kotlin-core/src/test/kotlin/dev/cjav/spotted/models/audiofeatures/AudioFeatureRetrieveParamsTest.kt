// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiofeatures

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureRetrieveParamsTest {

    @Test
    fun create() {
        AudioFeatureRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").build()
    }

    @Test
    fun pathParams() {
        val params = AudioFeatureRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").build()

        assertThat(params._pathParam(0)).isEqualTo("11dFghVXANMlKmJXsNCbNl")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
