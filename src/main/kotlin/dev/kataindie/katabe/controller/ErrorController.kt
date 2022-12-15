package dev.kataindie.katabe.controller

import dev.kataindie.katabe.model.WebResponse
import org.springframework.http.HttpStatus
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ErrorController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    fun validationError(methodArgumentNotValidException: MethodArgumentNotValidException): WebResponse<Map<String, String>>{
        val errors:HashMap<String,String> = HashMap<String,String>()
        methodArgumentNotValidException.bindingResult.allErrors.forEach { error ->
            val fieldName = (error as FieldError).field
            val errorMessage: String = error.defaultMessage!!
            errors[fieldName] = errorMessage
        }
        return WebResponse(code = 400, status = "BAD REQUEST", data = errors)
    }
}