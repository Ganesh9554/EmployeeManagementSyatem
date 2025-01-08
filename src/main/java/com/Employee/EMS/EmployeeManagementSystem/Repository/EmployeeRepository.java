package com.Employee.EMS.EmployeeManagementSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.EMS.EmployeeManagementSystem.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	
	
}
