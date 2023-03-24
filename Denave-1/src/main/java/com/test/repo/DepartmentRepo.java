package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Department;
import com.test.Entity.Employee;

public interface DepartmentRepo  extends JpaRepository<Department, Integer>{

}
