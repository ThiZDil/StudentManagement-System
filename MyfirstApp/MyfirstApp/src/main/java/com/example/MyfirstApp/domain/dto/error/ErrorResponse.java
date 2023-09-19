package com.example.MyfirstApp.domain.dto.error;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorResponse {

    private String responseCode;
    private String responseDescription;
    private int httpStatus;
}
