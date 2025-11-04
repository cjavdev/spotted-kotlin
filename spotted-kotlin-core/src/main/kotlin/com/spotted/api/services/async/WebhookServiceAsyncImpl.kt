// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.webhooks.UnwrapWebhookEvent
import com.spotted.api.services.blocking.WebhookServiceImpl

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws SpottedInvalidDataException if the body could not be parsed.
     */
    override fun unwrap(body: String): UnwrapWebhookEvent =
        WebhookServiceImpl(clientOptions).unwrap(body)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
