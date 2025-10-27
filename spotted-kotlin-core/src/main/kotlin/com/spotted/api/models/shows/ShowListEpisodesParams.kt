// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.shows

import com.spotted.api.core.Params
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import java.util.Objects

/**
 * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
 * limit the number of episodes returned.
 */
class ShowListEpisodesParams
private constructor(
    private val id: String?,
    private val limit: Long?,
    private val market: String?,
    private val offset: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. */
    fun id(): String? = id

    /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 50. */
    fun limit(): Long? = limit

    /**
     * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). If a
     * country code is specified, only content that is available in that market will be
     * returned.<br/> If a valid user access token is specified in the request header, the country
     * associated with the user account will take priority over this parameter.<br/> _**Note**: If
     * neither market or user country are provided, the content is considered unavailable for the
     * client._<br/> Users can view the country that is associated with their account in the
     * [account settings](https://www.spotify.com/account/overview/).
     */
    fun market(): String? = market

    /**
     * The index of the first item to return. Default: 0 (the first item). Use with limit to get the
     * next set of items.
     */
    fun offset(): Long? = offset

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ShowListEpisodesParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ShowListEpisodesParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ShowListEpisodesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var limit: Long? = null
        private var market: String? = null
        private var offset: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(showListEpisodesParams: ShowListEpisodesParams) = apply {
            id = showListEpisodesParams.id
            limit = showListEpisodesParams.limit
            market = showListEpisodesParams.market
            offset = showListEpisodesParams.offset
            additionalHeaders = showListEpisodesParams.additionalHeaders.toBuilder()
            additionalQueryParams = showListEpisodesParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. */
        fun id(id: String?) = apply { this.id = id }

        /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 50. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         * If a country code is specified, only content that is available in that market will be
         * returned.<br/> If a valid user access token is specified in the request header, the
         * country associated with the user account will take priority over this parameter.<br/>
         * _**Note**: If neither market or user country are provided, the content is considered
         * unavailable for the client._<br/> Users can view the country that is associated with
         * their account in the [account settings](https://www.spotify.com/account/overview/).
         */
        fun market(market: String?) = apply { this.market = market }

        /**
         * The index of the first item to return. Default: 0 (the first item). Use with limit to get
         * the next set of items.
         */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

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
         * Returns an immutable instance of [ShowListEpisodesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ShowListEpisodesParams =
            ShowListEpisodesParams(
                id,
                limit,
                market,
                offset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                market?.let { put("market", it) }
                offset?.let { put("offset", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListEpisodesParams &&
            id == other.id &&
            limit == other.limit &&
            market == other.market &&
            offset == other.offset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, limit, market, offset, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ShowListEpisodesParams{id=$id, limit=$limit, market=$market, offset=$offset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
