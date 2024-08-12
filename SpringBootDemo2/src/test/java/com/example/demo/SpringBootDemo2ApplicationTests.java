package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class SpringBootDemo2ApplicationTests {
	@Autowired
	EmployeeService empService;
	

	@Test
	void contextLoads() {
	}
	@Test
	public void testSaveEmployee() {
		Employee emp=new Employee(123l, "hello", 10000.0, "Developer");
		Employee savedEmployee=empService.saveEmployee(emp);
		Assertions.assertNotNull(savedEmployee);
		Assertions.assertEquals("hello", savedEmployee.getName());
		System.out.println("Test case runs succesfully");
		
	}
	@Test
	public void testUpdateEmployee() {
		Employee emp=new Employee(111l, "morning", 20000.0, "Tester");
		empService.saveEmployee(emp);
		Long oldid=emp.getEmpid();
		emp.setEmpid(300l);
		empService.updateEmployee(emp);
		Assertions.assertNotNull(oldid);
		Assertions.assertEquals(300l,emp.getEmpid() );
	}
	
	

}
