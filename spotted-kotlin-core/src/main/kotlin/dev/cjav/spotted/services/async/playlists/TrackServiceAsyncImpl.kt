// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

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
import dev.cjav.spotted.core.http.json
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.playlists.tracks.TrackAddParams
import dev.cjav.spotted.models.playlists.tracks.TrackAddResponse
import dev.cjav.spotted.models.playlists.tracks.TrackListPageAsync
import dev.cjav.spotted.models.playlists.tracks.TrackListPageResponse
import dev.cjav.spotted.models.playlists.tracks.TrackListParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveResponse
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateParams
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateResponse

class TrackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TrackServiceAsync {

    private val withRawResponse: TrackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TrackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackServiceAsync =
        TrackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions,
    ): TrackUpdateResponse =
        // put /playlists/{playlist_id}/tracks
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TrackListParams,
        requestOptions: RequestOptions,
    ): TrackListPageAsync =
        // get /playlists/{playlist_id}/tracks
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun add(
        params: TrackAddParams,
        requestOptions: RequestOptions,
    ): TrackAddResponse =
        // post /playlists/{playlist_id}/tracks
        withRawResponse().add(params, requestOptions).parse()

    override suspend fun remove(
        params: TrackRemoveParams,
        requestOptions: RequestOptions,
    ): TrackRemoveResponse =
        // delete /playlists/{playlist_id}/tracks
        withRawResponse().remove(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TrackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TrackServiceAsync.WithRawResponse =
            TrackServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val updateHandler: Handler<TrackUpdateResponse> =
            jsonHandler<TrackUpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TrackUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "tracks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TrackListPageResponse> =
            jsonHandler<TrackListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TrackListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "tracks")
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
                    .let {
                        TrackListPageAsync.builder()
                            .service(TrackServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val addHandler: Handler<TrackAddResponse> =
            jsonHandler<TrackAddResponse>(clientOptions.jsonMapper)

        override suspend fun add(
            params: TrackAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackAddResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "tracks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeHandler: Handler<TrackRemoveResponse> =
            jsonHandler<TrackRemoveResponse>(clientOptions.jsonMapper)

        override suspend fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackRemoveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "tracks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
