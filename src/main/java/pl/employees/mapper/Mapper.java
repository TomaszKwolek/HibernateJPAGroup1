package pl.employees.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pl.employees.model.entity.DepartmentEntity;
import pl.employees.model.entity.EmployeeEntity;
import pl.employees.model.entity.ProjectEntity;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;
import pl.employees.model.to.DepartmentTo;
import pl.employees.model.to.EmployeeTo;
import pl.employees.model.to.ProjectTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;

@Service
public class Mapper {

	/**
	 * @param Department entity
	 * @return Department to
	 */
	public DepartmentTo map2DepartmentTo(DepartmentEntity departmentEntity) {
		if (departmentEntity != null) {
			return new DepartmentTo(departmentEntity.getDepartmentName(), departmentEntity.getEmployees());
		}
		return null;
	}

	/**
	 * @param Department to
	 * @return Department entity
	 */
	public DepartmentEntity map2DepartmentEntity(DepartmentTo departmentTo) {
		if (departmentTo != null) {
			return new DepartmentEntity(departmentTo.getDepartmentName(), departmentTo.getEmployees());
		}
		return null;
	}
	
	/**
	 * @param list of Department entities
	 * @return list of Department tos
	 */
	public List<DepartmentTo> mapDeparmetns2Tos(List<DepartmentEntity> departmentEntities) {
		List<DepartmentTo> tos = new ArrayList<DepartmentTo>();
		for (DepartmentEntity department : departmentEntities) {
			tos.add(map2DepartmentTo(department));
		}
		return tos;
	}
	
	/**
	 * @param list of Department tos
	 * @return list of Department entities
	 */
	public List<DepartmentEntity> mapDeparmetn2Entities(List<DepartmentTo> departmentTos) {
		List<DepartmentEntity> entities = new ArrayList<DepartmentEntity>();
		for (DepartmentTo department : departmentTos) {
			entities.add(map2DepartmentEntity(department));
		}
		return entities;
	}
	
	/**
	 * @param ProjectsOfEmployee entity
	 * @return ProjectsOfEmployee to
	 */
	public ProjectsOfEmployeeTo map2ProjectsOfEmployeeTo(ProjectsOfEmployeeEntity projectsOfEmployeeEntity) {
		if (projectsOfEmployeeEntity != null) {
			ProjectsOfEmployeeTo projectsOfEmployeeTo = new ProjectsOfEmployeeTo();
			projectsOfEmployeeTo.setIdProjectsOfEmployees(projectsOfEmployeeEntity.getIdProjectsOfEmployees());
			projectsOfEmployeeTo.setEmployee(projectsOfEmployeeEntity.getEmployee());
			projectsOfEmployeeTo.setDateStart(projectsOfEmployeeEntity.getDateStart());
			projectsOfEmployeeTo.setDateStop(projectsOfEmployeeEntity.getDateStop());
			projectsOfEmployeeTo.setDailySalary(projectsOfEmployeeEntity.getDailySalary());
			projectsOfEmployeeTo.setRole(projectsOfEmployeeEntity.getRole());
			projectsOfEmployeeTo.setProject(projectsOfEmployeeEntity.getProject());
			return projectsOfEmployeeTo;
		}
		return null;
	}
	
	/**
	 * @param ProjectsOfEmployee to
	 * @return ProjectsOfEmployee entity
	 */
	public ProjectsOfEmployeeEntity map2ProjectsOfEmployeeEntity(ProjectsOfEmployeeTo projectsOfEmployeeTo) {
		if (projectsOfEmployeeTo != null) {
			ProjectsOfEmployeeEntity projectsOfEmployeeEntity = new ProjectsOfEmployeeEntity();
			projectsOfEmployeeEntity.setIdProjectsOfEmployees(projectsOfEmployeeTo.getIdProjectsOfEmployees());
			projectsOfEmployeeEntity.setEmployee(projectsOfEmployeeTo.getEmployee());
			projectsOfEmployeeEntity.setDateStart(projectsOfEmployeeTo.getDateStart());
			projectsOfEmployeeEntity.setDateStop(projectsOfEmployeeTo.getDateStop());
			projectsOfEmployeeEntity.setDailySalary(projectsOfEmployeeTo.getDailySalary());
			projectsOfEmployeeEntity.setRole(projectsOfEmployeeTo.getRole());
			projectsOfEmployeeEntity.setProject(projectsOfEmployeeTo.getProject());
			return projectsOfEmployeeEntity;
		}
		return null;
	}
	
	/**
	 * @param list of ProjectsOfEmployee entities
	 * @return list of ProjectsOfEmployee tos
	 */
	public List<ProjectsOfEmployeeTo> mapProjectsOfEmployee2Tos(List<ProjectsOfEmployeeEntity> projectsOfEmployeeEntities) {
		List<ProjectsOfEmployeeTo> tos = new ArrayList<ProjectsOfEmployeeTo>();
		for (ProjectsOfEmployeeEntity projectsOfEmployee : projectsOfEmployeeEntities) {
			tos.add(map2ProjectsOfEmployeeTo(projectsOfEmployee));
		}
		return tos;
	}
	
	/**
	 * @param list of ProjectsOfEmployee tos
	 * @return list of ProjectsOfEmployee entities
	 */
	public List<ProjectsOfEmployeeEntity> mapProjectsOfEmployee2Entities(List<ProjectsOfEmployeeTo> projectsOfEmployeeTos) {
		List<ProjectsOfEmployeeEntity> entities = new ArrayList<ProjectsOfEmployeeEntity>();
		for (ProjectsOfEmployeeTo projectsOfEmployee : projectsOfEmployeeTos) {
			entities.add(map2ProjectsOfEmployeeEntity(projectsOfEmployee));
		}
		return entities;
	}
	
	
	
	/**
	 * @param Project entity
	 * @return Project to
	 */
	public ProjectTo map2ProjectTo(ProjectEntity projectEntity) {
		if (projectEntity != null) {
			return new ProjectTo(projectEntity.getProjectName(), projectEntity.getProjectType(), mapProjectsOfEmployee2Tos(projectEntity.getProjectsofemployees()));
		}
		return null;
	}
	
	/**
	 * @param Project to
	 * @return Project entity
	 */
	public ProjectEntity map2ProjectEntity(ProjectTo projectTo) {
		if (projectTo != null) {
			return new ProjectEntity(projectTo.getProjectName(), projectTo.getProjectType(), mapProjectsOfEmployee2Entities(projectTo.getProjectsofemployees()));
		}
		return null;
	}
	
	
	/**
	 * @param Employee to
	 * @return Employee entity
	 */
	public EmployeeEntity map2EmployeeEntity(EmployeeTo employeeTo) {
		if (employeeTo != null) {
			return new EmployeeEntity(employeeTo.getIdEmployee(), employeeTo.getDateOfBirth(), employeeTo.getFirstName(), employeeTo.getLastName(), 
					employeeTo.getPesel(), map2DepartmentEntity(employeeTo.getDepartment()), mapProjectsOfEmployee2Entities(employeeTo.getProjectsofemployees()));
		}
		return null;
	}

	/**
	 * @param Employee entity
	 * @return Employee to
	 */
	public EmployeeTo map2EmployeeTo(EmployeeEntity employeeEntity) {
		if (employeeEntity != null) {
			return new EmployeeTo(employeeEntity.getIdEmployee(), employeeEntity.getDateOfBirth(), employeeEntity.getFirstName(), employeeEntity.getLastName(), 
					employeeEntity.getPesel(), map2DepartmentTo(employeeEntity.getDepartment()), mapProjectsOfEmployee2Tos(employeeEntity.getProjectsofemployees()));
		}
		return null;
	}
	
	/**
	 * @param list of Employee entities
	 * @return list of Employee tos
	 */
	public List<EmployeeTo> mapEmployee2Tos(List<EmployeeEntity> employeeEntities) {
		List<EmployeeTo> tos = new ArrayList<EmployeeTo>();
		for (EmployeeEntity employee : employeeEntities) {
			tos.add(map2EmployeeTo(employee));
		}
		return tos;
	}
	
	/**
	 * @param list of Employee tos
	 * @return list of Employee entities
	 */
	public List<EmployeeEntity> mapEmployee2Entities(List<EmployeeTo> employeeTos) {
		List<EmployeeEntity> entities = new ArrayList<EmployeeEntity>();
		for (EmployeeTo employee : employeeTos) {
			entities.add(map2EmployeeEntity(employee));
		}
		return entities;
	}
	
}
