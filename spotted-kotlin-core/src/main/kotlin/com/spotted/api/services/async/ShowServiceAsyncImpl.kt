// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

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
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.shows.ShowListEpisodesPageAsync
import com.spotted.api.models.shows.ShowListEpisodesPageResponse
import com.spotted.api.models.shows.ShowListEpisodesParams
import com.spotted.api.models.shows.ShowListParams
import com.spotted.api.models.shows.ShowListResponse
import com.spotted.api.models.shows.ShowRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveResponse

class ShowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ShowServiceAsync {

    private val withRawResponse: ShowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowServiceAsync =
        ShowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ShowRetrieveParams,
        requestOptions: RequestOptions,
    ): ShowRetrieveResponse =
        // get /shows/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ShowListParams,
        requestOptions: RequestOptions,
    ): ShowListResponse =
        // get /shows
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun listEpisodes(
        params: ShowListEpisodesParams,
        requestOptions: RequestOptions,
    ): ShowListEpisodesPageAsync =
        // get /shows/{id}/episodes
        withRawResponse().listEpisodes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ShowServiceAsync.WithRawResponse =
            ShowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ShowRetrieveResponse> =
            jsonHandler<ShowRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ShowRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<ShowListResponse> =
            jsonHandler<ShowListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ShowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listEpisodesHandler: Handler<ShowListEpisodesPageResponse> =
            jsonHandler<ShowListEpisodesPageResponse>(clientOptions.jsonMapper)

        override suspend fun listEpisodes(
            params: ShowListEpisodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowListEpisodesPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows", params._pathParam(0), "episodes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEpisodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ShowListEpisodesPageAsync.builder()
                            .service(ShowServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
