// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.me.following.FollowingCheckParams
import com.spotted.api.models.me.following.FollowingFollowParams
import com.spotted.api.models.me.following.FollowingListParams
import com.spotted.api.models.me.following.FollowingUnfollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FollowingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followingServiceAsync = client.me().following()

        val followings =
            followingServiceAsync.list(
                FollowingListParams.builder()
                    .type(FollowingListParams.Type.ARTIST)
                    .after("0I2XqVXqHScXjHhk6AYYRe")
                    .limit(10L)
                    .build()
            )

        followings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val followingServiceAsync = client.me().following()

        followingServiceAsync.check(
            FollowingCheckParams.builder()
                .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingCheckParams.Type.ARTIST)
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
        val followingServiceAsync = client.me().following()

        followingServiceAsync.follow(
            FollowingFollowParams.builder()
                .queryIds("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingFollowParams.Type.ARTIST)
                .addBodyId("string")
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
        val followingServiceAsync = client.me().following()

        followingServiceAsync.unfollow(
            FollowingUnfollowParams.builder()
                .queryIds("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                .type(FollowingUnfollowParams.Type.ARTIST)
                .addBodyId("string")
                .build()
        )
    }
}
