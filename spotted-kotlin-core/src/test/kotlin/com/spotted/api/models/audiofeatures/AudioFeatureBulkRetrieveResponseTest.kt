// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiofeatures

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureBulkRetrieveResponseTest {

    @Test
    fun create() {
        val audioFeatureBulkRetrieveResponse =
            AudioFeatureBulkRetrieveResponse.builder()
                .addAudioFeature(
                    AudioFeatureBulkRetrieveResponse.AudioFeature.builder()
                        .id("2takcwOaAZWiXQijPHIx7B")
                        .acousticness(0.00242f)
                        .analysisUrl(
                            "https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n"
                        )
                        .danceability(0.585f)
                        .durationMs(237040L)
                        .energy(0.842f)
                        .instrumentalness(0.00686f)
                        .key(9L)
                        .liveness(0.0866f)
                        .loudness(-5.883f)
                        .mode(0L)
                        .speechiness(0.0556f)
                        .tempo(118.211f)
                        .timeSignature(4L)
                        .trackHref("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
                        .type(AudioFeatureBulkRetrieveResponse.AudioFeature.Type.AUDIO_FEATURES)
                        .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                        .valence(0.428f)
                        .build()
                )
                .build()

        assertThat(audioFeatureBulkRetrieveResponse.audioFeatures())
            .containsExactly(
                AudioFeatureBulkRetrieveResponse.AudioFeature.builder()
                    .id("2takcwOaAZWiXQijPHIx7B")
                    .acousticness(0.00242f)
                    .analysisUrl(
                        "https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n"
                    )
                    .danceability(0.585f)
                    .durationMs(237040L)
                    .energy(0.842f)
                    .instrumentalness(0.00686f)
                    .key(9L)
                    .liveness(0.0866f)
                    .loudness(-5.883f)
                    .mode(0L)
                    .speechiness(0.0556f)
                    .tempo(118.211f)
                    .timeSignature(4L)
                    .trackHref("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
                    .type(AudioFeatureBulkRetrieveResponse.AudioFeature.Type.AUDIO_FEATURES)
                    .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                    .valence(0.428f)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioFeatureBulkRetrieveResponse =
            AudioFeatureBulkRetrieveResponse.builder()
                .addAudioFeature(
                    AudioFeatureBulkRetrieveResponse.AudioFeature.builder()
                        .id("2takcwOaAZWiXQijPHIx7B")
                        .acousticness(0.00242f)
                        .analysisUrl(
                            "https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n"
                        )
                        .danceability(0.585f)
                        .durationMs(237040L)
                        .energy(0.842f)
                        .instrumentalness(0.00686f)
                        .key(9L)
                        .liveness(0.0866f)
                        .loudness(-5.883f)
                        .mode(0L)
                        .speechiness(0.0556f)
                        .tempo(118.211f)
                        .timeSignature(4L)
                        .trackHref("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
                        .type(AudioFeatureBulkRetrieveResponse.AudioFeature.Type.AUDIO_FEATURES)
                        .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                        .valence(0.428f)
                        .build()
                )
                .build()

        val roundtrippedAudioFeatureBulkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioFeatureBulkRetrieveResponse),
                jacksonTypeRef<AudioFeatureBulkRetrieveResponse>(),
            )

        assertThat(roundtrippedAudioFeatureBulkRetrieveResponse)
            .isEqualTo(audioFeatureBulkRetrieveResponse)
    }
}
