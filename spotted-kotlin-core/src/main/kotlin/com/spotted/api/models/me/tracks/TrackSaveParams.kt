// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.tracks

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
import com.spotted.api.core.checkRequired
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Save one or more tracks to the current user's 'Your Music' library. */
class TrackSaveParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
     * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items can
     * be specified in one request. _**Note**: if the `timestamped_ids` is present in the body, any
     * IDs listed in the query parameters (deprecated) or the `ids` field in the body will be
     * ignored._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ids(): List<String> = body.ids()

    /**
     * A JSON array of objects containing track IDs with their corresponding timestamps. Each object
     * must include a track ID and an `added_at` timestamp. This allows you to specify when tracks
     * were added to maintain a specific chronological order in the user's library.<br/>A maximum of
     * 50 items can be specified in one request. _**Note**: if the `timestamped_ids` is present in
     * the body, any IDs listed in the query parameters (deprecated) or the `ids` field in the body
     * will be ignored._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestampedIds(): List<TimestampedId>? = body.timestampedIds()

    /**
     * Returns the raw JSON value of [ids].
     *
     * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ids(): JsonField<List<String>> = body._ids()

    /**
     * Returns the raw JSON value of [timestampedIds].
     *
     * Unlike [timestampedIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timestampedIds(): JsonField<List<TimestampedId>> = body._timestampedIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackSaveParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ids()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TrackSaveParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(trackSaveParams: TrackSaveParams) = apply {
            body = trackSaveParams.body.toBuilder()
            additionalHeaders = trackSaveParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackSaveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ids]
         * - [timestampedIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
         * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items
         * can be specified in one request. _**Note**: if the `timestamped_ids` is present in the
         * body, any IDs listed in the query parameters (deprecated) or the `ids` field in the body
         * will be ignored._
         */
        fun ids(ids: List<String>) = apply { body.ids(ids) }

        /**
         * Sets [Builder.ids] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ids(ids: JsonField<List<String>>) = apply { body.ids(ids) }

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { body.addId(id) }

        /**
         * A JSON array of objects containing track IDs with their corresponding timestamps. Each
         * object must include a track ID and an `added_at` timestamp. This allows you to specify
         * when tracks were added to maintain a specific chronological order in the user's
         * library.<br/>A maximum of 50 items can be specified in one request. _**Note**: if the
         * `timestamped_ids` is present in the body, any IDs listed in the query parameters
         * (deprecated) or the `ids` field in the body will be ignored._
         */
        fun timestampedIds(timestampedIds: List<TimestampedId>) = apply {
            body.timestampedIds(timestampedIds)
        }

        /**
         * Sets [Builder.timestampedIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestampedIds] with a well-typed `List<TimestampedId>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun timestampedIds(timestampedIds: JsonField<List<TimestampedId>>) = apply {
            body.timestampedIds(timestampedIds)
        }

        /**
         * Adds a single [TimestampedId] to [timestampedIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTimestampedId(timestampedId: TimestampedId) = apply {
            body.addTimestampedId(timestampedId)
        }

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
         * Returns an immutable instance of [TrackSaveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ids()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrackSaveParams =
            TrackSaveParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ids: JsonField<List<String>>,
        private val timestampedIds: JsonField<List<TimestampedId>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ids") @ExcludeMissing ids: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("timestamped_ids")
            @ExcludeMissing
            timestampedIds: JsonField<List<TimestampedId>> = JsonMissing.of(),
        ) : this(ids, timestampedIds, mutableMapOf())

        /**
         * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
         * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items
         * can be specified in one request. _**Note**: if the `timestamped_ids` is present in the
         * body, any IDs listed in the query parameters (deprecated) or the `ids` field in the body
         * will be ignored._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ids(): List<String> = ids.getRequired("ids")

        /**
         * A JSON array of objects containing track IDs with their corresponding timestamps. Each
         * object must include a track ID and an `added_at` timestamp. This allows you to specify
         * when tracks were added to maintain a specific chronological order in the user's
         * library.<br/>A maximum of 50 items can be specified in one request. _**Note**: if the
         * `timestamped_ids` is present in the body, any IDs listed in the query parameters
         * (deprecated) or the `ids` field in the body will be ignored._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestampedIds(): List<TimestampedId>? = timestampedIds.getNullable("timestamped_ids")

        /**
         * Returns the raw JSON value of [ids].
         *
         * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ids") @ExcludeMissing fun _ids(): JsonField<List<String>> = ids

        /**
         * Returns the raw JSON value of [timestampedIds].
         *
         * Unlike [timestampedIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timestamped_ids")
        @ExcludeMissing
        fun _timestampedIds(): JsonField<List<TimestampedId>> = timestampedIds

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
             * .ids()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var ids: JsonField<MutableList<String>>? = null
            private var timestampedIds: JsonField<MutableList<TimestampedId>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                ids = body.ids.map { it.toMutableList() }
                timestampedIds = body.timestampedIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids).
             * For example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of
             * 50 items can be specified in one request. _**Note**: if the `timestamped_ids` is
             * present in the body, any IDs listed in the query parameters (deprecated) or the `ids`
             * field in the body will be ignored._
             */
            fun ids(ids: List<String>) = ids(JsonField.of(ids))

            /**
             * Sets [Builder.ids] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ids(ids: JsonField<List<String>>) = apply {
                this.ids = ids.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ids].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addId(id: String) = apply {
                ids = (ids ?: JsonField.of(mutableListOf())).also { checkKnown("ids", it).add(id) }
            }

            /**
             * A JSON array of objects containing track IDs with their corresponding timestamps.
             * Each object must include a track ID and an `added_at` timestamp. This allows you to
             * specify when tracks were added to maintain a specific chronological order in the
             * user's library.<br/>A maximum of 50 items can be specified in one request. _**Note**:
             * if the `timestamped_ids` is present in the body, any IDs listed in the query
             * parameters (deprecated) or the `ids` field in the body will be ignored._
             */
            fun timestampedIds(timestampedIds: List<TimestampedId>) =
                timestampedIds(JsonField.of(timestampedIds))

            /**
             * Sets [Builder.timestampedIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestampedIds] with a well-typed
             * `List<TimestampedId>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun timestampedIds(timestampedIds: JsonField<List<TimestampedId>>) = apply {
                this.timestampedIds = timestampedIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [TimestampedId] to [timestampedIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTimestampedId(timestampedId: TimestampedId) = apply {
                timestampedIds =
                    (timestampedIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("timestampedIds", it).add(timestampedId)
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
             *
             * The following fields are required:
             * ```kotlin
             * .ids()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("ids", ids).map { it.toImmutable() },
                    (timestampedIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ids()
            timestampedIds()?.forEach { it.validate() }
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
            (ids.asKnown()?.size ?: 0) +
                (timestampedIds.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ids == other.ids &&
                timestampedIds == other.timestampedIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ids, timestampedIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ids=$ids, timestampedIds=$timestampedIds, additionalProperties=$additionalProperties}"
    }

    class TimestampedId
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val addedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("added_at")
            @ExcludeMissing
            addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, addedAt, mutableMapOf())

        /**
         * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The timestamp when the track was added to the library. Use ISO 8601 format with UTC
         * timezone (e.g., `2023-01-15T14:30:00Z`). You can specify past timestamps to insert tracks
         * at specific positions in the library's chronological order. The API uses minute-level
         * granularity for ordering, though the timestamp supports millisecond precision.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addedAt(): OffsetDateTime = addedAt.getRequired("added_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at")
        @ExcludeMissing
        fun _addedAt(): JsonField<OffsetDateTime> = addedAt

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
             * Returns a mutable builder for constructing an instance of [TimestampedId].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .addedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TimestampedId]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var addedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(timestampedId: TimestampedId) = apply {
                id = timestampedId.id
                addedAt = timestampedId.addedAt
                additionalProperties = timestampedId.additionalProperties.toMutableMap()
            }

            /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The timestamp when the track was added to the library. Use ISO 8601 format with UTC
             * timezone (e.g., `2023-01-15T14:30:00Z`). You can specify past timestamps to insert
             * tracks at specific positions in the library's chronological order. The API uses
             * minute-level granularity for ordering, though the timestamp supports millisecond
             * precision.
             */
            fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

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
             * Returns an immutable instance of [TimestampedId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .addedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TimestampedId =
                TimestampedId(
                    checkRequired("id", id),
                    checkRequired("addedAt", addedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TimestampedId = apply {
            if (validated) {
                return@apply
            }

            id()
            addedAt()
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
            (if (id.asKnown() == null) 0 else 1) + (if (addedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimestampedId &&
                id == other.id &&
                addedAt == other.addedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, addedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TimestampedId{id=$id, addedAt=$addedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackSaveParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TrackSaveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
