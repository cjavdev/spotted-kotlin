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

/**
 * Either reorder or replace items in a playlist depending on the request's parameters. To reorder
 * items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in the request's
 * body. To replace items, include `uris` as either a query parameter or in the request's body.
 * Replacing items in a playlist will overwrite its existing items. This operation can be used for
 * replacing or clearing items in a playlist. <br/> **Note**: Replace and reorder are mutually
 * exclusive operations which share the same endpoint, but have different parameters. These
 * operations can't be applied together in a single request.
 */
class TrackUpdateParams
private constructor(
    private val playlistId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
    fun playlistId(): String? = playlistId

    /**
     * The position where the items should be inserted.<br/>To reorder the items to the end of the
     * playlist, simply set _insert_before_ to the position after the last
     * item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist with 10
     * items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the last item in a
     * playlist with 10 items to the start of the playlist, set _range_start_ to 9, and
     * _insert_before_ to 0.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insertBefore(): Long? = body.insertBefore()

    /**
     * The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items to be
     * reordered begins from the _range_start_ position, and includes the _range_length_ subsequent
     * items.<br/>Example:<br/>To move the items at index 9-10 to the start of the playlist,
     * _range_start_ is set to 9, and _range_length_ is set to 2.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rangeLength(): Long? = body.rangeLength()

    /**
     * The position of the first item to be reordered.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rangeStart(): Long? = body.rangeStart()

    /**
     * The playlist's snapshot ID against which you want to make the changes.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): String? = body.snapshotId()

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uris(): List<String>? = body.uris()

    /**
     * Returns the raw JSON value of [insertBefore].
     *
     * Unlike [insertBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _insertBefore(): JsonField<Long> = body._insertBefore()

    /**
     * Returns the raw JSON value of [rangeLength].
     *
     * Unlike [rangeLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rangeLength(): JsonField<Long> = body._rangeLength()

    /**
     * Returns the raw JSON value of [rangeStart].
     *
     * Unlike [rangeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rangeStart(): JsonField<Long> = body._rangeStart()

    /**
     * Returns the raw JSON value of [snapshotId].
     *
     * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _snapshotId(): JsonField<String> = body._snapshotId()

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

        fun none(): TrackUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TrackUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackUpdateParams]. */
    class Builder internal constructor() {

        private var playlistId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(trackUpdateParams: TrackUpdateParams) = apply {
            playlistId = trackUpdateParams.playlistId
            body = trackUpdateParams.body.toBuilder()
            additionalHeaders = trackUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
        fun playlistId(playlistId: String?) = apply { this.playlistId = playlistId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [insertBefore]
         * - [rangeLength]
         * - [rangeStart]
         * - [snapshotId]
         * - [uris]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The position where the items should be inserted.<br/>To reorder the items to the end of
         * the playlist, simply set _insert_before_ to the position after the last
         * item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist with
         * 10 items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the last item
         * in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and
         * _insert_before_ to 0.
         */
        fun insertBefore(insertBefore: Long) = apply { body.insertBefore(insertBefore) }

        /**
         * Sets [Builder.insertBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insertBefore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun insertBefore(insertBefore: JsonField<Long>) = apply { body.insertBefore(insertBefore) }

        /**
         * The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items to
         * be reordered begins from the _range_start_ position, and includes the _range_length_
         * subsequent items.<br/>Example:<br/>To move the items at index 9-10 to the start of the
         * playlist, _range_start_ is set to 9, and _range_length_ is set to 2.
         */
        fun rangeLength(rangeLength: Long) = apply { body.rangeLength(rangeLength) }

        /**
         * Sets [Builder.rangeLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeLength] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeLength(rangeLength: JsonField<Long>) = apply { body.rangeLength(rangeLength) }

        /** The position of the first item to be reordered. */
        fun rangeStart(rangeStart: Long) = apply { body.rangeStart(rangeStart) }

        /**
         * Sets [Builder.rangeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeStart] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rangeStart(rangeStart: JsonField<Long>) = apply { body.rangeStart(rangeStart) }

        /** The playlist's snapshot ID against which you want to make the changes. */
        fun snapshotId(snapshotId: String) = apply { body.snapshotId(snapshotId) }

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { body.snapshotId(snapshotId) }

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
         * Returns an immutable instance of [TrackUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackUpdateParams =
            TrackUpdateParams(
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
        private val insertBefore: JsonField<Long>,
        private val rangeLength: JsonField<Long>,
        private val rangeStart: JsonField<Long>,
        private val snapshotId: JsonField<String>,
        private val uris: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("insert_before")
            @ExcludeMissing
            insertBefore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("range_length")
            @ExcludeMissing
            rangeLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("range_start")
            @ExcludeMissing
            rangeStart: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("snapshot_id")
            @ExcludeMissing
            snapshotId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uris") @ExcludeMissing uris: JsonField<List<String>> = JsonMissing.of(),
        ) : this(insertBefore, rangeLength, rangeStart, snapshotId, uris, mutableMapOf())

        /**
         * The position where the items should be inserted.<br/>To reorder the items to the end of
         * the playlist, simply set _insert_before_ to the position after the last
         * item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist with
         * 10 items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the last item
         * in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and
         * _insert_before_ to 0.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun insertBefore(): Long? = insertBefore.getNullable("insert_before")

        /**
         * The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items to
         * be reordered begins from the _range_start_ position, and includes the _range_length_
         * subsequent items.<br/>Example:<br/>To move the items at index 9-10 to the start of the
         * playlist, _range_start_ is set to 9, and _range_length_ is set to 2.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rangeLength(): Long? = rangeLength.getNullable("range_length")

        /**
         * The position of the first item to be reordered.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rangeStart(): Long? = rangeStart.getNullable("range_start")

        /**
         * The playlist's snapshot ID against which you want to make the changes.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snapshotId(): String? = snapshotId.getNullable("snapshot_id")

        /**
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uris(): List<String>? = uris.getNullable("uris")

        /**
         * Returns the raw JSON value of [insertBefore].
         *
         * Unlike [insertBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("insert_before")
        @ExcludeMissing
        fun _insertBefore(): JsonField<Long> = insertBefore

        /**
         * Returns the raw JSON value of [rangeLength].
         *
         * Unlike [rangeLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("range_length")
        @ExcludeMissing
        fun _rangeLength(): JsonField<Long> = rangeLength

        /**
         * Returns the raw JSON value of [rangeStart].
         *
         * Unlike [rangeStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("range_start") @ExcludeMissing fun _rangeStart(): JsonField<Long> = rangeStart

        /**
         * Returns the raw JSON value of [snapshotId].
         *
         * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        fun _snapshotId(): JsonField<String> = snapshotId

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

            private var insertBefore: JsonField<Long> = JsonMissing.of()
            private var rangeLength: JsonField<Long> = JsonMissing.of()
            private var rangeStart: JsonField<Long> = JsonMissing.of()
            private var snapshotId: JsonField<String> = JsonMissing.of()
            private var uris: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                insertBefore = body.insertBefore
                rangeLength = body.rangeLength
                rangeStart = body.rangeStart
                snapshotId = body.snapshotId
                uris = body.uris.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The position where the items should be inserted.<br/>To reorder the items to the end
             * of the playlist, simply set _insert_before_ to the position after the last
             * item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist
             * with 10 items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the
             * last item in a playlist with 10 items to the start of the playlist, set _range_start_
             * to 9, and _insert_before_ to 0.
             */
            fun insertBefore(insertBefore: Long) = insertBefore(JsonField.of(insertBefore))

            /**
             * Sets [Builder.insertBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insertBefore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun insertBefore(insertBefore: JsonField<Long>) = apply {
                this.insertBefore = insertBefore
            }

            /**
             * The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items
             * to be reordered begins from the _range_start_ position, and includes the
             * _range_length_ subsequent items.<br/>Example:<br/>To move the items at index 9-10 to
             * the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2.
             */
            fun rangeLength(rangeLength: Long) = rangeLength(JsonField.of(rangeLength))

            /**
             * Sets [Builder.rangeLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rangeLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rangeLength(rangeLength: JsonField<Long>) = apply { this.rangeLength = rangeLength }

            /** The position of the first item to be reordered. */
            fun rangeStart(rangeStart: Long) = rangeStart(JsonField.of(rangeStart))

            /**
             * Sets [Builder.rangeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rangeStart] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rangeStart(rangeStart: JsonField<Long>) = apply { this.rangeStart = rangeStart }

            /** The playlist's snapshot ID against which you want to make the changes. */
            fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

            /**
             * Sets [Builder.snapshotId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshotId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

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
                    insertBefore,
                    rangeLength,
                    rangeStart,
                    snapshotId,
                    (uris ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            insertBefore()
            rangeLength()
            rangeStart()
            snapshotId()
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
            (if (insertBefore.asKnown() == null) 0 else 1) +
                (if (rangeLength.asKnown() == null) 0 else 1) +
                (if (rangeStart.asKnown() == null) 0 else 1) +
                (if (snapshotId.asKnown() == null) 0 else 1) +
                (uris.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                insertBefore == other.insertBefore &&
                rangeLength == other.rangeLength &&
                rangeStart == other.rangeStart &&
                snapshotId == other.snapshotId &&
                uris == other.uris &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                insertBefore,
                rangeLength,
                rangeStart,
                snapshotId,
                uris,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{insertBefore=$insertBefore, rangeLength=$rangeLength, rangeStart=$rangeStart, snapshotId=$snapshotId, uris=$uris, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackUpdateParams &&
            playlistId == other.playlistId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(playlistId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TrackUpdateParams{playlistId=$playlistId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
