package pl.employees.model.to;

import java.util.Date;
import java.util.List;


public class EmployeeTo {
	
	private int idEmployee;
	private Date dateOfBirth;
	private String firstName;
	private String lastName;
	private String pesel;
	private DepartmentTo department;
	private List<ProjectsOfEmployeeTo> projectsofemployees;
	
	public EmployeeTo() {
	}
	
	public EmployeeTo(int idEmployee, Date dateOfBirth, String firstName, String lastName, String pesel, DepartmentTo department, 
							List<ProjectsOfEmployeeTo> projectsofemployees) {
		this.idEmployee=idEmployee;
		this.dateOfBirth=dateOfBirth;
		this.firstName=firstName;
		this.lastName=lastName;
		this.pesel=pesel;
		this.department=department;
		this.projectsofemployees=projectsofemployees;
	}
	
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public DepartmentTo getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentTo department) {
		this.department = department;
	}
	public List<ProjectsOfEmployeeTo> getProjectsofemployees() {
		return projectsofemployees;
	}
	public void setProjectsofemployees(List<ProjectsOfEmployeeTo> projectsofemployees) {
		this.projectsofemployees = projectsofemployees;
	}
	
	
}
