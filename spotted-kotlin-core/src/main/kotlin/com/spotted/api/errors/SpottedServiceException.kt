// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.errors

import com.spotted.api.core.JsonValue
import com.spotted.api.core.http.Headers

abstract class SpottedServiceException
protected constructor(message: String, cause: Throwable? = null) :
    SpottedException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
