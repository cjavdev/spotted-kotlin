// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.playlists

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FollowerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerService = client.playlists().followers()

        followerService.check(
            FollowerCheckParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .ids("jmperezperez")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun follow() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerService = client.playlists().followers()

        followerService.follow(
            FollowerFollowParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .published(true)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unfollow() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followerService = client.playlists().followers()

        followerService.unfollow("3cEYpjA9oz9GiPac4AsH4n")
    }
}
