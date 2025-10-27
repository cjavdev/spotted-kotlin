// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.artists

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
import com.spotted.api.models.ArtistObject
import java.util.Collections
import java.util.Objects

class ArtistListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val artists: JsonField<List<ArtistObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("artists")
        @ExcludeMissing
        artists: JsonField<List<ArtistObject>> = JsonMissing.of()
    ) : this(artists, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun artists(): List<ArtistObject> = artists.getRequired("artists")

    /**
     * Returns the raw JSON value of [artists].
     *
     * Unlike [artists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artists") @ExcludeMissing fun _artists(): JsonField<List<ArtistObject>> = artists

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
         * Returns a mutable builder for constructing an instance of [ArtistListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .artists()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ArtistListResponse]. */
    class Builder internal constructor() {

        private var artists: JsonField<MutableList<ArtistObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(artistListResponse: ArtistListResponse) = apply {
            artists = artistListResponse.artists.map { it.toMutableList() }
            additionalProperties = artistListResponse.additionalProperties.toMutableMap()
        }

        fun artists(artists: List<ArtistObject>) = artists(JsonField.of(artists))

        /**
         * Sets [Builder.artists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artists] with a well-typed `List<ArtistObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun artists(artists: JsonField<List<ArtistObject>>) = apply {
            this.artists = artists.map { it.toMutableList() }
        }

        /**
         * Adds a single [ArtistObject] to [artists].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArtist(artist: ArtistObject) = apply {
            artists =
                (artists ?: JsonField.of(mutableListOf())).also {
                    checkKnown("artists", it).add(artist)
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
         * Returns an immutable instance of [ArtistListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .artists()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArtistListResponse =
            ArtistListResponse(
                checkRequired("artists", artists).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ArtistListResponse = apply {
        if (validated) {
            return@apply
        }

        artists().forEach { it.validate() }
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
    internal fun validity(): Int = (artists.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArtistListResponse &&
            artists == other.artists &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(artists, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArtistListResponse{artists=$artists, additionalProperties=$additionalProperties}"
}
