// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.chapters

import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import java.util.Objects

/**
 * Get Spotify catalog information for a single audiobook chapter. Chapters are only available
 * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
 */
class ChapterRetrieveParams
private constructor(
    private val id: String?,
    private val market: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. */
    fun id(): String? = id

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

        fun none(): ChapterRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChapterRetrieveParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ChapterRetrieveParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var market: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(chapterRetrieveParams: ChapterRetrieveParams) = apply {
            id = chapterRetrieveParams.id
            market = chapterRetrieveParams.market
            additionalHeaders = chapterRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = chapterRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. */
        fun id(id: String?) = apply { this.id = id }

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
         * Returns an immutable instance of [ChapterRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChapterRetrieveParams =
            ChapterRetrieveParams(
                id,
                market,
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
                market?.let { put("market", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChapterRetrieveParams &&
            id == other.id &&
            market == other.market &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, market, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChapterRetrieveParams{id=$id, market=$market, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
