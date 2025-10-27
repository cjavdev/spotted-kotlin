// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.browse.BrowseGetFeaturedPlaylistsParams
import com.spotted.api.models.browse.BrowseGetFeaturedPlaylistsResponse
import com.spotted.api.models.browse.BrowseGetNewReleasesParams
import com.spotted.api.models.browse.BrowseGetNewReleasesResponse
import com.spotted.api.services.async.browse.CategoryServiceAsync
import com.spotted.api.services.async.browse.CategoryServiceAsyncImpl

class BrowseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrowseServiceAsync {

    private val withRawResponse: BrowseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val categories: CategoryServiceAsync by lazy { CategoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BrowseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrowseServiceAsync =
        BrowseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun categories(): CategoryServiceAsync = categories

    @Deprecated("deprecated")
    override suspend fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams,
        requestOptions: RequestOptions,
    ): BrowseGetFeaturedPlaylistsResponse =
        // get /browse/featured-playlists
        withRawResponse().getFeaturedPlaylists(params, requestOptions).parse()

    override suspend fun getNewReleases(
        params: BrowseGetNewReleasesParams,
        requestOptions: RequestOptions,
    ): BrowseGetNewReleasesResponse =
        // get /browse/new-releases
        withRawResponse().getNewReleases(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val categories: CategoryServiceAsync.WithRawResponse by lazy {
            CategoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BrowseServiceAsync.WithRawResponse =
            BrowseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun categories(): CategoryServiceAsync.WithRawResponse = categories

        private val getFeaturedPlaylistsHandler: Handler<BrowseGetFeaturedPlaylistsResponse> =
            jsonHandler<BrowseGetFeaturedPlaylistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowseGetFeaturedPlaylistsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "featured-playlists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFeaturedPlaylistsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getNewReleasesHandler: Handler<BrowseGetNewReleasesResponse> =
            jsonHandler<BrowseGetNewReleasesResponse>(clientOptions.jsonMapper)

        override suspend fun getNewReleases(
            params: BrowseGetNewReleasesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowseGetNewReleasesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "new-releases")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getNewReleasesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
