// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me.player

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
import dev.cjav.spotted.models.me.player.queue.QueueAddParams
import dev.cjav.spotted.models.me.player.queue.QueueGetParams
import dev.cjav.spotted.models.me.player.queue.QueueGetResponse

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
