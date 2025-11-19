package dev.cjav.spotted.errors

open class SpottedException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
