package project.dao;

import project.entity.EmployeeEntity;

public interface EmployeeDao {
	
	
	EmployeeEntity addEmployee(EmployeeEntity employee);

	EmployeeEntity updateEmployee(EmployeeEntity employee);

	String deleteEmployee(int empid);
	
	EmployeeEntity getEmployee(int empid);
	


}
