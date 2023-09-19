package com.example.MyfirstApp.domain.exception;

public class ValidationException extends BaseException{


    public ValidationException(String message, String code) {
        super(message, code);
    }
}
