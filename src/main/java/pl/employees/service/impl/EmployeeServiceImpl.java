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
	public List<EmployeeTo> findbyName(String name) {
		return mapper.mapEmployee2Tos(employeeRepository.findByName(name));
	}
	
	@Override
	@Transactional(readOnly = false)
	public void createOrUpdateEmployee(EmployeeTo employeeTo) {
		employeeRepository.save(mapper.map2EmployeeEntity(employeeTo));
	}


	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteEmployee(id);;
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteAll() {
		employeeRepository.deleteAllEmployees();
		
	}

}
