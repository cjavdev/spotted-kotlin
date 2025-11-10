// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audioanalysis

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.Enum
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class AudioAnalysisRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bars: JsonField<List<TimeIntervalObject>>,
    private val beats: JsonField<List<TimeIntervalObject>>,
    private val meta: JsonField<Meta>,
    private val sections: JsonField<List<Section>>,
    private val segments: JsonField<List<Segment>>,
    private val tatums: JsonField<List<TimeIntervalObject>>,
    private val track: JsonField<Track>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bars")
        @ExcludeMissing
        bars: JsonField<List<TimeIntervalObject>> = JsonMissing.of(),
        @JsonProperty("beats")
        @ExcludeMissing
        beats: JsonField<List<TimeIntervalObject>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("sections")
        @ExcludeMissing
        sections: JsonField<List<Section>> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("tatums")
        @ExcludeMissing
        tatums: JsonField<List<TimeIntervalObject>> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<Track> = JsonMissing.of(),
    ) : this(bars, beats, meta, sections, segments, tatums, track, mutableMapOf())

    /**
     * The time intervals of the bars throughout the track. A bar (or measure) is a segment of time
     * defined as a given number of beats.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bars(): List<TimeIntervalObject>? = bars.getNullable("bars")

    /**
     * The time intervals of beats throughout the track. A beat is the basic time unit of a piece of
     * music; for example, each tick of a metronome. Beats are typically multiples of tatums.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beats(): List<TimeIntervalObject>? = beats.getNullable("beats")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Meta? = meta.getNullable("meta")

    /**
     * Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge,
     * guitar solo, etc. Each section contains its own descriptions of tempo, key, mode,
     * time_signature, and loudness.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sections(): List<Section>? = sections.getNullable("sections")

    /**
     * Each segment contains a roughly conisistent sound throughout its duration.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segments(): List<Segment>? = segments.getNullable("segments")

    /**
     * A tatum represents the lowest regular pulse train that a listener intuitively infers from the
     * timing of perceived musical events (segments).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tatums(): List<TimeIntervalObject>? = tatums.getNullable("tatums")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Track? = track.getNullable("track")

    /**
     * Returns the raw JSON value of [bars].
     *
     * Unlike [bars], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bars") @ExcludeMissing fun _bars(): JsonField<List<TimeIntervalObject>> = bars

    /**
     * Returns the raw JSON value of [beats].
     *
     * Unlike [beats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beats") @ExcludeMissing fun _beats(): JsonField<List<TimeIntervalObject>> = beats

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [sections].
     *
     * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sections") @ExcludeMissing fun _sections(): JsonField<List<Section>> = sections

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * Returns the raw JSON value of [tatums].
     *
     * Unlike [tatums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tatums")
    @ExcludeMissing
    fun _tatums(): JsonField<List<TimeIntervalObject>> = tatums

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<Track> = track

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
         * Returns a mutable builder for constructing an instance of
         * [AudioAnalysisRetrieveResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [AudioAnalysisRetrieveResponse]. */
    class Builder internal constructor() {

        private var bars: JsonField<MutableList<TimeIntervalObject>>? = null
        private var beats: JsonField<MutableList<TimeIntervalObject>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var sections: JsonField<MutableList<Section>>? = null
        private var segments: JsonField<MutableList<Segment>>? = null
        private var tatums: JsonField<MutableList<TimeIntervalObject>>? = null
        private var track: JsonField<Track> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(audioAnalysisRetrieveResponse: AudioAnalysisRetrieveResponse) = apply {
            bars = audioAnalysisRetrieveResponse.bars.map { it.toMutableList() }
            beats = audioAnalysisRetrieveResponse.beats.map { it.toMutableList() }
            meta = audioAnalysisRetrieveResponse.meta
            sections = audioAnalysisRetrieveResponse.sections.map { it.toMutableList() }
            segments = audioAnalysisRetrieveResponse.segments.map { it.toMutableList() }
            tatums = audioAnalysisRetrieveResponse.tatums.map { it.toMutableList() }
            track = audioAnalysisRetrieveResponse.track
            additionalProperties = audioAnalysisRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * The time intervals of the bars throughout the track. A bar (or measure) is a segment of
         * time defined as a given number of beats.
         */
        fun bars(bars: List<TimeIntervalObject>) = bars(JsonField.of(bars))

        /**
         * Sets [Builder.bars] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bars] with a well-typed `List<TimeIntervalObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bars(bars: JsonField<List<TimeIntervalObject>>) = apply {
            this.bars = bars.map { it.toMutableList() }
        }

        /**
         * Adds a single [TimeIntervalObject] to [bars].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBar(bar: TimeIntervalObject) = apply {
            bars = (bars ?: JsonField.of(mutableListOf())).also { checkKnown("bars", it).add(bar) }
        }

        /**
         * The time intervals of beats throughout the track. A beat is the basic time unit of a
         * piece of music; for example, each tick of a metronome. Beats are typically multiples of
         * tatums.
         */
        fun beats(beats: List<TimeIntervalObject>) = beats(JsonField.of(beats))

        /**
         * Sets [Builder.beats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beats] with a well-typed `List<TimeIntervalObject>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beats(beats: JsonField<List<TimeIntervalObject>>) = apply {
            this.beats = beats.map { it.toMutableList() }
        }

        /**
         * Adds a single [TimeIntervalObject] to [beats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBeat(beat: TimeIntervalObject) = apply {
            beats =
                (beats ?: JsonField.of(mutableListOf())).also { checkKnown("beats", it).add(beat) }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /**
         * Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge,
         * guitar solo, etc. Each section contains its own descriptions of tempo, key, mode,
         * time_signature, and loudness.
         */
        fun sections(sections: List<Section>) = sections(JsonField.of(sections))

        /**
         * Sets [Builder.sections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sections] with a well-typed `List<Section>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sections(sections: JsonField<List<Section>>) = apply {
            this.sections = sections.map { it.toMutableList() }
        }

        /**
         * Adds a single [Section] to [sections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSection(section: Section) = apply {
            sections =
                (sections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sections", it).add(section)
                }
        }

        /** Each segment contains a roughly conisistent sound throughout its duration. */
        fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: Segment) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
                }
        }

        /**
         * A tatum represents the lowest regular pulse train that a listener intuitively infers from
         * the timing of perceived musical events (segments).
         */
        fun tatums(tatums: List<TimeIntervalObject>) = tatums(JsonField.of(tatums))

        /**
         * Sets [Builder.tatums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tatums] with a well-typed `List<TimeIntervalObject>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tatums(tatums: JsonField<List<TimeIntervalObject>>) = apply {
            this.tatums = tatums.map { it.toMutableList() }
        }

        /**
         * Adds a single [TimeIntervalObject] to [tatums].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTatum(tatum: TimeIntervalObject) = apply {
            tatums =
                (tatums ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tatums", it).add(tatum)
                }
        }

        fun track(track: Track) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [Track] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<Track>) = apply { this.track = track }

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
         * Returns an immutable instance of [AudioAnalysisRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AudioAnalysisRetrieveResponse =
            AudioAnalysisRetrieveResponse(
                (bars ?: JsonMissing.of()).map { it.toImmutable() },
                (beats ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                (sections ?: JsonMissing.of()).map { it.toImmutable() },
                (segments ?: JsonMissing.of()).map { it.toImmutable() },
                (tatums ?: JsonMissing.of()).map { it.toImmutable() },
                track,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AudioAnalysisRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        bars()?.forEach { it.validate() }
        beats()?.forEach { it.validate() }
        meta()?.validate()
        sections()?.forEach { it.validate() }
        segments()?.forEach { it.validate() }
        tatums()?.forEach { it.validate() }
        track()?.validate()
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
        (bars.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (beats.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown()?.validity() ?: 0) +
            (sections.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (segments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (tatums.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (track.asKnown()?.validity() ?: 0)

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val analysisTime: JsonField<Double>,
        private val analyzerVersion: JsonField<String>,
        private val detailedStatus: JsonField<String>,
        private val inputProcess: JsonField<String>,
        private val platform: JsonField<String>,
        private val statusCode: JsonField<Long>,
        private val timestamp: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("analysis_time")
            @ExcludeMissing
            analysisTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("analyzer_version")
            @ExcludeMissing
            analyzerVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("detailed_status")
            @ExcludeMissing
            detailedStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_process")
            @ExcludeMissing
            inputProcess: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Long> = JsonMissing.of(),
        ) : this(
            analysisTime,
            analyzerVersion,
            detailedStatus,
            inputProcess,
            platform,
            statusCode,
            timestamp,
            mutableMapOf(),
        )

        /**
         * The amount of time taken to analyze this track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun analysisTime(): Double? = analysisTime.getNullable("analysis_time")

        /**
         * The version of the Analyzer used to analyze this track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun analyzerVersion(): String? = analyzerVersion.getNullable("analyzer_version")

        /**
         * A detailed status code for this track. If analysis data is missing, this code may explain
         * why.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detailedStatus(): String? = detailedStatus.getNullable("detailed_status")

        /**
         * The method used to read the track's audio data.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputProcess(): String? = inputProcess.getNullable("input_process")

        /**
         * The platform used to read the track's audio data.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun platform(): String? = platform.getNullable("platform")

        /**
         * The return code of the analyzer process. 0 if successful, 1 if any errors occurred.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCode(): Long? = statusCode.getNullable("status_code")

        /**
         * The Unix timestamp (in seconds) at which this track was analyzed.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Long? = timestamp.getNullable("timestamp")

        /**
         * Returns the raw JSON value of [analysisTime].
         *
         * Unlike [analysisTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("analysis_time")
        @ExcludeMissing
        fun _analysisTime(): JsonField<Double> = analysisTime

        /**
         * Returns the raw JSON value of [analyzerVersion].
         *
         * Unlike [analyzerVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("analyzer_version")
        @ExcludeMissing
        fun _analyzerVersion(): JsonField<String> = analyzerVersion

        /**
         * Returns the raw JSON value of [detailedStatus].
         *
         * Unlike [detailedStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detailed_status")
        @ExcludeMissing
        fun _detailedStatus(): JsonField<String> = detailedStatus

        /**
         * Returns the raw JSON value of [inputProcess].
         *
         * Unlike [inputProcess], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_process")
        @ExcludeMissing
        fun _inputProcess(): JsonField<String> = inputProcess

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var analysisTime: JsonField<Double> = JsonMissing.of()
            private var analyzerVersion: JsonField<String> = JsonMissing.of()
            private var detailedStatus: JsonField<String> = JsonMissing.of()
            private var inputProcess: JsonField<String> = JsonMissing.of()
            private var platform: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var timestamp: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(meta: Meta) = apply {
                analysisTime = meta.analysisTime
                analyzerVersion = meta.analyzerVersion
                detailedStatus = meta.detailedStatus
                inputProcess = meta.inputProcess
                platform = meta.platform
                statusCode = meta.statusCode
                timestamp = meta.timestamp
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** The amount of time taken to analyze this track. */
            fun analysisTime(analysisTime: Double) = analysisTime(JsonField.of(analysisTime))

            /**
             * Sets [Builder.analysisTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analysisTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analysisTime(analysisTime: JsonField<Double>) = apply {
                this.analysisTime = analysisTime
            }

            /** The version of the Analyzer used to analyze this track. */
            fun analyzerVersion(analyzerVersion: String) =
                analyzerVersion(JsonField.of(analyzerVersion))

            /**
             * Sets [Builder.analyzerVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analyzerVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analyzerVersion(analyzerVersion: JsonField<String>) = apply {
                this.analyzerVersion = analyzerVersion
            }

            /**
             * A detailed status code for this track. If analysis data is missing, this code may
             * explain why.
             */
            fun detailedStatus(detailedStatus: String) =
                detailedStatus(JsonField.of(detailedStatus))

            /**
             * Sets [Builder.detailedStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailedStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detailedStatus(detailedStatus: JsonField<String>) = apply {
                this.detailedStatus = detailedStatus
            }

            /** The method used to read the track's audio data. */
            fun inputProcess(inputProcess: String) = inputProcess(JsonField.of(inputProcess))

            /**
             * Sets [Builder.inputProcess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputProcess] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputProcess(inputProcess: JsonField<String>) = apply {
                this.inputProcess = inputProcess
            }

            /** The platform used to read the track's audio data. */
            fun platform(platform: String) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<String>) = apply { this.platform = platform }

            /**
             * The return code of the analyzer process. 0 if successful, 1 if any errors occurred.
             */
            fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

            /** The Unix timestamp (in seconds) at which this track was analyzed. */
            fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    analysisTime,
                    analyzerVersion,
                    detailedStatus,
                    inputProcess,
                    platform,
                    statusCode,
                    timestamp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            analysisTime()
            analyzerVersion()
            detailedStatus()
            inputProcess()
            platform()
            statusCode()
            timestamp()
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
        internal fun validity(): Int =
            (if (analysisTime.asKnown() == null) 0 else 1) +
                (if (analyzerVersion.asKnown() == null) 0 else 1) +
                (if (detailedStatus.asKnown() == null) 0 else 1) +
                (if (inputProcess.asKnown() == null) 0 else 1) +
                (if (platform.asKnown() == null) 0 else 1) +
                (if (statusCode.asKnown() == null) 0 else 1) +
                (if (timestamp.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                analysisTime == other.analysisTime &&
                analyzerVersion == other.analyzerVersion &&
                detailedStatus == other.detailedStatus &&
                inputProcess == other.inputProcess &&
                platform == other.platform &&
                statusCode == other.statusCode &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                analysisTime,
                analyzerVersion,
                detailedStatus,
                inputProcess,
                platform,
                statusCode,
                timestamp,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{analysisTime=$analysisTime, analyzerVersion=$analyzerVersion, detailedStatus=$detailedStatus, inputProcess=$inputProcess, platform=$platform, statusCode=$statusCode, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    class Section
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidence: JsonField<Double>,
        private val duration: JsonField<Double>,
        private val key: JsonField<Long>,
        private val keyConfidence: JsonField<Double>,
        private val loudness: JsonField<Double>,
        private val mode: JsonField<Mode>,
        private val modeConfidence: JsonField<Double>,
        private val start: JsonField<Double>,
        private val tempo: JsonField<Double>,
        private val tempoConfidence: JsonField<Double>,
        private val timeSignature: JsonField<Long>,
        private val timeSignatureConfidence: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("key_confidence")
            @ExcludeMissing
            keyConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness")
            @ExcludeMissing
            loudness: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("mode_confidence")
            @ExcludeMissing
            modeConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tempo") @ExcludeMissing tempo: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tempo_confidence")
            @ExcludeMissing
            tempoConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("time_signature")
            @ExcludeMissing
            timeSignature: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_signature_confidence")
            @ExcludeMissing
            timeSignatureConfidence: JsonField<Double> = JsonMissing.of(),
        ) : this(
            confidence,
            duration,
            key,
            keyConfidence,
            loudness,
            mode,
            modeConfidence,
            start,
            tempo,
            tempoConfidence,
            timeSignature,
            timeSignatureConfidence,
            mutableMapOf(),
        )

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the section's "designation".
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Double? = confidence.getNullable("confidence")

        /**
         * The duration (in seconds) of the section.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Double? = duration.getNullable("duration")

        /**
         * The estimated overall key of the section. The values in this field ranging from 0 to 11
         * mapping to pitches using standard Pitch Class notation (E.g. 0 = C, 1 = C♯/D♭, 2 = D, and
         * so on). If no key was detected, the value is -1.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun key(): Long? = key.getNullable("key")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key
         * changes may correspond to low values in this field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyConfidence(): Double? = keyConfidence.getNullable("key_confidence")

        /**
         * The overall loudness of the section in decibels (dB). Loudness values are useful for
         * comparing relative loudness of sections within tracks.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loudness(): Double? = loudness.getNullable("loudness")

        /**
         * Indicates the modality (major or minor) of a section, the type of scale from which its
         * melodic content is derived. This field will contain a 0 for "minor", a 1 for "major", or
         * a -1 for no result. Note that the major key (e.g. C major) could more likely be confused
         * with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same
         * pitches.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mode(): Mode? = mode.getNullable("mode")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the `mode`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modeConfidence(): Double? = modeConfidence.getNullable("mode_confidence")

        /**
         * The starting point (in seconds) of the section.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Double? = start.getNullable("start")

        /**
         * The overall estimated tempo of the section in beats per minute (BPM). In musical
         * terminology, tempo is the speed or pace of a given piece and derives directly from the
         * average beat duration.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempo(): Double? = tempo.getNullable("tempo")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain
         * tempo changes or sounds which don't contain tempo (like pure speech) which would
         * correspond to a low value in this field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempoConfidence(): Double? = tempoConfidence.getNullable("tempo_confidence")

        /**
         * An estimated time signature. The time signature (meter) is a notational convention to
         * specify how many beats are in each bar (or measure). The time signature ranges from 3 to
         * 7 indicating time signatures of "3/4", to "7/4".
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeSignature(): Long? = timeSignature.getNullable("time_signature")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. Sections
         * with time signature changes may correspond to low values in this field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeSignatureConfidence(): Double? =
            timeSignatureConfidence.getNullable("time_signature_confidence")

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<Long> = key

        /**
         * Returns the raw JSON value of [keyConfidence].
         *
         * Unlike [keyConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("key_confidence")
        @ExcludeMissing
        fun _keyConfidence(): JsonField<Double> = keyConfidence

        /**
         * Returns the raw JSON value of [loudness].
         *
         * Unlike [loudness], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loudness") @ExcludeMissing fun _loudness(): JsonField<Double> = loudness

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [modeConfidence].
         *
         * Unlike [modeConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mode_confidence")
        @ExcludeMissing
        fun _modeConfidence(): JsonField<Double> = modeConfidence

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /**
         * Returns the raw JSON value of [tempo].
         *
         * Unlike [tempo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tempo") @ExcludeMissing fun _tempo(): JsonField<Double> = tempo

        /**
         * Returns the raw JSON value of [tempoConfidence].
         *
         * Unlike [tempoConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tempo_confidence")
        @ExcludeMissing
        fun _tempoConfidence(): JsonField<Double> = tempoConfidence

        /**
         * Returns the raw JSON value of [timeSignature].
         *
         * Unlike [timeSignature], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_signature")
        @ExcludeMissing
        fun _timeSignature(): JsonField<Long> = timeSignature

        /**
         * Returns the raw JSON value of [timeSignatureConfidence].
         *
         * Unlike [timeSignatureConfidence], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("time_signature_confidence")
        @ExcludeMissing
        fun _timeSignatureConfidence(): JsonField<Double> = timeSignatureConfidence

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

            /** Returns a mutable builder for constructing an instance of [Section]. */
            fun builder() = Builder()
        }

        /** A builder for [Section]. */
        class Builder internal constructor() {

            private var confidence: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var key: JsonField<Long> = JsonMissing.of()
            private var keyConfidence: JsonField<Double> = JsonMissing.of()
            private var loudness: JsonField<Double> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var modeConfidence: JsonField<Double> = JsonMissing.of()
            private var start: JsonField<Double> = JsonMissing.of()
            private var tempo: JsonField<Double> = JsonMissing.of()
            private var tempoConfidence: JsonField<Double> = JsonMissing.of()
            private var timeSignature: JsonField<Long> = JsonMissing.of()
            private var timeSignatureConfidence: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(section: Section) = apply {
                confidence = section.confidence
                duration = section.duration
                key = section.key
                keyConfidence = section.keyConfidence
                loudness = section.loudness
                mode = section.mode
                modeConfidence = section.modeConfidence
                start = section.start
                tempo = section.tempo
                tempoConfidence = section.tempoConfidence
                timeSignature = section.timeSignature
                timeSignatureConfidence = section.timeSignatureConfidence
                additionalProperties = section.additionalProperties.toMutableMap()
            }

            /**
             * The confidence, from 0.0 to 1.0, of the reliability of the section's "designation".
             */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** The duration (in seconds) of the section. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /**
             * The estimated overall key of the section. The values in this field ranging from 0 to
             * 11 mapping to pitches using standard Pitch Class notation (E.g. 0 = C, 1 = C♯/D♭, 2 =
             * D, and so on). If no key was detected, the value is -1.
             */
            fun key(key: Long) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<Long>) = apply { this.key = key }

            /**
             * The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key
             * changes may correspond to low values in this field.
             */
            fun keyConfidence(keyConfidence: Double) = keyConfidence(JsonField.of(keyConfidence))

            /**
             * Sets [Builder.keyConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyConfidence(keyConfidence: JsonField<Double>) = apply {
                this.keyConfidence = keyConfidence
            }

            /**
             * The overall loudness of the section in decibels (dB). Loudness values are useful for
             * comparing relative loudness of sections within tracks.
             */
            fun loudness(loudness: Double) = loudness(JsonField.of(loudness))

            /**
             * Sets [Builder.loudness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudness] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudness(loudness: JsonField<Double>) = apply { this.loudness = loudness }

            /**
             * Indicates the modality (major or minor) of a section, the type of scale from which
             * its melodic content is derived. This field will contain a 0 for "minor", a 1 for
             * "major", or a -1 for no result. Note that the major key (e.g. C major) could more
             * likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both
             * keys carry the same pitches.
             */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** The confidence, from 0.0 to 1.0, of the reliability of the `mode`. */
            fun modeConfidence(modeConfidence: Double) =
                modeConfidence(JsonField.of(modeConfidence))

            /**
             * Sets [Builder.modeConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modeConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modeConfidence(modeConfidence: JsonField<Double>) = apply {
                this.modeConfidence = modeConfidence
            }

            /** The starting point (in seconds) of the section. */
            fun start(start: Double) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /**
             * The overall estimated tempo of the section in beats per minute (BPM). In musical
             * terminology, tempo is the speed or pace of a given piece and derives directly from
             * the average beat duration.
             */
            fun tempo(tempo: Double) = tempo(JsonField.of(tempo))

            /**
             * Sets [Builder.tempo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempo] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempo(tempo: JsonField<Double>) = apply { this.tempo = tempo }

            /**
             * The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain
             * tempo changes or sounds which don't contain tempo (like pure speech) which would
             * correspond to a low value in this field.
             */
            fun tempoConfidence(tempoConfidence: Double) =
                tempoConfidence(JsonField.of(tempoConfidence))

            /**
             * Sets [Builder.tempoConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempoConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempoConfidence(tempoConfidence: JsonField<Double>) = apply {
                this.tempoConfidence = tempoConfidence
            }

            /**
             * An estimated time signature. The time signature (meter) is a notational convention to
             * specify how many beats are in each bar (or measure). The time signature ranges from 3
             * to 7 indicating time signatures of "3/4", to "7/4".
             */
            fun timeSignature(timeSignature: Long) = timeSignature(JsonField.of(timeSignature))

            /**
             * Sets [Builder.timeSignature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSignature] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeSignature(timeSignature: JsonField<Long>) = apply {
                this.timeSignature = timeSignature
            }

            /**
             * The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. Sections
             * with time signature changes may correspond to low values in this field.
             */
            fun timeSignatureConfidence(timeSignatureConfidence: Double) =
                timeSignatureConfidence(JsonField.of(timeSignatureConfidence))

            /**
             * Sets [Builder.timeSignatureConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSignatureConfidence] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeSignatureConfidence(timeSignatureConfidence: JsonField<Double>) = apply {
                this.timeSignatureConfidence = timeSignatureConfidence
            }

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
             * Returns an immutable instance of [Section].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Section =
                Section(
                    confidence,
                    duration,
                    key,
                    keyConfidence,
                    loudness,
                    mode,
                    modeConfidence,
                    start,
                    tempo,
                    tempoConfidence,
                    timeSignature,
                    timeSignatureConfidence,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Section = apply {
            if (validated) {
                return@apply
            }

            confidence()
            duration()
            key()
            keyConfidence()
            loudness()
            mode()?.validate()
            modeConfidence()
            start()
            tempo()
            tempoConfidence()
            timeSignature()
            timeSignatureConfidence()
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
        internal fun validity(): Int =
            (if (confidence.asKnown() == null) 0 else 1) +
                (if (duration.asKnown() == null) 0 else 1) +
                (if (key.asKnown() == null) 0 else 1) +
                (if (keyConfidence.asKnown() == null) 0 else 1) +
                (if (loudness.asKnown() == null) 0 else 1) +
                (mode.asKnown()?.validity() ?: 0) +
                (if (modeConfidence.asKnown() == null) 0 else 1) +
                (if (start.asKnown() == null) 0 else 1) +
                (if (tempo.asKnown() == null) 0 else 1) +
                (if (tempoConfidence.asKnown() == null) 0 else 1) +
                (if (timeSignature.asKnown() == null) 0 else 1) +
                (if (timeSignatureConfidence.asKnown() == null) 0 else 1)

        /**
         * Indicates the modality (major or minor) of a section, the type of scale from which its
         * melodic content is derived. This field will contain a 0 for "minor", a 1 for "major", or
         * a -1 for no result. Note that the major key (e.g. C major) could more likely be confused
         * with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same
         * pitches.
         */
        class Mode @JsonCreator private constructor(private val value: JsonField<Double>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Double> = value

            companion object {

                /** No result */
                val minus_1 = of(-1.0)

                /** Minor */
                val _0 = of(0.0)

                /** Major */
                val _1 = of(1.0)

                fun of(value: Double) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                /** No result */
                minus_1,
                /** Minor */
                _0,
                /** Major */
                _1,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** No result */
                minus_1,
                /** Minor */
                _0,
                /** Major */
                _1,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    minus_1 -> Value.minus_1
                    _0 -> Value._0
                    _1 -> Value._1
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws SpottedInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    minus_1 -> Known.minus_1
                    _0 -> Known._0
                    _1 -> Known._1
                    else -> throw SpottedInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws SpottedInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asDouble(): Double =
                _value().asNumber()?.toDouble()
                    ?: throw SpottedInvalidDataException("Value is not a Double")

            private var validated: Boolean = false

            fun validate(): Mode = apply {
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

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Section &&
                confidence == other.confidence &&
                duration == other.duration &&
                key == other.key &&
                keyConfidence == other.keyConfidence &&
                loudness == other.loudness &&
                mode == other.mode &&
                modeConfidence == other.modeConfidence &&
                start == other.start &&
                tempo == other.tempo &&
                tempoConfidence == other.tempoConfidence &&
                timeSignature == other.timeSignature &&
                timeSignatureConfidence == other.timeSignatureConfidence &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                confidence,
                duration,
                key,
                keyConfidence,
                loudness,
                mode,
                modeConfidence,
                start,
                tempo,
                tempoConfidence,
                timeSignature,
                timeSignatureConfidence,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Section{confidence=$confidence, duration=$duration, key=$key, keyConfidence=$keyConfidence, loudness=$loudness, mode=$mode, modeConfidence=$modeConfidence, start=$start, tempo=$tempo, tempoConfidence=$tempoConfidence, timeSignature=$timeSignature, timeSignatureConfidence=$timeSignatureConfidence, additionalProperties=$additionalProperties}"
    }

    class Segment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidence: JsonField<Double>,
        private val duration: JsonField<Double>,
        private val loudnessEnd: JsonField<Double>,
        private val loudnessMax: JsonField<Double>,
        private val loudnessMaxTime: JsonField<Double>,
        private val loudnessStart: JsonField<Double>,
        private val pitches: JsonField<List<Double>>,
        private val start: JsonField<Double>,
        private val timbre: JsonField<List<Double>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness_end")
            @ExcludeMissing
            loudnessEnd: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness_max")
            @ExcludeMissing
            loudnessMax: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness_max_time")
            @ExcludeMissing
            loudnessMaxTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness_start")
            @ExcludeMissing
            loudnessStart: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pitches")
            @ExcludeMissing
            pitches: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timbre")
            @ExcludeMissing
            timbre: JsonField<List<Double>> = JsonMissing.of(),
        ) : this(
            confidence,
            duration,
            loudnessEnd,
            loudnessMax,
            loudnessMaxTime,
            loudnessStart,
            pitches,
            start,
            timbre,
            mutableMapOf(),
        )

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the
         * song which are difficult to logically segment (e.g: noise) may correspond to low values
         * in this field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Double? = confidence.getNullable("confidence")

        /**
         * The duration (in seconds) of the segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Double? = duration.getNullable("duration")

        /**
         * The offset loudness of the segment in decibels (dB). This value should be equivalent to
         * the loudness_start of the following segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loudnessEnd(): Double? = loudnessEnd.getNullable("loudness_end")

        /**
         * The peak loudness of the segment in decibels (dB). Combined with `loudness_start` and
         * `loudness_max_time`, these components can be used to describe the "attack" of the
         * segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loudnessMax(): Double? = loudnessMax.getNullable("loudness_max")

        /**
         * The segment-relative offset of the segment peak loudness in seconds. Combined with
         * `loudness_start` and `loudness_max`, these components can be used to desctibe the
         * "attack" of the segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loudnessMaxTime(): Double? = loudnessMaxTime.getNullable("loudness_max_time")

        /**
         * The onset loudness of the segment in decibels (dB). Combined with `loudness_max` and
         * `loudness_max_time`, these components can be used to describe the "attack" of the
         * segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loudnessStart(): Double? = loudnessStart.getNullable("loudness_start")

        /**
         * Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#,
         * D to B, with values ranging from 0 to 1 that describe the relative dominance of every
         * pitch in the chromatic scale. For example a C Major chord would likely be represented by
         * large values of C, E and G (i.e. classes 0, 4, and 7).
         *
         * Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are
         * likely represented by values that are all close to 1, while pure tones are described by
         * one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices
         * are a combination of low-power spectrum values at their respective pitch frequencies.
         * ![pitch vector](/assets/audio/Pitch_vector.png)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pitches(): List<Double>? = pitches.getNullable("pitches")

        /**
         * The starting point (in seconds) of the segment.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Double? = start.getNullable("start")

        /**
         * Timbre is the quality of a musical note or sound that distinguishes different types of
         * musical instruments, or voices. It is a complex notion also referred to as sound color,
         * texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal
         * surface, independently of pitch and loudness. The timbre feature is a vector that
         * includes 12 unbounded values roughly centered around 0. Those values are high level
         * abstractions of the spectral surface, ordered by degree of importance.
         *
         * For completeness however, the first dimension represents the average loudness of the
         * segment; second emphasizes brightness; third is more closely correlated to the flatness
         * of a sound; fourth to sounds with a stronger attack; etc. See an image below representing
         * the 12 basis functions (i.e. template segments). ![timbre basis
         * functions](/assets/audio/Timbre_basis_functions.png)
         *
         * The actual timbre of the segment is best described as a linear combination of these 12
         * basis functions weighted by the coefficient values: timbre = c1 x b1 + c2 x b2 + ... +
         * c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis
         * functions as displayed below. Timbre vectors are best used in comparison with each other.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timbre(): List<Double>? = timbre.getNullable("timbre")

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [loudnessEnd].
         *
         * Unlike [loudnessEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loudness_end")
        @ExcludeMissing
        fun _loudnessEnd(): JsonField<Double> = loudnessEnd

        /**
         * Returns the raw JSON value of [loudnessMax].
         *
         * Unlike [loudnessMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loudness_max")
        @ExcludeMissing
        fun _loudnessMax(): JsonField<Double> = loudnessMax

        /**
         * Returns the raw JSON value of [loudnessMaxTime].
         *
         * Unlike [loudnessMaxTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loudness_max_time")
        @ExcludeMissing
        fun _loudnessMaxTime(): JsonField<Double> = loudnessMaxTime

        /**
         * Returns the raw JSON value of [loudnessStart].
         *
         * Unlike [loudnessStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loudness_start")
        @ExcludeMissing
        fun _loudnessStart(): JsonField<Double> = loudnessStart

        /**
         * Returns the raw JSON value of [pitches].
         *
         * Unlike [pitches], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pitches") @ExcludeMissing fun _pitches(): JsonField<List<Double>> = pitches

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /**
         * Returns the raw JSON value of [timbre].
         *
         * Unlike [timbre], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timbre") @ExcludeMissing fun _timbre(): JsonField<List<Double>> = timbre

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

            /** Returns a mutable builder for constructing an instance of [Segment]. */
            fun builder() = Builder()
        }

        /** A builder for [Segment]. */
        class Builder internal constructor() {

            private var confidence: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var loudnessEnd: JsonField<Double> = JsonMissing.of()
            private var loudnessMax: JsonField<Double> = JsonMissing.of()
            private var loudnessMaxTime: JsonField<Double> = JsonMissing.of()
            private var loudnessStart: JsonField<Double> = JsonMissing.of()
            private var pitches: JsonField<MutableList<Double>>? = null
            private var start: JsonField<Double> = JsonMissing.of()
            private var timbre: JsonField<MutableList<Double>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(segment: Segment) = apply {
                confidence = segment.confidence
                duration = segment.duration
                loudnessEnd = segment.loudnessEnd
                loudnessMax = segment.loudnessMax
                loudnessMaxTime = segment.loudnessMaxTime
                loudnessStart = segment.loudnessStart
                pitches = segment.pitches.map { it.toMutableList() }
                start = segment.start
                timbre = segment.timbre.map { it.toMutableList() }
                additionalProperties = segment.additionalProperties.toMutableMap()
            }

            /**
             * The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of
             * the song which are difficult to logically segment (e.g: noise) may correspond to low
             * values in this field.
             */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** The duration (in seconds) of the segment. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /**
             * The offset loudness of the segment in decibels (dB). This value should be equivalent
             * to the loudness_start of the following segment.
             */
            fun loudnessEnd(loudnessEnd: Double) = loudnessEnd(JsonField.of(loudnessEnd))

            /**
             * Sets [Builder.loudnessEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudnessEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudnessEnd(loudnessEnd: JsonField<Double>) = apply {
                this.loudnessEnd = loudnessEnd
            }

            /**
             * The peak loudness of the segment in decibels (dB). Combined with `loudness_start` and
             * `loudness_max_time`, these components can be used to describe the "attack" of the
             * segment.
             */
            fun loudnessMax(loudnessMax: Double) = loudnessMax(JsonField.of(loudnessMax))

            /**
             * Sets [Builder.loudnessMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudnessMax] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudnessMax(loudnessMax: JsonField<Double>) = apply {
                this.loudnessMax = loudnessMax
            }

            /**
             * The segment-relative offset of the segment peak loudness in seconds. Combined with
             * `loudness_start` and `loudness_max`, these components can be used to desctibe the
             * "attack" of the segment.
             */
            fun loudnessMaxTime(loudnessMaxTime: Double) =
                loudnessMaxTime(JsonField.of(loudnessMaxTime))

            /**
             * Sets [Builder.loudnessMaxTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudnessMaxTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudnessMaxTime(loudnessMaxTime: JsonField<Double>) = apply {
                this.loudnessMaxTime = loudnessMaxTime
            }

            /**
             * The onset loudness of the segment in decibels (dB). Combined with `loudness_max` and
             * `loudness_max_time`, these components can be used to describe the "attack" of the
             * segment.
             */
            fun loudnessStart(loudnessStart: Double) = loudnessStart(JsonField.of(loudnessStart))

            /**
             * Sets [Builder.loudnessStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudnessStart] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudnessStart(loudnessStart: JsonField<Double>) = apply {
                this.loudnessStart = loudnessStart
            }

            /**
             * Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C,
             * C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of
             * every pitch in the chromatic scale. For example a C Major chord would likely be
             * represented by large values of C, E and G (i.e. classes 0, 4, and 7).
             *
             * Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are
             * likely represented by values that are all close to 1, while pure tones are described
             * by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector
             * indices are a combination of low-power spectrum values at their respective pitch
             * frequencies. ![pitch vector](/assets/audio/Pitch_vector.png)
             */
            fun pitches(pitches: List<Double>) = pitches(JsonField.of(pitches))

            /**
             * Sets [Builder.pitches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pitches] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pitches(pitches: JsonField<List<Double>>) = apply {
                this.pitches = pitches.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [pitches].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPitch(pitch: Double) = apply {
                pitches =
                    (pitches ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pitches", it).add(pitch)
                    }
            }

            /** The starting point (in seconds) of the segment. */
            fun start(start: Double) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /**
             * Timbre is the quality of a musical note or sound that distinguishes different types
             * of musical instruments, or voices. It is a complex notion also referred to as sound
             * color, texture, or tone quality, and is derived from the shape of a segment’s
             * spectro-temporal surface, independently of pitch and loudness. The timbre feature is
             * a vector that includes 12 unbounded values roughly centered around 0. Those values
             * are high level abstractions of the spectral surface, ordered by degree of importance.
             *
             * For completeness however, the first dimension represents the average loudness of the
             * segment; second emphasizes brightness; third is more closely correlated to the
             * flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below
             * representing the 12 basis functions (i.e. template segments). ![timbre basis
             * functions](/assets/audio/Timbre_basis_functions.png)
             *
             * The actual timbre of the segment is best described as a linear combination of these
             * 12 basis functions weighted by the coefficient values: timbre = c1 x b1 + c2 x b2 +
             * ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12
             * basis functions as displayed below. Timbre vectors are best used in comparison with
             * each other.
             */
            fun timbre(timbre: List<Double>) = timbre(JsonField.of(timbre))

            /**
             * Sets [Builder.timbre] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timbre] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timbre(timbre: JsonField<List<Double>>) = apply {
                this.timbre = timbre.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.timbre].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTimbre(timbre: Double) = apply {
                this.timbre =
                    (this.timbre ?: JsonField.of(mutableListOf())).also {
                        checkKnown("timbre", it).add(timbre)
                    }
            }

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
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Segment =
                Segment(
                    confidence,
                    duration,
                    loudnessEnd,
                    loudnessMax,
                    loudnessMaxTime,
                    loudnessStart,
                    (pitches ?: JsonMissing.of()).map { it.toImmutable() },
                    start,
                    (timbre ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

            confidence()
            duration()
            loudnessEnd()
            loudnessMax()
            loudnessMaxTime()
            loudnessStart()
            pitches()
            start()
            timbre()
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
        internal fun validity(): Int =
            (if (confidence.asKnown() == null) 0 else 1) +
                (if (duration.asKnown() == null) 0 else 1) +
                (if (loudnessEnd.asKnown() == null) 0 else 1) +
                (if (loudnessMax.asKnown() == null) 0 else 1) +
                (if (loudnessMaxTime.asKnown() == null) 0 else 1) +
                (if (loudnessStart.asKnown() == null) 0 else 1) +
                (pitches.asKnown()?.size ?: 0) +
                (if (start.asKnown() == null) 0 else 1) +
                (timbre.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Segment &&
                confidence == other.confidence &&
                duration == other.duration &&
                loudnessEnd == other.loudnessEnd &&
                loudnessMax == other.loudnessMax &&
                loudnessMaxTime == other.loudnessMaxTime &&
                loudnessStart == other.loudnessStart &&
                pitches == other.pitches &&
                start == other.start &&
                timbre == other.timbre &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                confidence,
                duration,
                loudnessEnd,
                loudnessMax,
                loudnessMaxTime,
                loudnessStart,
                pitches,
                start,
                timbre,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Segment{confidence=$confidence, duration=$duration, loudnessEnd=$loudnessEnd, loudnessMax=$loudnessMax, loudnessMaxTime=$loudnessMaxTime, loudnessStart=$loudnessStart, pitches=$pitches, start=$start, timbre=$timbre, additionalProperties=$additionalProperties}"
    }

    class Track
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val analysisChannels: JsonField<Long>,
        private val analysisSampleRate: JsonField<Long>,
        private val codeVersion: JsonField<Double>,
        private val codestring: JsonField<String>,
        private val duration: JsonField<Double>,
        private val echoprintVersion: JsonField<Double>,
        private val echoprintstring: JsonField<String>,
        private val endOfFadeIn: JsonField<Double>,
        private val key: JsonField<Long>,
        private val keyConfidence: JsonField<Double>,
        private val loudness: JsonField<Float>,
        private val mode: JsonField<Long>,
        private val modeConfidence: JsonField<Double>,
        private val numSamples: JsonField<Long>,
        private val offsetSeconds: JsonField<Long>,
        private val rhythmVersion: JsonField<Double>,
        private val rhythmstring: JsonField<String>,
        private val sampleMd5: JsonField<String>,
        private val startOfFadeOut: JsonField<Double>,
        private val synchVersion: JsonField<Double>,
        private val synchstring: JsonField<String>,
        private val tempo: JsonField<Float>,
        private val tempoConfidence: JsonField<Double>,
        private val timeSignature: JsonField<Long>,
        private val timeSignatureConfidence: JsonField<Double>,
        private val windowSeconds: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("analysis_channels")
            @ExcludeMissing
            analysisChannels: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("analysis_sample_rate")
            @ExcludeMissing
            analysisSampleRate: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("code_version")
            @ExcludeMissing
            codeVersion: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("codestring")
            @ExcludeMissing
            codestring: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("echoprint_version")
            @ExcludeMissing
            echoprintVersion: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("echoprintstring")
            @ExcludeMissing
            echoprintstring: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_of_fade_in")
            @ExcludeMissing
            endOfFadeIn: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("key_confidence")
            @ExcludeMissing
            keyConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("loudness") @ExcludeMissing loudness: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mode_confidence")
            @ExcludeMissing
            modeConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("num_samples")
            @ExcludeMissing
            numSamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset_seconds")
            @ExcludeMissing
            offsetSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rhythm_version")
            @ExcludeMissing
            rhythmVersion: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rhythmstring")
            @ExcludeMissing
            rhythmstring: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample_md5")
            @ExcludeMissing
            sampleMd5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_of_fade_out")
            @ExcludeMissing
            startOfFadeOut: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("synch_version")
            @ExcludeMissing
            synchVersion: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("synchstring")
            @ExcludeMissing
            synchstring: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tempo") @ExcludeMissing tempo: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("tempo_confidence")
            @ExcludeMissing
            tempoConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("time_signature")
            @ExcludeMissing
            timeSignature: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_signature_confidence")
            @ExcludeMissing
            timeSignatureConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("window_seconds")
            @ExcludeMissing
            windowSeconds: JsonField<Long> = JsonMissing.of(),
        ) : this(
            analysisChannels,
            analysisSampleRate,
            codeVersion,
            codestring,
            duration,
            echoprintVersion,
            echoprintstring,
            endOfFadeIn,
            key,
            keyConfidence,
            loudness,
            mode,
            modeConfidence,
            numSamples,
            offsetSeconds,
            rhythmVersion,
            rhythmstring,
            sampleMd5,
            startOfFadeOut,
            synchVersion,
            synchstring,
            tempo,
            tempoConfidence,
            timeSignature,
            timeSignatureConfidence,
            windowSeconds,
            mutableMapOf(),
        )

        /**
         * The number of channels used for analysis. If 1, all channels are summed together to mono
         * before analysis.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun analysisChannels(): Long? = analysisChannels.getNullable("analysis_channels")

        /**
         * The sample rate used to decode and analyze this track. May differ from the actual sample
         * rate of this track available on Spotify.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun analysisSampleRate(): Long? = analysisSampleRate.getNullable("analysis_sample_rate")

        /**
         * A version number for the Echo Nest Musical Fingerprint format used in the codestring
         * field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeVersion(): Double? = codeVersion.getNullable("code_version")

        /**
         * An
         * [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4)
         * codestring for this track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codestring(): String? = codestring.getNullable("codestring")

        /**
         * Length of the track in seconds.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Double? = duration.getNullable("duration")

        /**
         * A version number for the EchoPrint format used in the echoprintstring field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun echoprintVersion(): Double? = echoprintVersion.getNullable("echoprint_version")

        /**
         * An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun echoprintstring(): String? = echoprintstring.getNullable("echoprintstring")

        /**
         * The time, in seconds, at which the track's fade-in period ends. If the track has no
         * fade-in, this will be 0.0.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endOfFadeIn(): Double? = endOfFadeIn.getNullable("end_of_fade_in")

        /**
         * The key the track is in. Integers map to pitches using standard
         * [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 = C♯/D♭,
         * 2 = D, and so on. If no key was detected, the value is -1.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun key(): Long? = key.getNullable("key")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the `key`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyConfidence(): Double? = keyConfidence.getNullable("key_confidence")

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
         * The confidence, from 0.0 to 1.0, of the reliability of the `mode`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modeConfidence(): Double? = modeConfidence.getNullable("mode_confidence")

        /**
         * The exact number of audio samples analyzed from this track. See also
         * `analysis_sample_rate`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numSamples(): Long? = numSamples.getNullable("num_samples")

        /**
         * An offset to the start of the region of the track that was analyzed. (As the entire track
         * is analyzed, this should always be 0.)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offsetSeconds(): Long? = offsetSeconds.getNullable("offset_seconds")

        /**
         * A version number for the Rhythmstring used in the rhythmstring field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rhythmVersion(): Double? = rhythmVersion.getNullable("rhythm_version")

        /**
         * A Rhythmstring for this track. The format of this string is similar to the Synchstring.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rhythmstring(): String? = rhythmstring.getNullable("rhythmstring")

        /**
         * This field will always contain the empty string.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sampleMd5(): String? = sampleMd5.getNullable("sample_md5")

        /**
         * The time, in seconds, at which the track's fade-out period starts. If the track has no
         * fade-out, this should match the track's length.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startOfFadeOut(): Double? = startOfFadeOut.getNullable("start_of_fade_out")

        /**
         * A version number for the Synchstring used in the synchstring field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun synchVersion(): Double? = synchVersion.getNullable("synch_version")

        /**
         * A [Synchstring](https://github.com/echonest/synchdata) for this track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun synchstring(): String? = synchstring.getNullable("synchstring")

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
         * The confidence, from 0.0 to 1.0, of the reliability of the `tempo`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempoConfidence(): Double? = tempoConfidence.getNullable("tempo_confidence")

        /**
         * An estimated time signature. The time signature (meter) is a notational convention to
         * specify how many beats are in each bar (or measure). The time signature ranges from 3 to
         * 7 indicating time signatures of "3/4", to "7/4".
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeSignature(): Long? = timeSignature.getNullable("time_signature")

        /**
         * The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeSignatureConfidence(): Double? =
            timeSignatureConfidence.getNullable("time_signature_confidence")

        /**
         * The length of the region of the track was analyzed, if a subset of the track was
         * analyzed. (As the entire track is analyzed, this should always be 0.)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun windowSeconds(): Long? = windowSeconds.getNullable("window_seconds")

        /**
         * Returns the raw JSON value of [analysisChannels].
         *
         * Unlike [analysisChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("analysis_channels")
        @ExcludeMissing
        fun _analysisChannels(): JsonField<Long> = analysisChannels

        /**
         * Returns the raw JSON value of [analysisSampleRate].
         *
         * Unlike [analysisSampleRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("analysis_sample_rate")
        @ExcludeMissing
        fun _analysisSampleRate(): JsonField<Long> = analysisSampleRate

        /**
         * Returns the raw JSON value of [codeVersion].
         *
         * Unlike [codeVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_version")
        @ExcludeMissing
        fun _codeVersion(): JsonField<Double> = codeVersion

        /**
         * Returns the raw JSON value of [codestring].
         *
         * Unlike [codestring], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("codestring")
        @ExcludeMissing
        fun _codestring(): JsonField<String> = codestring

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [echoprintVersion].
         *
         * Unlike [echoprintVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("echoprint_version")
        @ExcludeMissing
        fun _echoprintVersion(): JsonField<Double> = echoprintVersion

        /**
         * Returns the raw JSON value of [echoprintstring].
         *
         * Unlike [echoprintstring], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("echoprintstring")
        @ExcludeMissing
        fun _echoprintstring(): JsonField<String> = echoprintstring

        /**
         * Returns the raw JSON value of [endOfFadeIn].
         *
         * Unlike [endOfFadeIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_of_fade_in")
        @ExcludeMissing
        fun _endOfFadeIn(): JsonField<Double> = endOfFadeIn

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<Long> = key

        /**
         * Returns the raw JSON value of [keyConfidence].
         *
         * Unlike [keyConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("key_confidence")
        @ExcludeMissing
        fun _keyConfidence(): JsonField<Double> = keyConfidence

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
         * Returns the raw JSON value of [modeConfidence].
         *
         * Unlike [modeConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mode_confidence")
        @ExcludeMissing
        fun _modeConfidence(): JsonField<Double> = modeConfidence

        /**
         * Returns the raw JSON value of [numSamples].
         *
         * Unlike [numSamples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_samples") @ExcludeMissing fun _numSamples(): JsonField<Long> = numSamples

        /**
         * Returns the raw JSON value of [offsetSeconds].
         *
         * Unlike [offsetSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("offset_seconds")
        @ExcludeMissing
        fun _offsetSeconds(): JsonField<Long> = offsetSeconds

        /**
         * Returns the raw JSON value of [rhythmVersion].
         *
         * Unlike [rhythmVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rhythm_version")
        @ExcludeMissing
        fun _rhythmVersion(): JsonField<Double> = rhythmVersion

        /**
         * Returns the raw JSON value of [rhythmstring].
         *
         * Unlike [rhythmstring], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rhythmstring")
        @ExcludeMissing
        fun _rhythmstring(): JsonField<String> = rhythmstring

        /**
         * Returns the raw JSON value of [sampleMd5].
         *
         * Unlike [sampleMd5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample_md5") @ExcludeMissing fun _sampleMd5(): JsonField<String> = sampleMd5

        /**
         * Returns the raw JSON value of [startOfFadeOut].
         *
         * Unlike [startOfFadeOut], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("start_of_fade_out")
        @ExcludeMissing
        fun _startOfFadeOut(): JsonField<Double> = startOfFadeOut

        /**
         * Returns the raw JSON value of [synchVersion].
         *
         * Unlike [synchVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("synch_version")
        @ExcludeMissing
        fun _synchVersion(): JsonField<Double> = synchVersion

        /**
         * Returns the raw JSON value of [synchstring].
         *
         * Unlike [synchstring], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("synchstring")
        @ExcludeMissing
        fun _synchstring(): JsonField<String> = synchstring

        /**
         * Returns the raw JSON value of [tempo].
         *
         * Unlike [tempo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tempo") @ExcludeMissing fun _tempo(): JsonField<Float> = tempo

        /**
         * Returns the raw JSON value of [tempoConfidence].
         *
         * Unlike [tempoConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tempo_confidence")
        @ExcludeMissing
        fun _tempoConfidence(): JsonField<Double> = tempoConfidence

        /**
         * Returns the raw JSON value of [timeSignature].
         *
         * Unlike [timeSignature], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_signature")
        @ExcludeMissing
        fun _timeSignature(): JsonField<Long> = timeSignature

        /**
         * Returns the raw JSON value of [timeSignatureConfidence].
         *
         * Unlike [timeSignatureConfidence], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("time_signature_confidence")
        @ExcludeMissing
        fun _timeSignatureConfidence(): JsonField<Double> = timeSignatureConfidence

        /**
         * Returns the raw JSON value of [windowSeconds].
         *
         * Unlike [windowSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("window_seconds")
        @ExcludeMissing
        fun _windowSeconds(): JsonField<Long> = windowSeconds

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

            /** Returns a mutable builder for constructing an instance of [Track]. */
            fun builder() = Builder()
        }

        /** A builder for [Track]. */
        class Builder internal constructor() {

            private var analysisChannels: JsonField<Long> = JsonMissing.of()
            private var analysisSampleRate: JsonField<Long> = JsonMissing.of()
            private var codeVersion: JsonField<Double> = JsonMissing.of()
            private var codestring: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var echoprintVersion: JsonField<Double> = JsonMissing.of()
            private var echoprintstring: JsonField<String> = JsonMissing.of()
            private var endOfFadeIn: JsonField<Double> = JsonMissing.of()
            private var key: JsonField<Long> = JsonMissing.of()
            private var keyConfidence: JsonField<Double> = JsonMissing.of()
            private var loudness: JsonField<Float> = JsonMissing.of()
            private var mode: JsonField<Long> = JsonMissing.of()
            private var modeConfidence: JsonField<Double> = JsonMissing.of()
            private var numSamples: JsonField<Long> = JsonMissing.of()
            private var offsetSeconds: JsonField<Long> = JsonMissing.of()
            private var rhythmVersion: JsonField<Double> = JsonMissing.of()
            private var rhythmstring: JsonField<String> = JsonMissing.of()
            private var sampleMd5: JsonField<String> = JsonMissing.of()
            private var startOfFadeOut: JsonField<Double> = JsonMissing.of()
            private var synchVersion: JsonField<Double> = JsonMissing.of()
            private var synchstring: JsonField<String> = JsonMissing.of()
            private var tempo: JsonField<Float> = JsonMissing.of()
            private var tempoConfidence: JsonField<Double> = JsonMissing.of()
            private var timeSignature: JsonField<Long> = JsonMissing.of()
            private var timeSignatureConfidence: JsonField<Double> = JsonMissing.of()
            private var windowSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(track: Track) = apply {
                analysisChannels = track.analysisChannels
                analysisSampleRate = track.analysisSampleRate
                codeVersion = track.codeVersion
                codestring = track.codestring
                duration = track.duration
                echoprintVersion = track.echoprintVersion
                echoprintstring = track.echoprintstring
                endOfFadeIn = track.endOfFadeIn
                key = track.key
                keyConfidence = track.keyConfidence
                loudness = track.loudness
                mode = track.mode
                modeConfidence = track.modeConfidence
                numSamples = track.numSamples
                offsetSeconds = track.offsetSeconds
                rhythmVersion = track.rhythmVersion
                rhythmstring = track.rhythmstring
                sampleMd5 = track.sampleMd5
                startOfFadeOut = track.startOfFadeOut
                synchVersion = track.synchVersion
                synchstring = track.synchstring
                tempo = track.tempo
                tempoConfidence = track.tempoConfidence
                timeSignature = track.timeSignature
                timeSignatureConfidence = track.timeSignatureConfidence
                windowSeconds = track.windowSeconds
                additionalProperties = track.additionalProperties.toMutableMap()
            }

            /**
             * The number of channels used for analysis. If 1, all channels are summed together to
             * mono before analysis.
             */
            fun analysisChannels(analysisChannels: Long) =
                analysisChannels(JsonField.of(analysisChannels))

            /**
             * Sets [Builder.analysisChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analysisChannels] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analysisChannels(analysisChannels: JsonField<Long>) = apply {
                this.analysisChannels = analysisChannels
            }

            /**
             * The sample rate used to decode and analyze this track. May differ from the actual
             * sample rate of this track available on Spotify.
             */
            fun analysisSampleRate(analysisSampleRate: Long) =
                analysisSampleRate(JsonField.of(analysisSampleRate))

            /**
             * Sets [Builder.analysisSampleRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analysisSampleRate] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analysisSampleRate(analysisSampleRate: JsonField<Long>) = apply {
                this.analysisSampleRate = analysisSampleRate
            }

            /**
             * A version number for the Echo Nest Musical Fingerprint format used in the codestring
             * field.
             */
            fun codeVersion(codeVersion: Double) = codeVersion(JsonField.of(codeVersion))

            /**
             * Sets [Builder.codeVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeVersion] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeVersion(codeVersion: JsonField<Double>) = apply {
                this.codeVersion = codeVersion
            }

            /**
             * An
             * [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4)
             * codestring for this track.
             */
            fun codestring(codestring: String) = codestring(JsonField.of(codestring))

            /**
             * Sets [Builder.codestring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codestring] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codestring(codestring: JsonField<String>) = apply { this.codestring = codestring }

            /** Length of the track in seconds. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /** A version number for the EchoPrint format used in the echoprintstring field. */
            fun echoprintVersion(echoprintVersion: Double) =
                echoprintVersion(JsonField.of(echoprintVersion))

            /**
             * Sets [Builder.echoprintVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.echoprintVersion] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun echoprintVersion(echoprintVersion: JsonField<Double>) = apply {
                this.echoprintVersion = echoprintVersion
            }

            /**
             * An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this
             * track.
             */
            fun echoprintstring(echoprintstring: String) =
                echoprintstring(JsonField.of(echoprintstring))

            /**
             * Sets [Builder.echoprintstring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.echoprintstring] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun echoprintstring(echoprintstring: JsonField<String>) = apply {
                this.echoprintstring = echoprintstring
            }

            /**
             * The time, in seconds, at which the track's fade-in period ends. If the track has no
             * fade-in, this will be 0.0.
             */
            fun endOfFadeIn(endOfFadeIn: Double) = endOfFadeIn(JsonField.of(endOfFadeIn))

            /**
             * Sets [Builder.endOfFadeIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endOfFadeIn] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endOfFadeIn(endOfFadeIn: JsonField<Double>) = apply {
                this.endOfFadeIn = endOfFadeIn
            }

            /**
             * The key the track is in. Integers map to pitches using standard
             * [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 =
             * C♯/D♭, 2 = D, and so on. If no key was detected, the value is -1.
             */
            fun key(key: Long) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<Long>) = apply { this.key = key }

            /** The confidence, from 0.0 to 1.0, of the reliability of the `key`. */
            fun keyConfidence(keyConfidence: Double) = keyConfidence(JsonField.of(keyConfidence))

            /**
             * Sets [Builder.keyConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyConfidence(keyConfidence: JsonField<Double>) = apply {
                this.keyConfidence = keyConfidence
            }

            /**
             * The overall loudness of a track in decibels (dB). Loudness values are averaged across
             * the entire track and are useful for comparing relative loudness of tracks. Loudness
             * is the quality of a sound that is the primary psychological correlate of physical
             * strength (amplitude). Values typically range between -60 and 0 db.
             */
            fun loudness(loudness: Float) = loudness(JsonField.of(loudness))

            /**
             * Sets [Builder.loudness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loudness] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loudness(loudness: JsonField<Float>) = apply { this.loudness = loudness }

            /**
             * Mode indicates the modality (major or minor) of a track, the type of scale from which
             * its melodic content is derived. Major is represented by 1 and minor is 0.
             */
            fun mode(mode: Long) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Long>) = apply { this.mode = mode }

            /** The confidence, from 0.0 to 1.0, of the reliability of the `mode`. */
            fun modeConfidence(modeConfidence: Double) =
                modeConfidence(JsonField.of(modeConfidence))

            /**
             * Sets [Builder.modeConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modeConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modeConfidence(modeConfidence: JsonField<Double>) = apply {
                this.modeConfidence = modeConfidence
            }

            /**
             * The exact number of audio samples analyzed from this track. See also
             * `analysis_sample_rate`.
             */
            fun numSamples(numSamples: Long) = numSamples(JsonField.of(numSamples))

            /**
             * Sets [Builder.numSamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numSamples] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numSamples(numSamples: JsonField<Long>) = apply { this.numSamples = numSamples }

            /**
             * An offset to the start of the region of the track that was analyzed. (As the entire
             * track is analyzed, this should always be 0.)
             */
            fun offsetSeconds(offsetSeconds: Long) = offsetSeconds(JsonField.of(offsetSeconds))

            /**
             * Sets [Builder.offsetSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offsetSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun offsetSeconds(offsetSeconds: JsonField<Long>) = apply {
                this.offsetSeconds = offsetSeconds
            }

            /** A version number for the Rhythmstring used in the rhythmstring field. */
            fun rhythmVersion(rhythmVersion: Double) = rhythmVersion(JsonField.of(rhythmVersion))

            /**
             * Sets [Builder.rhythmVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rhythmVersion] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rhythmVersion(rhythmVersion: JsonField<Double>) = apply {
                this.rhythmVersion = rhythmVersion
            }

            /**
             * A Rhythmstring for this track. The format of this string is similar to the
             * Synchstring.
             */
            fun rhythmstring(rhythmstring: String) = rhythmstring(JsonField.of(rhythmstring))

            /**
             * Sets [Builder.rhythmstring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rhythmstring] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rhythmstring(rhythmstring: JsonField<String>) = apply {
                this.rhythmstring = rhythmstring
            }

            /** This field will always contain the empty string. */
            fun sampleMd5(sampleMd5: String) = sampleMd5(JsonField.of(sampleMd5))

            /**
             * Sets [Builder.sampleMd5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleMd5] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sampleMd5(sampleMd5: JsonField<String>) = apply { this.sampleMd5 = sampleMd5 }

            /**
             * The time, in seconds, at which the track's fade-out period starts. If the track has
             * no fade-out, this should match the track's length.
             */
            fun startOfFadeOut(startOfFadeOut: Double) =
                startOfFadeOut(JsonField.of(startOfFadeOut))

            /**
             * Sets [Builder.startOfFadeOut] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startOfFadeOut] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startOfFadeOut(startOfFadeOut: JsonField<Double>) = apply {
                this.startOfFadeOut = startOfFadeOut
            }

            /** A version number for the Synchstring used in the synchstring field. */
            fun synchVersion(synchVersion: Double) = synchVersion(JsonField.of(synchVersion))

            /**
             * Sets [Builder.synchVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.synchVersion] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun synchVersion(synchVersion: JsonField<Double>) = apply {
                this.synchVersion = synchVersion
            }

            /** A [Synchstring](https://github.com/echonest/synchdata) for this track. */
            fun synchstring(synchstring: String) = synchstring(JsonField.of(synchstring))

            /**
             * Sets [Builder.synchstring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.synchstring] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun synchstring(synchstring: JsonField<String>) = apply {
                this.synchstring = synchstring
            }

            /**
             * The overall estimated tempo of a track in beats per minute (BPM). In musical
             * terminology, tempo is the speed or pace of a given piece and derives directly from
             * the average beat duration.
             */
            fun tempo(tempo: Float) = tempo(JsonField.of(tempo))

            /**
             * Sets [Builder.tempo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempo] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tempo(tempo: JsonField<Float>) = apply { this.tempo = tempo }

            /** The confidence, from 0.0 to 1.0, of the reliability of the `tempo`. */
            fun tempoConfidence(tempoConfidence: Double) =
                tempoConfidence(JsonField.of(tempoConfidence))

            /**
             * Sets [Builder.tempoConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempoConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempoConfidence(tempoConfidence: JsonField<Double>) = apply {
                this.tempoConfidence = tempoConfidence
            }

            /**
             * An estimated time signature. The time signature (meter) is a notational convention to
             * specify how many beats are in each bar (or measure). The time signature ranges from 3
             * to 7 indicating time signatures of "3/4", to "7/4".
             */
            fun timeSignature(timeSignature: Long) = timeSignature(JsonField.of(timeSignature))

            /**
             * Sets [Builder.timeSignature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSignature] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeSignature(timeSignature: JsonField<Long>) = apply {
                this.timeSignature = timeSignature
            }

            /** The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. */
            fun timeSignatureConfidence(timeSignatureConfidence: Double) =
                timeSignatureConfidence(JsonField.of(timeSignatureConfidence))

            /**
             * Sets [Builder.timeSignatureConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSignatureConfidence] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeSignatureConfidence(timeSignatureConfidence: JsonField<Double>) = apply {
                this.timeSignatureConfidence = timeSignatureConfidence
            }

            /**
             * The length of the region of the track was analyzed, if a subset of the track was
             * analyzed. (As the entire track is analyzed, this should always be 0.)
             */
            fun windowSeconds(windowSeconds: Long) = windowSeconds(JsonField.of(windowSeconds))

            /**
             * Sets [Builder.windowSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.windowSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun windowSeconds(windowSeconds: JsonField<Long>) = apply {
                this.windowSeconds = windowSeconds
            }

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
             * Returns an immutable instance of [Track].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Track =
                Track(
                    analysisChannels,
                    analysisSampleRate,
                    codeVersion,
                    codestring,
                    duration,
                    echoprintVersion,
                    echoprintstring,
                    endOfFadeIn,
                    key,
                    keyConfidence,
                    loudness,
                    mode,
                    modeConfidence,
                    numSamples,
                    offsetSeconds,
                    rhythmVersion,
                    rhythmstring,
                    sampleMd5,
                    startOfFadeOut,
                    synchVersion,
                    synchstring,
                    tempo,
                    tempoConfidence,
                    timeSignature,
                    timeSignatureConfidence,
                    windowSeconds,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Track = apply {
            if (validated) {
                return@apply
            }

            analysisChannels()
            analysisSampleRate()
            codeVersion()
            codestring()
            duration()
            echoprintVersion()
            echoprintstring()
            endOfFadeIn()
            key()
            keyConfidence()
            loudness()
            mode()
            modeConfidence()
            numSamples()
            offsetSeconds()
            rhythmVersion()
            rhythmstring()
            sampleMd5()
            startOfFadeOut()
            synchVersion()
            synchstring()
            tempo()
            tempoConfidence()
            timeSignature()
            timeSignatureConfidence()
            windowSeconds()
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
        internal fun validity(): Int =
            (if (analysisChannels.asKnown() == null) 0 else 1) +
                (if (analysisSampleRate.asKnown() == null) 0 else 1) +
                (if (codeVersion.asKnown() == null) 0 else 1) +
                (if (codestring.asKnown() == null) 0 else 1) +
                (if (duration.asKnown() == null) 0 else 1) +
                (if (echoprintVersion.asKnown() == null) 0 else 1) +
                (if (echoprintstring.asKnown() == null) 0 else 1) +
                (if (endOfFadeIn.asKnown() == null) 0 else 1) +
                (if (key.asKnown() == null) 0 else 1) +
                (if (keyConfidence.asKnown() == null) 0 else 1) +
                (if (loudness.asKnown() == null) 0 else 1) +
                (if (mode.asKnown() == null) 0 else 1) +
                (if (modeConfidence.asKnown() == null) 0 else 1) +
                (if (numSamples.asKnown() == null) 0 else 1) +
                (if (offsetSeconds.asKnown() == null) 0 else 1) +
                (if (rhythmVersion.asKnown() == null) 0 else 1) +
                (if (rhythmstring.asKnown() == null) 0 else 1) +
                (if (sampleMd5.asKnown() == null) 0 else 1) +
                (if (startOfFadeOut.asKnown() == null) 0 else 1) +
                (if (synchVersion.asKnown() == null) 0 else 1) +
                (if (synchstring.asKnown() == null) 0 else 1) +
                (if (tempo.asKnown() == null) 0 else 1) +
                (if (tempoConfidence.asKnown() == null) 0 else 1) +
                (if (timeSignature.asKnown() == null) 0 else 1) +
                (if (timeSignatureConfidence.asKnown() == null) 0 else 1) +
                (if (windowSeconds.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Track &&
                analysisChannels == other.analysisChannels &&
                analysisSampleRate == other.analysisSampleRate &&
                codeVersion == other.codeVersion &&
                codestring == other.codestring &&
                duration == other.duration &&
                echoprintVersion == other.echoprintVersion &&
                echoprintstring == other.echoprintstring &&
                endOfFadeIn == other.endOfFadeIn &&
                key == other.key &&
                keyConfidence == other.keyConfidence &&
                loudness == other.loudness &&
                mode == other.mode &&
                modeConfidence == other.modeConfidence &&
                numSamples == other.numSamples &&
                offsetSeconds == other.offsetSeconds &&
                rhythmVersion == other.rhythmVersion &&
                rhythmstring == other.rhythmstring &&
                sampleMd5 == other.sampleMd5 &&
                startOfFadeOut == other.startOfFadeOut &&
                synchVersion == other.synchVersion &&
                synchstring == other.synchstring &&
                tempo == other.tempo &&
                tempoConfidence == other.tempoConfidence &&
                timeSignature == other.timeSignature &&
                timeSignatureConfidence == other.timeSignatureConfidence &&
                windowSeconds == other.windowSeconds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                analysisChannels,
                analysisSampleRate,
                codeVersion,
                codestring,
                duration,
                echoprintVersion,
                echoprintstring,
                endOfFadeIn,
                key,
                keyConfidence,
                loudness,
                mode,
                modeConfidence,
                numSamples,
                offsetSeconds,
                rhythmVersion,
                rhythmstring,
                sampleMd5,
                startOfFadeOut,
                synchVersion,
                synchstring,
                tempo,
                tempoConfidence,
                timeSignature,
                timeSignatureConfidence,
                windowSeconds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Track{analysisChannels=$analysisChannels, analysisSampleRate=$analysisSampleRate, codeVersion=$codeVersion, codestring=$codestring, duration=$duration, echoprintVersion=$echoprintVersion, echoprintstring=$echoprintstring, endOfFadeIn=$endOfFadeIn, key=$key, keyConfidence=$keyConfidence, loudness=$loudness, mode=$mode, modeConfidence=$modeConfidence, numSamples=$numSamples, offsetSeconds=$offsetSeconds, rhythmVersion=$rhythmVersion, rhythmstring=$rhythmstring, sampleMd5=$sampleMd5, startOfFadeOut=$startOfFadeOut, synchVersion=$synchVersion, synchstring=$synchstring, tempo=$tempo, tempoConfidence=$tempoConfidence, timeSignature=$timeSignature, timeSignatureConfidence=$timeSignatureConfidence, windowSeconds=$windowSeconds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudioAnalysisRetrieveResponse &&
            bars == other.bars &&
            beats == other.beats &&
            meta == other.meta &&
            sections == other.sections &&
            segments == other.segments &&
            tatums == other.tatums &&
            track == other.track &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bars, beats, meta, sections, segments, tatums, track, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudioAnalysisRetrieveResponse{bars=$bars, beats=$beats, meta=$meta, sections=$sections, segments=$segments, tatums=$tatums, track=$track, additionalProperties=$additionalProperties}"
}
