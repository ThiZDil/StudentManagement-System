package com.example.MyfirstApp.domain.utill;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum DomainStatus {
    SUCCESS_OK("BGS1001", "SUCCESS", HttpStatus.OK),
    VALIDATION_FAILURE("BGS2000", "Validation failure", HttpStatus.BAD_REQUEST),
    DATA_NOT_FOUND("BGS2002", "Data not found", HttpStatus.BAD_REQUEST),
    COMMON_ERROR("BGS3000", "Common error", HttpStatus.INTERNAL_SERVER_ERROR),
    DB_FAILURE("BGS3001", "Database failure", HttpStatus.INTERNAL_SERVER_ERROR)
            ;

    private final String code;



    DomainStatus(String code, String description, HttpStatus httpStatus) {
        this.code = code;

    }
}
