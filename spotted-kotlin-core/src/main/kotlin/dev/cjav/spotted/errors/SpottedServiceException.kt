// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.errors

import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.http.Headers

abstract class SpottedServiceException
protected constructor(message: String, cause: Throwable? = null) :
    SpottedException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
