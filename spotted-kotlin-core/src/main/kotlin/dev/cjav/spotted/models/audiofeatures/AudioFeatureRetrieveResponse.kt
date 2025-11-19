// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiofeatures

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.Enum
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class AudioFeatureRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acousticness: JsonField<Float>,
    private val analysisUrl: JsonField<String>,
    private val danceability: JsonField<Float>,
    private val durationMs: JsonField<Long>,
    private val energy: JsonField<Float>,
    private val instrumentalness: JsonField<Float>,
    private val key: JsonField<Long>,
    private val liveness: JsonField<Float>,
    private val loudness: JsonField<Float>,
    private val mode: JsonField<Long>,
    private val speechiness: JsonField<Float>,
    private val tempo: JsonField<Float>,
    private val timeSignature: JsonField<Long>,
    private val trackHref: JsonField<String>,
    private val type: JsonField<Type>,
    private val uri: JsonField<String>,
    private val valence: JsonField<Float>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acousticness")
        @ExcludeMissing
        acousticness: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("analysis_url")
        @ExcludeMissing
        analysisUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("danceability")
        @ExcludeMissing
        danceability: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("energy") @ExcludeMissing energy: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("instrumentalness")
        @ExcludeMissing
        instrumentalness: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("liveness") @ExcludeMissing liveness: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("loudness") @ExcludeMissing loudness: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("speechiness")
        @ExcludeMissing
        speechiness: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("tempo") @ExcludeMissing tempo: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("time_signature")
        @ExcludeMissing
        timeSignature: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("track_href") @ExcludeMissing trackHref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valence") @ExcludeMissing valence: JsonField<Float> = JsonMissing.of(),
    ) : this(
        id,
        acousticness,
        analysisUrl,
        danceability,
        durationMs,
        energy,
        instrumentalness,
        key,
        liveness,
        loudness,
        mode,
        speechiness,
        tempo,
        timeSignature,
        trackHref,
        type,
        uri,
        valence,
        mutableMapOf(),
    )

    /**
     * The Spotify ID for the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * A confidence measure from 0.0 to 1.0 of whether the track is acoustic. 1.0 represents high
     * confidence the track is acoustic.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acousticness(): Float? = acousticness.getNullable("acousticness")

    /**
     * A URL to access the full audio analysis of this track. An access token is required to access
     * this data.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun analysisUrl(): String? = analysisUrl.getNullable("analysis_url")

    /**
     * Danceability describes how suitable a track is for dancing based on a combination of musical
     * elements including tempo, rhythm stability, beat strength, and overall regularity. A value of
     * 0.0 is least danceable and 1.0 is most danceable.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun danceability(): Float? = danceability.getNullable("danceability")

    /**
     * The duration of the track in milliseconds.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Long? = durationMs.getNullable("duration_ms")

    /**
     * Energy is a measure from 0.0 to 1.0 and represents a perceptual measure of intensity and
     * activity. Typically, energetic tracks feel fast, loud, and noisy. For example, death metal
     * has high energy, while a Bach prelude scores low on the scale. Perceptual features
     * contributing to this attribute include dynamic range, perceived loudness, timbre, onset rate,
     * and general entropy.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun energy(): Float? = energy.getNullable("energy")

    /**
     * Predicts whether a track contains no vocals. "Ooh" and "aah" sounds are treated as
     * instrumental in this context. Rap or spoken word tracks are clearly "vocal". The closer the
     * instrumentalness value is to 1.0, the greater likelihood the track contains no vocal content.
     * Values above 0.5 are intended to represent instrumental tracks, but confidence is higher as
     * the value approaches 1.0.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentalness(): Float? = instrumentalness.getNullable("instrumentalness")

    /**
     * The key the track is in. Integers map to pitches using standard
     * [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 = C♯/D♭, 2 =
     * D, and so on. If no key was detected, the value is -1.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun key(): Long? = key.getNullable("key")

    /**
     * Detects the presence of an audience in the recording. Higher liveness values represent an
     * increased probability that the track was performed live. A value above 0.8 provides strong
     * likelihood that the track is live.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun liveness(): Float? = liveness.getNullable("liveness")

    /**
     * The overall loudness of a track in decibels (dB). Loudness values are averaged across the
     * entire track and are useful for comparing relative loudness of tracks. Loudness is the
     * quality of a sound that is the primary psychological correlate of physical strength
     * (amplitude). Values typically range between -60 and 0 db.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loudness(): Float? = loudness.getNullable("loudness")

    /**
     * Mode indicates the modality (major or minor) of a track, the type of scale from which its
     * melodic content is derived. Major is represented by 1 and minor is 0.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Long? = mode.getNullable("mode")

    /**
     * Speechiness detects the presence of spoken words in a track. The more exclusively speech-like
     * the recording (e.g. talk show, audio book, poetry), the closer to 1.0 the attribute value.
     * Values above 0.66 describe tracks that are probably made entirely of spoken words. Values
     * between 0.33 and 0.66 describe tracks that may contain both music and speech, either in
     * sections or layered, including such cases as rap music. Values below 0.33 most likely
     * represent music and other non-speech-like tracks.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speechiness(): Float? = speechiness.getNullable("speechiness")

    /**
     * The overall estimated tempo of a track in beats per minute (BPM). In musical terminology,
     * tempo is the speed or pace of a given piece and derives directly from the average beat
     * duration.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tempo(): Float? = tempo.getNullable("tempo")

    /**
     * An estimated time signature. The time signature (meter) is a notational convention to specify
     * how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating
     * time signatures of "3/4", to "7/4".
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeSignature(): Long? = timeSignature.getNullable("time_signature")

    /**
     * A link to the Web API endpoint providing full details of the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trackHref(): String? = trackHref.getNullable("track_href")

    /**
     * The object type.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Type? = type.getNullable("type")

    /**
     * The Spotify URI for the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): String? = uri.getNullable("uri")

    /**
     * A measure from 0.0 to 1.0 describing the musical positiveness conveyed by a track. Tracks
     * with high valence sound more positive (e.g. happy, cheerful, euphoric), while tracks with low
     * valence sound more negative (e.g. sad, depressed, angry).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valence(): Float? = valence.getNullable("valence")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acousticness].
     *
     * Unlike [acousticness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acousticness")
    @ExcludeMissing
    fun _acousticness(): JsonField<Float> = acousticness

    /**
     * Returns the raw JSON value of [analysisUrl].
     *
     * Unlike [analysisUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("analysis_url")
    @ExcludeMissing
    fun _analysisUrl(): JsonField<String> = analysisUrl

    /**
     * Returns the raw JSON value of [danceability].
     *
     * Unlike [danceability], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("danceability")
    @ExcludeMissing
    fun _danceability(): JsonField<Float> = danceability

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_ms") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

    /**
     * Returns the raw JSON value of [energy].
     *
     * Unlike [energy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("energy") @ExcludeMissing fun _energy(): JsonField<Float> = energy

    /**
     * Returns the raw JSON value of [instrumentalness].
     *
     * Unlike [instrumentalness], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("instrumentalness")
    @ExcludeMissing
    fun _instrumentalness(): JsonField<Float> = instrumentalness

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<Long> = key

    /**
     * Returns the raw JSON value of [liveness].
     *
     * Unlike [liveness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("liveness") @ExcludeMissing fun _liveness(): JsonField<Float> = liveness

    /**
     * Returns the raw JSON value of [loudness].
     *
     * Unlike [loudness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loudness") @ExcludeMissing fun _loudness(): JsonField<Float> = loudness

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Long> = mode

    /**
     * Returns the raw JSON value of [speechiness].
     *
     * Unlike [speechiness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speechiness") @ExcludeMissing fun _speechiness(): JsonField<Float> = speechiness

    /**
     * Returns the raw JSON value of [tempo].
     *
     * Unlike [tempo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tempo") @ExcludeMissing fun _tempo(): JsonField<Float> = tempo

    /**
     * Returns the raw JSON value of [timeSignature].
     *
     * Unlike [timeSignature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_signature")
    @ExcludeMissing
    fun _timeSignature(): JsonField<Long> = timeSignature

    /**
     * Returns the raw JSON value of [trackHref].
     *
     * Unlike [trackHref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track_href") @ExcludeMissing fun _trackHref(): JsonField<String> = trackHref

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

    /**
     * Returns the raw JSON value of [valence].
     *
     * Unlike [valence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valence") @ExcludeMissing fun _valence(): JsonField<Float> = valence

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudioFeatureRetrieveResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [AudioFeatureRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var acousticness: JsonField<Float> = JsonMissing.of()
        private var analysisUrl: JsonField<String> = JsonMissing.of()
        private var danceability: JsonField<Float> = JsonMissing.of()
        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var energy: JsonField<Float> = JsonMissing.of()
        private var instrumentalness: JsonField<Float> = JsonMissing.of()
        private var key: JsonField<Long> = JsonMissing.of()
        private var liveness: JsonField<Float> = JsonMissing.of()
        private var loudness: JsonField<Float> = JsonMissing.of()
        private var mode: JsonField<Long> = JsonMissing.of()
        private var speechiness: JsonField<Float> = JsonMissing.of()
        private var tempo: JsonField<Float> = JsonMissing.of()
        private var timeSignature: JsonField<Long> = JsonMissing.of()
        private var trackHref: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var valence: JsonField<Float> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(audioFeatureRetrieveResponse: AudioFeatureRetrieveResponse) = apply {
            id = audioFeatureRetrieveResponse.id
            acousticness = audioFeatureRetrieveResponse.acousticness
            analysisUrl = audioFeatureRetrieveResponse.analysisUrl
            danceability = audioFeatureRetrieveResponse.danceability
            durationMs = audioFeatureRetrieveResponse.durationMs
            energy = audioFeatureRetrieveResponse.energy
            instrumentalness = audioFeatureRetrieveResponse.instrumentalness
            key = audioFeatureRetrieveResponse.key
            liveness = audioFeatureRetrieveResponse.liveness
            loudness = audioFeatureRetrieveResponse.loudness
            mode = audioFeatureRetrieveResponse.mode
            speechiness = audioFeatureRetrieveResponse.speechiness
            tempo = audioFeatureRetrieveResponse.tempo
            timeSignature = audioFeatureRetrieveResponse.timeSignature
            trackHref = audioFeatureRetrieveResponse.trackHref
            type = audioFeatureRetrieveResponse.type
            uri = audioFeatureRetrieveResponse.uri
            valence = audioFeatureRetrieveResponse.valence
            additionalProperties = audioFeatureRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The Spotify ID for the track. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A confidence measure from 0.0 to 1.0 of whether the track is acoustic. 1.0 represents
         * high confidence the track is acoustic.
         */
        fun acousticness(acousticness: Float) = acousticness(JsonField.of(acousticness))

        /**
         * Sets [Builder.acousticness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acousticness] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acousticness(acousticness: JsonField<Float>) = apply {
            this.acousticness = acousticness
        }

        /**
         * A URL to access the full audio analysis of this track. An access token is required to
         * access this data.
         */
        fun analysisUrl(analysisUrl: String) = analysisUrl(JsonField.of(analysisUrl))

        /**
         * Sets [Builder.analysisUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analysisUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun analysisUrl(analysisUrl: JsonField<String>) = apply { this.analysisUrl = analysisUrl }

        /**
         * Danceability describes how suitable a track is for dancing based on a combination of
         * musical elements including tempo, rhythm stability, beat strength, and overall
         * regularity. A value of 0.0 is least danceable and 1.0 is most danceable.
         */
        fun danceability(danceability: Float) = danceability(JsonField.of(danceability))

        /**
         * Sets [Builder.danceability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.danceability] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun danceability(danceability: JsonField<Float>) = apply {
            this.danceability = danceability
        }

        /** The duration of the track in milliseconds. */
        fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        /**
         * Energy is a measure from 0.0 to 1.0 and represents a perceptual measure of intensity and
         * activity. Typically, energetic tracks feel fast, loud, and noisy. For example, death
         * metal has high energy, while a Bach prelude scores low on the scale. Perceptual features
         * contributing to this attribute include dynamic range, perceived loudness, timbre, onset
         * rate, and general entropy.
         */
        fun energy(energy: Float) = energy(JsonField.of(energy))

        /**
         * Sets [Builder.energy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.energy] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun energy(energy: JsonField<Float>) = apply { this.energy = energy }

        /**
         * Predicts whether a track contains no vocals. "Ooh" and "aah" sounds are treated as
         * instrumental in this context. Rap or spoken word tracks are clearly "vocal". The closer
         * the instrumentalness value is to 1.0, the greater likelihood the track contains no vocal
         * content. Values above 0.5 are intended to represent instrumental tracks, but confidence
         * is higher as the value approaches 1.0.
         */
        fun instrumentalness(instrumentalness: Float) =
            instrumentalness(JsonField.of(instrumentalness))

        /**
         * Sets [Builder.instrumentalness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentalness] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentalness(instrumentalness: JsonField<Float>) = apply {
            this.instrumentalness = instrumentalness
        }

        /**
         * The key the track is in. Integers map to pitches using standard
         * [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 = C♯/D♭,
         * 2 = D, and so on. If no key was detected, the value is -1.
         */
        fun key(key: Long) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<Long>) = apply { this.key = key }

        /**
         * Detects the presence of an audience in the recording. Higher liveness values represent an
         * increased probability that the track was performed live. A value above 0.8 provides
         * strong likelihood that the track is live.
         */
        fun liveness(liveness: Float) = liveness(JsonField.of(liveness))

        /**
         * Sets [Builder.liveness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveness] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun liveness(liveness: JsonField<Float>) = apply { this.liveness = liveness }

        /**
         * The overall loudness of a track in decibels (dB). Loudness values are averaged across the
         * entire track and are useful for comparing relative loudness of tracks. Loudness is the
         * quality of a sound that is the primary psychological correlate of physical strength
         * (amplitude). Values typically range between -60 and 0 db.
         */
        fun loudness(loudness: Float) = loudness(JsonField.of(loudness))

        /**
         * Sets [Builder.loudness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loudness] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loudness(loudness: JsonField<Float>) = apply { this.loudness = loudness }

        /**
         * Mode indicates the modality (major or minor) of a track, the type of scale from which its
         * melodic content is derived. Major is represented by 1 and minor is 0.
         */
        fun mode(mode: Long) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Long>) = apply { this.mode = mode }

        /**
         * Speechiness detects the presence of spoken words in a track. The more exclusively
         * speech-like the recording (e.g. talk show, audio book, poetry), the closer to 1.0 the
         * attribute value. Values above 0.66 describe tracks that are probably made entirely of
         * spoken words. Values between 0.33 and 0.66 describe tracks that may contain both music
         * and speech, either in sections or layered, including such cases as rap music. Values
         * below 0.33 most likely represent music and other non-speech-like tracks.
         */
        fun speechiness(speechiness: Float) = speechiness(JsonField.of(speechiness))

        /**
         * Sets [Builder.speechiness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speechiness] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speechiness(speechiness: JsonField<Float>) = apply { this.speechiness = speechiness }

        /**
         * The overall estimated tempo of a track in beats per minute (BPM). In musical terminology,
         * tempo is the speed or pace of a given piece and derives directly from the average beat
         * duration.
         */
        fun tempo(tempo: Float) = tempo(JsonField.of(tempo))

        /**
         * Sets [Builder.tempo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempo] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tempo(tempo: JsonField<Float>) = apply { this.tempo = tempo }

        /**
         * An estimated time signature. The time signature (meter) is a notational convention to
         * specify how many beats are in each bar (or measure). The time signature ranges from 3 to
         * 7 indicating time signatures of "3/4", to "7/4".
         */
        fun timeSignature(timeSignature: Long) = timeSignature(JsonField.of(timeSignature))

        /**
         * Sets [Builder.timeSignature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeSignature] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeSignature(timeSignature: JsonField<Long>) = apply {
            this.timeSignature = timeSignature
        }

        /** A link to the Web API endpoint providing full details of the track. */
        fun trackHref(trackHref: String) = trackHref(JsonField.of(trackHref))

        /**
         * Sets [Builder.trackHref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackHref] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackHref(trackHref: JsonField<String>) = apply { this.trackHref = trackHref }

        /** The object type. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The Spotify URI for the track. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

        /**
         * A measure from 0.0 to 1.0 describing the musical positiveness conveyed by a track. Tracks
         * with high valence sound more positive (e.g. happy, cheerful, euphoric), while tracks with
         * low valence sound more negative (e.g. sad, depressed, angry).
         */
        fun valence(valence: Float) = valence(JsonField.of(valence))

        /**
         * Sets [Builder.valence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valence] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valence(valence: JsonField<Float>) = apply { this.valence = valence }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AudioFeatureRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AudioFeatureRetrieveResponse =
            AudioFeatureRetrieveResponse(
                id,
                acousticness,
                analysisUrl,
                danceability,
                durationMs,
                energy,
                instrumentalness,
                key,
                liveness,
                loudness,
                mode,
                speechiness,
                tempo,
                timeSignature,
                trackHref,
                type,
                uri,
                valence,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AudioFeatureRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        acousticness()
        analysisUrl()
        danceability()
        durationMs()
        energy()
        instrumentalness()
        key()
        liveness()
        loudness()
        mode()
        speechiness()
        tempo()
        timeSignature()
        trackHref()
        type()?.validate()
        uri()
        valence()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SpottedInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (acousticness.asKnown() == null) 0 else 1) +
            (if (analysisUrl.asKnown() == null) 0 else 1) +
            (if (danceability.asKnown() == null) 0 else 1) +
            (if (durationMs.asKnown() == null) 0 else 1) +
            (if (energy.asKnown() == null) 0 else 1) +
            (if (instrumentalness.asKnown() == null) 0 else 1) +
            (if (key.asKnown() == null) 0 else 1) +
            (if (liveness.asKnown() == null) 0 else 1) +
            (if (loudness.asKnown() == null) 0 else 1) +
            (if (mode.asKnown() == null) 0 else 1) +
            (if (speechiness.asKnown() == null) 0 else 1) +
            (if (tempo.asKnown() == null) 0 else 1) +
            (if (timeSignature.asKnown() == null) 0 else 1) +
            (if (trackHref.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (uri.asKnown() == null) 0 else 1) +
            (if (valence.asKnown() == null) 0 else 1)

    /** The object type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUDIO_FEATURES = of("audio_features")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AUDIO_FEATURES
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUDIO_FEATURES,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUDIO_FEATURES -> Value.AUDIO_FEATURES
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUDIO_FEATURES -> Known.AUDIO_FEATURES
                else -> throw SpottedInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SpottedInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SpottedInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudioFeatureRetrieveResponse &&
            id == other.id &&
            acousticness == other.acousticness &&
            analysisUrl == other.analysisUrl &&
            danceability == other.danceability &&
            durationMs == other.durationMs &&
            energy == other.energy &&
            instrumentalness == other.instrumentalness &&
            key == other.key &&
            liveness == other.liveness &&
            loudness == other.loudness &&
            mode == other.mode &&
            speechiness == other.speechiness &&
            tempo == other.tempo &&
            timeSignature == other.timeSignature &&
            trackHref == other.trackHref &&
            type == other.type &&
            uri == other.uri &&
            valence == other.valence &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acousticness,
            analysisUrl,
            danceability,
            durationMs,
            energy,
            instrumentalness,
            key,
            liveness,
            loudness,
            mode,
            speechiness,
            tempo,
            timeSignature,
            trackHref,
            type,
            uri,
            valence,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudioFeatureRetrieveResponse{id=$id, acousticness=$acousticness, analysisUrl=$analysisUrl, danceability=$danceability, durationMs=$durationMs, energy=$energy, instrumentalness=$instrumentalness, key=$key, liveness=$liveness, loudness=$loudness, mode=$mode, speechiness=$speechiness, tempo=$tempo, timeSignature=$timeSignature, trackHref=$trackHref, type=$type, uri=$uri, valence=$valence, additionalProperties=$additionalProperties}"
}
