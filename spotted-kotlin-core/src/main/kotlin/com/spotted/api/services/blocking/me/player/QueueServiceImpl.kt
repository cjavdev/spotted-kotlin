// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me.player

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.handlers.emptyHandler
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
import com.spotted.api.models.me.player.queue.QueueAddParams
import com.spotted.api.models.me.player.queue.QueueGetParams
import com.spotted.api.models.me.player.queue.QueueGetResponse

class QueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueService {

    private val withRawResponse: QueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QueueService =
        QueueServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun add(params: QueueAddParams, requestOptions: RequestOptions) {
        // post /me/player/queue
        withRawResponse().add(params, requestOptions)
    }

    override fun get(params: QueueGetParams, requestOptions: RequestOptions): QueueGetResponse =
        // get /me/player/queue
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QueueService.WithRawResponse =
            QueueServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val addHandler: Handler<Void?> = emptyHandler()

        override fun add(params: QueueAddParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "queue")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addHandler.handle(it) }
            }
        }

        private val getHandler: Handler<QueueGetResponse> =
            jsonHandler<QueueGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: QueueGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "queue")
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
    }
}
