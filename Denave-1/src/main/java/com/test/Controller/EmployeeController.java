package com.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Department;
import com.test.Entity.Employee;
import com.test.Entity.EmployeeDTO;
import com.test.Exception.EmployeeExcpetion;
import com.test.Service.DepartmentService;
import com.test.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDto){
		EmployeeDTO edto= employeeService.addEmployee(employeeDto);
		return new ResponseEntity<>(edto,HttpStatus.CREATED);
	}
	@GetMapping("/")
	public String getwelcome() {
		return "welcone";
	}

	@PostMapping("/deptAdd")
	public ResponseEntity<Department> addDepartmemt(@RequestBody Department department){
		Department edto=departmentService.addDepartment(department);
		return new ResponseEntity<>(edto,HttpStatus.CREATED);
	}
	@PostMapping("/deptemp/{empid}/{deptid}")
	public ResponseEntity<Employee> addEmptoDept(@PathVariable("empid") Integer empid,@PathVariable("deptid") Integer deptid)throws EmployeeExcpetion{
		Employee emp=employeeService.addDepartmentToEmployee(empid, deptid);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@PostMapping("/manager/{empid}/{manid}")
	public ResponseEntity<Employee> addMaanagrtoEmplouee(@PathVariable("empid") Integer empid,@PathVariable("manid") Integer manid)throws EmployeeExcpetion{
		Employee emp=employeeService.assignMaangerToEmp(empid, manid);
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	}
}
