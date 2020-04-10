package com.employee.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
public class EmployeeRequest {
	
	
	private Long id;
	
	private String name;
	
	private String role;

}
