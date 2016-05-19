package pl.employees.service;

import java.util.Date;
import java.util.List;

import pl.employees.model.entity.DepartmentEntity;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;
import pl.employees.model.to.EmployeeTo;

public interface EmployeeService{

	List<EmployeeTo> findAllEmployees();
	List<EmployeeTo> findByFirstName(String firstName);
	void createEmployee(int id, Date dateOfBirth, String name, String surname, String pesel);
	void updateEmployee(int id, Date dateOfBirth, String name, String surname, String pesel);


}
