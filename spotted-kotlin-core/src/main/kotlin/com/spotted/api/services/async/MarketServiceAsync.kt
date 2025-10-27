// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.markets.MarketListParams
import com.spotted.api.models.markets.MarketListResponse

interface MarketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MarketServiceAsync

    /** Get the list of markets where Spotify is available. */
    suspend fun list(
        params: MarketListParams = MarketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): MarketListResponse =
        list(MarketListParams.none(), requestOptions)

    /**
     * A view of [MarketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MarketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /markets`, but is otherwise the same as
         * [MarketServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: MarketListParams = MarketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<MarketListResponse> =
            list(MarketListParams.none(), requestOptions)
    }
}
