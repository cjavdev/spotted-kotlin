// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.markets.MarketListParams
import dev.cjav.spotted.models.markets.MarketListResponse

interface MarketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MarketService

    /** Get the list of markets where Spotify is available. */
    fun list(
        params: MarketListParams = MarketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): MarketListResponse =
        list(MarketListParams.none(), requestOptions)

    /** A view of [MarketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MarketService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /markets`, but is otherwise the same as
         * [MarketService.list].
         */
        @MustBeClosed
        fun list(
            params: MarketListParams = MarketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MarketListResponse> =
            list(MarketListParams.none(), requestOptions)
    }
}
