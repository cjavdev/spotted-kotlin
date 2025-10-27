// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.recommendations

import com.spotted.api.core.Params
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import java.util.Objects

/**
 * Recommendations are generated based on the available information for a given seed entity and
 * matched against similar artists and tracks. If there is sufficient information about the provided
 * seeds, a list of tracks will be returned together with pool size details.
 *
 * For artists and tracks that are very new or obscure there might not be enough data to generate a
 * list of tracks.
 */
@Deprecated("deprecated")
class RecommendationGetParams
private constructor(
    private val limit: Long?,
    private val market: String?,
    private val maxAcousticness: Double?,
    private val maxDanceability: Double?,
    private val maxDurationMs: Long?,
    private val maxEnergy: Double?,
    private val maxInstrumentalness: Double?,
    private val maxKey: Long?,
    private val maxLiveness: Double?,
    private val maxLoudness: Double?,
    private val maxMode: Long?,
    private val maxPopularity: Long?,
    private val maxSpeechiness: Double?,
    private val maxTempo: Double?,
    private val maxTimeSignature: Long?,
    private val maxValence: Double?,
    private val minAcousticness: Double?,
    private val minDanceability: Double?,
    private val minDurationMs: Long?,
    private val minEnergy: Double?,
    private val minInstrumentalness: Double?,
    private val minKey: Long?,
    private val minLiveness: Double?,
    private val minLoudness: Double?,
    private val minMode: Long?,
    private val minPopularity: Long?,
    private val minSpeechiness: Double?,
    private val minTempo: Double?,
    private val minTimeSignature: Long?,
    private val minValence: Double?,
    private val seedArtists: String?,
    private val seedGenres: String?,
    private val seedTracks: String?,
    private val targetAcousticness: Double?,
    private val targetDanceability: Double?,
    private val targetDurationMs: Long?,
    private val targetEnergy: Double?,
    private val targetInstrumentalness: Double?,
    private val targetKey: Long?,
    private val targetLiveness: Double?,
    private val targetLoudness: Double?,
    private val targetMode: Long?,
    private val targetPopularity: Long?,
    private val targetSpeechiness: Double?,
    private val targetTempo: Double?,
    private val targetTimeSignature: Long?,
    private val targetValence: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The target size of the list of recommended tracks. For seeds with unusually small pools or
     * when highly restrictive filtering is applied, it may be impossible to generate the requested
     * number of recommended tracks. Debugging information for such cases is available in the
     * response. Default: 20\. Minimum: 1\. Maximum: 100.
     */
    fun limit(): Long? = limit

    /**
     * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). If a
     * country code is specified, only content that is available in that market will be
     * returned.<br/> If a valid user access token is specified in the request header, the country
     * associated with the user account will take priority over this parameter.<br/> _**Note**: If
     * neither market or user country are provided, the content is considered unavailable for the
     * client._<br/> Users can view the country that is associated with their account in the
     * [account settings](https://www.spotify.com/account/overview/).
     */
    fun market(): String? = market

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxAcousticness(): Double? = maxAcousticness

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxDanceability(): Double? = maxDanceability

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxDurationMs(): Long? = maxDurationMs

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxEnergy(): Double? = maxEnergy

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxInstrumentalness(): Double? = maxInstrumentalness

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxKey(): Long? = maxKey

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxLiveness(): Double? = maxLiveness

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxLoudness(): Double? = maxLoudness

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxMode(): Long? = maxMode

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxPopularity(): Long? = maxPopularity

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxSpeechiness(): Double? = maxSpeechiness

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxTempo(): Double? = maxTempo

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxTimeSignature(): Long? = maxTimeSignature

    /**
     * For each tunable track attribute, a hard ceiling on the selected track attribute’s value can
     * be provided. See tunable track attributes below for the list of available options. For
     * example, `max_instrumentalness=0.35` would filter out most tracks that are likely to be
     * instrumental.
     */
    fun maxValence(): Double? = maxValence

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minAcousticness(): Double? = minAcousticness

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minDanceability(): Double? = minDanceability

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minDurationMs(): Long? = minDurationMs

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minEnergy(): Double? = minEnergy

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minInstrumentalness(): Double? = minInstrumentalness

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minKey(): Long? = minKey

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minLiveness(): Double? = minLiveness

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minLoudness(): Double? = minLoudness

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minMode(): Long? = minMode

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minPopularity(): Long? = minPopularity

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minSpeechiness(): Double? = minSpeechiness

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minTempo(): Double? = minTempo

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minTimeSignature(): Long? = minTimeSignature

    /**
     * For each tunable track attribute, a hard floor on the selected track attribute’s value can be
     * provided. See tunable track attributes below for the list of available options. For example,
     * `min_tempo=140` would restrict results to only those tracks with a tempo of greater than 140
     * beats per minute.
     */
    fun minValence(): Double? = minValence

    /**
     * A comma separated list of [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids) for
     * seed artists. Up to 5 seed values may be provided in any combination of `seed_artists`,
     * `seed_tracks` and `seed_genres`.<br/> _**Note**: only required if `seed_genres` and
     * `seed_tracks` are not set_.
     */
    fun seedArtists(): String? = seedArtists

    /**
     * A comma separated list of any genres in the set of
     * [available genre seeds](/documentation/web-api/reference/get-recommendation-genres). Up to 5
     * seed values may be provided in any combination of `seed_artists`, `seed_tracks` and
     * `seed_genres`.<br/> _**Note**: only required if `seed_artists` and `seed_tracks` are not
     * set_.
     */
    fun seedGenres(): String? = seedGenres

    /**
     * A comma separated list of [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids) for
     * a seed track. Up to 5 seed values may be provided in any combination of `seed_artists`,
     * `seed_tracks` and `seed_genres`.<br/> _**Note**: only required if `seed_artists` and
     * `seed_genres` are not set_.
     */
    fun seedTracks(): String? = seedTracks

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetAcousticness(): Double? = targetAcousticness

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetDanceability(): Double? = targetDanceability

    /** Target duration of the track (ms) */
    fun targetDurationMs(): Long? = targetDurationMs

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetEnergy(): Double? = targetEnergy

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetInstrumentalness(): Double? = targetInstrumentalness

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetKey(): Long? = targetKey

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetLiveness(): Double? = targetLiveness

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetLoudness(): Double? = targetLoudness

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetMode(): Long? = targetMode

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetPopularity(): Long? = targetPopularity

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetSpeechiness(): Double? = targetSpeechiness

    /** Target tempo (BPM) */
    fun targetTempo(): Double? = targetTempo

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetTimeSignature(): Long? = targetTimeSignature

    /**
     * For each of the tunable track attributes (below) a target value may be provided. Tracks with
     * the attribute values nearest to the target values will be preferred. For example, you might
     * request `target_energy=0.6` and `target_danceability=0.8`. All target values will be weighed
     * equally in ranking results.
     */
    fun targetValence(): Double? = targetValence

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): RecommendationGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RecommendationGetParams]. */
        fun builder() = Builder()
    }

    /** A builder for [RecommendationGetParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var market: String? = null
        private var maxAcousticness: Double? = null
        private var maxDanceability: Double? = null
        private var maxDurationMs: Long? = null
        private var maxEnergy: Double? = null
        private var maxInstrumentalness: Double? = null
        private var maxKey: Long? = null
        private var maxLiveness: Double? = null
        private var maxLoudness: Double? = null
        private var maxMode: Long? = null
        private var maxPopularity: Long? = null
        private var maxSpeechiness: Double? = null
        private var maxTempo: Double? = null
        private var maxTimeSignature: Long? = null
        private var maxValence: Double? = null
        private var minAcousticness: Double? = null
        private var minDanceability: Double? = null
        private var minDurationMs: Long? = null
        private var minEnergy: Double? = null
        private var minInstrumentalness: Double? = null
        private var minKey: Long? = null
        private var minLiveness: Double? = null
        private var minLoudness: Double? = null
        private var minMode: Long? = null
        private var minPopularity: Long? = null
        private var minSpeechiness: Double? = null
        private var minTempo: Double? = null
        private var minTimeSignature: Long? = null
        private var minValence: Double? = null
        private var seedArtists: String? = null
        private var seedGenres: String? = null
        private var seedTracks: String? = null
        private var targetAcousticness: Double? = null
        private var targetDanceability: Double? = null
        private var targetDurationMs: Long? = null
        private var targetEnergy: Double? = null
        private var targetInstrumentalness: Double? = null
        private var targetKey: Long? = null
        private var targetLiveness: Double? = null
        private var targetLoudness: Double? = null
        private var targetMode: Long? = null
        private var targetPopularity: Long? = null
        private var targetSpeechiness: Double? = null
        private var targetTempo: Double? = null
        private var targetTimeSignature: Long? = null
        private var targetValence: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(recommendationGetParams: RecommendationGetParams) = apply {
            limit = recommendationGetParams.limit
            market = recommendationGetParams.market
            maxAcousticness = recommendationGetParams.maxAcousticness
            maxDanceability = recommendationGetParams.maxDanceability
            maxDurationMs = recommendationGetParams.maxDurationMs
            maxEnergy = recommendationGetParams.maxEnergy
            maxInstrumentalness = recommendationGetParams.maxInstrumentalness
            maxKey = recommendationGetParams.maxKey
            maxLiveness = recommendationGetParams.maxLiveness
            maxLoudness = recommendationGetParams.maxLoudness
            maxMode = recommendationGetParams.maxMode
            maxPopularity = recommendationGetParams.maxPopularity
            maxSpeechiness = recommendationGetParams.maxSpeechiness
            maxTempo = recommendationGetParams.maxTempo
            maxTimeSignature = recommendationGetParams.maxTimeSignature
            maxValence = recommendationGetParams.maxValence
            minAcousticness = recommendationGetParams.minAcousticness
            minDanceability = recommendationGetParams.minDanceability
            minDurationMs = recommendationGetParams.minDurationMs
            minEnergy = recommendationGetParams.minEnergy
            minInstrumentalness = recommendationGetParams.minInstrumentalness
            minKey = recommendationGetParams.minKey
            minLiveness = recommendationGetParams.minLiveness
            minLoudness = recommendationGetParams.minLoudness
            minMode = recommendationGetParams.minMode
            minPopularity = recommendationGetParams.minPopularity
            minSpeechiness = recommendationGetParams.minSpeechiness
            minTempo = recommendationGetParams.minTempo
            minTimeSignature = recommendationGetParams.minTimeSignature
            minValence = recommendationGetParams.minValence
            seedArtists = recommendationGetParams.seedArtists
            seedGenres = recommendationGetParams.seedGenres
            seedTracks = recommendationGetParams.seedTracks
            targetAcousticness = recommendationGetParams.targetAcousticness
            targetDanceability = recommendationGetParams.targetDanceability
            targetDurationMs = recommendationGetParams.targetDurationMs
            targetEnergy = recommendationGetParams.targetEnergy
            targetInstrumentalness = recommendationGetParams.targetInstrumentalness
            targetKey = recommendationGetParams.targetKey
            targetLiveness = recommendationGetParams.targetLiveness
            targetLoudness = recommendationGetParams.targetLoudness
            targetMode = recommendationGetParams.targetMode
            targetPopularity = recommendationGetParams.targetPopularity
            targetSpeechiness = recommendationGetParams.targetSpeechiness
            targetTempo = recommendationGetParams.targetTempo
            targetTimeSignature = recommendationGetParams.targetTimeSignature
            targetValence = recommendationGetParams.targetValence
            additionalHeaders = recommendationGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = recommendationGetParams.additionalQueryParams.toBuilder()
        }

        /**
         * The target size of the list of recommended tracks. For seeds with unusually small pools
         * or when highly restrictive filtering is applied, it may be impossible to generate the
         * requested number of recommended tracks. Debugging information for such cases is available
         * in the response. Default: 20\. Minimum: 1\. Maximum: 100.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         * If a country code is specified, only content that is available in that market will be
         * returned.<br/> If a valid user access token is specified in the request header, the
         * country associated with the user account will take priority over this parameter.<br/>
         * _**Note**: If neither market or user country are provided, the content is considered
         * unavailable for the client._<br/> Users can view the country that is associated with
         * their account in the [account settings](https://www.spotify.com/account/overview/).
         */
        fun market(market: String?) = apply { this.market = market }

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxAcousticness(maxAcousticness: Double?) = apply {
            this.maxAcousticness = maxAcousticness
        }

        /**
         * Alias for [Builder.maxAcousticness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxAcousticness(maxAcousticness: Double) = maxAcousticness(maxAcousticness as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxDanceability(maxDanceability: Double?) = apply {
            this.maxDanceability = maxDanceability
        }

        /**
         * Alias for [Builder.maxDanceability].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDanceability(maxDanceability: Double) = maxDanceability(maxDanceability as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxDurationMs(maxDurationMs: Long?) = apply { this.maxDurationMs = maxDurationMs }

        /**
         * Alias for [Builder.maxDurationMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDurationMs(maxDurationMs: Long) = maxDurationMs(maxDurationMs as Long?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxEnergy(maxEnergy: Double?) = apply { this.maxEnergy = maxEnergy }

        /**
         * Alias for [Builder.maxEnergy].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxEnergy(maxEnergy: Double) = maxEnergy(maxEnergy as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxInstrumentalness(maxInstrumentalness: Double?) = apply {
            this.maxInstrumentalness = maxInstrumentalness
        }

        /**
         * Alias for [Builder.maxInstrumentalness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxInstrumentalness(maxInstrumentalness: Double) =
            maxInstrumentalness(maxInstrumentalness as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxKey(maxKey: Long?) = apply { this.maxKey = maxKey }

        /**
         * Alias for [Builder.maxKey].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxKey(maxKey: Long) = maxKey(maxKey as Long?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxLiveness(maxLiveness: Double?) = apply { this.maxLiveness = maxLiveness }

        /**
         * Alias for [Builder.maxLiveness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLiveness(maxLiveness: Double) = maxLiveness(maxLiveness as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxLoudness(maxLoudness: Double?) = apply { this.maxLoudness = maxLoudness }

        /**
         * Alias for [Builder.maxLoudness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLoudness(maxLoudness: Double) = maxLoudness(maxLoudness as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxMode(maxMode: Long?) = apply { this.maxMode = maxMode }

        /**
         * Alias for [Builder.maxMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxMode(maxMode: Long) = maxMode(maxMode as Long?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxPopularity(maxPopularity: Long?) = apply { this.maxPopularity = maxPopularity }

        /**
         * Alias for [Builder.maxPopularity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxPopularity(maxPopularity: Long) = maxPopularity(maxPopularity as Long?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxSpeechiness(maxSpeechiness: Double?) = apply { this.maxSpeechiness = maxSpeechiness }

        /**
         * Alias for [Builder.maxSpeechiness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxSpeechiness(maxSpeechiness: Double) = maxSpeechiness(maxSpeechiness as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxTempo(maxTempo: Double?) = apply { this.maxTempo = maxTempo }

        /**
         * Alias for [Builder.maxTempo].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTempo(maxTempo: Double) = maxTempo(maxTempo as Double?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxTimeSignature(maxTimeSignature: Long?) = apply {
            this.maxTimeSignature = maxTimeSignature
        }

        /**
         * Alias for [Builder.maxTimeSignature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTimeSignature(maxTimeSignature: Long) = maxTimeSignature(maxTimeSignature as Long?)

        /**
         * For each tunable track attribute, a hard ceiling on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `max_instrumentalness=0.35` would filter out most tracks that are likely to
         * be instrumental.
         */
        fun maxValence(maxValence: Double?) = apply { this.maxValence = maxValence }

        /**
         * Alias for [Builder.maxValence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxValence(maxValence: Double) = maxValence(maxValence as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minAcousticness(minAcousticness: Double?) = apply {
            this.minAcousticness = minAcousticness
        }

        /**
         * Alias for [Builder.minAcousticness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minAcousticness(minAcousticness: Double) = minAcousticness(minAcousticness as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minDanceability(minDanceability: Double?) = apply {
            this.minDanceability = minDanceability
        }

        /**
         * Alias for [Builder.minDanceability].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minDanceability(minDanceability: Double) = minDanceability(minDanceability as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minDurationMs(minDurationMs: Long?) = apply { this.minDurationMs = minDurationMs }

        /**
         * Alias for [Builder.minDurationMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minDurationMs(minDurationMs: Long) = minDurationMs(minDurationMs as Long?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minEnergy(minEnergy: Double?) = apply { this.minEnergy = minEnergy }

        /**
         * Alias for [Builder.minEnergy].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minEnergy(minEnergy: Double) = minEnergy(minEnergy as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minInstrumentalness(minInstrumentalness: Double?) = apply {
            this.minInstrumentalness = minInstrumentalness
        }

        /**
         * Alias for [Builder.minInstrumentalness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minInstrumentalness(minInstrumentalness: Double) =
            minInstrumentalness(minInstrumentalness as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minKey(minKey: Long?) = apply { this.minKey = minKey }

        /**
         * Alias for [Builder.minKey].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minKey(minKey: Long) = minKey(minKey as Long?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minLiveness(minLiveness: Double?) = apply { this.minLiveness = minLiveness }

        /**
         * Alias for [Builder.minLiveness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minLiveness(minLiveness: Double) = minLiveness(minLiveness as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minLoudness(minLoudness: Double?) = apply { this.minLoudness = minLoudness }

        /**
         * Alias for [Builder.minLoudness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minLoudness(minLoudness: Double) = minLoudness(minLoudness as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minMode(minMode: Long?) = apply { this.minMode = minMode }

        /**
         * Alias for [Builder.minMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minMode(minMode: Long) = minMode(minMode as Long?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minPopularity(minPopularity: Long?) = apply { this.minPopularity = minPopularity }

        /**
         * Alias for [Builder.minPopularity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minPopularity(minPopularity: Long) = minPopularity(minPopularity as Long?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minSpeechiness(minSpeechiness: Double?) = apply { this.minSpeechiness = minSpeechiness }

        /**
         * Alias for [Builder.minSpeechiness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minSpeechiness(minSpeechiness: Double) = minSpeechiness(minSpeechiness as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minTempo(minTempo: Double?) = apply { this.minTempo = minTempo }

        /**
         * Alias for [Builder.minTempo].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minTempo(minTempo: Double) = minTempo(minTempo as Double?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minTimeSignature(minTimeSignature: Long?) = apply {
            this.minTimeSignature = minTimeSignature
        }

        /**
         * Alias for [Builder.minTimeSignature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minTimeSignature(minTimeSignature: Long) = minTimeSignature(minTimeSignature as Long?)

        /**
         * For each tunable track attribute, a hard floor on the selected track attribute’s value
         * can be provided. See tunable track attributes below for the list of available options.
         * For example, `min_tempo=140` would restrict results to only those tracks with a tempo of
         * greater than 140 beats per minute.
         */
        fun minValence(minValence: Double?) = apply { this.minValence = minValence }

        /**
         * Alias for [Builder.minValence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minValence(minValence: Double) = minValence(minValence as Double?)

        /**
         * A comma separated list of [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids)
         * for seed artists. Up to 5 seed values may be provided in any combination of
         * `seed_artists`, `seed_tracks` and `seed_genres`.<br/> _**Note**: only required if
         * `seed_genres` and `seed_tracks` are not set_.
         */
        fun seedArtists(seedArtists: String?) = apply { this.seedArtists = seedArtists }

        /**
         * A comma separated list of any genres in the set of
         * [available genre seeds](/documentation/web-api/reference/get-recommendation-genres). Up
         * to 5 seed values may be provided in any combination of `seed_artists`, `seed_tracks` and
         * `seed_genres`.<br/> _**Note**: only required if `seed_artists` and `seed_tracks` are not
         * set_.
         */
        fun seedGenres(seedGenres: String?) = apply { this.seedGenres = seedGenres }

        /**
         * A comma separated list of [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids)
         * for a seed track. Up to 5 seed values may be provided in any combination of
         * `seed_artists`, `seed_tracks` and `seed_genres`.<br/> _**Note**: only required if
         * `seed_artists` and `seed_genres` are not set_.
         */
        fun seedTracks(seedTracks: String?) = apply { this.seedTracks = seedTracks }

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetAcousticness(targetAcousticness: Double?) = apply {
            this.targetAcousticness = targetAcousticness
        }

        /**
         * Alias for [Builder.targetAcousticness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetAcousticness(targetAcousticness: Double) =
            targetAcousticness(targetAcousticness as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetDanceability(targetDanceability: Double?) = apply {
            this.targetDanceability = targetDanceability
        }

        /**
         * Alias for [Builder.targetDanceability].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetDanceability(targetDanceability: Double) =
            targetDanceability(targetDanceability as Double?)

        /** Target duration of the track (ms) */
        fun targetDurationMs(targetDurationMs: Long?) = apply {
            this.targetDurationMs = targetDurationMs
        }

        /**
         * Alias for [Builder.targetDurationMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetDurationMs(targetDurationMs: Long) = targetDurationMs(targetDurationMs as Long?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetEnergy(targetEnergy: Double?) = apply { this.targetEnergy = targetEnergy }

        /**
         * Alias for [Builder.targetEnergy].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetEnergy(targetEnergy: Double) = targetEnergy(targetEnergy as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetInstrumentalness(targetInstrumentalness: Double?) = apply {
            this.targetInstrumentalness = targetInstrumentalness
        }

        /**
         * Alias for [Builder.targetInstrumentalness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetInstrumentalness(targetInstrumentalness: Double) =
            targetInstrumentalness(targetInstrumentalness as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetKey(targetKey: Long?) = apply { this.targetKey = targetKey }

        /**
         * Alias for [Builder.targetKey].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetKey(targetKey: Long) = targetKey(targetKey as Long?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetLiveness(targetLiveness: Double?) = apply { this.targetLiveness = targetLiveness }

        /**
         * Alias for [Builder.targetLiveness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetLiveness(targetLiveness: Double) = targetLiveness(targetLiveness as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetLoudness(targetLoudness: Double?) = apply { this.targetLoudness = targetLoudness }

        /**
         * Alias for [Builder.targetLoudness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetLoudness(targetLoudness: Double) = targetLoudness(targetLoudness as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetMode(targetMode: Long?) = apply { this.targetMode = targetMode }

        /**
         * Alias for [Builder.targetMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetMode(targetMode: Long) = targetMode(targetMode as Long?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetPopularity(targetPopularity: Long?) = apply {
            this.targetPopularity = targetPopularity
        }

        /**
         * Alias for [Builder.targetPopularity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetPopularity(targetPopularity: Long) = targetPopularity(targetPopularity as Long?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetSpeechiness(targetSpeechiness: Double?) = apply {
            this.targetSpeechiness = targetSpeechiness
        }

        /**
         * Alias for [Builder.targetSpeechiness].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetSpeechiness(targetSpeechiness: Double) =
            targetSpeechiness(targetSpeechiness as Double?)

        /** Target tempo (BPM) */
        fun targetTempo(targetTempo: Double?) = apply { this.targetTempo = targetTempo }

        /**
         * Alias for [Builder.targetTempo].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetTempo(targetTempo: Double) = targetTempo(targetTempo as Double?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetTimeSignature(targetTimeSignature: Long?) = apply {
            this.targetTimeSignature = targetTimeSignature
        }

        /**
         * Alias for [Builder.targetTimeSignature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetTimeSignature(targetTimeSignature: Long) =
            targetTimeSignature(targetTimeSignature as Long?)

        /**
         * For each of the tunable track attributes (below) a target value may be provided. Tracks
         * with the attribute values nearest to the target values will be preferred. For example,
         * you might request `target_energy=0.6` and `target_danceability=0.8`. All target values
         * will be weighed equally in ranking results.
         */
        fun targetValence(targetValence: Double?) = apply { this.targetValence = targetValence }

        /**
         * Alias for [Builder.targetValence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun targetValence(targetValence: Double) = targetValence(targetValence as Double?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RecommendationGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecommendationGetParams =
            RecommendationGetParams(
                limit,
                market,
                maxAcousticness,
                maxDanceability,
                maxDurationMs,
                maxEnergy,
                maxInstrumentalness,
                maxKey,
                maxLiveness,
                maxLoudness,
                maxMode,
                maxPopularity,
                maxSpeechiness,
                maxTempo,
                maxTimeSignature,
                maxValence,
                minAcousticness,
                minDanceability,
                minDurationMs,
                minEnergy,
                minInstrumentalness,
                minKey,
                minLiveness,
                minLoudness,
                minMode,
                minPopularity,
                minSpeechiness,
                minTempo,
                minTimeSignature,
                minValence,
                seedArtists,
                seedGenres,
                seedTracks,
                targetAcousticness,
                targetDanceability,
                targetDurationMs,
                targetEnergy,
                targetInstrumentalness,
                targetKey,
                targetLiveness,
                targetLoudness,
                targetMode,
                targetPopularity,
                targetSpeechiness,
                targetTempo,
                targetTimeSignature,
                targetValence,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                market?.let { put("market", it) }
                maxAcousticness?.let { put("max_acousticness", it.toString()) }
                maxDanceability?.let { put("max_danceability", it.toString()) }
                maxDurationMs?.let { put("max_duration_ms", it.toString()) }
                maxEnergy?.let { put("max_energy", it.toString()) }
                maxInstrumentalness?.let { put("max_instrumentalness", it.toString()) }
                maxKey?.let { put("max_key", it.toString()) }
                maxLiveness?.let { put("max_liveness", it.toString()) }
                maxLoudness?.let { put("max_loudness", it.toString()) }
                maxMode?.let { put("max_mode", it.toString()) }
                maxPopularity?.let { put("max_popularity", it.toString()) }
                maxSpeechiness?.let { put("max_speechiness", it.toString()) }
                maxTempo?.let { put("max_tempo", it.toString()) }
                maxTimeSignature?.let { put("max_time_signature", it.toString()) }
                maxValence?.let { put("max_valence", it.toString()) }
                minAcousticness?.let { put("min_acousticness", it.toString()) }
                minDanceability?.let { put("min_danceability", it.toString()) }
                minDurationMs?.let { put("min_duration_ms", it.toString()) }
                minEnergy?.let { put("min_energy", it.toString()) }
                minInstrumentalness?.let { put("min_instrumentalness", it.toString()) }
                minKey?.let { put("min_key", it.toString()) }
                minLiveness?.let { put("min_liveness", it.toString()) }
                minLoudness?.let { put("min_loudness", it.toString()) }
                minMode?.let { put("min_mode", it.toString()) }
                minPopularity?.let { put("min_popularity", it.toString()) }
                minSpeechiness?.let { put("min_speechiness", it.toString()) }
                minTempo?.let { put("min_tempo", it.toString()) }
                minTimeSignature?.let { put("min_time_signature", it.toString()) }
                minValence?.let { put("min_valence", it.toString()) }
                seedArtists?.let { put("seed_artists", it) }
                seedGenres?.let { put("seed_genres", it) }
                seedTracks?.let { put("seed_tracks", it) }
                targetAcousticness?.let { put("target_acousticness", it.toString()) }
                targetDanceability?.let { put("target_danceability", it.toString()) }
                targetDurationMs?.let { put("target_duration_ms", it.toString()) }
                targetEnergy?.let { put("target_energy", it.toString()) }
                targetInstrumentalness?.let { put("target_instrumentalness", it.toString()) }
                targetKey?.let { put("target_key", it.toString()) }
                targetLiveness?.let { put("target_liveness", it.toString()) }
                targetLoudness?.let { put("target_loudness", it.toString()) }
                targetMode?.let { put("target_mode", it.toString()) }
                targetPopularity?.let { put("target_popularity", it.toString()) }
                targetSpeechiness?.let { put("target_speechiness", it.toString()) }
                targetTempo?.let { put("target_tempo", it.toString()) }
                targetTimeSignature?.let { put("target_time_signature", it.toString()) }
                targetValence?.let { put("target_valence", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecommendationGetParams &&
            limit == other.limit &&
            market == other.market &&
            maxAcousticness == other.maxAcousticness &&
            maxDanceability == other.maxDanceability &&
            maxDurationMs == other.maxDurationMs &&
            maxEnergy == other.maxEnergy &&
            maxInstrumentalness == other.maxInstrumentalness &&
            maxKey == other.maxKey &&
            maxLiveness == other.maxLiveness &&
            maxLoudness == other.maxLoudness &&
            maxMode == other.maxMode &&
            maxPopularity == other.maxPopularity &&
            maxSpeechiness == other.maxSpeechiness &&
            maxTempo == other.maxTempo &&
            maxTimeSignature == other.maxTimeSignature &&
            maxValence == other.maxValence &&
            minAcousticness == other.minAcousticness &&
            minDanceability == other.minDanceability &&
            minDurationMs == other.minDurationMs &&
            minEnergy == other.minEnergy &&
            minInstrumentalness == other.minInstrumentalness &&
            minKey == other.minKey &&
            minLiveness == other.minLiveness &&
            minLoudness == other.minLoudness &&
            minMode == other.minMode &&
            minPopularity == other.minPopularity &&
            minSpeechiness == other.minSpeechiness &&
            minTempo == other.minTempo &&
            minTimeSignature == other.minTimeSignature &&
            minValence == other.minValence &&
            seedArtists == other.seedArtists &&
            seedGenres == other.seedGenres &&
            seedTracks == other.seedTracks &&
            targetAcousticness == other.targetAcousticness &&
            targetDanceability == other.targetDanceability &&
            targetDurationMs == other.targetDurationMs &&
            targetEnergy == other.targetEnergy &&
            targetInstrumentalness == other.targetInstrumentalness &&
            targetKey == other.targetKey &&
            targetLiveness == other.targetLiveness &&
            targetLoudness == other.targetLoudness &&
            targetMode == other.targetMode &&
            targetPopularity == other.targetPopularity &&
            targetSpeechiness == other.targetSpeechiness &&
            targetTempo == other.targetTempo &&
            targetTimeSignature == other.targetTimeSignature &&
            targetValence == other.targetValence &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            limit,
            market,
            maxAcousticness,
            maxDanceability,
            maxDurationMs,
            maxEnergy,
            maxInstrumentalness,
            maxKey,
            maxLiveness,
            maxLoudness,
            maxMode,
            maxPopularity,
            maxSpeechiness,
            maxTempo,
            maxTimeSignature,
            maxValence,
            minAcousticness,
            minDanceability,
            minDurationMs,
            minEnergy,
            minInstrumentalness,
            minKey,
            minLiveness,
            minLoudness,
            minMode,
            minPopularity,
            minSpeechiness,
            minTempo,
            minTimeSignature,
            minValence,
            seedArtists,
            seedGenres,
            seedTracks,
            targetAcousticness,
            targetDanceability,
            targetDurationMs,
            targetEnergy,
            targetInstrumentalness,
            targetKey,
            targetLiveness,
            targetLoudness,
            targetMode,
            targetPopularity,
            targetSpeechiness,
            targetTempo,
            targetTimeSignature,
            targetValence,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RecommendationGetParams{limit=$limit, market=$market, maxAcousticness=$maxAcousticness, maxDanceability=$maxDanceability, maxDurationMs=$maxDurationMs, maxEnergy=$maxEnergy, maxInstrumentalness=$maxInstrumentalness, maxKey=$maxKey, maxLiveness=$maxLiveness, maxLoudness=$maxLoudness, maxMode=$maxMode, maxPopularity=$maxPopularity, maxSpeechiness=$maxSpeechiness, maxTempo=$maxTempo, maxTimeSignature=$maxTimeSignature, maxValence=$maxValence, minAcousticness=$minAcousticness, minDanceability=$minDanceability, minDurationMs=$minDurationMs, minEnergy=$minEnergy, minInstrumentalness=$minInstrumentalness, minKey=$minKey, minLiveness=$minLiveness, minLoudness=$minLoudness, minMode=$minMode, minPopularity=$minPopularity, minSpeechiness=$minSpeechiness, minTempo=$minTempo, minTimeSignature=$minTimeSignature, minValence=$minValence, seedArtists=$seedArtists, seedGenres=$seedGenres, seedTracks=$seedTracks, targetAcousticness=$targetAcousticness, targetDanceability=$targetDanceability, targetDurationMs=$targetDurationMs, targetEnergy=$targetEnergy, targetInstrumentalness=$targetInstrumentalness, targetKey=$targetKey, targetLiveness=$targetLiveness, targetLoudness=$targetLoudness, targetMode=$targetMode, targetPopularity=$targetPopularity, targetSpeechiness=$targetSpeechiness, targetTempo=$targetTempo, targetTimeSignature=$targetTimeSignature, targetValence=$targetValence, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
