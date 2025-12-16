// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumRestrictionObjectTest {

    @Test
    fun create() {
        val albumRestrictionObject =
            AlbumRestrictionObject.builder()
                .published(true)
                .reason(AlbumRestrictionObject.Reason.MARKET)
                .build()

        assertThat(albumRestrictionObject.published()).isEqualTo(true)
        assertThat(albumRestrictionObject.reason()).isEqualTo(AlbumRestrictionObject.Reason.MARKET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val albumRestrictionObject =
            AlbumRestrictionObject.builder()
                .published(true)
                .reason(AlbumRestrictionObject.Reason.MARKET)
                .build()

        val roundtrippedAlbumRestrictionObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(albumRestrictionObject),
                jacksonTypeRef<AlbumRestrictionObject>(),
            )

        assertThat(roundtrippedAlbumRestrictionObject).isEqualTo(albumRestrictionObject)
    }
}
