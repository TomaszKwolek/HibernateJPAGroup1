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
import pl.employees.model.to.ProjectTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "EmployeeServiceTest-context.xml")
public class EmployeeEngagementServiceTest {

	@Autowired
	private EmployeesEngagementService employeeEngagementService;

//	@Test
//	@Sql(scripts = "inserts.sql")
//	public void testShouldFindAll() {
//		// given
//		List<ProjectsOfEmployeeTo> poes = employeeEngagementService.findAllProjectsEngagements();
//		// then
//		System.out.println(poes.size());
//		assertFalse(poes.isEmpty());
//	}
//	
//	@Test
//	@Sql(scripts = "inserts.sql")
//	public void testShouldFindProjectsOfEmployees() {
//		// given
//		List<ProjectsOfEmployeeTo> poes = employeeEngagementService.findProjectsEngagement(10L, "ETH Zurych");
//		int expectedSizeOfPoes = poes.size();
//		// then
//		System.out.println(poes.size());
//		assertFalse(poes.isEmpty());
//		assertEquals(expectedSizeOfPoes, 1);
//	}
	
	@Test
	@Sql(scripts = "deleteAll.sql")
	public void testShouldCreateNewPOE() {
	// given
	ProjectTo projectTo = new ProjectTo();
	projectTo.setProjectName("new project");
	projectTo.setProjectType("internal");
	
	ProjectsOfEmployeeTo poeTo = new ProjectsOfEmployeeTo();
	poeTo.setProject(projectTo);
	employeeEngagementService.createEmployeeEngagement(poeTo);
	
	
	
//	List<ProjectsOfEmployeeTo> poes = new ArrayList<>();
//	EmployeeTo employeeTo = new EmployeeTo(6, new Date(2001 - 07 - 15), "Jarosław", "Was", "345465634",
//			departmentTo, poes);
//	employeeService.createOrUpdateEmployee(employeeTo);
//	List<EmployeeTo> employees = employeeService.findAllEmployees();
//	// then
//	assertFalse(employees.isEmpty());
//	assertEquals(employees.size(), 1);
	}

}
