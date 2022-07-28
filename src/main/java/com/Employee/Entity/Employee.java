package com.Employee.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Table;
import javax.persistence.Id;

@Entity 
@Table(name= "Employee_Data")
public class Employee {
	@Id
	
	@Column(name = "EmplId")
	private int id;
	@Column(name = "EmplName")
    private String name;
	@Column(name = "EmplSalary")
    private int salary;
	@Column(name = "EmplDesignation")
    private String designation;
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
			
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
    
}