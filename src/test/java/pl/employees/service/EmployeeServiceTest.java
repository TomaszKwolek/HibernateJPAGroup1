package pl.employees.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

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
		employeeService.createEmployee(23,new Date(2013-04-12), "aaa", "bbb", "223456546");
		//System.out.println(employees.size());
		// then
		//assertNotNull(employees);

	}


}
