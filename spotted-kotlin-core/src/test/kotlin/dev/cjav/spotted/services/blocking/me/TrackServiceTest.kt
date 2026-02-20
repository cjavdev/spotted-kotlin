// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.me.tracks.TrackCheckParams
import dev.cjav.spotted.models.me.tracks.TrackRemoveParams
import dev.cjav.spotted.models.me.tracks.TrackSaveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrackServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val trackService = client.me().tracks()

        val page = trackService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val trackService = client.me().tracks()

        trackService.check(
            TrackCheckParams.builder()
                .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val trackService = client.me().tracks()

        trackService.remove(TrackRemoveParams.builder().addId("string").published(true).build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun save() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val trackService = client.me().tracks()

        trackService.save(
            TrackSaveParams.builder()
                .addId("string")
                .published(true)
                .addTimestampedId(
                    TrackSaveParams.TimestampedId.builder()
                        .id("id")
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        )
    }
}
