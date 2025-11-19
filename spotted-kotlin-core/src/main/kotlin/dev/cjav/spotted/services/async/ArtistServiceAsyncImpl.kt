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
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveParams
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveResponse
import dev.cjav.spotted.models.artists.ArtistListAlbumsPageAsync
import dev.cjav.spotted.models.artists.ArtistListAlbumsPageResponse
import dev.cjav.spotted.models.artists.ArtistListAlbumsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsResponse
import dev.cjav.spotted.models.artists.ArtistRetrieveParams
import dev.cjav.spotted.models.artists.ArtistTopTracksParams
import dev.cjav.spotted.models.artists.ArtistTopTracksResponse

class ArtistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ArtistServiceAsync {

    private val withRawResponse: ArtistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ArtistServiceAsync =
        ArtistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions,
    ): ArtistObject =
        // get /artists/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun bulkRetrieve(
        params: ArtistBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): ArtistBulkRetrieveResponse =
        // get /artists
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    override suspend fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions,
    ): ArtistListAlbumsPageAsync =
        // get /artists/{id}/albums
        withRawResponse().listAlbums(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions,
    ): ArtistListRelatedArtistsResponse =
        // get /artists/{id}/related-artists
        withRawResponse().listRelatedArtists(params, requestOptions).parse()

    override suspend fun topTracks(
        params: ArtistTopTracksParams,
        requestOptions: RequestOptions,
    ): ArtistTopTracksResponse =
        // get /artists/{id}/top-tracks
        withRawResponse().topTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ArtistServiceAsync.WithRawResponse =
            ArtistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ArtistObject> =
            jsonHandler<ArtistObject>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ArtistRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<ArtistBulkRetrieveResponse> =
            jsonHandler<ArtistBulkRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun bulkRetrieve(
            params: ArtistBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists")
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

        private val listAlbumsHandler: Handler<ArtistListAlbumsPageResponse> =
            jsonHandler<ArtistListAlbumsPageResponse>(clientOptions.jsonMapper)

        override suspend fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListAlbumsPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "albums")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAlbumsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ArtistListAlbumsPageAsync.builder()
                            .service(ArtistServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listRelatedArtistsHandler: Handler<ArtistListRelatedArtistsResponse> =
            jsonHandler<ArtistListRelatedArtistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "related-artists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRelatedArtistsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val topTracksHandler: Handler<ArtistTopTracksResponse> =
            jsonHandler<ArtistTopTracksResponse>(clientOptions.jsonMapper)

        override suspend fun topTracks(
            params: ArtistTopTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistTopTracksResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "top-tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { topTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
