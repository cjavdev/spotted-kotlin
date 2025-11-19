// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

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
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.shows.ShowBulkRetrieveParams
import dev.cjav.spotted.models.shows.ShowBulkRetrieveResponse
import dev.cjav.spotted.models.shows.ShowListEpisodesPageAsync
import dev.cjav.spotted.models.shows.ShowListEpisodesPageResponse
import dev.cjav.spotted.models.shows.ShowListEpisodesParams
import dev.cjav.spotted.models.shows.ShowRetrieveParams
import dev.cjav.spotted.models.shows.ShowRetrieveResponse

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

    override suspend fun bulkRetrieve(
        params: ShowBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): ShowBulkRetrieveResponse =
        // get /shows
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

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

        private val bulkRetrieveHandler: Handler<ShowBulkRetrieveResponse> =
            jsonHandler<ShowBulkRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun bulkRetrieve(
            params: ShowBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowBulkRetrieveResponse> {
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
                    .use { bulkRetrieveHandler.handle(it) }
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
