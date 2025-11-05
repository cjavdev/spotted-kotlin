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
import com.spotted.api.models.albums.AlbumBulkRetrieveParams
import com.spotted.api.models.albums.AlbumBulkRetrieveResponse
import com.spotted.api.models.albums.AlbumListTracksPageAsync
import com.spotted.api.models.albums.AlbumListTracksPageResponse
import com.spotted.api.models.albums.AlbumListTracksParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import com.spotted.api.models.albums.AlbumRetrieveResponse

class AlbumServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlbumServiceAsync {

    private val withRawResponse: AlbumServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlbumServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumServiceAsync =
        AlbumServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions,
    ): AlbumRetrieveResponse =
        // get /albums/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): AlbumBulkRetrieveResponse =
        // get /albums
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    override suspend fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions,
    ): AlbumListTracksPageAsync =
        // get /albums/{id}/tracks
        withRawResponse().listTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlbumServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AlbumServiceAsync.WithRawResponse =
            AlbumServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AlbumRetrieveResponse> =
            jsonHandler<AlbumRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AlbumRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<AlbumBulkRetrieveResponse> =
            jsonHandler<AlbumBulkRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums")
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

        private val listTracksHandler: Handler<AlbumListTracksPageResponse> =
            jsonHandler<AlbumListTracksPageResponse>(clientOptions.jsonMapper)

        override suspend fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumListTracksPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums", params._pathParam(0), "tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AlbumListTracksPageAsync.builder()
                            .service(AlbumServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
