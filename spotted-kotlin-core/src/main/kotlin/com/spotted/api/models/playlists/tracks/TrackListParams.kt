// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.spotted.api.core.Params
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import java.util.Objects

/** Get full details of the items of a playlist owned by a Spotify user. */
class TrackListParams
private constructor(
    private val playlistId: String?,
    private val additionalTypes: String?,
    private val fields: String?,
    private val limit: Long?,
    private val market: String?,
    private val offset: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
    fun playlistId(): String? = playlistId

    /**
     * A comma-separated list of item types that your client supports besides the default `track`
     * type. Valid types are: `track` and `episode`.<br/> _**Note**: This parameter was introduced
     * to allow existing clients to maintain their current behaviour and might be deprecated in the
     * future._<br/> In addition to providing this parameter, make sure that your client properly
     * handles cases of new types in the future by checking against the `type` field of each object.
     */
    fun additionalTypes(): String? = additionalTypes

    /**
     * Filters for the query: a comma-separated list of the fields to return. If omitted, all fields
     * are returned. For example, to get just the total number of items and the request
     * limit:<br/>`fields=total,limit`<br/>A dot separator can be used to specify non-reoccurring
     * fields, while parentheses can be used to specify reoccurring fields within objects. For
     * example, to get just the added date and user ID of the
     * adder:<br/>`fields=items(added_at,added_by.id)`<br/>Use multiple parentheses to drill down
     * into nested objects, for
     * example:<br/>`fields=items(track(name,href,album(name,href)))`<br/>Fields can be excluded by
     * prefixing them with an exclamation mark, for
     * example:<br/>`fields=items.track.album(!external_urls,images)`
     */
    fun fields(): String? = fields

    /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 100. */
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

        fun none(): TrackListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TrackListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackListParams]. */
    class Builder internal constructor() {

        private var playlistId: String? = null
        private var additionalTypes: String? = null
        private var fields: String? = null
        private var limit: Long? = null
        private var market: String? = null
        private var offset: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(trackListParams: TrackListParams) = apply {
            playlistId = trackListParams.playlistId
            additionalTypes = trackListParams.additionalTypes
            fields = trackListParams.fields
            limit = trackListParams.limit
            market = trackListParams.market
            offset = trackListParams.offset
            additionalHeaders = trackListParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackListParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) of the playlist. */
        fun playlistId(playlistId: String?) = apply { this.playlistId = playlistId }

        /**
         * A comma-separated list of item types that your client supports besides the default
         * `track` type. Valid types are: `track` and `episode`.<br/> _**Note**: This parameter was
         * introduced to allow existing clients to maintain their current behaviour and might be
         * deprecated in the future._<br/> In addition to providing this parameter, make sure that
         * your client properly handles cases of new types in the future by checking against the
         * `type` field of each object.
         */
        fun additionalTypes(additionalTypes: String?) = apply {
            this.additionalTypes = additionalTypes
        }

        /**
         * Filters for the query: a comma-separated list of the fields to return. If omitted, all
         * fields are returned. For example, to get just the total number of items and the request
         * limit:<br/>`fields=total,limit`<br/>A dot separator can be used to specify
         * non-reoccurring fields, while parentheses can be used to specify reoccurring fields
         * within objects. For example, to get just the added date and user ID of the
         * adder:<br/>`fields=items(added_at,added_by.id)`<br/>Use multiple parentheses to drill
         * down into nested objects, for
         * example:<br/>`fields=items(track(name,href,album(name,href)))`<br/>Fields can be excluded
         * by prefixing them with an exclamation mark, for
         * example:<br/>`fields=items.track.album(!external_urls,images)`
         */
        fun fields(fields: String?) = apply { this.fields = fields }

        /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 100. */
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
         * Returns an immutable instance of [TrackListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackListParams =
            TrackListParams(
                playlistId,
                additionalTypes,
                fields,
                limit,
                market,
                offset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> playlistId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                additionalTypes?.let { put("additional_types", it) }
                fields?.let { put("fields", it) }
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

        return other is TrackListParams &&
            playlistId == other.playlistId &&
            additionalTypes == other.additionalTypes &&
            fields == other.fields &&
            limit == other.limit &&
            market == other.market &&
            offset == other.offset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            playlistId,
            additionalTypes,
            fields,
            limit,
            market,
            offset,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TrackListParams{playlistId=$playlistId, additionalTypes=$additionalTypes, fields=$fields, limit=$limit, market=$market, offset=$offset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
