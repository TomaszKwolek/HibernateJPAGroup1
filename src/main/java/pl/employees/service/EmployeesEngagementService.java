package pl.employees.service;


import java.util.List;


import pl.employees.model.to.ProjectTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;

public interface EmployeesEngagementService{

	List<ProjectsOfEmployeeTo> findAllProjectsEngagements();
	List<ProjectsOfEmployeeTo> findProjectsEngagement(long idEmployee, String projectName);
	void deleteAll();
	void createProject(ProjectTo projectTo);
	void createEmployeeEngagement(ProjectsOfEmployeeTo poe);
	void addEmployeeToProject(long idEmployee, ProjectsOfEmployeeTo poe);
	void removeEmployeeFromProject(long idEmployee, String ProjectName, ProjectsOfEmployeeTo poe);

}
