// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.Params
import com.spotted.api.core.checkKnown
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

/** Add one or more items to a user's playlist. */
class TrackAddParams
private constructor(
    private val playlistId: String?,
    private val queryPosition: Long?,
    private val queryUris: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
    fun playlistId(): String? = playlistId

    /**
     * The position to insert the items, a zero-based index. For example, to insert the items in the
     * first position: `position=0`; to insert the items in the third position: `position=2`. If
     * omitted, the items will be appended to the playlist. Items are added in the order they are
     * listed in the query string or request body.
     */
    fun queryPosition(): Long? = queryPosition

    /**
     * A comma-separated list of [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to
     * add, can be track or episode URIs. For
     * example:<br/>`uris=spotify:track:4iV5W9uYEdYUVa79Axb7Rh,
     * spotify:track:1301WleyT98MSxVHPZCA6M, spotify:episode:512ojhOuo1ktJprKbVcKyQ`<br/>A maximum
     * of 100 items can be added in one request. <br/> _**Note**: it is likely that passing a large
     * number of item URIs as a query parameter will exceed the maximum length of the request URI.
     * When adding a large number of items, it is recommended to pass them in the request body, see
     * below._
     */
    fun queryUris(): String? = queryUris

    /**
     * The position to insert the items, a zero-based index. For example, to insert the items in the
     * first position: `position=0` ; to insert the items in the third position: `position=2`. If
     * omitted, the items will be appended to the playlist. Items are added in the order they appear
     * in the uris array. For example: `{"uris":
     * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M"], "position":
     * 3}`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyPosition(): Long? = body.bodyPosition()

    /**
     * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to add.
     * For example: `{"uris":
     * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
     * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter is
     * present in the query string, any URIs listed here in the body will be ignored._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyUris(): List<String>? = body.bodyUris()

    /**
     * Returns the raw JSON value of [bodyPosition].
     *
     * Unlike [bodyPosition], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyPosition(): JsonField<Long> = body._bodyPosition()

    /**
     * Returns the raw JSON value of [bodyUris].
     *
     * Unlike [bodyUris], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyUris(): JsonField<List<String>> = body._bodyUris()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TrackAddParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TrackAddParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackAddParams]. */
    class Builder internal constructor() {

        private var playlistId: String? = null
        private var queryPosition: Long? = null
        private var queryUris: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(trackAddParams: TrackAddParams) = apply {
            playlistId = trackAddParams.playlistId
            queryPosition = trackAddParams.queryPosition
            queryUris = trackAddParams.queryUris
            body = trackAddParams.body.toBuilder()
            additionalHeaders = trackAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackAddParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
        fun playlistId(playlistId: String?) = apply { this.playlistId = playlistId }

        /**
         * The position to insert the items, a zero-based index. For example, to insert the items in
         * the first position: `position=0`; to insert the items in the third position:
         * `position=2`. If omitted, the items will be appended to the playlist. Items are added in
         * the order they are listed in the query string or request body.
         */
        fun queryPosition(queryPosition: Long?) = apply { this.queryPosition = queryPosition }

        /**
         * Alias for [Builder.queryPosition].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun queryPosition(queryPosition: Long) = queryPosition(queryPosition as Long?)

        /**
         * A comma-separated list of
         * [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to add, can be track or
         * episode URIs. For example:<br/>`uris=spotify:track:4iV5W9uYEdYUVa79Axb7Rh,
         * spotify:track:1301WleyT98MSxVHPZCA6M, spotify:episode:512ojhOuo1ktJprKbVcKyQ`<br/>A
         * maximum of 100 items can be added in one request. <br/> _**Note**: it is likely that
         * passing a large number of item URIs as a query parameter will exceed the maximum length
         * of the request URI. When adding a large number of items, it is recommended to pass them
         * in the request body, see below._
         */
        fun queryUris(queryUris: String?) = apply { this.queryUris = queryUris }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyPosition]
         * - [bodyUris]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The position to insert the items, a zero-based index. For example, to insert the items in
         * the first position: `position=0` ; to insert the items in the third position:
         * `position=2`. If omitted, the items will be appended to the playlist. Items are added in
         * the order they appear in the uris array. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M"],
         * "position": 3}`
         */
        fun bodyPosition(bodyPosition: Long) = apply { body.bodyPosition(bodyPosition) }

        /**
         * Sets [Builder.bodyPosition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyPosition] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyPosition(bodyPosition: JsonField<Long>) = apply { body.bodyPosition(bodyPosition) }

        /**
         * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to
         * add. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
         * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter is
         * present in the query string, any URIs listed here in the body will be ignored._
         */
        fun bodyUris(bodyUris: List<String>) = apply { body.bodyUris(bodyUris) }

        /**
         * Sets [Builder.bodyUris] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyUris] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyUris(bodyUris: JsonField<List<String>>) = apply { body.bodyUris(bodyUris) }

        /**
         * Adds a single [String] to [Builder.bodyUris].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBodyUris(bodyUris: String) = apply { body.addBodyUris(bodyUris) }

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
         * Returns an immutable instance of [TrackAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackAddParams =
            TrackAddParams(
                playlistId,
                queryPosition,
                queryUris,
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

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                queryPosition?.let { put("position", it.toString()) }
                queryUris?.let { put("uris", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyPosition: JsonField<Long>,
        private val bodyUris: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("position")
            @ExcludeMissing
            bodyPosition: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uris")
            @ExcludeMissing
            bodyUris: JsonField<List<String>> = JsonMissing.of(),
        ) : this(bodyPosition, bodyUris, mutableMapOf())

        /**
         * The position to insert the items, a zero-based index. For example, to insert the items in
         * the first position: `position=0` ; to insert the items in the third position:
         * `position=2`. If omitted, the items will be appended to the playlist. Items are added in
         * the order they appear in the uris array. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M"],
         * "position": 3}`
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyPosition(): Long? = bodyPosition.getNullable("position")

        /**
         * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to
         * add. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
         * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter is
         * present in the query string, any URIs listed here in the body will be ignored._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyUris(): List<String>? = bodyUris.getNullable("uris")

        /**
         * Returns the raw JSON value of [bodyPosition].
         *
         * Unlike [bodyPosition], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("position")
        @ExcludeMissing
        fun _bodyPosition(): JsonField<Long> = bodyPosition

        /**
         * Returns the raw JSON value of [bodyUris].
         *
         * Unlike [bodyUris], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uris") @ExcludeMissing fun _bodyUris(): JsonField<List<String>> = bodyUris

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

            private var bodyPosition: JsonField<Long> = JsonMissing.of()
            private var bodyUris: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                bodyPosition = body.bodyPosition
                bodyUris = body.bodyUris.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The position to insert the items, a zero-based index. For example, to insert the
             * items in the first position: `position=0` ; to insert the items in the third
             * position: `position=2`. If omitted, the items will be appended to the playlist. Items
             * are added in the order they appear in the uris array. For example: `{"uris":
             * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M"],
             * "position": 3}`
             */
            fun bodyPosition(bodyPosition: Long) = bodyPosition(JsonField.of(bodyPosition))

            /**
             * Sets [Builder.bodyPosition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyPosition] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyPosition(bodyPosition: JsonField<Long>) = apply {
                this.bodyPosition = bodyPosition
            }

            /**
             * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids)
             * to add. For example: `{"uris":
             * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
             * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter
             * is present in the query string, any URIs listed here in the body will be ignored._
             */
            fun bodyUris(bodyUris: List<String>) = bodyUris(JsonField.of(bodyUris))

            /**
             * Sets [Builder.bodyUris] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyUris] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyUris(bodyUris: JsonField<List<String>>) = apply {
                this.bodyUris = bodyUris.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.bodyUris].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBodyUris(bodyUris: String) = apply {
                this.bodyUris =
                    (this.bodyUris ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bodyUris", it).add(bodyUris)
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
                    bodyPosition,
                    (bodyUris ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bodyPosition()
            bodyUris()
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
            (if (bodyPosition.asKnown() == null) 0 else 1) + (bodyUris.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyPosition == other.bodyPosition &&
                bodyUris == other.bodyUris &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bodyPosition, bodyUris, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyPosition=$bodyPosition, bodyUris=$bodyUris, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackAddParams &&
            playlistId == other.playlistId &&
            queryPosition == other.queryPosition &&
            queryUris == other.queryUris &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            playlistId,
            queryPosition,
            queryUris,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TrackAddParams{playlistId=$playlistId, queryPosition=$queryPosition, queryUris=$queryUris, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
