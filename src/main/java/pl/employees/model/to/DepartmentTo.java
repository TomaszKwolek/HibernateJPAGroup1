package pl.employees.model.to;

import java.util.Set;

import pl.employees.model.entity.EmployeeEntity;

public class DepartmentTo {
	
	private String departmentName;
	private Set<EmployeeEntity> employees;
	
	public DepartmentTo() {
	}
	
	public DepartmentTo(String departmentName, Set<EmployeeEntity> employees) {
		this.departmentName=departmentName;
		this.employees=employees;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Set<EmployeeEntity> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<EmployeeEntity> employees) {
		this.employees = employees;
	}
	
	
}
