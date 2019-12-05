package com.demo.crud.studentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.studentservice.model.Student;
import com.demo.crud.studentservice.repository.StudentRespository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRespository studentRespository;

	public List<Student> getAllStudents() {
        return studentRespository.findAll();
    }

	@Override
	public Student saveStudent(Student newStudent) {
		return studentRespository.save(newStudent);
	}

	@Override
	public void removeStudent(Long id) {
		studentRespository.deleteById(id);
	}

	@Override
	public Student updateStudent(Long id, Student newStudent) {

		/*
		 * Student student = studentRespository.findById(id) .orElseThrow(() -> new
		 * ResourceNotFoundException("Student with id : " + id + " not found."));
		 */
		Optional<Student> student = studentRespository.findById(id);

		if (student.isPresent()) {
			student.get().setfName(newStudent.getfName());
			student.get().setlName(newStudent.getlName());
			student.get().setEmailAddress(newStudent.getEmailAddress());
		}
		return null;
	}
}
