package com.spotted.api.errors

class SpottedIoException(message: String? = null, cause: Throwable? = null) :
    SpottedException(message, cause)
