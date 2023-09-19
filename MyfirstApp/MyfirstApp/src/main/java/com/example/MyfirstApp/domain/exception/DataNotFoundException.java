package com.example.MyfirstApp.domain.exception;

import lombok.Getter;

@Getter
public class DataNotFoundException extends BaseException{

    private final String source;


    public DataNotFoundException(String message,String code,String source) {
        super(message, code);
        this.source = source;
    }

    public DataNotFoundException(Exception exception,String message, String code, String source){
        super(exception,message,code);
        this.source=source;
    }
}
