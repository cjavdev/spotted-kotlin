// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.browse

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.handlers.errorBodyHandler
import dev.cjav.spotted.core.handlers.errorHandler
import dev.cjav.spotted.core.handlers.jsonHandler
import dev.cjav.spotted.core.http.HttpMethod
import dev.cjav.spotted.core.http.HttpRequest
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponse.Handler
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsParams
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsResponse
import dev.cjav.spotted.models.browse.categories.CategoryListPage
import dev.cjav.spotted.models.browse.categories.CategoryListPageResponse
import dev.cjav.spotted.models.browse.categories.CategoryListParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveResponse

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
    ): CategoryListPage =
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

        private val listHandler: Handler<CategoryListPageResponse> =
            jsonHandler<CategoryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CategoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryListPage> {
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
                    .let {
                        CategoryListPage.builder()
                            .service(CategoryServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
