// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
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
import dev.cjav.spotted.models.recommendations.RecommendationGetParams
import dev.cjav.spotted.models.recommendations.RecommendationGetResponse
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsParams
import dev.cjav.spotted.models.recommendations.RecommendationListAvailableGenreSeedsResponse

class RecommendationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RecommendationServiceAsync {

    private val withRawResponse: RecommendationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecommendationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): RecommendationServiceAsync =
        RecommendationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override suspend fun get(
        params: RecommendationGetParams,
        requestOptions: RequestOptions,
    ): RecommendationGetResponse =
        // get /recommendations
        withRawResponse().get(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams,
        requestOptions: RequestOptions,
    ): RecommendationListAvailableGenreSeedsResponse =
        // get /recommendations/available-genre-seeds
        withRawResponse().listAvailableGenreSeeds(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecommendationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecommendationServiceAsync.WithRawResponse =
            RecommendationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getHandler: Handler<RecommendationGetResponse> =
            jsonHandler<RecommendationGetResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun get(
            params: RecommendationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecommendationGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAvailableGenreSeedsHandler:
            Handler<RecommendationListAvailableGenreSeedsResponse> =
            jsonHandler<RecommendationListAvailableGenreSeedsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations", "available-genre-seeds")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAvailableGenreSeedsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
