// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
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
                .published(true)
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
