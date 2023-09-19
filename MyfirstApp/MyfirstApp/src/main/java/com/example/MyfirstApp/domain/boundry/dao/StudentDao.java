package com.example.MyfirstApp.domain.boundry.dao;

import com.example.MyfirstApp.domain.dto.student.StudentDbData;
import com.example.MyfirstApp.domain.exception.BaseException;
import com.example.MyfirstApp.domain.exception.DataNotFoundException;

import java.util.List;

public interface StudentDao  {


    StudentDbData getStudentDetail(int id) throws DataNotFoundException, BaseException;
}
