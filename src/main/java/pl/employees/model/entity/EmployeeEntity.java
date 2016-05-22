package pl.employees.model.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.util.Date;
import java.util.List;

/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name = "employee")
@NamedQuery(name = "EmployeeEntity.findAll", query = "SELECT e FROM EmployeeEntity e")
public class EmployeeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_employee")
	private long idEmployee;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String pesel;
	@ManyToOne( cascade = {CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name = "department_name")
	private DepartmentEntity department;

	public EmployeeEntity() {
	}

	public EmployeeEntity(long idEmployee, Date dateOfBirth, String firstName, String lastName, String pesel,
			DepartmentEntity department) {
		this.idEmployee = idEmployee;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pesel = pesel;
		this.department = department;

	}

	public long getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public DepartmentEntity getDepartment() {
		return this.department;
	}

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}


}