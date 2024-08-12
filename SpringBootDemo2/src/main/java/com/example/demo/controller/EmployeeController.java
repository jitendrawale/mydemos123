package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService ser;
	@GetMapping("/all")
public List<Employee> getAllEmployee(){
	return ser.getAllEmployee();
}
@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById1(@PathVariable Long id){
		Optional<Employee> employee=ser.getEmployeeById(id);
		return employee.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
	}
@PostMapping
public Employee createEmployee(@RequestBody Employee employee) {
	return ser.saveEmployee(employee);
	
	
}
 


}
