package com.test.repo;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
