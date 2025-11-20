// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.users.playlists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Create a playlist for a Spotify user. (The playlist will be empty until you
 * [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is generally
 * limited to a maximum of 11000 playlists.
 */
class PlaylistCreateParams
private constructor(
    private val userId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The user's [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids). */
    fun userId(): String? = userId

    /**
     * The name for the new playlist, for example `"Your Coolest Playlist"`. This name does not need
     * to be unique; a user may have several playlists with the same name.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Defaults to `true`. The playlist's public/private status (if it should be added to the user's
     * profile or not): `true` the playlist will be public, `false` the playlist will be private. To
     * be able to create private playlists, the user must have granted the `playlist-modify-private`
     * [scope](/documentation/web-api/concepts/scopes/#list-of-scopes). For more about
     * public/private status, see
     * [Working with Playlists](/documentation/web-api/concepts/playlists)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(): Boolean? =
        body.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished()

    /**
     * Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to create a
     * collaborative playlist you must also set `public` to `false`. To create collaborative
     * playlists you must have granted `playlist-modify-private` and `playlist-modify-public`
     * [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collaborative(): Boolean? = body.collaborative()

    /**
     * value for playlist description as displayed in Spotify Clients and in the Web API.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of
     * [pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished].
     *
     * Unlike [pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished], this method doesn't
     * throw if the JSON field has an unexpected type.
     */
    fun _pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(): JsonField<Boolean> =
        body._pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlaylistCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlaylistCreateParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(playlistCreateParams: PlaylistCreateParams) = apply {
            userId = playlistCreateParams.userId
            body = playlistCreateParams.body.toBuilder()
            additionalHeaders = playlistCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = playlistCreateParams.additionalQueryParams.toBuilder()
        }

        /** The user's [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids). */
        fun userId(userId: String?) = apply { this.userId = userId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished]
         * - [collaborative]
         * - [description]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The name for the new playlist, for example `"Your Coolest Playlist"`. This name does not
         * need to be unique; a user may have several playlists with the same name.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Defaults to `true`. The playlist's public/private status (if it should be added to the
         * user's profile or not): `true` the playlist will be public, `false` the playlist will be
         * private. To be able to create private playlists, the user must have granted the
         * `playlist-modify-private`
         * [scope](/documentation/web-api/concepts/scopes/#list-of-scopes). For more about
         * public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         */
        fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished: Boolean
        ) = apply {
            body.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished
            )
        }

        /**
         * Sets [Builder.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished] to an
         * arbitrary JSON value.
         *
         * You should usually call
         * [Builder.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished: JsonField<Boolean>
        ) = apply {
            body.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished
            )
        }

        /**
         * Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to create a
         * collaborative playlist you must also set `public` to `false`. To create collaborative
         * playlists you must have granted `playlist-modify-private` and `playlist-modify-public`
         * [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._
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

        /** value for playlist description as displayed in Spotify Clients and in the Web API. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

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
         * Returns an immutable instance of [PlaylistCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlaylistCreateParams =
            PlaylistCreateParams(
                userId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished:
            JsonField<Boolean>,
        private val collaborative: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty(
                "\$.paths['*'].*.requestBody.content['application/json'].schema.properties.published"
            )
            @ExcludeMissing
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished: JsonField<Boolean> =
                JsonMissing.of(),
            @JsonProperty("collaborative")
            @ExcludeMissing
            collaborative: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished,
            collaborative,
            description,
            mutableMapOf(),
        )

        /**
         * The name for the new playlist, for example `"Your Coolest Playlist"`. This name does not
         * need to be unique; a user may have several playlists with the same name.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Defaults to `true`. The playlist's public/private status (if it should be added to the
         * user's profile or not): `true` the playlist will be public, `false` the playlist will be
         * private. To be able to create private playlists, the user must have granted the
         * `playlist-modify-private`
         * [scope](/documentation/web-api/concepts/scopes/#list-of-scopes). For more about
         * public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(): Boolean? =
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished.getNullable(
                "\$.paths['*'].*.requestBody.content['application/json'].schema.properties.published"
            )

        /**
         * Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to create a
         * collaborative playlist you must also set `public` to `false`. To create collaborative
         * playlists you must have granted `playlist-modify-private` and `playlist-modify-public`
         * [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun collaborative(): Boolean? = collaborative.getNullable("collaborative")

        /**
         * value for playlist description as displayed in Spotify Clients and in the Web API.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of
         * [pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished].
         *
         * Unlike [pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished], this method
         * doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty(
            "\$.paths['*'].*.requestBody.content['application/json'].schema.properties.published"
        )
        @ExcludeMissing
        fun _pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(): JsonField<Boolean> =
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished:
                JsonField<Boolean> =
                JsonMissing.of()
            private var collaborative: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished =
                    body.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished
                collaborative = body.collaborative
                description = body.description
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The name for the new playlist, for example `"Your Coolest Playlist"`. This name does
             * not need to be unique; a user may have several playlists with the same name.
             */
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
             * Defaults to `true`. The playlist's public/private status (if it should be added to
             * the user's profile or not): `true` the playlist will be public, `false` the playlist
             * will be private. To be able to create private playlists, the user must have granted
             * the `playlist-modify-private`
             * [scope](/documentation/web-api/concepts/scopes/#list-of-scopes). For more about
             * public/private status, see
             * [Working with Playlists](/documentation/web-api/concepts/playlists)
             */
            fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished: Boolean
            ) =
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
                    JsonField.of(pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished)
                )

            /**
             * Sets [Builder.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished] to an
             * arbitrary JSON value.
             *
             * You should usually call
             * [Builder.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished(
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished: JsonField<Boolean>
            ) = apply {
                this.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished =
                    pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished
            }

            /**
             * Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to
             * create a collaborative playlist you must also set `public` to `false`. To create
             * collaborative playlists you must have granted `playlist-modify-private` and
             * `playlist-modify-public`
             * [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._
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
             * value for playlist description as displayed in Spotify Clients and in the Web API.
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
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished,
                    collaborative,
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished()
            collaborative()
            description()
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
            (if (name.asKnown() == null) 0 else 1) +
                (if (
                    pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished.asKnown() ==
                        null
                )
                    0
                else 1) +
                (if (collaborative.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished ==
                    other.pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished &&
                collaborative == other.collaborative &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished,
                collaborative,
                description,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished=$pathsRequestBodyContentApplicationJsonSchemaPropertiesPublished, collaborative=$collaborative, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaylistCreateParams &&
            userId == other.userId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlaylistCreateParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
