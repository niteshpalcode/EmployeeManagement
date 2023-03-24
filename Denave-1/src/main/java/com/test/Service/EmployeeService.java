package com.test.Service;

import java.util.List;

import org.yaml.snakeyaml.emitter.EmitterException;

import com.test.Entity.Employee;
import com.test.Entity.EmployeeDTO;
import com.test.Exception.EmployeeExcpetion;

public interface EmployeeService {

	
//	fir adding the employee
	public EmployeeDTO addEmployee(EmployeeDTO employee);
	public List<Employee> getEmployee();
	
	public Employee addDepartmentToEmployee(Integer empid,Integer deptId) throws EmployeeExcpetion;
	
	public Employee assignMaangerToEmp(Integer empid,Integer mangerId) throws EmployeeExcpetion;

//	empl> dept>manager
	
}
