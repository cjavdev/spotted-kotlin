// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.playlists

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FollowerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val followerService = client.playlists().followers()

        followerService.check(
            FollowerCheckParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .ids("jmperezperez")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun follow() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val followerService = client.playlists().followers()

        followerService.follow(
            FollowerFollowParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .published(true)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unfollow() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val followerService = client.playlists().followers()

        followerService.unfollow("3cEYpjA9oz9GiPac4AsH4n")
    }
}
