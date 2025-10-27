package com.spotted.api.errors

class SpottedInvalidDataException(message: String? = null, cause: Throwable? = null) :
    SpottedException(message, cause)
