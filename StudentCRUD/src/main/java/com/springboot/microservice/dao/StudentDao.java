package com.springboot.microservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springboot.microservice.model.Student;



public interface StudentDao extends JpaRepository<Student,Integer>
{
	List<Student> findByName(String name);
	
	@Query("select * from studentDetails")
	List<Student> findAll();
	
	
	
}
