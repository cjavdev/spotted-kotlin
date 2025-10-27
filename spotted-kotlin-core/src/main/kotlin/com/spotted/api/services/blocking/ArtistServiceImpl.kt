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
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.artists.ArtistListAlbumsPage
import com.spotted.api.models.artists.ArtistListAlbumsPageResponse
import com.spotted.api.models.artists.ArtistListAlbumsParams
import com.spotted.api.models.artists.ArtistListParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsResponse
import com.spotted.api.models.artists.ArtistListResponse
import com.spotted.api.models.artists.ArtistListTopTracksParams
import com.spotted.api.models.artists.ArtistListTopTracksResponse
import com.spotted.api.models.artists.ArtistRetrieveParams

class ArtistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ArtistService {

    private val withRawResponse: ArtistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ArtistService =
        ArtistServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions,
    ): ArtistObject =
        // get /artists/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ArtistListParams,
        requestOptions: RequestOptions,
    ): ArtistListResponse =
        // get /artists
        withRawResponse().list(params, requestOptions).parse()

    override fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions,
    ): ArtistListAlbumsPage =
        // get /artists/{id}/albums
        withRawResponse().listAlbums(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions,
    ): ArtistListRelatedArtistsResponse =
        // get /artists/{id}/related-artists
        withRawResponse().listRelatedArtists(params, requestOptions).parse()

    override fun listTopTracks(
        params: ArtistListTopTracksParams,
        requestOptions: RequestOptions,
    ): ArtistListTopTracksResponse =
        // get /artists/{id}/top-tracks
        withRawResponse().listTopTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ArtistService.WithRawResponse =
            ArtistServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<ArtistObject> =
            jsonHandler<ArtistObject>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<ArtistListResponse> =
            jsonHandler<ArtistListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ArtistListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists")
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

        private val listAlbumsHandler: Handler<ArtistListAlbumsPageResponse> =
            jsonHandler<ArtistListAlbumsPageResponse>(clientOptions.jsonMapper)

        override fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListAlbumsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "albums")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAlbumsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ArtistListAlbumsPage.builder()
                            .service(ArtistServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listRelatedArtistsHandler: Handler<ArtistListRelatedArtistsResponse> =
            jsonHandler<ArtistListRelatedArtistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun listRelatedArtists(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listTopTracksHandler: Handler<ArtistListTopTracksResponse> =
            jsonHandler<ArtistListTopTracksResponse>(clientOptions.jsonMapper)

        override fun listTopTracks(
            params: ArtistListTopTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListTopTracksResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "top-tracks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
