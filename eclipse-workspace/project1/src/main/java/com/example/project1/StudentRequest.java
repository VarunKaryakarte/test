package com.example.project1;

import java.util.ArrayList;
import java.util.List;

public class StudentRequest {
	
	private String studentName;
	private int studentGrade;
	
	
	public List<Faculty> getFaculties() {
		return faculties;
	}
	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setGrade(int grade) {
		this.studentGrade = grade;
	}
	public List<Faculty> faculties = new ArrayList<>();
	public StudentRequest() {
		
	}
}