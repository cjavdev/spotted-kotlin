// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

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

class ExternalUrlObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val published: JsonField<Boolean>,
    private val spotify: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("spotify") @ExcludeMissing spotify: JsonField<String> = JsonMissing.of(),
    ) : this(published, spotify, mutableMapOf())

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
     * The [Spotify URL](/documentation/web-api/concepts/spotify-uris-ids) for the object.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spotify(): String? = spotify.getNullable("spotify")

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

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

        private var published: JsonField<Boolean> = JsonMissing.of()
        private var spotify: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalUrlObject: ExternalUrlObject) = apply {
            published = externalUrlObject.published
            spotify = externalUrlObject.spotify
            additionalProperties = externalUrlObject.additionalProperties.toMutableMap()
        }

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
            ExternalUrlObject(published, spotify, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ExternalUrlObject = apply {
        if (validated) {
            return@apply
        }

        published()
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
    internal fun validity(): Int =
        (if (published.asKnown() == null) 0 else 1) + (if (spotify.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalUrlObject &&
            published == other.published &&
            spotify == other.spotify &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(published, spotify, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalUrlObject{published=$published, spotify=$spotify, additionalProperties=$additionalProperties}"
}
