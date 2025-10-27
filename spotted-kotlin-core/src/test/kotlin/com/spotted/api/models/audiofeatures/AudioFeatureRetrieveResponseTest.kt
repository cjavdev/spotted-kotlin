// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiofeatures

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureRetrieveResponseTest {

    @Test
    fun create() {
        val audioFeatureRetrieveResponse =
            AudioFeatureRetrieveResponse.builder()
                .id("2takcwOaAZWiXQijPHIx7B")
                .acousticness(0.00242f)
                .analysisUrl("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
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
                .type(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
                .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                .valence(0.428f)
                .build()

        assertThat(audioFeatureRetrieveResponse.id()).isEqualTo("2takcwOaAZWiXQijPHIx7B")
        assertThat(audioFeatureRetrieveResponse.acousticness()).isEqualTo(0.00242f)
        assertThat(audioFeatureRetrieveResponse.analysisUrl())
            .isEqualTo("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
        assertThat(audioFeatureRetrieveResponse.danceability()).isEqualTo(0.585f)
        assertThat(audioFeatureRetrieveResponse.durationMs()).isEqualTo(237040L)
        assertThat(audioFeatureRetrieveResponse.energy()).isEqualTo(0.842f)
        assertThat(audioFeatureRetrieveResponse.instrumentalness()).isEqualTo(0.00686f)
        assertThat(audioFeatureRetrieveResponse.key()).isEqualTo(9L)
        assertThat(audioFeatureRetrieveResponse.liveness()).isEqualTo(0.0866f)
        assertThat(audioFeatureRetrieveResponse.loudness()).isEqualTo(-5.883f)
        assertThat(audioFeatureRetrieveResponse.mode()).isEqualTo(0L)
        assertThat(audioFeatureRetrieveResponse.speechiness()).isEqualTo(0.0556f)
        assertThat(audioFeatureRetrieveResponse.tempo()).isEqualTo(118.211f)
        assertThat(audioFeatureRetrieveResponse.timeSignature()).isEqualTo(4L)
        assertThat(audioFeatureRetrieveResponse.trackHref())
            .isEqualTo("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
        assertThat(audioFeatureRetrieveResponse.type())
            .isEqualTo(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
        assertThat(audioFeatureRetrieveResponse.uri())
            .isEqualTo("spotify:track:2takcwOaAZWiXQijPHIx7B")
        assertThat(audioFeatureRetrieveResponse.valence()).isEqualTo(0.428f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioFeatureRetrieveResponse =
            AudioFeatureRetrieveResponse.builder()
                .id("2takcwOaAZWiXQijPHIx7B")
                .acousticness(0.00242f)
                .analysisUrl("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
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
                .type(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
                .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                .valence(0.428f)
                .build()

        val roundtrippedAudioFeatureRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioFeatureRetrieveResponse),
                jacksonTypeRef<AudioFeatureRetrieveResponse>(),
            )

        assertThat(roundtrippedAudioFeatureRetrieveResponse).isEqualTo(audioFeatureRetrieveResponse)
    }
}
