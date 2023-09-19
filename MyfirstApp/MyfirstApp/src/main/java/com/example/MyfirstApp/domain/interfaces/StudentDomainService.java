package com.example.MyfirstApp.domain.interfaces;

import com.example.MyfirstApp.domain.dto.DomainResponse;
import com.example.MyfirstApp.domain.dto.DomainStudentsResponse;

public interface StudentDomainService {

    public DomainResponse<DomainStudentsResponse> process(DomainStudentsResponse domainStudentsResponse);

}
