// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.recommendations.RecommendationGetParams
import com.spotted.api.models.recommendations.RecommendationGetResponse
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsParams
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsResponse

interface RecommendationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RecommendationService

    /**
     * Recommendations are generated based on the available information for a given seed entity and
     * matched against similar artists and tracks. If there is sufficient information about the
     * provided seeds, a list of tracks will be returned together with pool size details.
     *
     * For artists and tracks that are very new or obscure there might not be enough data to
     * generate a list of tracks.
     */
    @Deprecated("deprecated")
    fun get(
        params: RecommendationGetParams = RecommendationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecommendationGetResponse

    /** @see get */
    @Deprecated("deprecated")
    fun get(requestOptions: RequestOptions): RecommendationGetResponse =
        get(RecommendationGetParams.none(), requestOptions)

    /**
     * Retrieve a list of available genres seed parameter values for
     * [recommendations](/documentation/web-api/reference/get-recommendations).
     */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams =
            RecommendationListAvailableGenreSeedsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecommendationListAvailableGenreSeedsResponse

    /** @see listAvailableGenreSeeds */
    @Deprecated("deprecated")
    fun listAvailableGenreSeeds(
        requestOptions: RequestOptions
    ): RecommendationListAvailableGenreSeedsResponse =
        listAvailableGenreSeeds(RecommendationListAvailableGenreSeedsParams.none(), requestOptions)

    /**
     * A view of [RecommendationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecommendationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /recommendations`, but is otherwise the same as
         * [RecommendationService.get].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(
            params: RecommendationGetParams = RecommendationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecommendationGetResponse>

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<RecommendationGetResponse> =
            get(RecommendationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /recommendations/available-genre-seeds`, but is
         * otherwise the same as [RecommendationService.listAvailableGenreSeeds].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams =
                RecommendationListAvailableGenreSeedsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>

        /** @see listAvailableGenreSeeds */
        @Deprecated("deprecated")
        @MustBeClosed
        fun listAvailableGenreSeeds(
            requestOptions: RequestOptions
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse> =
            listAvailableGenreSeeds(
                RecommendationListAvailableGenreSeedsParams.none(),
                requestOptions,
            )
    }
}
