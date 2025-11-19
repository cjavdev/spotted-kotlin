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
import dev.cjav.spotted.models.search.SearchQueryParams
import dev.cjav.spotted.models.search.SearchQueryResponse

class SearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchService {

    private val withRawResponse: SearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService =
        SearchServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun query(
        params: SearchQueryParams,
        requestOptions: RequestOptions,
    ): SearchQueryResponse =
        // get /search
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SearchService.WithRawResponse =
            SearchServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val queryHandler: Handler<SearchQueryResponse> =
            jsonHandler<SearchQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: SearchQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SearchQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
