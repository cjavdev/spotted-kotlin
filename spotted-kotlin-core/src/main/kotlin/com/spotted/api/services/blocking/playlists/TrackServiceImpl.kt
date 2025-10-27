// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.playlists

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
import com.spotted.api.core.http.json
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepare
import com.spotted.api.models.playlists.tracks.TrackAddParams
import com.spotted.api.models.playlists.tracks.TrackAddResponse
import com.spotted.api.models.playlists.tracks.TrackListPage
import com.spotted.api.models.playlists.tracks.TrackListPageResponse
import com.spotted.api.models.playlists.tracks.TrackListParams
import com.spotted.api.models.playlists.tracks.TrackRemoveParams
import com.spotted.api.models.playlists.tracks.TrackRemoveResponse
import com.spotted.api.models.playlists.tracks.TrackUpdateParams
import com.spotted.api.models.playlists.tracks.TrackUpdateResponse

class TrackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TrackService {

    private val withRawResponse: TrackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TrackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService =
        TrackServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions,
    ): TrackUpdateResponse =
        // put /playlists/{playlist_id}/tracks
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TrackListParams, requestOptions: RequestOptions): TrackListPage =
        // get /playlists/{playlist_id}/tracks
        withRawResponse().list(params, requestOptions).parse()

    override fun add(params: TrackAddParams, requestOptions: RequestOptions): TrackAddResponse =
        // post /playlists/{playlist_id}/tracks
        withRawResponse().add(params, requestOptions).parse()

    override fun remove(
        params: TrackRemoveParams,
        requestOptions: RequestOptions,
    ): TrackRemoveResponse =
        // delete /playlists/{playlist_id}/tracks
        withRawResponse().remove(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TrackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TrackService.WithRawResponse =
            TrackServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val updateHandler: Handler<TrackUpdateResponse> =
            jsonHandler<TrackUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: TrackListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "tracks")
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
                        TrackListPage.builder()
                            .service(TrackServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val addHandler: Handler<TrackAddResponse> =
            jsonHandler<TrackAddResponse>(clientOptions.jsonMapper)

        override fun add(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun remove(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
