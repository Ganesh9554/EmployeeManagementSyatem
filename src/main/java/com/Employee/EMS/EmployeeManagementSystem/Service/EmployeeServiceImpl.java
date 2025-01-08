package com.Employee.EMS.EmployeeManagementSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.EMS.EmployeeManagementSystem.Model.Employee;
import com.Employee.EMS.EmployeeManagementSystem.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
		
	}

	@Override
	public Employee editEmployee(Employee e) {
		   Optional<Employee> dbemp= repo.findById(e.getEmpId());
		   if(dbemp.isPresent()) {
			   if(dbemp.get().getEmpId() == e.getEmpId()) {
				   repo.save(e);
			   }
		   }
		return e;
		
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		     return repo.findAll();
		
	}

	@Override
	public String deleteEmployee(long id) {
		            repo.deleteById(id);
		return "record deleted successfullu";
	}

	@Override
	public List<Employee> getEmployeeByLocationAndDesignation(String location) {
		 List<Employee> newList=new ArrayList<Employee>();
		List<Employee> emp=repo.findAll();
		for (Employee employee : emp) {
			if(employee.getEmpAddress().equalsIgnoreCase(location)&& employee.getEmpDesignation().equalsIgnoreCase("ssr")) {
				newList.add(employee);
			}
		}
		return newList;
	}

	@Override
	public List<String> getEmployeeBySalaryAndDesignationAndCompanyName(String comapanyName) {
		 
		List<String> names=new ArrayList<String>();
		 List<Employee> emps=repo.findAll();
		 for (Employee employee : emps) {
			 if(employee.getEmpSalary()>50000.0 && employee.getEmpDesignation().equalsIgnoreCase("sse") && employee.getComapanyName().equalsIgnoreCase(comapanyName)) {
				  names.add(employee.getEmpName());
			 }
		}
		return names;
	}

	@Override
	public Optional<Employee> getEmployeById(long id) {
		  return repo.findById(id);
		
	}

	@Override
	public List<Employee> saveEmployees(List<Employee> emps) {
		for (Employee employee : emps) {
			repo.save(employee);
		}
		return emps;
	}

	@Override
	public List<Employee> editEmployees(List<Employee> employees) {
		     for (Employee employee : employees) {
		    	      Optional<Employee> dbemprecord=repo.findById(employee.getEmpId());
		    	      if(dbemprecord.isPresent()) {
		    	    	      if(dbemprecord.get().getEmpId()==employee.getEmpId()) {
		    	    	    	  repo.save(employee);
		    	    	      }
		    	      }
			}
		return employees;
	}

	@Override
	public String deleteEmployees(List<Long> ids) {
		 repo.deleteAllById(ids);
		return "records deleted successfully";
	}
	

}
