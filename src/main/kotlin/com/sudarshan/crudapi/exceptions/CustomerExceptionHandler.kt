package com.sudarshan.crudapi.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ProblemDetail
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CustomerExceptionHandler {

    @ExceptionHandler
    fun handleCustomerNotFoundException(ex: CustomerNotFoundException): ProblemDetail {
        val message = ex.message.toString()
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message)
    }

}