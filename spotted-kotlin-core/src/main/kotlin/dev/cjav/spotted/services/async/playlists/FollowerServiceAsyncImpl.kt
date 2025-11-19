// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.checkRequired
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
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
import dev.cjav.spotted.models.playlists.followers.FollowerUnfollowParams

class FollowerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FollowerServiceAsync {

    private val withRawResponse: FollowerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FollowerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowerServiceAsync =
        FollowerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun check(
        params: FollowerCheckParams,
        requestOptions: RequestOptions,
    ): List<Boolean> =
        // get /playlists/{playlist_id}/followers/contains
        withRawResponse().check(params, requestOptions).parse()

    override suspend fun follow(params: FollowerFollowParams, requestOptions: RequestOptions) {
        // put /playlists/{playlist_id}/followers
        withRawResponse().follow(params, requestOptions)
    }

    override suspend fun unfollow(params: FollowerUnfollowParams, requestOptions: RequestOptions) {
        // delete /playlists/{playlist_id}/followers
        withRawResponse().unfollow(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FollowerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FollowerServiceAsync.WithRawResponse =
            FollowerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override suspend fun check(
            params: FollowerCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "followers", "contains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { checkHandler.handle(it) }
            }
        }

        private val followHandler: Handler<Void?> = emptyHandler()

        override suspend fun follow(
            params: FollowerFollowParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "followers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { followHandler.handle(it) }
            }
        }

        private val unfollowHandler: Handler<Void?> = emptyHandler()

        override suspend fun unfollow(
            params: FollowerUnfollowParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0), "followers")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unfollowHandler.handle(it) }
            }
        }
    }
}
