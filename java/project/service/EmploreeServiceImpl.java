package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.dao.EmployeeDao;
import project.entity.EmployeeEntity;

@Service
@Transactional
public class EmploreeServiceImpl implements EmployeeService {

	@Autowired
	 EmployeeDao dao;

	@Override
	public EmployeeEntity addEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empid);
	}

	public EmployeeEntity getEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.getEmployee(empid);
	}

	
}
