// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class ResumePointObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fullyPlayed: JsonField<Boolean>,
    private val resumePositionMs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fully_played")
        @ExcludeMissing
        fullyPlayed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("resume_position_ms")
        @ExcludeMissing
        resumePositionMs: JsonField<Long> = JsonMissing.of(),
    ) : this(fullyPlayed, resumePositionMs, mutableMapOf())

    /**
     * Whether or not the episode has been fully played by the user.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullyPlayed(): Boolean? = fullyPlayed.getNullable("fully_played")

    /**
     * The user's most recent position in the episode in milliseconds.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resumePositionMs(): Long? = resumePositionMs.getNullable("resume_position_ms")

    /**
     * Returns the raw JSON value of [fullyPlayed].
     *
     * Unlike [fullyPlayed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fully_played")
    @ExcludeMissing
    fun _fullyPlayed(): JsonField<Boolean> = fullyPlayed

    /**
     * Returns the raw JSON value of [resumePositionMs].
     *
     * Unlike [resumePositionMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resume_position_ms")
    @ExcludeMissing
    fun _resumePositionMs(): JsonField<Long> = resumePositionMs

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

        /** Returns a mutable builder for constructing an instance of [ResumePointObject]. */
        fun builder() = Builder()
    }

    /** A builder for [ResumePointObject]. */
    class Builder internal constructor() {

        private var fullyPlayed: JsonField<Boolean> = JsonMissing.of()
        private var resumePositionMs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(resumePointObject: ResumePointObject) = apply {
            fullyPlayed = resumePointObject.fullyPlayed
            resumePositionMs = resumePointObject.resumePositionMs
            additionalProperties = resumePointObject.additionalProperties.toMutableMap()
        }

        /** Whether or not the episode has been fully played by the user. */
        fun fullyPlayed(fullyPlayed: Boolean) = fullyPlayed(JsonField.of(fullyPlayed))

        /**
         * Sets [Builder.fullyPlayed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullyPlayed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fullyPlayed(fullyPlayed: JsonField<Boolean>) = apply { this.fullyPlayed = fullyPlayed }

        /** The user's most recent position in the episode in milliseconds. */
        fun resumePositionMs(resumePositionMs: Long) =
            resumePositionMs(JsonField.of(resumePositionMs))

        /**
         * Sets [Builder.resumePositionMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resumePositionMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resumePositionMs(resumePositionMs: JsonField<Long>) = apply {
            this.resumePositionMs = resumePositionMs
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
         * Returns an immutable instance of [ResumePointObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResumePointObject =
            ResumePointObject(fullyPlayed, resumePositionMs, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ResumePointObject = apply {
        if (validated) {
            return@apply
        }

        fullyPlayed()
        resumePositionMs()
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
        (if (fullyPlayed.asKnown() == null) 0 else 1) +
            (if (resumePositionMs.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResumePointObject &&
            fullyPlayed == other.fullyPlayed &&
            resumePositionMs == other.resumePositionMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fullyPlayed, resumePositionMs, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResumePointObject{fullyPlayed=$fullyPlayed, resumePositionMs=$resumePositionMs, additionalProperties=$additionalProperties}"
}
