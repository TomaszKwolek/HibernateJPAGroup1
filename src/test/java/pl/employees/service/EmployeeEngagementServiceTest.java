package pl.employees.service;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.employees.model.to.EmployeeTo;
import pl.employees.model.to.ProjectTo;
import pl.employees.model.to.ProjectsOfEmployeeTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "EmployeeServiceTest-context.xml")
public class EmployeeEngagementServiceTest {

	@Autowired
	private EmployeesEngagementService employeeEngagementService;

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldFindAll() {
		// given
		List<ProjectsOfEmployeeTo> poes = employeeEngagementService.findAllProjectsEngagements();
		// then
		assertEquals(16, poes.size());
	}

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldFindCurrentProjectsOfEmployees() {
		// given
		List<ProjectsOfEmployeeTo> poes = employeeEngagementService.findCurrentProjectsEngagement("68071306911","ETH Zurych");
		int expectedSizeOfPoes = poes.size();
		// then
		System.out.println(poes.size() + " ");
		assertFalse(poes.isEmpty());
		assertEquals(expectedSizeOfPoes, 1);
		assertEquals(poes.get(0).getEmployee().getPesel(), "68071306911");
		assertEquals(poes.get(0).getProject().getProjectName(), "ETH Zurych");

	}

	@Test
	@Sql(scripts = "deleteAll.sql")
	public void testShouldCreateNewPOE() throws ParseException {
		// given
		ProjectsOfEmployeeTo poeTo = new ProjectsOfEmployeeTo();
		poeTo.setProject(createNewProject("New Project", "internal"));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date startDate = dateFormat.parse("2002/08/03"); 
		// when
		poeTo.setDateStart(startDate);
		employeeEngagementService.saveEmployeeEngagement(poeTo);
		// then
		List<ProjectsOfEmployeeTo> poes = employeeEngagementService.findAllProjectsEngagements();
		assertFalse(poes.isEmpty());
		assertEquals(poes.get(0).getProject().getProjectName(), "New Project");
	}

	@Test
	@Sql(scripts = "deleteAll.sql")
	public void testShouldAddEmployee() throws ParseException {
		// given
		ProjectsOfEmployeeTo poeTo = new ProjectsOfEmployeeTo();
		poeTo.setProject(createNewProject("New Project", "internal"));
		EmployeeTo employeeTo = createNewEmployee("2002/08/03", "Andrzej", "Kowalaski", "049239430");
		poeTo.setEmployee(employeeTo);
		// when
		employeeEngagementService.saveEmployeeEngagement(poeTo);
		// then
		List<ProjectsOfEmployeeTo> addedPoes = employeeEngagementService.findAllProjectsEngagements();
		assertFalse(addedPoes.isEmpty());
		assertEquals(employeeTo.getPesel(), addedPoes.get(0).getEmployee().getPesel());
	}

	@Test
	@Sql(scripts = "inserts.sql")
	public void testShouldRemoveEmployyeFromProject() throws ParseException {
		// given
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date stopDate = dateFormat.parse("2016/08/03");
		// when
		employeeEngagementService.removeEmployeeFromProject("68071306911", "ETH Zurych", stopDate);
		// then
		List<ProjectsOfEmployeeTo> foundPoes = employeeEngagementService.findCurrentProjectsEngagement("68071306911","ETH Zurych");
		assertTrue(foundPoes.isEmpty());

	}

	private EmployeeTo createNewEmployee(String dateOfBirth, String firstName, String lastName, String Pesel) throws ParseException {
		EmployeeTo employeeTo = new EmployeeTo();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = dateFormat.parse(dateOfBirth);
		employeeTo.setDateOfBirth(date);
		employeeTo.setFirstName(firstName);
		employeeTo.setLastName(lastName);
		employeeTo.setPesel(Pesel);
		return employeeTo;
	}

	private ProjectTo createNewProject(String projectName, String projectType) {
		ProjectTo projectTo = new ProjectTo();
		projectTo.setProjectName(projectName);
		projectTo.setProjectType(projectType);
		return projectTo;
	}

}
