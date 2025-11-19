// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.PagingPlaylistObject
import java.util.Collections
import java.util.Objects

class BrowseGetFeaturedPlaylistsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val playlists: JsonField<PagingPlaylistObject>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("playlists")
        @ExcludeMissing
        playlists: JsonField<PagingPlaylistObject> = JsonMissing.of(),
    ) : this(message, playlists, mutableMapOf())

    /**
     * The localized message of a playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): String? = message.getNullable("message")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playlists(): PagingPlaylistObject? = playlists.getNullable("playlists")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [playlists].
     *
     * Unlike [playlists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playlists")
    @ExcludeMissing
    fun _playlists(): JsonField<PagingPlaylistObject> = playlists

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
         * [BrowseGetFeaturedPlaylistsResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [BrowseGetFeaturedPlaylistsResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String> = JsonMissing.of()
        private var playlists: JsonField<PagingPlaylistObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(browseGetFeaturedPlaylistsResponse: BrowseGetFeaturedPlaylistsResponse) =
            apply {
                message = browseGetFeaturedPlaylistsResponse.message
                playlists = browseGetFeaturedPlaylistsResponse.playlists
                additionalProperties =
                    browseGetFeaturedPlaylistsResponse.additionalProperties.toMutableMap()
            }

        /** The localized message of a playlist. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun playlists(playlists: PagingPlaylistObject) = playlists(JsonField.of(playlists))

        /**
         * Sets [Builder.playlists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playlists] with a well-typed [PagingPlaylistObject]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun playlists(playlists: JsonField<PagingPlaylistObject>) = apply {
            this.playlists = playlists
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
         * Returns an immutable instance of [BrowseGetFeaturedPlaylistsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrowseGetFeaturedPlaylistsResponse =
            BrowseGetFeaturedPlaylistsResponse(
                message,
                playlists,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrowseGetFeaturedPlaylistsResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        playlists()?.validate()
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
        (if (message.asKnown() == null) 0 else 1) + (playlists.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrowseGetFeaturedPlaylistsResponse &&
            message == other.message &&
            playlists == other.playlists &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, playlists, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrowseGetFeaturedPlaylistsResponse{message=$message, playlists=$playlists, additionalProperties=$additionalProperties}"
}
