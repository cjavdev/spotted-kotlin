// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.users

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
import com.spotted.api.models.PagingPlaylistObject
import com.spotted.api.models.users.playlists.PlaylistCreateParams
import com.spotted.api.models.users.playlists.PlaylistCreateResponse
import com.spotted.api.models.users.playlists.PlaylistListPage
import com.spotted.api.models.users.playlists.PlaylistListParams

class PlaylistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaylistService {

    private val withRawResponse: PlaylistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaylistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService =
        PlaylistServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: PlaylistCreateParams,
        requestOptions: RequestOptions,
    ): PlaylistCreateResponse =
        // post /users/{user_id}/playlists
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions,
    ): PlaylistListPage =
        // get /users/{user_id}/playlists
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaylistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaylistService.WithRawResponse =
            PlaylistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PlaylistCreateResponse> =
            jsonHandler<PlaylistCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "playlists")
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
                        PlaylistListPage.builder()
                            .service(PlaylistServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
