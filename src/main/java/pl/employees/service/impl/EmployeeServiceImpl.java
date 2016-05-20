package pl.employees.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.glasnost.orika.MapperFacade;
import pl.employees.model.entity.EmployeeEntity;
import pl.employees.model.to.EmployeeTo;
import pl.employees.repository.EmployeeRepository;
import pl.employees.service.EmployeeService;


@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired(required = true)
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private MapperFacade mapper;

	@Override
	public List<EmployeeTo> findAllEmployees() {
		return mapper.mapAsList(employeeRepository.findAll(), EmployeeTo.class);
	}
	

	@Override
	public List<EmployeeTo> findbyName(String name) {
		return mapper.mapAsList(employeeRepository.findByName(name), EmployeeTo.class);
	}
	
	@Override
	@Transactional(readOnly = false)
	public void createOrUpdateEmployee(EmployeeTo employeeTo) {
		employeeRepository.save(mapper.map(employeeTo, EmployeeEntity.class));
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
