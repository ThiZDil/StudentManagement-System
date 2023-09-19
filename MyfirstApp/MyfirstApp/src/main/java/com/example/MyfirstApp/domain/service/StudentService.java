package com.example.MyfirstApp.domain.service;

import com.example.MyfirstApp.domain.boundry.dao.StudentDao;
import com.example.MyfirstApp.domain.dto.student.StudentData;
import com.example.MyfirstApp.domain.dto.student.StudentDbData;
import com.example.MyfirstApp.domain.exception.BaseException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentDao studentDao;


    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentData fetchStudentDetails(int id) throws BaseException {
        StudentDbData studentDbData=studentDao.getStudentDetail(id);

        StudentData studentData = new StudentData();
        studentData.setId(studentData.getId());
        studentData.setName(studentDbData.getName());

        return studentData;
    }
}
