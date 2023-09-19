package com.example.MyfirstApp.external.repository;

import com.example.MyfirstApp.domain.dto.student.StudentDbData;
import com.example.MyfirstApp.external.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Optional,Integer> {

    Optional<StudentDbData> findById(int id);

}
