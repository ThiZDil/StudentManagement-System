package com.example.MyfirstApp.application.controller;

import com.example.MyfirstApp.application.dto.response.StudentDetailResponse;
import com.example.MyfirstApp.domain.interfaces.StudentDomainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class StudentDetailController {

    private final StudentDomainService studentDomainService;


    public StudentDetailController(StudentDomainService studentDomainService) {
        this.studentDomainService = studentDomainService;
    }

    public ResponseEntity<StudentDetailResponse> viewStudent(@PathVariable int id){

        StudentDetailResponse studentDetailResponse= new StudentDetailResponse();
        studentDetailResponse.setId(studentDomainService.process());

        return ResponseEntity.status(200).body();
    }

}
