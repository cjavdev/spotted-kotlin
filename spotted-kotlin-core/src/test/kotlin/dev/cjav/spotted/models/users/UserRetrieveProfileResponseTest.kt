// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.FollowersObject
import dev.cjav.spotted.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveProfileResponseTest {

    @Test
    fun create() {
        val userRetrieveProfileResponse =
            UserRetrieveProfileResponse.builder()
                .id("id")
                .displayName("display_name")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .type(UserRetrieveProfileResponse.Type.USER)
                .uri("uri")
                .build()

        assertThat(userRetrieveProfileResponse.id()).isEqualTo("id")
        assertThat(userRetrieveProfileResponse.displayName()).isEqualTo("display_name")
        assertThat(userRetrieveProfileResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(userRetrieveProfileResponse.followers())
            .isEqualTo(FollowersObject.builder().href("href").total(0L).build())
        assertThat(userRetrieveProfileResponse.href()).isEqualTo("href")
        assertThat(userRetrieveProfileResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(userRetrieveProfileResponse.type())
            .isEqualTo(UserRetrieveProfileResponse.Type.USER)
        assertThat(userRetrieveProfileResponse.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveProfileResponse =
            UserRetrieveProfileResponse.builder()
                .id("id")
                .displayName("display_name")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .type(UserRetrieveProfileResponse.Type.USER)
                .uri("uri")
                .build()

        val roundtrippedUserRetrieveProfileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveProfileResponse),
                jacksonTypeRef<UserRetrieveProfileResponse>(),
            )

        assertThat(roundtrippedUserRetrieveProfileResponse).isEqualTo(userRetrieveProfileResponse)
    }
}
