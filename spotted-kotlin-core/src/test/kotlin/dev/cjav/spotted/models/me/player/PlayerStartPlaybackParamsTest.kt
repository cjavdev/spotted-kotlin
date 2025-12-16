// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerStartPlaybackParamsTest {

    @Test
    fun create() {
        PlayerStartPlaybackParams.builder()
            .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
            .contextUri("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
            .offset(
                PlayerStartPlaybackParams.Offset.builder()
                    .putAdditionalProperty("position", JsonValue.from("bar"))
                    .build()
            )
            .positionMs(0L)
            .published(true)
            .addUris("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerStartPlaybackParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .contextUri("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
                .offset(
                    PlayerStartPlaybackParams.Offset.builder()
                        .putAdditionalProperty("position", JsonValue.from("bar"))
                        .build()
                )
                .positionMs(0L)
                .published(true)
                .addUris("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("device_id", "0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerStartPlaybackParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PlayerStartPlaybackParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .contextUri("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
                .offset(
                    PlayerStartPlaybackParams.Offset.builder()
                        .putAdditionalProperty("position", JsonValue.from("bar"))
                        .build()
                )
                .positionMs(0L)
                .published(true)
                .addUris("string")
                .build()

        val body = params._body()

        assertThat(body.contextUri()).isEqualTo("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
        assertThat(body.offset())
            .isEqualTo(
                PlayerStartPlaybackParams.Offset.builder()
                    .putAdditionalProperty("position", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.positionMs()).isEqualTo(0L)
        assertThat(body.published()).isEqualTo(true)
        assertThat(body.uris()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlayerStartPlaybackParams.builder().build()

        val body = params._body()
    }
}
