package pl.employees.model.entity;

import java.io.Serializable;
import javax.persistence.*;


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

	public DepartmentEntity() {
	}
	
	public DepartmentEntity(String departmentName) {
		this.departmentName=departmentName;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}