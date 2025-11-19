// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.handlers.emptyHandler
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
import dev.cjav.spotted.models.me.tracks.TrackCheckParams
import dev.cjav.spotted.models.me.tracks.TrackListPageAsync
import dev.cjav.spotted.models.me.tracks.TrackListPageResponse
import dev.cjav.spotted.models.me.tracks.TrackListParams
import dev.cjav.spotted.models.me.tracks.TrackRemoveParams
import dev.cjav.spotted.models.me.tracks.TrackSaveParams

class TrackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TrackServiceAsync {

    private val withRawResponse: TrackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TrackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackServiceAsync =
        TrackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: TrackListParams,
        requestOptions: RequestOptions,
    ): TrackListPageAsync =
        // get /me/tracks
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun check(
        params: TrackCheckParams,
        requestOptions: RequestOptions,
    ): List<Boolean> =
        // get /me/tracks/contains
        withRawResponse().check(params, requestOptions).parse()

    override suspend fun remove(params: TrackRemoveParams, requestOptions: RequestOptions) {
        // delete /me/tracks
        withRawResponse().remove(params, requestOptions)
    }

    override suspend fun save(params: TrackSaveParams, requestOptions: RequestOptions) {
        // put /me/tracks
        withRawResponse().save(params, requestOptions)
    }

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

        private val listHandler: Handler<TrackListPageResponse> =
            jsonHandler<TrackListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TrackListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "tracks")
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

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override suspend fun check(
            params: TrackCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "tracks", "contains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { checkHandler.handle(it) }
            }
        }

        private val removeHandler: Handler<Void?> = emptyHandler()

        override suspend fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "tracks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeHandler.handle(it) }
            }
        }

        private val saveHandler: Handler<Void?> = emptyHandler()

        override suspend fun save(
            params: TrackSaveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "tracks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { saveHandler.handle(it) }
            }
        }
    }
}
