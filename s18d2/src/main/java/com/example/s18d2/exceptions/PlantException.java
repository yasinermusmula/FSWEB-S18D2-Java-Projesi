package com.example.s18d2.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class PlantException extends RuntimeException{
    private HttpStatus status;
    public PlantException(String message, HttpStatus status) {
        super(message);
        this.status=status;
    }
}
