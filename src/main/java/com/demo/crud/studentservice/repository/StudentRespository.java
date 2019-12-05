package com.demo.crud.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.crud.studentservice.model.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long> {

}
