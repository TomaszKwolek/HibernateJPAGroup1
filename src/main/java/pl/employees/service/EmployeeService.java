package pl.employees.service;

import java.util.List;

import pl.employees.model.to.EmployeeTo;

public interface EmployeeService{

	List<EmployeeTo> findAllEmployees();
	List<EmployeeTo> findbyName(String name);
	void deleteAll();
	void deleteEmployee(long id);
	void createOrUpdateEmployee(EmployeeTo employeeTo);

}
