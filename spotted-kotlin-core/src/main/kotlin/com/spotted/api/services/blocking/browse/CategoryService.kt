// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.browse

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsParams
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsResponse
import com.spotted.api.models.browse.categories.CategoryListParams
import com.spotted.api.models.browse.categories.CategoryListResponse
import com.spotted.api.models.browse.categories.CategoryRetrieveParams
import com.spotted.api.models.browse.categories.CategoryRetrieveResponse

interface CategoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryService

    /**
     * Get a single category used to tag items in Spotify (on, for example, the Spotify player’s
     * “Browse” tab).
     */
    fun retrieve(
        categoryId: String,
        params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryRetrieveResponse =
        retrieve(params.toBuilder().categoryId(categoryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryRetrieveResponse

    /** @see retrieve */
    fun retrieve(categoryId: String, requestOptions: RequestOptions): CategoryRetrieveResponse =
        retrieve(categoryId, CategoryRetrieveParams.none(), requestOptions)

    /**
     * Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s
     * “Browse” tab).
     */
    fun list(
        params: CategoryListParams = CategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): CategoryListResponse =
        list(CategoryListParams.none(), requestOptions)

    /** Get a list of Spotify playlists tagged with a particular category. */
    @Deprecated("deprecated")
    fun getPlaylists(
        categoryId: String,
        params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryGetPlaylistsResponse =
        getPlaylists(params.toBuilder().categoryId(categoryId).build(), requestOptions)

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        params: CategoryGetPlaylistsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryGetPlaylistsResponse

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        categoryId: String,
        requestOptions: RequestOptions,
    ): CategoryGetPlaylistsResponse =
        getPlaylists(categoryId, CategoryGetPlaylistsParams.none(), requestOptions)

    /** A view of [CategoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse/categories/{category_id}`, but is otherwise
         * the same as [CategoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            categoryId: String,
            params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryRetrieveResponse> =
            retrieve(params.toBuilder().categoryId(categoryId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            categoryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryRetrieveResponse> =
            retrieve(categoryId, CategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/categories`, but is otherwise the same as
         * [CategoryService.list].
         */
        @MustBeClosed
        fun list(
            params: CategoryListParams = CategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CategoryListResponse> =
            list(CategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/categories/{category_id}/playlists`, but is
         * otherwise the same as [CategoryService.getPlaylists].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getPlaylists(
            categoryId: String,
            params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryGetPlaylistsResponse> =
            getPlaylists(params.toBuilder().categoryId(categoryId).build(), requestOptions)

        /** @see getPlaylists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getPlaylists(
            params: CategoryGetPlaylistsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryGetPlaylistsResponse>

        /** @see getPlaylists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getPlaylists(
            categoryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryGetPlaylistsResponse> =
            getPlaylists(categoryId, CategoryGetPlaylistsParams.none(), requestOptions)
    }
}
