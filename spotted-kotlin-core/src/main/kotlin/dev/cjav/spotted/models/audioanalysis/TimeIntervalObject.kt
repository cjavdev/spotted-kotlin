// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audioanalysis

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class TimeIntervalObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val confidence: JsonField<Double>,
    private val duration: JsonField<Double>,
    private val published: JsonField<Boolean>,
    private val start: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
    ) : this(confidence, duration, published, start, mutableMapOf())

    /**
     * The confidence, from 0.0 to 1.0, of the reliability of the interval.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confidence(): Double? = confidence.getNullable("confidence")

    /**
     * The duration (in seconds) of the time interval.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Double? = duration.getNullable("duration")

    /**
     * The playlist's public/private status (if it should be added to the user's profile or not):
     * `true` the playlist will be public, `false` the playlist will be private, `null` the playlist
     * status is not relevant. For more about public/private status, see
     * [Working with Playlists](/documentation/web-api/concepts/playlists)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun published(): Boolean? = published.getNullable("published")

    /**
     * The starting point (in seconds) of the time interval.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun start(): Double? = start.getNullable("start")

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

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

        /** Returns a mutable builder for constructing an instance of [TimeIntervalObject]. */
        fun builder() = Builder()
    }

    /** A builder for [TimeIntervalObject]. */
    class Builder internal constructor() {

        private var confidence: JsonField<Double> = JsonMissing.of()
        private var duration: JsonField<Double> = JsonMissing.of()
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var start: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(timeIntervalObject: TimeIntervalObject) = apply {
            confidence = timeIntervalObject.confidence
            duration = timeIntervalObject.duration
            published = timeIntervalObject.published
            start = timeIntervalObject.start
            additionalProperties = timeIntervalObject.additionalProperties.toMutableMap()
        }

        /** The confidence, from 0.0 to 1.0, of the reliability of the interval. */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

        /** The duration (in seconds) of the time interval. */
        fun duration(duration: Double) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        /**
         * The playlist's public/private status (if it should be added to the user's profile or
         * not): `true` the playlist will be public, `false` the playlist will be private, `null`
         * the playlist status is not relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         */
        fun published(published: Boolean) = published(JsonField.of(published))

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun published(published: JsonField<Boolean>) = apply { this.published = published }

        /** The starting point (in seconds) of the time interval. */
        fun start(start: Double) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun start(start: JsonField<Double>) = apply { this.start = start }

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
         * Returns an immutable instance of [TimeIntervalObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TimeIntervalObject =
            TimeIntervalObject(
                confidence,
                duration,
                published,
                start,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimeIntervalObject = apply {
        if (validated) {
            return@apply
        }

        confidence()
        duration()
        published()
        start()
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
        (if (confidence.asKnown() == null) 0 else 1) +
            (if (duration.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1) +
            (if (start.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimeIntervalObject &&
            confidence == other.confidence &&
            duration == other.duration &&
            published == other.published &&
            start == other.start &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(confidence, duration, published, start, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimeIntervalObject{confidence=$confidence, duration=$duration, published=$published, start=$start, additionalProperties=$additionalProperties}"
}
