// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.tracks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.TrackObject
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class TrackListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addedAt: JsonField<OffsetDateTime>,
    private val track: JsonField<TrackObject>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<TrackObject> = JsonMissing.of(),
    ) : this(addedAt, track, mutableMapOf())

    /**
     * The date and time the track was saved. Timestamps are returned in ISO 8601 format as
     * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is
     * imprecise (for example, the date/time of an album release), an additional field indicates the
     * precision; see for example, release_date in an album object.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime? = addedAt.getNullable("added_at")

    /**
     * Information about the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): TrackObject? = track.getNullable("track")

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<TrackObject> = track

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

        /** Returns a mutable builder for constructing an instance of [TrackListResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackListResponse]. */
    class Builder internal constructor() {

        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var track: JsonField<TrackObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trackListResponse: TrackListResponse) = apply {
            addedAt = trackListResponse.addedAt
            track = trackListResponse.track
            additionalProperties = trackListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The date and time the track was saved. Timestamps are returned in ISO 8601 format as
         * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is
         * imprecise (for example, the date/time of an album release), an additional field indicates
         * the precision; see for example, release_date in an album object.
         */
        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        /** Information about the track. */
        fun track(track: TrackObject) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [TrackObject] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun track(track: JsonField<TrackObject>) = apply { this.track = track }

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
         * Returns an immutable instance of [TrackListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackListResponse =
            TrackListResponse(addedAt, track, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TrackListResponse = apply {
        if (validated) {
            return@apply
        }

        addedAt()
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
        (if (addedAt.asKnown() == null) 0 else 1) + (track.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackListResponse &&
            addedAt == other.addedAt &&
            track == other.track &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(addedAt, track, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackListResponse{addedAt=$addedAt, track=$track, additionalProperties=$additionalProperties}"
}
