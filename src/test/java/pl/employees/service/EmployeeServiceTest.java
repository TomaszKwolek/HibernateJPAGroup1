package pl.employees.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.employees.model.to.DepartmentTo;
import pl.employees.model.to.EmployeeTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "EmployeeServiceTest-context.xml")
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldFindAll() {
		// given
		List<EmployeeTo> employees = employeeService.findAllEmployees();
		// then
		assertFalse(employees.isEmpty());
	}

	@Test
	@Sql(scripts = "inserts.sql")
	@Ignore
	public void testShouldDeleteAll() {
		// given
		employeeService.deleteAll();
		List<EmployeeTo> employees = employeeService.findAllEmployees();
		// // then
		assertTrue(employees.isEmpty());
	}

	@Test
	@Sql(scripts = "deleteAll.sql")
	public void testShouldDeleteEmployee() {
		DepartmentTo departmentTo = new DepartmentTo();
		departmentTo.setDepartmentName("FINANCIAL");
		List<ProjectsOfEmployeeTo> poes = new ArrayList<>();
		EmployeeTo employeeTo = new EmployeeTo(1, new Date(2001 - 07 - 15), "name", "lastname", "111111111",
				departmentTo, poes);
		employeeService.createOrUpdateEmployee(employeeTo);
		long id= employeeService.findAllEmployees().get(0).getIdEmployee();
		// given
		employeeService.deleteEmployee(id);
		List<EmployeeTo> employees = employeeService.findAllEmployees();
		// // then
		System.out.println(employees.size());
		assertTrue(employees.isEmpty());
	}

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldFindByName() {
		// given
		List<EmployeeTo> employees = employeeService.findbyName("%a%");
		// then
		assertFalse(employees.isEmpty());
	}

	@Test
	@Sql(scripts = "deleteAll.sql")
	public void testShouldCreateNewEmployee() {
		// given
		DepartmentTo departmentTo = new DepartmentTo();
		departmentTo.setDepartmentName("FINANCIAL");
		List<ProjectsOfEmployeeTo> poes = new ArrayList<>();
		EmployeeTo employeeTo = new EmployeeTo(6, new Date(2001 - 07 - 15), "Jarosław", "Was", "345465634",
				departmentTo, poes);
		employeeService.createOrUpdateEmployee(employeeTo);
		List<EmployeeTo> employees = employeeService.findAllEmployees();
		// then
		assertFalse(employees.isEmpty());
		assertEquals(employees.size(), 1);

	}

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldUpdateEmployee() {
		// given
		DepartmentTo departmentTo = new DepartmentTo();
		departmentTo.setDepartmentName("FINANCIAL");
		List<ProjectsOfEmployeeTo> poes = new ArrayList<>();
		EmployeeTo employeeTo = new EmployeeTo(8, new Date(2001 - 07 - 15), "Jarosław", "Was", "345465634",
				departmentTo, poes);
		employeeService.createOrUpdateEmployee(employeeTo);
		// then
		List<EmployeeTo> employees = employeeService.findbyName("%Jarosław%");
		assertFalse(employees.isEmpty());
	}

}
