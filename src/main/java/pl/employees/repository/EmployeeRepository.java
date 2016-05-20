package pl.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.employees.model.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	
    @Query("from EmployeeEntity e where e.firstName like :name% or e.lastName like :name%")
    List<EmployeeEntity> findByName(@Param("name") String name);
    
    @Modifying(clearAutomatically = true)
    @Query("delete from EmployeeEntity")
    void deleteAllEmployees();
    
    @Modifying(clearAutomatically = true)
    @Query("delete EmployeeEntity e where e.idEmployee = ?1")
    void deleteEmployee(long employeeId);
	
	
}
