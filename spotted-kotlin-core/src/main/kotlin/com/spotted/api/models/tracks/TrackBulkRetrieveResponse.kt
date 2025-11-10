// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.tracks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.checkRequired
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.TrackObject
import java.util.Collections
import java.util.Objects

class TrackBulkRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val tracks: JsonField<List<TrackObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tracks")
        @ExcludeMissing
        tracks: JsonField<List<TrackObject>> = JsonMissing.of()
    ) : this(tracks, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tracks(): List<TrackObject> = tracks.getRequired("tracks")

    /**
     * Returns the raw JSON value of [tracks].
     *
     * Unlike [tracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracks") @ExcludeMissing fun _tracks(): JsonField<List<TrackObject>> = tracks

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
         * Returns a mutable builder for constructing an instance of [TrackBulkRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .tracks()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TrackBulkRetrieveResponse]. */
    class Builder internal constructor() {

        private var tracks: JsonField<MutableList<TrackObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trackBulkRetrieveResponse: TrackBulkRetrieveResponse) = apply {
            tracks = trackBulkRetrieveResponse.tracks.map { it.toMutableList() }
            additionalProperties = trackBulkRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun tracks(tracks: List<TrackObject>) = tracks(JsonField.of(tracks))

        /**
         * Sets [Builder.tracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracks] with a well-typed `List<TrackObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tracks(tracks: JsonField<List<TrackObject>>) = apply {
            this.tracks = tracks.map { it.toMutableList() }
        }

        /**
         * Adds a single [TrackObject] to [tracks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrack(track: TrackObject) = apply {
            tracks =
                (tracks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tracks", it).add(track)
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
         * Returns an immutable instance of [TrackBulkRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .tracks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrackBulkRetrieveResponse =
            TrackBulkRetrieveResponse(
                checkRequired("tracks", tracks).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrackBulkRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        tracks().forEach { it.validate() }
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
    internal fun validity(): Int = (tracks.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackBulkRetrieveResponse &&
            tracks == other.tracks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(tracks, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackBulkRetrieveResponse{tracks=$tracks, additionalProperties=$additionalProperties}"
}
