package com.sang.ManageEmployee.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sang.ManageEmployee.model.Employee;


public interface EmployeeService {
	public List<Employee> getAllEmployee();
	
	public Employee createEmployee(Employee em);
	
	public ResponseEntity<Employee> getEmployeeById(Long id);
	
	public ResponseEntity<Employee> updateEmployee(Long id, Employee empDetails);
	
}
