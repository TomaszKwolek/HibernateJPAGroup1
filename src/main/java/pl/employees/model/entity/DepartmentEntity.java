package pl.employees.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import java.util.List;
import java.util.Set;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name="department")
@NamedQuery(name="DepartmentEntity.findAll", query="SELECT d FROM DepartmentEntity d")
public class DepartmentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="department_name")
	private String departmentName;

	//bi-directional many-to-one association to EmployeeEntity
	@OneToMany(mappedBy="department", cascade = {CascadeType.ALL})
	private Set<EmployeeEntity> employees;

	public DepartmentEntity() {
	}
	
	public DepartmentEntity(String departmentName, Set<EmployeeEntity> employees) {
		this.departmentName=departmentName;
		this.employees=employees;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<EmployeeEntity> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<EmployeeEntity> employees) {
		this.employees = employees;
	}

	public EmployeeEntity addEmployee(EmployeeEntity employee) {
		getEmployees().add(employee);
		employee.setDepartment(this);

		return employee;
	}

	public EmployeeEntity removeEmployee(EmployeeEntity employee) {
		getEmployees().remove(employee);
		employee.setDepartment(null);

		return employee;
	}

}