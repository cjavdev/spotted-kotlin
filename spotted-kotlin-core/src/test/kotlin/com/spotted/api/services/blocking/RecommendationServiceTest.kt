// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.recommendations.RecommendationGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecommendationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val recommendationService = client.recommendations()

        val recommendation =
            recommendationService.get(
                RecommendationGetParams.builder()
                    .limit(10L)
                    .market("ES")
                    .maxAcousticness(0.0)
                    .maxDanceability(0.0)
                    .maxDurationMs(0L)
                    .maxEnergy(0.0)
                    .maxInstrumentalness(0.0)
                    .maxKey(0L)
                    .maxLiveness(0.0)
                    .maxLoudness(0.0)
                    .maxMode(0L)
                    .maxPopularity(0L)
                    .maxSpeechiness(0.0)
                    .maxTempo(0.0)
                    .maxTimeSignature(0L)
                    .maxValence(0.0)
                    .minAcousticness(0.0)
                    .minDanceability(0.0)
                    .minDurationMs(0L)
                    .minEnergy(0.0)
                    .minInstrumentalness(0.0)
                    .minKey(0L)
                    .minLiveness(0.0)
                    .minLoudness(0.0)
                    .minMode(0L)
                    .minPopularity(0L)
                    .minSpeechiness(0.0)
                    .minTempo(0.0)
                    .minTimeSignature(11L)
                    .minValence(0.0)
                    .seedArtists("4NHQUGzhtTLFvgF5SZesLK")
                    .seedGenres("classical,country")
                    .seedTracks("0c6xIDDpzE81m2q797ordA")
                    .targetAcousticness(0.0)
                    .targetDanceability(0.0)
                    .targetDurationMs(0L)
                    .targetEnergy(0.0)
                    .targetInstrumentalness(0.0)
                    .targetKey(0L)
                    .targetLiveness(0.0)
                    .targetLoudness(0.0)
                    .targetMode(0L)
                    .targetPopularity(0L)
                    .targetSpeechiness(0.0)
                    .targetTempo(0.0)
                    .targetTimeSignature(0L)
                    .targetValence(0.0)
                    .build()
            )

        recommendation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAvailableGenreSeeds() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val recommendationService = client.recommendations()

        val response = recommendationService.listAvailableGenreSeeds()

        response.validate()
    }
}
