// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

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
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.chapters.ChapterBulkRetrieveParams
import com.spotted.api.models.chapters.ChapterBulkRetrieveResponse
import com.spotted.api.models.chapters.ChapterRetrieveParams
import com.spotted.api.models.chapters.ChapterRetrieveResponse

class ChapterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChapterServiceAsync {

    private val withRawResponse: ChapterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChapterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChapterServiceAsync =
        ChapterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ChapterRetrieveParams,
        requestOptions: RequestOptions,
    ): ChapterRetrieveResponse =
        // get /chapters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun bulkRetrieve(
        params: ChapterBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): ChapterBulkRetrieveResponse =
        // get /chapters
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChapterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChapterServiceAsync.WithRawResponse =
            ChapterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ChapterRetrieveResponse> =
            jsonHandler<ChapterRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun bulkRetrieve(
            params: ChapterBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChapterBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chapters")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
