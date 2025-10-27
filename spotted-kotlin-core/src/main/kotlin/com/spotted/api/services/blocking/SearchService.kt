// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.search.SearchRetrieveParams
import com.spotted.api.models.search.SearchRetrieveResponse

interface SearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService

    /**
     * Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or
     * audiobooks that match a keyword string. Audiobooks are only available within the US, UK,
     * Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(
        params: SearchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchRetrieveResponse

    /** A view of [SearchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /search`, but is otherwise the same as
         * [SearchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SearchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchRetrieveResponse>
    }
}
