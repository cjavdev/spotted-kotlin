// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.Enum
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class SimplifiedArtistObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val href: JsonField<String>,
    private val name: JsonField<String>,
    private val published: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_urls")
        @ExcludeMissing
        externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(id, externalUrls, href, name, published, type, uri, mutableMapOf())

    /**
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * Known external URLs for this artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject? = externalUrls.getNullable("external_urls")

    /**
     * A link to the Web API endpoint providing full details of the artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): String? = href.getNullable("href")

    /**
     * The name of the artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

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
     * The object type.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Type? = type.getNullable("type")

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): String? = uri.getNullable("uri")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [externalUrls].
     *
     * Unlike [externalUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_urls")
    @ExcludeMissing
    fun _externalUrls(): JsonField<ExternalUrlObject> = externalUrls

    /**
     * Returns the raw JSON value of [href].
     *
     * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

        /** Returns a mutable builder for constructing an instance of [SimplifiedArtistObject]. */
        fun builder() = Builder()
    }

    /** A builder for [SimplifiedArtistObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(simplifiedArtistObject: SimplifiedArtistObject) = apply {
            id = simplifiedArtistObject.id
            externalUrls = simplifiedArtistObject.externalUrls
            href = simplifiedArtistObject.href
            name = simplifiedArtistObject.name
            published = simplifiedArtistObject.published
            type = simplifiedArtistObject.type
            uri = simplifiedArtistObject.uri
            additionalProperties = simplifiedArtistObject.additionalProperties.toMutableMap()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Known external URLs for this artist. */
        fun externalUrls(externalUrls: ExternalUrlObject) = externalUrls(JsonField.of(externalUrls))

        /**
         * Sets [Builder.externalUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalUrls] with a well-typed [ExternalUrlObject]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalUrls(externalUrls: JsonField<ExternalUrlObject>) = apply {
            this.externalUrls = externalUrls
        }

        /** A link to the Web API endpoint providing full details of the artist. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** The name of the artist. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** The object type. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [SimplifiedArtistObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimplifiedArtistObject =
            SimplifiedArtistObject(
                id,
                externalUrls,
                href,
                name,
                published,
                type,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplifiedArtistObject = apply {
        if (validated) {
            return@apply
        }

        id()
        externalUrls()?.validate()
        href()
        name()
        published()
        type()?.validate()
        uri()
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
        (if (id.asKnown() == null) 0 else 1) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (uri.asKnown() == null) 0 else 1)

    /** The object type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ARTIST = of("artist")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ARTIST
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARTIST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ARTIST -> Value.ARTIST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ARTIST -> Known.ARTIST
                else -> throw SpottedInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SpottedInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimplifiedArtistObject &&
            id == other.id &&
            externalUrls == other.externalUrls &&
            href == other.href &&
            name == other.name &&
            published == other.published &&
            type == other.type &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, externalUrls, href, name, published, type, uri, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimplifiedArtistObject{id=$id, externalUrls=$externalUrls, href=$href, name=$name, published=$published, type=$type, uri=$uri, additionalProperties=$additionalProperties}"
}
