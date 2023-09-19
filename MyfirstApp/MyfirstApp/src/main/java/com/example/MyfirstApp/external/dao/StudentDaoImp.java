package com.example.MyfirstApp.external.dao;

import com.example.MyfirstApp.domain.boundry.dao.StudentDao;
import com.example.MyfirstApp.domain.dto.student.DbException;
import com.example.MyfirstApp.domain.dto.student.StudentDbData;
import com.example.MyfirstApp.domain.exception.BaseException;
import com.example.MyfirstApp.domain.exception.DataNotFoundException;
import com.example.MyfirstApp.external.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentDaoImp implements StudentDao {

    private final StudentRepository studentRepository ;

    public StudentDaoImp(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    @Override
    public StudentDbData getStudentDetail(int id) throws BaseException {
        Optional<StudentDbData> optional;
        try {
            optional = studentRepository.findById(id);

        }catch(Exception ex){
            throw new DbException(ex,"DB, Filure","SPL3001","Fetch Student data");
        }
        if(!optional.isPresent()){
            throw new DataNotFoundException("No data found","spl2001","Fetch Student data");
        }

        return optional.get();

    }

}
