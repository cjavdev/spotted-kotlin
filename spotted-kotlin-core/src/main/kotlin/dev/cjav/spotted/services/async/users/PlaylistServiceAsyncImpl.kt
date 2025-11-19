// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.users

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
import dev.cjav.spotted.models.PagingPlaylistObject
import dev.cjav.spotted.models.users.playlists.PlaylistCreateParams
import dev.cjav.spotted.models.users.playlists.PlaylistCreateResponse
import dev.cjav.spotted.models.users.playlists.PlaylistListPageAsync
import dev.cjav.spotted.models.users.playlists.PlaylistListParams

class PlaylistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaylistServiceAsync {

    private val withRawResponse: PlaylistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaylistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistServiceAsync =
        PlaylistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PlaylistCreateParams,
        requestOptions: RequestOptions,
    ): PlaylistCreateResponse =
        // post /users/{user_id}/playlists
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions,
    ): PlaylistListPageAsync =
        // get /users/{user_id}/playlists
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaylistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaylistServiceAsync.WithRawResponse =
            PlaylistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PlaylistCreateResponse> =
            jsonHandler<PlaylistCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PlaylistCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "playlists")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PagingPlaylistObject> =
            jsonHandler<PagingPlaylistObject>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "playlists")
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
                        PlaylistListPageAsync.builder()
                            .service(PlaylistServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
