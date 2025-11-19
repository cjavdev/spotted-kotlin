// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.search.SearchQueryParams
import dev.cjav.spotted.models.search.SearchQueryResponse

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
    suspend fun query(
        params: SearchQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchQueryResponse

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
         * [SearchServiceAsync.query].
         */
        @MustBeClosed
        suspend fun query(
            params: SearchQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchQueryResponse>
    }
}
