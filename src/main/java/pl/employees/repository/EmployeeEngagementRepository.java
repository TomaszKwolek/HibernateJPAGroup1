package pl.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.employees.model.entity.ProjectEntity;
import pl.employees.model.entity.ProjectsOfEmployeeEntity;

public interface EmployeeEngagementRepository extends JpaRepository<ProjectsOfEmployeeEntity, Long> {
	
    @Query("from ProjectsOfEmployeeEntity poe where id_employee=?1 and project_name=?2 and dateStop is null")
    List<ProjectsOfEmployeeEntity> findProjectsOfEmployee(long idEmployee, String projectName);
    //long idPOE, String projectName
//    @Modifying(clearAutomatically = true)
//    @Query("delete from EmployeeEntity")
//    void deleteAllEmployees();
//    
//    @Modifying(clearAutomatically = true)
//    @Query("delete EmployeeEntity e where e.idEmployee = ?1")
//    void deleteEmployee(long employeeId);
	
	
}
