package com.example.project1;

public class FacultyRequest {

	private String facultyName;
	
	private String facultySubject;

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String name) {
		this.facultyName = name;
	}

	public String getSubject() {
		return facultySubject;
	}

	public void setFacultySubject(String subject) {
		this.facultySubject = subject;
	}
	
	public FacultyRequest() {
		
	}
	
}
