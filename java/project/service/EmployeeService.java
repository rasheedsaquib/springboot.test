package project.service;

import project.entity.EmployeeEntity;

public interface EmployeeService {
	
	EmployeeEntity addEmployee(EmployeeEntity employee);

	EmployeeEntity updateEmployee(EmployeeEntity employee);

	String deleteEmployee(int empid);

	EmployeeEntity getEmployee(int empid);

}
