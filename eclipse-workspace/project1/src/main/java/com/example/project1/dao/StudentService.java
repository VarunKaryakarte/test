package com.example.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.project1.Faculty;
import com.example.project1.FacultyRequest;
import com.example.project1.Student;
import com.example.project1.StudentRequest;
import com.example.project1.repository.StudentRepository;

@Service
public class StudentService {

	
	
	private @Autowired StudentRepository studentrepository;
	
	/*to save an student*/
	
	public Student save(StudentRequest stuReq) {
		Student stu = new Student();
		
		stu.setStu_class(stuReq.getStudentGrade());
		stu.setStu_name(stuReq.getStudentName());
		stu.setFaculty(stuReq.getFaculties());
		
	//	fac.setName(facR.getFacultyName());
		//fac.setSubject(facR.getSubject());
		
		return studentrepository.save(stu);
		//return StudentDAO.save(stu_name);
	}
	 
	/* to list a student*/
	public List<Student> findAll() {
		return studentrepository.findAll();
	}
	
	/* find by id*/
	public Student findById(Long stu_id) {
		return studentrepository.getOne(stu_id);
	}
	
	
	/* delete by id */
	public void delete(Student stu) {
		studentrepository.delete(stu);
	}	
}
