package com.sang.ManageEmployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sang.ManageEmployee.exception.ResourceNotFoundException;
import com.sang.ManageEmployee.model.Employee;
import com.sang.ManageEmployee.repository.EmployeeRepository;
@Service
public class ImpEmployeeService implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee em) {
		// TODO Auto-generated method stub
		
		return employeeRepository.save(em);
	}

	@Override
	public ResponseEntity<Employee> getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Employee empl = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exits with id:"+id));
		return ResponseEntity.ok(empl);
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Long id, Employee empDetails) {
		// TODO Auto-generated method stub
		Employee empl = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exits with id:"+id));
		
		empl.setFirstName(null);
		empl.setLastName(null);
		empl.setEmailId(null);
		
		return null;
	}
	
	

}
