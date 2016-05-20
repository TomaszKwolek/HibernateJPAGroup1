package pl.employees.model.to;

import java.util.List;


public class ProjectTo {

	private String projectName;
	private String projectType;
	private List<ProjectsOfEmployeeTo> projectsofemployees;
	
	public ProjectTo() {
	}
	
	public ProjectTo(String projectName, String projectType) {
		this.projectName = projectName;
		this.projectType = projectType;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	
}
