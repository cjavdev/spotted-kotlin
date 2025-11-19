// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import java.util.Objects

/**
 * Get information about the user’s current playback state, including track or episode, progress,
 * and active device.
 */
class PlayerGetStateParams
private constructor(
    private val additionalTypes: String?,
    private val market: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A comma-separated list of item types that your client supports besides the default `track`
     * type. Valid types are: `track` and `episode`.<br/> _**Note**: This parameter was introduced
     * to allow existing clients to maintain their current behaviour and might be deprecated in the
     * future._<br/> In addition to providing this parameter, make sure that your client properly
     * handles cases of new types in the future by checking against the `type` field of each object.
     */
    fun additionalTypes(): String? = additionalTypes

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

        fun none(): PlayerGetStateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PlayerGetStateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PlayerGetStateParams]. */
    class Builder internal constructor() {

        private var additionalTypes: String? = null
        private var market: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(playerGetStateParams: PlayerGetStateParams) = apply {
            additionalTypes = playerGetStateParams.additionalTypes
            market = playerGetStateParams.market
            additionalHeaders = playerGetStateParams.additionalHeaders.toBuilder()
            additionalQueryParams = playerGetStateParams.additionalQueryParams.toBuilder()
        }

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
         * Returns an immutable instance of [PlayerGetStateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlayerGetStateParams =
            PlayerGetStateParams(
                additionalTypes,
                market,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                additionalTypes?.let { put("additional_types", it) }
                market?.let { put("market", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerGetStateParams &&
            additionalTypes == other.additionalTypes &&
            market == other.market &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(additionalTypes, market, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlayerGetStateParams{additionalTypes=$additionalTypes, market=$market, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
