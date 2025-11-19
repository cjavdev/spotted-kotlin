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
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveResponse
import dev.cjav.spotted.models.tracks.TrackRetrieveParams

class TrackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TrackService {

    private val withRawResponse: TrackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TrackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService =
        TrackServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: TrackRetrieveParams,
        requestOptions: RequestOptions,
    ): TrackObject =
        // get /tracks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun bulkRetrieve(
        params: TrackBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): TrackBulkRetrieveResponse =
        // get /tracks
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TrackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TrackService.WithRawResponse =
            TrackServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<TrackObject> =
            jsonHandler<TrackObject>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TrackRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tracks", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<TrackBulkRetrieveResponse> =
            jsonHandler<TrackBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: TrackBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tracks")
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
