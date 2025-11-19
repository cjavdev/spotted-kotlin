// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

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
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveParams
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveResponse
import dev.cjav.spotted.models.me.following.FollowingCheckParams
import dev.cjav.spotted.models.me.following.FollowingFollowParams
import dev.cjav.spotted.models.me.following.FollowingUnfollowParams

class FollowingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FollowingService {

    private val withRawResponse: FollowingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FollowingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowingService =
        FollowingServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun bulkRetrieve(
        params: FollowingBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): FollowingBulkRetrieveResponse =
        // get /me/following
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    override fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions,
    ): List<Boolean> =
        // get /me/following/contains
        withRawResponse().check(params, requestOptions).parse()

    override fun follow(params: FollowingFollowParams, requestOptions: RequestOptions) {
        // put /me/following
        withRawResponse().follow(params, requestOptions)
    }

    override fun unfollow(params: FollowingUnfollowParams, requestOptions: RequestOptions) {
        // delete /me/following
        withRawResponse().unfollow(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FollowingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FollowingService.WithRawResponse =
            FollowingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val bulkRetrieveHandler: Handler<FollowingBulkRetrieveResponse> =
            jsonHandler<FollowingBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: FollowingBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FollowingBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
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

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following", "contains")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { checkHandler.handle(it) }
            }
        }

        private val followHandler: Handler<Void?> = emptyHandler()

        override fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { followHandler.handle(it) }
            }
        }

        private val unfollowHandler: Handler<Void?> = emptyHandler()

        override fun unfollow(
            params: FollowingUnfollowParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unfollowHandler.handle(it) }
            }
        }
    }
}
