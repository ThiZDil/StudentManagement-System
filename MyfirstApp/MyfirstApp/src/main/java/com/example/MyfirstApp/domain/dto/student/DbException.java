package com.example.MyfirstApp.domain.dto.student;

import com.example.MyfirstApp.domain.exception.BaseException;
import lombok.Getter;

@Getter
public class DbException extends BaseException {

    final String source;


    public DbException(Exception exception, String message,String code,String source) {
        super(exception,message,code);
        this.source = source;
    }
}
