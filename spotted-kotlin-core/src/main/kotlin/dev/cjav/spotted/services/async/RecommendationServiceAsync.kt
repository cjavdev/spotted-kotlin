// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.recommendations.RecommendationGetParams
import dev.cjav.spotted.models.recommendations.RecommendationGetResponse
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsParams
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsResponse

interface RecommendationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RecommendationServiceAsync

    /**
     * Recommendations are generated based on the available information for a given seed entity and
     * matched against similar artists and tracks. If there is sufficient information about the
     * provided seeds, a list of tracks will be returned together with pool size details.
     *
     * For artists and tracks that are very new or obscure there might not be enough data to
     * generate a list of tracks.
     */
    @Deprecated("deprecated")
    suspend fun get(
        params: RecommendationGetParams = RecommendationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecommendationGetResponse

    /** @see get */
    @Deprecated("deprecated")
    suspend fun get(requestOptions: RequestOptions): RecommendationGetResponse =
        get(RecommendationGetParams.none(), requestOptions)

    /**
     * Retrieve a list of available genres seed parameter values for
     * [recommendations](/documentation/web-api/reference/get-recommendations).
     */
    @Deprecated("deprecated")
    suspend fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams =
            RecommendationListAvailableGenreSeedsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecommendationListAvailableGenreSeedsResponse

    /** @see listAvailableGenreSeeds */
    @Deprecated("deprecated")
    suspend fun listAvailableGenreSeeds(
        requestOptions: RequestOptions
    ): RecommendationListAvailableGenreSeedsResponse =
        listAvailableGenreSeeds(RecommendationListAvailableGenreSeedsParams.none(), requestOptions)

    /**
     * A view of [RecommendationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecommendationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /recommendations`, but is otherwise the same as
         * [RecommendationServiceAsync.get].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun get(
            params: RecommendationGetParams = RecommendationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecommendationGetResponse>

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun get(
            requestOptions: RequestOptions
        ): HttpResponseFor<RecommendationGetResponse> =
            get(RecommendationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /recommendations/available-genre-seeds`, but is
         * otherwise the same as [RecommendationServiceAsync.listAvailableGenreSeeds].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams =
                RecommendationListAvailableGenreSeedsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>

        /** @see listAvailableGenreSeeds */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun listAvailableGenreSeeds(
            requestOptions: RequestOptions
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse> =
            listAvailableGenreSeeds(
                RecommendationListAvailableGenreSeedsParams.none(),
                requestOptions,
            )
    }
}
