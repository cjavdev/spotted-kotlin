// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.checkKnown
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Start a new context or resume current playback on the user's active device. This API only works
 * for users who have Spotify Premium. The order of execution is not guaranteed when you use this
 * API with other Player API endpoints.
 */
class PlayerStartPlaybackParams
private constructor(
    private val deviceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The id of the device this command is targeting. If not supplied, the user's currently active
     * device is the target.
     */
    fun deviceId(): String? = deviceId

    /**
     * Optional. Spotify URI of the context to play. Valid contexts are albums, artists & playlists.
     * `{context_uri:"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT"}`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contextUri(): String? = body.contextUri()

    /**
     * Optional. Indicates from where in the context playback should start. Only available when
     * context_uri corresponds to an album or playlist object "position" is zero based and can’t be
     * negative. Example: `"offset": {"position": 5}` "uri" is a string representing the uri of the
     * item to start at. Example: `"offset": {"uri": "spotify:track:1301WleyT98MSxVHPZCA6M"}`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Offset? = body.offset()

    /**
     * Indicates from what position to start playback. Must be a positive number. Passing in a
     * position that is greater than the length of the track will cause the player to start playing
     * the next song.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun positionMs(): Long? = body.positionMs()

    /**
     * Optional. A JSON array of the Spotify track URIs to play. For example: `{"uris":
     * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh", "spotify:track:1301WleyT98MSxVHPZCA6M"]}`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uris(): List<String>? = body.uris()

    /**
     * Returns the raw JSON value of [contextUri].
     *
     * Unlike [contextUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contextUri(): JsonField<String> = body._contextUri()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Offset> = body._offset()

    /**
     * Returns the raw JSON value of [positionMs].
     *
     * Unlike [positionMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _positionMs(): JsonField<Long> = body._positionMs()

    /**
     * Returns the raw JSON value of [uris].
     *
     * Unlike [uris], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uris(): JsonField<List<String>> = body._uris()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PlayerStartPlaybackParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [PlayerStartPlaybackParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [PlayerStartPlaybackParams]. */
    class Builder internal constructor() {

        private var deviceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(playerStartPlaybackParams: PlayerStartPlaybackParams) = apply {
            deviceId = playerStartPlaybackParams.deviceId
            body = playerStartPlaybackParams.body.toBuilder()
            additionalHeaders = playerStartPlaybackParams.additionalHeaders.toBuilder()
            additionalQueryParams = playerStartPlaybackParams.additionalQueryParams.toBuilder()
        }

        /**
         * The id of the device this command is targeting. If not supplied, the user's currently
         * active device is the target.
         */
        fun deviceId(deviceId: String?) = apply { this.deviceId = deviceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contextUri]
         * - [offset]
         * - [positionMs]
         * - [uris]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Optional. Spotify URI of the context to play. Valid contexts are albums, artists &
         * playlists. `{context_uri:"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT"}`
         */
        fun contextUri(contextUri: String) = apply { body.contextUri(contextUri) }

        /**
         * Sets [Builder.contextUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contextUri(contextUri: JsonField<String>) = apply { body.contextUri(contextUri) }

        /**
         * Optional. Indicates from where in the context playback should start. Only available when
         * context_uri corresponds to an album or playlist object "position" is zero based and can’t
         * be negative. Example: `"offset": {"position": 5}` "uri" is a string representing the uri
         * of the item to start at. Example: `"offset": {"uri":
         * "spotify:track:1301WleyT98MSxVHPZCA6M"}`
         */
        fun offset(offset: Offset) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Offset] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Offset>) = apply { body.offset(offset) }

        /**
         * Indicates from what position to start playback. Must be a positive number. Passing in a
         * position that is greater than the length of the track will cause the player to start
         * playing the next song.
         */
        fun positionMs(positionMs: Long) = apply { body.positionMs(positionMs) }

        /**
         * Sets [Builder.positionMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun positionMs(positionMs: JsonField<Long>) = apply { body.positionMs(positionMs) }

        /**
         * Optional. A JSON array of the Spotify track URIs to play. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh", "spotify:track:1301WleyT98MSxVHPZCA6M"]}`
         */
        fun uris(uris: List<String>) = apply { body.uris(uris) }

        /**
         * Sets [Builder.uris] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uris] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uris(uris: JsonField<List<String>>) = apply { body.uris(uris) }

        /**
         * Adds a single [String] to [Builder.uris].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUris(uris: String) = apply { body.addUris(uris) }

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
         * Returns an immutable instance of [PlayerStartPlaybackParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlayerStartPlaybackParams =
            PlayerStartPlaybackParams(
                deviceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                deviceId?.let { put("device_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contextUri: JsonField<String>,
        private val offset: JsonField<Offset>,
        private val positionMs: JsonField<Long>,
        private val uris: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("context_uri")
            @ExcludeMissing
            contextUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Offset> = JsonMissing.of(),
            @JsonProperty("position_ms")
            @ExcludeMissing
            positionMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uris") @ExcludeMissing uris: JsonField<List<String>> = JsonMissing.of(),
        ) : this(contextUri, offset, positionMs, uris, mutableMapOf())

        /**
         * Optional. Spotify URI of the context to play. Valid contexts are albums, artists &
         * playlists. `{context_uri:"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT"}`
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contextUri(): String? = contextUri.getNullable("context_uri")

        /**
         * Optional. Indicates from where in the context playback should start. Only available when
         * context_uri corresponds to an album or playlist object "position" is zero based and can’t
         * be negative. Example: `"offset": {"position": 5}` "uri" is a string representing the uri
         * of the item to start at. Example: `"offset": {"uri":
         * "spotify:track:1301WleyT98MSxVHPZCA6M"}`
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Offset? = offset.getNullable("offset")

        /**
         * Indicates from what position to start playback. Must be a positive number. Passing in a
         * position that is greater than the length of the track will cause the player to start
         * playing the next song.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun positionMs(): Long? = positionMs.getNullable("position_ms")

        /**
         * Optional. A JSON array of the Spotify track URIs to play. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh", "spotify:track:1301WleyT98MSxVHPZCA6M"]}`
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uris(): List<String>? = uris.getNullable("uris")

        /**
         * Returns the raw JSON value of [contextUri].
         *
         * Unlike [contextUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context_uri")
        @ExcludeMissing
        fun _contextUri(): JsonField<String> = contextUri

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Offset> = offset

        /**
         * Returns the raw JSON value of [positionMs].
         *
         * Unlike [positionMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position_ms") @ExcludeMissing fun _positionMs(): JsonField<Long> = positionMs

        /**
         * Returns the raw JSON value of [uris].
         *
         * Unlike [uris], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uris") @ExcludeMissing fun _uris(): JsonField<List<String>> = uris

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

            private var contextUri: JsonField<String> = JsonMissing.of()
            private var offset: JsonField<Offset> = JsonMissing.of()
            private var positionMs: JsonField<Long> = JsonMissing.of()
            private var uris: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                contextUri = body.contextUri
                offset = body.offset
                positionMs = body.positionMs
                uris = body.uris.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Optional. Spotify URI of the context to play. Valid contexts are albums, artists &
             * playlists. `{context_uri:"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT"}`
             */
            fun contextUri(contextUri: String) = contextUri(JsonField.of(contextUri))

            /**
             * Sets [Builder.contextUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contextUri(contextUri: JsonField<String>) = apply { this.contextUri = contextUri }

            /**
             * Optional. Indicates from where in the context playback should start. Only available
             * when context_uri corresponds to an album or playlist object "position" is zero based
             * and can’t be negative. Example: `"offset": {"position": 5}` "uri" is a string
             * representing the uri of the item to start at. Example: `"offset": {"uri":
             * "spotify:track:1301WleyT98MSxVHPZCA6M"}`
             */
            fun offset(offset: Offset) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Offset] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun offset(offset: JsonField<Offset>) = apply { this.offset = offset }

            /**
             * Indicates from what position to start playback. Must be a positive number. Passing in
             * a position that is greater than the length of the track will cause the player to
             * start playing the next song.
             */
            fun positionMs(positionMs: Long) = positionMs(JsonField.of(positionMs))

            /**
             * Sets [Builder.positionMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.positionMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun positionMs(positionMs: JsonField<Long>) = apply { this.positionMs = positionMs }

            /**
             * Optional. A JSON array of the Spotify track URIs to play. For example: `{"uris":
             * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh", "spotify:track:1301WleyT98MSxVHPZCA6M"]}`
             */
            fun uris(uris: List<String>) = uris(JsonField.of(uris))

            /**
             * Sets [Builder.uris] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uris] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uris(uris: JsonField<List<String>>) = apply {
                this.uris = uris.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.uris].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUris(uris: String) = apply {
                this.uris =
                    (this.uris ?: JsonField.of(mutableListOf())).also {
                        checkKnown("uris", it).add(uris)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    contextUri,
                    offset,
                    positionMs,
                    (uris ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contextUri()
            offset()?.validate()
            positionMs()
            uris()
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
            (if (contextUri.asKnown() == null) 0 else 1) +
                (offset.asKnown()?.validity() ?: 0) +
                (if (positionMs.asKnown() == null) 0 else 1) +
                (uris.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contextUri == other.contextUri &&
                offset == other.offset &&
                positionMs == other.positionMs &&
                uris == other.uris &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contextUri, offset, positionMs, uris, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contextUri=$contextUri, offset=$offset, positionMs=$positionMs, uris=$uris, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional. Indicates from where in the context playback should start. Only available when
     * context_uri corresponds to an album or playlist object "position" is zero based and can’t be
     * negative. Example: `"offset": {"position": 5}` "uri" is a string representing the uri of the
     * item to start at. Example: `"offset": {"uri": "spotify:track:1301WleyT98MSxVHPZCA6M"}`
     */
    class Offset
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Offset]. */
            fun builder() = Builder()
        }

        /** A builder for [Offset]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(offset: Offset) = apply {
                additionalProperties = offset.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Offset].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Offset = Offset(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Offset = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Offset && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Offset{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerStartPlaybackParams &&
            deviceId == other.deviceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(deviceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlayerStartPlaybackParams{deviceId=$deviceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
