package pl.employees.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@Table(name="project")
@NamedQuery(name="ProjectEntity.findAll", query="SELECT p FROM ProjectEntity p")
public class ProjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_name")
	private String projectName;

	@Column(name="project_type")
	private String projectType;

	//bi-directional many-to-one association to ProjectsOfEmployeeEntity
	@OneToMany(mappedBy="project")
	private List<ProjectsOfEmployeeEntity> projectsofemployees;

	public ProjectEntity() {
	}
	
	public ProjectEntity(String projectName, String projectType, List<ProjectsOfEmployeeEntity> projectsofemployees) {
		super();
		this.projectName = projectName;
		this.projectType = projectType;
		this.projectsofemployees = projectsofemployees;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public List<ProjectsOfEmployeeEntity> getProjectsofemployees() {
		return this.projectsofemployees;
	}

	public void setProjectsofemployees(List<ProjectsOfEmployeeEntity> projectsofemployees) {
		this.projectsofemployees = projectsofemployees;
	}

	public ProjectsOfEmployeeEntity addProjectsofemployee(ProjectsOfEmployeeEntity projectsofemployee) {
		getProjectsofemployees().add(projectsofemployee);
		projectsofemployee.setProject(this);

		return projectsofemployee;
	}

	public ProjectsOfEmployeeEntity removeProjectsofemployee(ProjectsOfEmployeeEntity projectsofemployee) {
		getProjectsofemployees().remove(projectsofemployee);
		projectsofemployee.setProject(null);

		return projectsofemployee;
	}

}