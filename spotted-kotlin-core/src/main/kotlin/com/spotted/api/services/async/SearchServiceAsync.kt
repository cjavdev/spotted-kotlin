// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.search.SearchRetrieveParams
import com.spotted.api.models.search.SearchRetrieveResponse

interface SearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchServiceAsync

    /**
     * Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or
     * audiobooks that match a keyword string. Audiobooks are only available within the US, UK,
     * Canada, Ireland, New Zealand and Australia markets.
     */
    suspend fun retrieve(
        params: SearchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchRetrieveResponse

    /**
     * A view of [SearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /search`, but is otherwise the same as
         * [SearchServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SearchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchRetrieveResponse>
    }
}
