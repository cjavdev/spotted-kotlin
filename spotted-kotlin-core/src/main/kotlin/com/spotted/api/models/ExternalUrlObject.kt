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

class ExternalUrlObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val spotify: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("spotify") @ExcludeMissing spotify: JsonField<String> = JsonMissing.of()
    ) : this(spotify, mutableMapOf())

    /**
     * The [Spotify URL](/documentation/web-api/concepts/spotify-uris-ids) for the object.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spotify(): String? = spotify.getNullable("spotify")

    /**
     * Returns the raw JSON value of [spotify].
     *
     * Unlike [spotify], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spotify") @ExcludeMissing fun _spotify(): JsonField<String> = spotify

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

        /** Returns a mutable builder for constructing an instance of [ExternalUrlObject]. */
        fun builder() = Builder()
    }

    /** A builder for [ExternalUrlObject]. */
    class Builder internal constructor() {

        private var spotify: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalUrlObject: ExternalUrlObject) = apply {
            spotify = externalUrlObject.spotify
            additionalProperties = externalUrlObject.additionalProperties.toMutableMap()
        }

        /** The [Spotify URL](/documentation/web-api/concepts/spotify-uris-ids) for the object. */
        fun spotify(spotify: String) = spotify(JsonField.of(spotify))

        /**
         * Sets [Builder.spotify] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spotify] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spotify(spotify: JsonField<String>) = apply { this.spotify = spotify }

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
         * Returns an immutable instance of [ExternalUrlObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalUrlObject =
            ExternalUrlObject(spotify, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ExternalUrlObject = apply {
        if (validated) {
            return@apply
        }

        spotify()
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
    internal fun validity(): Int = (if (spotify.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalUrlObject &&
            spotify == other.spotify &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(spotify, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalUrlObject{spotify=$spotify, additionalProperties=$additionalProperties}"
}
