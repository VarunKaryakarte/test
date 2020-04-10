package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeRequest;
import com.employee.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl service;
	
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody EmployeeRequest employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/get{id}")
	public Employee getById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return service.getAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
