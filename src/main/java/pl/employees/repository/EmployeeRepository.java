package pl.employees.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.employees.model.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	
    @Query("from EmployeeEntity l where l.firstName like :name%")
    List<EmployeeEntity> findByName(@Param("name") String name);

//	@Modifying(clearAutomatically = true)
//	@Query(value = "insert into EmployeeEntity (idEmployee) VALUES (:29)")
//	  void insertEmployee(Date date_of_birth, String first_name, String last_name, String pesel);
//	
//	@Modifying(clearAutomatically = true)
//	@Query("update Employee e set e.name = :name, e.surname = :surname, e.pesel = :pesel, e.dateOfBirth = :dateOfBirth where e.id = :id")
//	void updateEmployeeData(@Param("name") String name, @Param("surname") String surname,
//			@Param("pesel") String pesel, @Param("dateOfBirth") Date dateOfBirth, @Param("id") int id);
	
}
