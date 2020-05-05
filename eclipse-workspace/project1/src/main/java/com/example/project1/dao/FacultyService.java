package com.example.project1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.Faculty;
import com.example.project1.repository.FacultyRepository;

@Service
public class FacultyService {
	
	public @Autowired FacultyRepository facultyrepository;
	
	/* Saves a faculty member */
	public Faculty saveFaculty(Faculty fac) {
		return facultyrepository.save(fac);
	}
	
	/* Displays the names of all the faculty member */
	public List<Faculty> showFaculty(){
		return facultyrepository.findAll();
	}
	
	public Faculty getById(Long facId) {
		return facultyrepository.getOne(facId);
	}
	
	public void delete(Faculty fac) {
		 facultyrepository.delete(fac);
	}
}
