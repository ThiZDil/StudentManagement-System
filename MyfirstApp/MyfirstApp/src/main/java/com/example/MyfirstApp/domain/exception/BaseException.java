package com.example.MyfirstApp.domain.exception;

import lombok.Getter;

@Getter
public class BaseException extends Exception{

    private final String code;


    public BaseException(String message,String code) {
        super(message);
        this.code = code;
    }

    public BaseException(Exception exception,String message, String code){
        super(message,exception);
        this.code=code;
    }
}
