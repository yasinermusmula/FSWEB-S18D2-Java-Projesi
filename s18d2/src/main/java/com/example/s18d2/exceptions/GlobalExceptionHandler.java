package com.example.s18d2.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(PlantException plantException){
        log.error("PlantException", plantException);
        ErrorResponse errorResponse = new ErrorResponse(plantException.getStatus().value(),
                plantException.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,plantException.getStatus());
    }


    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception exception){
        log.error("Exception",exception);
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                exception.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
