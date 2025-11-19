// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Change a playlist's name and public/private state. (The user must, of course, own the playlist.)
 */
class PlaylistUpdateParams
private constructor(
    private val playlistId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
    fun playlistId(): String? = playlistId

    /**
     * If `true`, the playlist will become collaborative and other users will be able to modify the
     * playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative` to `true`
     * on non-public playlists._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collaborative(): Boolean? = body.collaborative()

    /**
     * Value for playlist description as displayed in Spotify Clients and in the Web API.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * The new name for the playlist, for example `"My New Playlist Title"`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * The playlist's public/private status (if it should be added to the user's profile or not):
     * `true` the playlist will be public, `false` the playlist will be private, `null` the playlist
     * status is not relevant. For more about public/private status, see
     * [Working with Playlists](/documentation/web-api/concepts/playlists)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun public_(): Boolean? = body.public_()

    /**
     * Returns the raw JSON value of [collaborative].
     *
     * Unlike [collaborative], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _collaborative(): JsonField<Boolean> = body._collaborative()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [public_].
     *
     * Unlike [public_], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _public_(): JsonField<Boolean> = body._public_()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PlaylistUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PlaylistUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PlaylistUpdateParams]. */
    class Builder internal constructor() {

        private var playlistId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(playlistUpdateParams: PlaylistUpdateParams) = apply {
            playlistId = playlistUpdateParams.playlistId
            body = playlistUpdateParams.body.toBuilder()
            additionalHeaders = playlistUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = playlistUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
        fun playlistId(playlistId: String?) = apply { this.playlistId = playlistId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [collaborative]
         * - [description]
         * - [name]
         * - [public_]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * If `true`, the playlist will become collaborative and other users will be able to modify
         * the playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative`
         * to `true` on non-public playlists._
         */
        fun collaborative(collaborative: Boolean) = apply { body.collaborative(collaborative) }

        /**
         * Sets [Builder.collaborative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collaborative] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collaborative(collaborative: JsonField<Boolean>) = apply {
            body.collaborative(collaborative)
        }

        /** Value for playlist description as displayed in Spotify Clients and in the Web API. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The new name for the playlist, for example `"My New Playlist Title"` */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The playlist's public/private status (if it should be added to the user's profile or
         * not): `true` the playlist will be public, `false` the playlist will be private, `null`
         * the playlist status is not relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         */
        fun public_(public_: Boolean) = apply { body.public_(public_) }

        /**
         * Sets [Builder.public_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.public_] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun public_(public_: JsonField<Boolean>) = apply { body.public_(public_) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PlaylistUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaylistUpdateParams =
            PlaylistUpdateParams(
                playlistId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> playlistId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val collaborative: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val public_: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collaborative")
            @ExcludeMissing
            collaborative: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("public") @ExcludeMissing public_: JsonField<Boolean> = JsonMissing.of(),
        ) : this(collaborative, description, name, public_, mutableMapOf())

        /**
         * If `true`, the playlist will become collaborative and other users will be able to modify
         * the playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative`
         * to `true` on non-public playlists._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun collaborative(): Boolean? = collaborative.getNullable("collaborative")

        /**
         * Value for playlist description as displayed in Spotify Clients and in the Web API.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The new name for the playlist, for example `"My New Playlist Title"`
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * The playlist's public/private status (if it should be added to the user's profile or
         * not): `true` the playlist will be public, `false` the playlist will be private, `null`
         * the playlist status is not relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun public_(): Boolean? = public_.getNullable("public")

        /**
         * Returns the raw JSON value of [collaborative].
         *
         * Unlike [collaborative], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collaborative")
        @ExcludeMissing
        fun _collaborative(): JsonField<Boolean> = collaborative

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [public_].
         *
         * Unlike [public_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("public") @ExcludeMissing fun _public_(): JsonField<Boolean> = public_

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var collaborative: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var public_: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                collaborative = body.collaborative
                description = body.description
                name = body.name
                public_ = body.public_
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * If `true`, the playlist will become collaborative and other users will be able to
             * modify the playlist in their Spotify client. <br/> _**Note**: You can only set
             * `collaborative` to `true` on non-public playlists._
             */
            fun collaborative(collaborative: Boolean) = collaborative(JsonField.of(collaborative))

            /**
             * Sets [Builder.collaborative] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collaborative] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collaborative(collaborative: JsonField<Boolean>) = apply {
                this.collaborative = collaborative
            }

            /**
             * Value for playlist description as displayed in Spotify Clients and in the Web API.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The new name for the playlist, for example `"My New Playlist Title"` */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The playlist's public/private status (if it should be added to the user's profile or
             * not): `true` the playlist will be public, `false` the playlist will be private,
             * `null` the playlist status is not relevant. For more about public/private status, see
             * [Working with Playlists](/documentation/web-api/concepts/playlists)
             */
            fun public_(public_: Boolean) = public_(JsonField.of(public_))

            /**
             * Sets [Builder.public_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.public_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(collaborative, description, name, public_, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            collaborative()
            description()
            name()
            public_()
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
        internal fun validity(): Int =
            (if (collaborative.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (public_.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                collaborative == other.collaborative &&
                description == other.description &&
                name == other.name &&
                public_ == other.public_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(collaborative, description, name, public_, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{collaborative=$collaborative, description=$description, name=$name, public_=$public_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaylistUpdateParams &&
            playlistId == other.playlistId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(playlistId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlaylistUpdateParams{playlistId=$playlistId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
