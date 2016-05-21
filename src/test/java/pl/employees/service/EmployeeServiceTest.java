package pl.employees.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.employees.model.to.EmployeeTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "EmployeeServiceTest-context.xml")
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testShouldFindAll() {
		// given
		 List<EmployeeTo> employees = employeeService.findAllEmployees();
		 System.out.println(employees.size());
		// then
		assertNotNull(employees);

	}
	
	@Test
	public void testShouldFindByFirstName() {
		// given
		 List<EmployeeTo> employees = employeeService.findByFirstName("%a%");
		 System.out.println(employees.size());
		// then
		assertNotNull(employees);

	}
	
	@Test
	public void testShouldCreateNewEmployee() {
		// given
		employeeService.createEmployee();
		//System.out.println(employees.size());
		// then
		//assertNotNull(employees);

	}
	
	@Test
	public void testShouldDeleteAll() {
		// given
		employeeService.deleteAll();
		//System.out.println(employees.size());
		// then
		//assertNotNull(employees);

	}
	
	@Test
	@Ignore
	public void testShouldDelete() {

	}
	
	@Test
	public void testShouldUpdateEmployee() {
		// given
		//System.out.println(employees.size());
		employeeService.updateEmployee(2, null,"update", "employee", null);
		// then
		//assertNotNull(employees);

	}


}
