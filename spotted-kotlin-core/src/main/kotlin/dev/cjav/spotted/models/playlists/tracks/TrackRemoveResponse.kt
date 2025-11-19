// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

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

class TrackRemoveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val snapshotId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        snapshotId: JsonField<String> = JsonMissing.of()
    ) : this(snapshotId, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): String? = snapshotId.getNullable("snapshot_id")

    /**
     * Returns the raw JSON value of [snapshotId].
     *
     * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshot_id") @ExcludeMissing fun _snapshotId(): JsonField<String> = snapshotId

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

        /** Returns a mutable builder for constructing an instance of [TrackRemoveResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackRemoveResponse]. */
    class Builder internal constructor() {

        private var snapshotId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trackRemoveResponse: TrackRemoveResponse) = apply {
            snapshotId = trackRemoveResponse.snapshotId
            additionalProperties = trackRemoveResponse.additionalProperties.toMutableMap()
        }

        fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

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
         * Returns an immutable instance of [TrackRemoveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackRemoveResponse =
            TrackRemoveResponse(snapshotId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TrackRemoveResponse = apply {
        if (validated) {
            return@apply
        }

        snapshotId()
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
    internal fun validity(): Int = (if (snapshotId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackRemoveResponse &&
            snapshotId == other.snapshotId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(snapshotId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackRemoveResponse{snapshotId=$snapshotId, additionalProperties=$additionalProperties}"
}
