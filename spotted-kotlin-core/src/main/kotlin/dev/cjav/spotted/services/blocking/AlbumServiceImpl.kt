// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

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
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveParams
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveResponse
import dev.cjav.spotted.models.albums.AlbumListTracksPage
import dev.cjav.spotted.models.albums.AlbumListTracksPageResponse
import dev.cjav.spotted.models.albums.AlbumListTracksParams
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

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

    override fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): AlbumBulkRetrieveResponse =
        // get /albums
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

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

        private val bulkRetrieveHandler: Handler<AlbumBulkRetrieveResponse> =
            jsonHandler<AlbumBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumBulkRetrieveResponse> {
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
