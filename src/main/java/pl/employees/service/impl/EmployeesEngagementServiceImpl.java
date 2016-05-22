package pl.employees.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.glasnost.orika.MapperFacade;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;
import pl.employees.model.to.ProjectsOfEmployeeTo;
import pl.employees.repository.EmployeeEngagementRepository;
import pl.employees.service.EmployeesEngagementService;


@Service
@Transactional(readOnly = true)
public class EmployeesEngagementServiceImpl implements EmployeesEngagementService {

	@Autowired(required = true)
	private EmployeeEngagementRepository employeeEngagementRepository;
	
	@Autowired
	private MapperFacade mapper;

	@Override
	public List<ProjectsOfEmployeeTo> findAllProjectsEngagements() {
		return mapper.mapAsList(employeeEngagementRepository.findAll(), ProjectsOfEmployeeTo.class);
	}

	@Override
	public List<ProjectsOfEmployeeTo> findCurrentProjectsEngagement(String pesel, String projectName) {
		return mapper.mapAsList(employeeEngagementRepository.findProjectsOfEmployee(projectName, pesel), ProjectsOfEmployeeTo.class);
	}

	@Override
	public void saveEmployeeEngagement(ProjectsOfEmployeeTo poe) {
		employeeEngagementRepository.save(mapper.map(poe, ProjectsOfEmployeeEntity.class));
	}

	@Override
	public void removeEmployeeFromProject(String pesel, String projectName, java.util.Date stopDate) {
		ProjectsOfEmployeeEntity poeEntity = employeeEngagementRepository.findProjectsOfEmployee(projectName, pesel).get(0);
		ProjectsOfEmployeeTo poeTo = mapper.map(poeEntity, ProjectsOfEmployeeTo.class);
		poeTo.setDateStop(stopDate);
		employeeEngagementRepository.save(mapper.map(poeTo, ProjectsOfEmployeeEntity.class));
	}

	@Override
	public void deleteAll() {
		
	}

}
