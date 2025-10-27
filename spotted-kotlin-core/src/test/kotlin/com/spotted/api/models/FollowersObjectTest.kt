// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowersObjectTest {

    @Test
    fun create() {
        val followersObject = FollowersObject.builder().href("href").total(0L).build()

        assertThat(followersObject.href()).isEqualTo("href")
        assertThat(followersObject.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followersObject = FollowersObject.builder().href("href").total(0L).build()

        val roundtrippedFollowersObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followersObject),
                jacksonTypeRef<FollowersObject>(),
            )

        assertThat(roundtrippedFollowersObject).isEqualTo(followersObject)
    }
}
