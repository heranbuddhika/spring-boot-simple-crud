package com.demo.crud.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.studentservice.model.Student;
import com.demo.crud.studentservice.service.StudentService;

@RestController
@RequestMapping("/student-service")
public class StudentController {

	@Autowired
    private StudentService studentService;

	@GetMapping("/get/student/all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("/save/student")
    public Student saveUser(@RequestBody Student newStudent){
        return studentService.saveStudent(newStudent);
    }

	@DeleteMapping("/remove/student/{id}")
    public void removeStudent(@PathVariable Long id){
		studentService.removeStudent(id);
    }

	@PatchMapping("/patchUser/{id}")
    public Student updateUser(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }
}
