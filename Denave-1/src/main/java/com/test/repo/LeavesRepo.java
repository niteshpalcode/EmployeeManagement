package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Leaves;

public interface LeavesRepo extends JpaRepository<Leaves, Integer> {
	

}
