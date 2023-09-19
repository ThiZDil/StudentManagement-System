package com.example.MyfirstApp.domain.service;

import com.example.MyfirstApp.domain.dto.DomainStudentsResponse;
import com.example.MyfirstApp.domain.dto.DomainResponse;
import com.example.MyfirstApp.domain.dto.student.StudentData;
import com.example.MyfirstApp.domain.interfaces.StudentDomainService;
import com.example.MyfirstApp.domain.utill.DomainStatus;
import com.example.MyfirstApp.domain.utill.ExceptionHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponse;

@Service
public class StudentDomainServiceImp implements StudentDomainService {

    private final StudentService studentService;
    private final ExceptionHandler exceptionHandler;

    public StudentDomainServiceImp(StudentService studentService,
                                   ExceptionHandler exceptionHandler) {
        this.studentService = studentService;
        this.exceptionHandler = exceptionHandler;
    }


    public DomainResponse<DomainStudentsResponse> process( DomainStudentsResponse domainStudentsResponse){
       DomainResponse<DomainStudentsResponse> domainResponse;

       try {
           StudentData studentData = studentService.fetchStudentDetails(domainStudentsResponse.getId());
           DomainStudentsResponse studentsResponse=new DomainStudentsResponse();
           studentsResponse.setId(studentData.getId());
           studentsResponse.setName(studentData.getName());

           domainResponse=new DomainResponse<>();
           domainResponse.setResCode(DomainStatus.SUCCESS_OK.getCode());
           domainResponse.setData(studentsResponse);



       }catch (Exception exception){
           //ErrorResponse errorResponse=exceptionHandler.handleException(exception);
           domainResponse=new DomainResponse<>();
           domainResponse.setResCode("404");



       }
       return domainResponse;
    }
}
