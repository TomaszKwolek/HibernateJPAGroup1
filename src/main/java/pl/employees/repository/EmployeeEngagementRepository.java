package pl.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.employees.model.entity.ProjectEntity;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;

public interface EmployeeEngagementRepository extends JpaRepository<ProjectsOfEmployeeEntity, Long> {
	
    @Query("from ProjectsOfEmployeeEntity poe join fetch poe.employee e where project_name=?1 and pesel=?2 and poe.dateStop is null")
    List<ProjectsOfEmployeeEntity> findProjectsOfEmployee(String projectName, String pesel);
	
}
