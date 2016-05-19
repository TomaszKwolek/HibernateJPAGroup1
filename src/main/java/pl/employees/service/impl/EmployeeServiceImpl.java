package pl.employees.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.employees.mapper.Mapper;
import pl.employees.model.entity.DepartmentEntity;
import pl.employees.model.entity.EmployeeEntity;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;
import pl.employees.model.to.EmployeeTo;
import pl.employees.repository.EmployeeRepository;
import pl.employees.service.EmployeeService;


@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired(required = true)
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private Mapper mapper;

	@Override
	public List<EmployeeTo> findAllEmployees() {
		return mapper.mapEmployee2Tos(employeeRepository.findAll());
	}
	

	@Override
	public List<EmployeeTo> findByFirstName(String firstName) {
		return mapper.mapEmployee2Tos(employeeRepository.findByName(firstName));
	}

	@Override
	@Transactional(readOnly = false)
	public void createEmployee(int id, Date dateOfBirth, String firstName, String lastName, String pesel) {
	//	employeeRepository.save(new EmployeeEntity(id, dateOfBirth, firstName, lastName, pesel, department, poes));
	//	employeeRepository.save(new EmployeeEntity());
	//	employeeRepository.insertEmployee(dateOfBirth, firstName, lastName, pesel);
	}
	

	@Override
	public void updateEmployee(int id, Date dateOfBirth, String name, String surname, String pesel) {
		// TODO Auto-generated method stub
		
	}






}
