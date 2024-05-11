package com.hackathon.ewallet.auditservice.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ProblemDetail handleResponseStatusException(ResponseStatusException ex) {
        log.error("Error: {}, Reason: {}", ex.getMessage(), ex.getReason());
        return ProblemDetail.forStatusAndDetail(ex.getStatusCode(), ex.getMessage());
    }
    
}
