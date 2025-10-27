// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.playlists

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.playlists.followers.FollowerCheckParams
import com.spotted.api.models.playlists.followers.FollowerFollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FollowerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerServiceAsync = client.playlists().followers()

        followerServiceAsync.check(
            FollowerCheckParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .ids("jmperezperez")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun follow() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerServiceAsync = client.playlists().followers()

        followerServiceAsync.follow(
            FollowerFollowParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .public_(false)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun unfollow() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerServiceAsync = client.playlists().followers()

        followerServiceAsync.unfollow("3cEYpjA9oz9GiPac4AsH4n")
    }
}
