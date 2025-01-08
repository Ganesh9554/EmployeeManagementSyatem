package com.Employee.EMS.EmployeeManagementSystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private long empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_salary")
	private float empSalary;
	
	@Column(name="emp_address")
	private String empAddress;
	
	@Column(name="emp_gender")
	private char empGender;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_design")
	private String empDesignation;
	
	@Column(name="emp_cmpn_name")
	private String comapanyName;
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	
	public String getComapanyName() {
		return comapanyName;
	}
	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}
	public Employee(long empId, String empName, float empSalary, String empAddress, char empGender, String empEmail,
			String empDesignation, String comapanyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empGender = empGender;
		this.empEmail = empEmail;
		this.empDesignation = empDesignation;
		this.comapanyName = comapanyName;
	}
	public Employee() {
		super();
	}
	
	
	
	

}
