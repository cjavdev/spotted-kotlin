// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EpisodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val episodeServiceAsync = client.me().episodes()

        val page = episodeServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun check() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val episodeServiceAsync = client.me().episodes()

        episodeServiceAsync.check(
            EpisodeCheckParams.builder()
                .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun remove() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val episodeServiceAsync = client.me().episodes()

        episodeServiceAsync.remove(
            EpisodeRemoveParams.builder().addId("string").published(true).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun save() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val episodeServiceAsync = client.me().episodes()

        episodeServiceAsync.save(
            EpisodeSaveParams.builder().addId("string").published(true).build()
        )
    }
}
