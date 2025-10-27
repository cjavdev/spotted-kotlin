// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.browse

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.checkRequired
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepare
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsParams
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsResponse
import com.spotted.api.models.browse.categories.CategoryListParams
import com.spotted.api.models.browse.categories.CategoryListResponse
import com.spotted.api.models.browse.categories.CategoryRetrieveParams
import com.spotted.api.models.browse.categories.CategoryRetrieveResponse

class CategoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CategoryService {

    private val withRawResponse: CategoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CategoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryService =
        CategoryServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): CategoryRetrieveResponse =
        // get /browse/categories/{category_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CategoryListParams,
        requestOptions: RequestOptions,
    ): CategoryListResponse =
        // get /browse/categories
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun getPlaylists(
        params: CategoryGetPlaylistsParams,
        requestOptions: RequestOptions,
    ): CategoryGetPlaylistsResponse =
        // get /browse/categories/{category_id}/playlists
        withRawResponse().getPlaylists(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CategoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CategoryService.WithRawResponse =
            CategoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CategoryRetrieveResponse> =
            jsonHandler<CategoryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("categoryId", params.categoryId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "categories", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CategoryListResponse> =
            jsonHandler<CategoryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CategoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "categories")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPlaylistsHandler: Handler<CategoryGetPlaylistsResponse> =
            jsonHandler<CategoryGetPlaylistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getPlaylists(
            params: CategoryGetPlaylistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryGetPlaylistsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("categoryId", params.categoryId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "categories", params._pathParam(0), "playlists")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPlaylistsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
