// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.top

import com.spotted.api.core.Params
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import java.util.Objects

/** Get the current user's top artists based on calculated affinity. */
class TopListTopArtistsParams
private constructor(
    private val limit: Long?,
    private val offset: Long?,
    private val timeRange: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 50. */
    fun limit(): Long? = limit

    /**
     * The index of the first item to return. Default: 0 (the first item). Use with limit to get the
     * next set of items.
     */
    fun offset(): Long? = offset

    /**
     * Over what time frame the affinities are computed. Valid values: `long_term` (calculated from
     * ~1 year of data and including all new data as it becomes available), `medium_term`
     * (approximately last 6 months), `short_term` (approximately last 4 weeks). Default:
     * `medium_term`
     */
    fun timeRange(): String? = timeRange

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TopListTopArtistsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TopListTopArtistsParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TopListTopArtistsParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var offset: Long? = null
        private var timeRange: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(topListTopArtistsParams: TopListTopArtistsParams) = apply {
            limit = topListTopArtistsParams.limit
            offset = topListTopArtistsParams.offset
            timeRange = topListTopArtistsParams.timeRange
            additionalHeaders = topListTopArtistsParams.additionalHeaders.toBuilder()
            additionalQueryParams = topListTopArtistsParams.additionalQueryParams.toBuilder()
        }

        /** The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 50. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

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

        /**
         * Over what time frame the affinities are computed. Valid values: `long_term` (calculated
         * from ~1 year of data and including all new data as it becomes available), `medium_term`
         * (approximately last 6 months), `short_term` (approximately last 4 weeks). Default:
         * `medium_term`
         */
        fun timeRange(timeRange: String?) = apply { this.timeRange = timeRange }

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
         * Returns an immutable instance of [TopListTopArtistsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TopListTopArtistsParams =
            TopListTopArtistsParams(
                limit,
                offset,
                timeRange,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                timeRange?.let { put("time_range", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopArtistsParams &&
            limit == other.limit &&
            offset == other.offset &&
            timeRange == other.timeRange &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, offset, timeRange, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TopListTopArtistsParams{limit=$limit, offset=$offset, timeRange=$timeRange, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
