package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeRequest;

public interface EmployeeService {

	public Employee saveEmployee(EmployeeRequest employee);
	
	public Employee getEmployeeById(Long id);
	
	public void delete(Long id);
	
	public List<Employee> getAll();
	
	
}
