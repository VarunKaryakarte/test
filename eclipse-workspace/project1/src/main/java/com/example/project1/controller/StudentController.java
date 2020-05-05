package com.example.project1.controller;

import javax.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Student;
import com.example.project1.StudentRequest;
import com.example.project1.dao.StudentService;



/**
 * @author varun.p
 *
 */
/**
 * @author varun.p
 *
 */
@RestController
@RequestMapping("/company")
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	/* to save a student */
	@PostMapping("/students")
	public Student createstudent( @RequestBody StudentRequest stuReq) {
		
		return studentservice.save(stuReq);
	}
	
	/* to search all students */
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentservice.findAll();
	}
	
	/* finds students by Id */
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value="id") Long stuid){
		
		Student stu = studentservice.findById(stuid);
		
		if(stu ==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(stu);
		
	}
	
	/*Delete an employee*/
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable(value="id") Long stu_id){
		
		Student stu= studentservice.findById(stu_id);
		
		if(stu ==null) {
			return ResponseEntity.notFound().build();
		}
		studentservice.delete(stu);
		return ResponseEntity.ok().body(stu);
	}
}
