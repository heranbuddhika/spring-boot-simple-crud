package com.demo.crud.studentservice.service;

import java.util.List;

import com.demo.crud.studentservice.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student saveStudent(Student newStudent);

	public void removeStudent(Long id);

	public Student updateStudent(Long id, Student student);
}
