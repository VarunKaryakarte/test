package com.example.project1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.project1.Faculty;
import com.example.project1.dao.FacultyService;
@RestController
@RequestMapping("/company")
public class FacultyController {
	
	@Autowired
	FacultyService facultyservice;
	/* saving a faculty */
	@PostMapping("/faculty")
	public Faculty saveFaculty(@Valid @RequestBody Faculty fac) {
		return facultyservice.saveFaculty(fac);
	}
	
	/* display table of faculty */
	@GetMapping("/faculty")
	public List<Faculty> showFaculty() {
		return facultyservice.showFaculty();
	}
	
	/* get a faculty by id */
	@GetMapping("/faculty/{id}")
	public ResponseEntity<Faculty> getFacultyById(@PathVariable(value = "id")  Long id) {
		Faculty fac = facultyservice.getById(id);
		
		if(fac == null) {
			return ResponseEntity.notFound().build();
		}
		return  ResponseEntity.ok().body(fac);
	}
	
	/* Delete a record */
	@DeleteMapping("/faculty{id}")
	public ResponseEntity<Faculty> deleteById(@PathVariable(value = "id") Long id ){
		
		Faculty fac = facultyservice.getById(id);
		if(fac == null) {
			return ResponseEntity.notFound().build();
		}
		facultyservice.delete(fac);
		return ResponseEntity.ok().body(fac);
	}
}
