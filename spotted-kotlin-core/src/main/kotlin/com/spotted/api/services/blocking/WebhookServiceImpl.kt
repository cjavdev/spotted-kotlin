// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.ClientOptions
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.webhooks.UnwrapWebhookEvent

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws SpottedInvalidDataException if the body could not be parsed.
     */
    override fun unwrap(body: String): UnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw SpottedInvalidDataException("Error parsing body", e)
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
