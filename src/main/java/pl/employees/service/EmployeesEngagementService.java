package pl.employees.service;


import java.util.List;

import pl.employees.model.to.ProjectsOfEmployeeTo;

public interface EmployeesEngagementService{

	List<ProjectsOfEmployeeTo> findAllProjectsEngagements();
	List<ProjectsOfEmployeeTo> findCurrentProjectsEngagement(String pesel, String projectName);
	void deleteAll();
	void saveEmployeeEngagement(ProjectsOfEmployeeTo poe);
	void removeEmployeeFromProject(String pesel, String ProjectName, java.util.Date stopDate);

}
