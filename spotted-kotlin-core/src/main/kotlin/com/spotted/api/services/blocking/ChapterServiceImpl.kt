// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

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
import com.spotted.api.core.prepare
import com.spotted.api.models.chapters.ChapterListParams
import com.spotted.api.models.chapters.ChapterListResponse
import com.spotted.api.models.chapters.ChapterRetrieveParams
import com.spotted.api.models.chapters.ChapterRetrieveResponse

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

    override fun list(
        params: ChapterListParams,
        requestOptions: RequestOptions,
    ): ChapterListResponse =
        // get /chapters
        withRawResponse().list(params, requestOptions).parse()

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

        private val listHandler: Handler<ChapterListResponse> =
            jsonHandler<ChapterListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChapterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChapterListResponse> {
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
