// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

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
import java.util.Collections
import java.util.Objects

/** Save one or more albums to the current user's 'Your Music' library. */
class AlbumSaveParams
private constructor(
    private val queryIds: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A comma-separated list of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids)
     * for the albums. Maximum: 20 IDs.
     */
    fun queryIds(): String = queryIds

    /**
     * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
     * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items can
     * be specified in one request. _**Note**: if the `ids` parameter is present in the query
     * string, any IDs listed here in the body will be ignored._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyIds(): List<String>? = body.bodyIds()

    /**
     * Returns the raw JSON value of [bodyIds].
     *
     * Unlike [bodyIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyIds(): JsonField<List<String>> = body._bodyIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumSaveParams].
         *
         * The following fields are required:
         * ```kotlin
         * .queryIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AlbumSaveParams]. */
    class Builder internal constructor() {

        private var queryIds: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(albumSaveParams: AlbumSaveParams) = apply {
            queryIds = albumSaveParams.queryIds
            body = albumSaveParams.body.toBuilder()
            additionalHeaders = albumSaveParams.additionalHeaders.toBuilder()
            additionalQueryParams = albumSaveParams.additionalQueryParams.toBuilder()
        }

        /**
         * A comma-separated list of the
         * [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids) for the albums. Maximum:
         * 20 IDs.
         */
        fun queryIds(queryIds: String) = apply { this.queryIds = queryIds }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
         * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items
         * can be specified in one request. _**Note**: if the `ids` parameter is present in the
         * query string, any IDs listed here in the body will be ignored._
         */
        fun bodyIds(bodyIds: List<String>) = apply { body.bodyIds(bodyIds) }

        /**
         * Sets [Builder.bodyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyIds(bodyIds: JsonField<List<String>>) = apply { body.bodyIds(bodyIds) }

        /**
         * Adds a single [String] to [bodyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBodyId(bodyId: String) = apply { body.addBodyId(bodyId) }

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
         * Returns an immutable instance of [AlbumSaveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .queryIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlbumSaveParams =
            AlbumSaveParams(
                checkRequired("queryIds", queryIds),
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
                put("ids", queryIds)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ids") @ExcludeMissing bodyIds: JsonField<List<String>> = JsonMissing.of()
        ) : this(bodyIds, mutableMapOf())

        /**
         * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For
         * example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of 50 items
         * can be specified in one request. _**Note**: if the `ids` parameter is present in the
         * query string, any IDs listed here in the body will be ignored._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyIds(): List<String>? = bodyIds.getNullable("ids")

        /**
         * Returns the raw JSON value of [bodyIds].
         *
         * Unlike [bodyIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ids") @ExcludeMissing fun _bodyIds(): JsonField<List<String>> = bodyIds

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

            private var bodyIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                bodyIds = body.bodyIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids).
             * For example: `["4iV5W9uYEdYUVa79Axb7Rh", "1301WleyT98MSxVHPZCA6M"]`<br/>A maximum of
             * 50 items can be specified in one request. _**Note**: if the `ids` parameter is
             * present in the query string, any IDs listed here in the body will be ignored._
             */
            fun bodyIds(bodyIds: List<String>) = bodyIds(JsonField.of(bodyIds))

            /**
             * Sets [Builder.bodyIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyIds(bodyIds: JsonField<List<String>>) = apply {
                this.bodyIds = bodyIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [bodyIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBodyId(bodyId: String) = apply {
                bodyIds =
                    (bodyIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bodyIds", it).add(bodyId)
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
                    (bodyIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bodyIds()
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
        internal fun validity(): Int = (bodyIds.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyIds == other.bodyIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(bodyIds, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyIds=$bodyIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumSaveParams &&
            queryIds == other.queryIds &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queryIds, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlbumSaveParams{queryIds=$queryIds, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
