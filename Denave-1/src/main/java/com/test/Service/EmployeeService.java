package com.test.Service;

import java.util.List;
import java.util.Set;

import org.yaml.snakeyaml.emitter.EmitterException;

import com.test.Entity.Employee;
import com.test.Entity.EmployeeDTO;
import com.test.Entity.Leaves;
import com.test.Exception.EmployeeExcpetion;
import com.test.Exception.LeaveException;

public interface EmployeeService {

	public EmployeeDTO addEmployee(EmployeeDTO employee);
	public List<Employee> getEmployee();
	
	public Employee addDepartmentToEmployee(Integer empid,Integer deptId) throws EmployeeExcpetion;
	
	public Employee assignMaangerToEmp(Integer empid,Integer mangerId) throws EmployeeExcpetion;
	
	public String applyLeaves(Integer empId, Leaves leaves) throws EmployeeExcpetion,LeaveException;
	
	public List<Leaves> getAllLeav() throws LeaveException;


//	when a manager is assigned to a employee than automatically department will set accordiig to the manager(bug)
//	Particlar manager will see all the leaves, all the employees who are working under him.
//	manager can aprrove a leave of a particular employee

	
}
