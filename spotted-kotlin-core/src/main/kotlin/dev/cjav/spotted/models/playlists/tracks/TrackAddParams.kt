// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

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

/** Add one or more items to a user's playlist. */
class TrackAddParams
private constructor(
    private val playlistId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
    fun playlistId(): String? = playlistId

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
    fun position(): Long? = body.position()

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
    fun uris(): List<String>? = body.uris()

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _position(): JsonField<Long> = body._position()

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

        fun none(): TrackAddParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TrackAddParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackAddParams]. */
    class Builder internal constructor() {

        private var playlistId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(trackAddParams: TrackAddParams) = apply {
            playlistId = trackAddParams.playlistId
            body = trackAddParams.body.toBuilder()
            additionalHeaders = trackAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackAddParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
        fun playlistId(playlistId: String?) = apply { this.playlistId = playlistId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [position]
         * - [uris]
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
        fun position(position: Long) = apply { body.position(position) }

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<Long>) = apply { body.position(position) }

        /**
         * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to
         * add. For example: `{"uris":
         * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
         * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter is
         * present in the query string, any URIs listed here in the body will be ignored._
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
         * Returns an immutable instance of [TrackAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackAddParams =
            TrackAddParams(
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
        private val position: JsonField<Long>,
        private val uris: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("position") @ExcludeMissing position: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uris") @ExcludeMissing uris: JsonField<List<String>> = JsonMissing.of(),
        ) : this(position, uris, mutableMapOf())

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
        fun position(): Long? = position.getNullable("position")

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
        fun uris(): List<String>? = uris.getNullable("uris")

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Long> = position

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

            private var position: JsonField<Long> = JsonMissing.of()
            private var uris: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                position = body.position
                uris = body.uris.map { it.toMutableList() }
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
            fun position(position: Long) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<Long>) = apply { this.position = position }

            /**
             * A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids)
             * to add. For example: `{"uris":
             * ["spotify:track:4iV5W9uYEdYUVa79Axb7Rh","spotify:track:1301WleyT98MSxVHPZCA6M", "spotify:episode:512ojhOuo1ktJprKbVcKyQ"]}`<br/>A
             * maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter
             * is present in the query string, any URIs listed here in the body will be ignored._
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
                    position,
                    (uris ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            position()
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
            (if (position.asKnown() == null) 0 else 1) + (uris.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                position == other.position &&
                uris == other.uris &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(position, uris, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{position=$position, uris=$uris, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackAddParams &&
            playlistId == other.playlistId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(playlistId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TrackAddParams{playlistId=$playlistId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
