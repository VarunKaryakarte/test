package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeRequest;
import com.employee.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

		@Autowired
		private EmployeeRepository employeeRepository;
		
		Employee emp = new Employee();
		
		public Employee saveEmployee(EmployeeRequest employee) {
			
			emp.setEmployeeName(employee.getName());
			emp.setEmployeeRole(employee.getRole());
			
			return employeeRepository.save(emp);
			
		}

		@Override
		public Employee getEmployeeById(Long id) {
			return employeeRepository.getOne(id);
			
		}

		@Override
		public void delete(Long id) {
			employeeRepository.deleteById(id);
			
		}

		@Override
		public List<Employee> getAll(){
			return employeeRepository.findAll();
		}
}
