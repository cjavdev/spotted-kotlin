// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveParams
import dev.cjav.spotted.models.me.following.FollowingCheckParams
import dev.cjav.spotted.models.me.following.FollowingFollowParams
import dev.cjav.spotted.models.me.following.FollowingUnfollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FollowingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun bulkRetrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val followingServiceAsync = client.me().following()

        val response =
            followingServiceAsync.bulkRetrieve(
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
    suspend fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
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
                .accessToken("My Access Token")
                .build()
        val followingServiceAsync = client.me().following()

        followingServiceAsync.follow(
            FollowingFollowParams.builder().addId("string").published(true).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun unfollow() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val followingServiceAsync = client.me().following()

        followingServiceAsync.unfollow(
            FollowingUnfollowParams.builder().addId("string").published(true).build()
        )
    }
}
