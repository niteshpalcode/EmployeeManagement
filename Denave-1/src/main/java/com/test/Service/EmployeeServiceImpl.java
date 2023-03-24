package com.test.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.emitter.EmitterException;

import com.test.Entity.Department;
import com.test.Entity.Employee;
import com.test.Entity.EmployeeDTO;
import com.test.Exception.EmployeeExcpetion;
import com.test.repo.DepartmentRepo;
import com.test.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	DepartmentRepo departmentRepo;
//	List<Employee> list;
//
//	public EmployeeServiceImpl() {
//		// TODO Auto-generated constructor stub
//		list=new ArrayList<>();
//		list.add(new Employee(1,"nitesg", null));
//		list.add(new Employee(2,"nitesg3", null));
//	}
//	1 nidnn
	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName(employee.getName());
		employeeRepo.save(emp);
		return employee;
	}

@Override
public List<Employee> getEmployee() {
	// TODO Auto-generated method stub
return null;
//	return list;
}

@Override
public Employee addDepartmentToEmployee(Integer empid, Integer deptId) throws EmployeeExcpetion {
	// TODO Auto-generated method stub
	
	Optional<Employee> emp=employeeRepo.findById(empid);
	
	if(emp.isPresent()) {
		Optional<Department> dept=departmentRepo.findById(deptId);
		if(dept.isPresent()) {
			Employee employee=emp.get();
			employee.setDept(dept.get());
			 employeeRepo.save(employee);
			return employee;
		}
	
		else {
			throw new EmployeeExcpetion("no dept");
		}
	}
		
		else {
			throw new EmployeeExcpetion("no emp");
		}
}

@Override
public Employee assignMaangerToEmp(Integer empid, Integer mangerId) throws EmployeeExcpetion {
	// TODO Auto-generated method stub
	  Optional<Employee> emp = employeeRepo.findById(empid);
	    
	    if (emp.isPresent()) {
	    	
	        Optional<Employee> manager = employeeRepo.findById(mangerId);
	        
	        if (manager.isPresent()) {
	        	
	            Employee employee = emp.get();
	            Employee managerEmp = manager.get();
	            employee.setManager(managerEmp);
	            managerEmp.getList_ofEmployees().add(employee);
	            
	            employeeRepo.save(employee); // Save the changes to the employee entity
	            employeeRepo.save(managerEmp); // Save the changes to the manager entity
	            return employee;
	        } else {
	            throw new EmployeeExcpetion("Manager not found");
	        }
	    } else {
	        throw new EmployeeExcpetion("Employee not found");
	    }
	

}

	

	
	
}
