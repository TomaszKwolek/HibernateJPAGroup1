package pl.employees.model.to;

import java.math.BigDecimal;
import java.util.Date;

import pl.employees.model.entity.EmployeeEntity;
import pl.employees.model.entity.ProjectEntity;


public class ProjectsOfEmployeeTo {
	

	private int idProjectsOfEmployees;
	private BigDecimal dailySalary;
	private Date dateStart;
	private Date dateStop;
	private String role;
	private EmployeeEntity employee;
	private ProjectEntity project;
	
	public ProjectsOfEmployeeTo() {
	}	
	
	public ProjectsOfEmployeeTo(int idProjectsOfEmployees, BigDecimal dailySalary, Date dateStart, Date dateStop,
			String role, EmployeeEntity employee, ProjectEntity project) {
		super();
		this.idProjectsOfEmployees = idProjectsOfEmployees;
		this.dailySalary = dailySalary;
		this.dateStart = dateStart;
		this.dateStop = dateStop;
		this.role = role;
		this.employee = employee;
		this.project = project;
	}
	
	public int getIdProjectsOfEmployees() {
		return idProjectsOfEmployees;
	}
	public void setIdProjectsOfEmployees(int idProjectsOfEmployees) {
		this.idProjectsOfEmployees = idProjectsOfEmployees;
	}
	public BigDecimal getDailySalary() {
		return dailySalary;
	}
	public void setDailySalary(BigDecimal dailySalary) {
		this.dailySalary = dailySalary;
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
	

		
}
