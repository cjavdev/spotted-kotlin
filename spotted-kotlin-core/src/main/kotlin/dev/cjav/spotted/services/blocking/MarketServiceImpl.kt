// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

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
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.markets.MarketListParams
import dev.cjav.spotted.models.markets.MarketListResponse

class MarketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketService {

    private val withRawResponse: MarketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MarketService =
        MarketServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: MarketListParams,
        requestOptions: RequestOptions,
    ): MarketListResponse =
        // get /markets
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MarketService.WithRawResponse =
            MarketServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listHandler: Handler<MarketListResponse> =
            jsonHandler<MarketListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MarketListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("markets")
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
    }
}
