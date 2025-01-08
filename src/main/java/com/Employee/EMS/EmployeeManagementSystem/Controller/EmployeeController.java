package com.Employee.EMS.EmployeeManagementSystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.EMS.EmployeeManagementSystem.Model.Employee;
import com.Employee.EMS.EmployeeManagementSystem.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
	private EmployeeService service;
    
    @PostMapping("/save")
    Employee saveEmployee(@RequestBody Employee e) {
    	return service.saveEmployee(e);
    }
    @PutMapping("/editemp")
	Employee editEmployee(@RequestBody Employee e) {
		return service.editEmployee(e);
	}
    @GetMapping("/fetchemps")
	List<Employee>fetchAllEmployee(){
		return service.fetchAllEmployee();
	}
    @DeleteMapping("/deleteemp/{id}")
	String deleteEmployee(@PathVariable long id) {
		return service.deleteEmployee(id);
	}
    @GetMapping("/getempbylocanddesign/{location}")
	List<Employee> getEmployeeByLocationAndDesignation(@PathVariable String location){
		return service.getEmployeeByLocationAndDesignation(location);
	}
    @GetMapping("/getempbysalanddesignandcompany/{comapanyName}")
    List<String> getEmployeeBySalaryAndDesignationAndCompanyName(@PathVariable String comapanyName){
    	return service.getEmployeeBySalaryAndDesignationAndCompanyName(comapanyName);
    }
    @GetMapping("/getemp/{id}")
    Optional<Employee> getEmployeById(@PathVariable long id){
    	return service.getEmployeById(id);
    }
    @PostMapping("/saveemps")
    List<Employee> saveEmployees(@RequestBody List<Employee> emps){
    	return service.saveEmployees(emps);
    }
    @PutMapping("/editemps")
    List<Employee> editEmployees(@RequestBody List<Employee> emps){
    	return service.editEmployees(emps);
    }
    @DeleteMapping("/deleteemps/{ids}")
    String deleteEmployees(@PathVariable List<Long> ids) {
    	return service.deleteEmployees(ids);
    }
    
	
}
