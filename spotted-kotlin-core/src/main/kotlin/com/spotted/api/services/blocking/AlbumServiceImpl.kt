// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

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
import com.spotted.api.models.albums.AlbumListParams
import com.spotted.api.models.albums.AlbumListResponse
import com.spotted.api.models.albums.AlbumListTracksPage
import com.spotted.api.models.albums.AlbumListTracksPageResponse
import com.spotted.api.models.albums.AlbumListTracksParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import com.spotted.api.models.albums.AlbumRetrieveResponse

class AlbumServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlbumService {

    private val withRawResponse: AlbumService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlbumService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumService =
        AlbumServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions,
    ): AlbumRetrieveResponse =
        // get /albums/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: AlbumListParams, requestOptions: RequestOptions): AlbumListResponse =
        // get /albums
        withRawResponse().list(params, requestOptions).parse()

    override fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions,
    ): AlbumListTracksPage =
        // get /albums/{id}/tracks
        withRawResponse().listTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlbumService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AlbumService.WithRawResponse =
            AlbumServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<AlbumRetrieveResponse> =
            jsonHandler<AlbumRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<AlbumListResponse> =
            jsonHandler<AlbumListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AlbumListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums")
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

        private val listTracksHandler: Handler<AlbumListTracksPageResponse> =
            jsonHandler<AlbumListTracksPageResponse>(clientOptions.jsonMapper)

        override fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumListTracksPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums", params._pathParam(0), "tracks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AlbumListTracksPage.builder()
                            .service(AlbumServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
