package com.springboot.microservice.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.dao.StudentDao;
import com.springboot.microservice.model.Student;


@RestController
public class StudentController {

    
	StudentDao repo;
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	@PutMapping(path="/student")
	public Student saveOrUpdateStudent(Student student) {
		
		repo.save(student);
		return student;
	}
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		System.out.println("ADD");
		repo.save(student);
		return student;
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		Student a =repo.getReferenceById(id);
		repo.delete(a);
		return "deleted";
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return repo.findAll();
	}

	
	
	

	
	
}
