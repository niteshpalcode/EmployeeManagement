package com.test.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department dept;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	@OneToMany(mappedBy = "manager")
	@JsonIgnore
	private List<Employee> list_ofEmployees=new ArrayList<>();
	
	
	@OneToMany(mappedBy = "employee")
	@JsonIgnore
	private Set<Leaves> allLeaves=new HashSet<>();
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empid, String name, Department dept, Employee manager, List<Employee> list_ofEmployees,
			Set<Leaves> allLeaves) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.manager = manager;
		this.list_ofEmployees = list_ofEmployees;
		this.allLeaves = allLeaves;
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public Employee getManager() {
		return manager;
	}


	public void setManager(Employee manager) {
		this.manager = manager;
	}


	public List<Employee> getList_ofEmployees() {
		return list_ofEmployees;
	}


	public void setList_ofEmployees(List<Employee> list_ofEmployees) {
		this.list_ofEmployees = list_ofEmployees;
	}


	public Set<Leaves> getAllLeaves() {
		return allLeaves;
	}


	public void setAllLeaves(Set<Leaves> allLeaves) {
		this.allLeaves = allLeaves;
	}


}

