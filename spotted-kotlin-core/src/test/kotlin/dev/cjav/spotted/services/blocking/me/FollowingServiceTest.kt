// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveParams
import dev.cjav.spotted.models.me.following.FollowingCheckParams
import dev.cjav.spotted.models.me.following.FollowingFollowParams
import dev.cjav.spotted.models.me.following.FollowingUnfollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FollowingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followingService = client.me().following()

        val response =
            followingService.bulkRetrieve(
                FollowingBulkRetrieveParams.builder()
                    .type(FollowingBulkRetrieveParams.Type.ARTIST)
                    .after("0I2XqVXqHScXjHhk6AYYRe")
                    .limit(10L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followingService = client.me().following()

        followingService.check(
            FollowingCheckParams.builder()
                .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingCheckParams.Type.ARTIST)
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
        val followingService = client.me().following()

        followingService.follow(
            FollowingFollowParams.builder().addId("string").published(true).build()
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
        val followingService = client.me().following()

        followingService.unfollow(
            FollowingUnfollowParams.builder().addId("string").published(true).build()
        )
    }
}
