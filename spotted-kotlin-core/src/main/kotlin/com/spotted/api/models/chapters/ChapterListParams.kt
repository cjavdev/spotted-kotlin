// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.chapters

import com.spotted.api.core.Params
import com.spotted.api.core.checkRequired
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import java.util.Objects

/**
 * Get Spotify catalog information for several audiobook chapters identified by their Spotify IDs.
 * Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia
 * markets.
 */
class ChapterListParams
private constructor(
    private val ids: String,
    private val market: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A comma-separated list of the
     * [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example:
     * `ids=0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU`. Maximum: 50 IDs.
     */
    fun ids(): String = ids

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChapterListParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ids()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChapterListParams]. */
    class Builder internal constructor() {

        private var ids: String? = null
        private var market: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(chapterListParams: ChapterListParams) = apply {
            ids = chapterListParams.ids
            market = chapterListParams.market
            additionalHeaders = chapterListParams.additionalHeaders.toBuilder()
            additionalQueryParams = chapterListParams.additionalQueryParams.toBuilder()
        }

        /**
         * A comma-separated list of the
         * [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example:
         * `ids=0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU`. Maximum: 50 IDs.
         */
        fun ids(ids: String) = apply { this.ids = ids }

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
         * Returns an immutable instance of [ChapterListParams].
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
        fun build(): ChapterListParams =
            ChapterListParams(
                checkRequired("ids", ids),
                market,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("ids", ids)
                market?.let { put("market", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChapterListParams &&
            ids == other.ids &&
            market == other.market &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(ids, market, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChapterListParams{ids=$ids, market=$market, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
