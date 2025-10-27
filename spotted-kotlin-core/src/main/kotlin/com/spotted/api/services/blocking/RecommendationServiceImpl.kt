// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
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
import com.spotted.api.models.recommendations.RecommendationGetParams
import com.spotted.api.models.recommendations.RecommendationGetResponse
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsParams
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsResponse

class RecommendationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecommendationService {

    private val withRawResponse: RecommendationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecommendationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RecommendationService =
        RecommendationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override fun get(
        params: RecommendationGetParams,
        requestOptions: RequestOptions,
    ): RecommendationGetResponse =
        // get /recommendations
        withRawResponse().get(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams,
        requestOptions: RequestOptions,
    ): RecommendationListAvailableGenreSeedsResponse =
        // get /recommendations/available-genre-seeds
        withRawResponse().listAvailableGenreSeeds(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecommendationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecommendationService.WithRawResponse =
            RecommendationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getHandler: Handler<RecommendationGetResponse> =
            jsonHandler<RecommendationGetResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun get(
            params: RecommendationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecommendationGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
        override fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecommendationListAvailableGenreSeedsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations", "available-genre-seeds")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
