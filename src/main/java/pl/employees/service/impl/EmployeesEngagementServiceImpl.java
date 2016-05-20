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
import pl.employees.model.to.ProjectTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;
import pl.employees.repository.EmployeeEngagementRepository;
import pl.employees.repository.EmployeeRepository;
import pl.employees.service.EmployeeService;
import pl.employees.service.EmployeesEngagementService;


@Service
@Transactional(readOnly = true)
public class EmployeesEngagementServiceImpl implements EmployeesEngagementService {

	@Autowired(required = true)
	private EmployeeEngagementRepository employeeEngagementRepository;
	
	@Autowired
	private Mapper mapper;

	@Override
	public List<ProjectsOfEmployeeTo> findAllProjectsEngagements() {
		return mapper.mapProjectsOfEmployee2Tos(employeeEngagementRepository.findAll());
	}


	@Override
	public List<ProjectsOfEmployeeTo> findProjectsEngagement(long idEmployee, String projectName) {
		return mapper.mapProjectsOfEmployee2Tos(employeeEngagementRepository.findProjectsOfEmployee(idEmployee, projectName));
	}


	@Override
	public void createProject(ProjectTo projectTo) {

	}


	@Override
	public void createEmployeeEngagement(ProjectsOfEmployeeTo poe) {
		employeeEngagementRepository.save(mapper.map2ProjectsOfEmployeeEntity(poe));
	}


	@Override
	public void addEmployeeToProject(long idEmployee, ProjectsOfEmployeeTo poe) {
		
	}


	@Override
	public void removeEmployeeFromProject(long idEmployee, String ProjectName, ProjectsOfEmployeeTo poe) {
		
	}


	@Override
	public void deleteAll() {
		
	}






}
