package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.Entity.Employee;
import com.test.Service.EmployeeService;

@SpringBootApplication
public class Denave1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Denave1Application.class, args);
	}
	
//	@Autowired
//	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee employee =new Employee(5, "hvdss", null);
//		
//		employeeService.addEmployee(employee);
		
		
	}

}
