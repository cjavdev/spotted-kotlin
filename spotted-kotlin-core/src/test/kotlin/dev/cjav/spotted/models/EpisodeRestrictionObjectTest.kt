// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeRestrictionObjectTest {

    @Test
    fun create() {
        val episodeRestrictionObject = EpisodeRestrictionObject.builder().reason("reason").build()

        assertThat(episodeRestrictionObject.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episodeRestrictionObject = EpisodeRestrictionObject.builder().reason("reason").build()

        val roundtrippedEpisodeRestrictionObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(episodeRestrictionObject),
                jacksonTypeRef<EpisodeRestrictionObject>(),
            )

        assertThat(roundtrippedEpisodeRestrictionObject).isEqualTo(episodeRestrictionObject)
    }
}
