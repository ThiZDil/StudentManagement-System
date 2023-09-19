package com.example.MyfirstApp.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DomainResponse<T>{

    private String resCode;

    private T data;

}
