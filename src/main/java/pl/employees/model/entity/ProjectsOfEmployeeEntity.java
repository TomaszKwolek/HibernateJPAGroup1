package pl.employees.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the projectsofemployees database table.
 * 
 */
@Entity
@Table(name = "projectsofemployees")
@NamedQuery(name = "ProjectsOfEmployeeEntity.findAll", query = "SELECT p FROM ProjectsOfEmployeeEntity p")
public class ProjectsOfEmployeeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_projects_of_employees")
	private long idProjectsOfEmployees;

	@ManyToOne(optional = true, cascade = { CascadeType.ALL})
	@JoinColumn(name = "id_employee")
	private EmployeeEntity employee;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "project_name")
	private ProjectEntity project;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_start")
	private Date dateStart;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_stop")
	private Date dateStop;

	private String role;

	@Column(name = "daily_salary")
	private BigDecimal dailySalary;

	public ProjectsOfEmployeeEntity() {
	}

	public ProjectsOfEmployeeEntity(long idProjectsOfEmployees, EmployeeEntity employee, ProjectEntity project,
			Date dateStart, Date dateStop, String role, BigDecimal dailySalary) {
		super();
		this.idProjectsOfEmployees = idProjectsOfEmployees;
		this.employee = employee;
		this.project = project;
		this.dateStart = dateStart;
		this.dateStop = dateStop;
		this.role = role;
		this.dailySalary = dailySalary;
	}

	public long getIdProjectsOfEmployees() {
		return idProjectsOfEmployees;
	}

	public void setIdProjectsOfEmployees(long idProjectsOfEmployees) {
		this.idProjectsOfEmployees = idProjectsOfEmployees;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public ProjectEntity getProject() {
		return project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateStop() {
		return dateStop;
	}

	public void setDateStop(Date dateStop) {
		this.dateStop = dateStop;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getDailySalary() {
		return dailySalary;
	}

	public void setDailySalary(BigDecimal dailySalary) {
		this.dailySalary = dailySalary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}