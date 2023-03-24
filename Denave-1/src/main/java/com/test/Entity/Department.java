package com.test.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dept_id;
	private String name;
	
	@OneToMany(mappedBy = "empid")
	private List<Employee> list=new ArrayList<>();

	
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer dept_id, String name, List<Employee> list) {
		super();
		this.dept_id = dept_id;
		this.name = name;
		this.list = list;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}	
	
	
}
