// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

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
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveResponse
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveResponse

class ChapterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChapterService {

    private val withRawResponse: ChapterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChapterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChapterService =
        ChapterServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ChapterRetrieveParams,
        requestOptions: RequestOptions,
    ): ChapterRetrieveResponse =
        // get /chapters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun bulkRetrieve(
        params: ChapterBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): ChapterBulkRetrieveResponse =
        // get /chapters
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChapterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChapterService.WithRawResponse =
            ChapterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ChapterRetrieveResponse> =
            jsonHandler<ChapterRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ChapterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChapterRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chapters", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val bulkRetrieveHandler: Handler<ChapterBulkRetrieveResponse> =
            jsonHandler<ChapterBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: ChapterBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChapterBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chapters")
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
    }
}
