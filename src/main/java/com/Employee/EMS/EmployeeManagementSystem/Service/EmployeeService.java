package com.Employee.EMS.EmployeeManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Employee.EMS.EmployeeManagementSystem.Model.Employee;

@Service
public interface EmployeeService {
	
	Employee saveEmployee(Employee e);
	Employee editEmployee(Employee e);
	List<Employee>fetchAllEmployee();
	String deleteEmployee(long id);
	List<Employee> getEmployeeByLocationAndDesignation(String location);
    List<String> getEmployeeBySalaryAndDesignationAndCompanyName(String comapanyName);
    Optional<Employee> getEmployeById(long id);
    List<Employee> saveEmployees( List<Employee> emps);
    List<Employee> editEmployees(List<Employee> emps);
    String deleteEmployees(List<Long> ids);
	
	
	
	
}
