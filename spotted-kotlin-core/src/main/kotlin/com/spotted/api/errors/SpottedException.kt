package com.spotted.api.errors

open class SpottedException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
