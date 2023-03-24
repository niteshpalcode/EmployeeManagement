package com.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Entity.Department;
import com.test.Entity.Employee;
import com.test.repo.DepartmentRepo;
import com.test.repo.EmployeeRepo;

@Service
public class DepartmentServiceImpl  implements DepartmentService{

	@Autowired
	DepartmentRepo departmentRepo;
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Department addDepartment(Department dept) {
		// TODO Auto-generated method stub
		Department deptarment=departmentRepo.save(dept);
		
		return deptarment;
	}
}
