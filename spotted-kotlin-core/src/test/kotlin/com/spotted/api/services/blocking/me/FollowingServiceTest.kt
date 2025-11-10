// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.me.following.FollowingBulkRetrieveParams
import com.spotted.api.models.me.following.FollowingCheckParams
import com.spotted.api.models.me.following.FollowingFollowParams
import com.spotted.api.models.me.following.FollowingUnfollowParams
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

        followingService.follow(FollowingFollowParams.builder().addId("string").build())
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

        followingService.unfollow(FollowingUnfollowParams.builder().addId("string").build())
    }
}
