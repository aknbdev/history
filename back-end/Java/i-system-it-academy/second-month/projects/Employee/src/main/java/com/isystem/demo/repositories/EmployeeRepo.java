package com.isystem.demo.repositories;
import com.isystem.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.email = :email")
    Optional<Employee> findByEmail(@Param("email") String requestEmail);

    List<Employee> findAllByJobTitle(String requestJob);

    Optional<Employee> findByPhone(String phone);
}
