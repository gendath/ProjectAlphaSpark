package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository

public interface EmployeeDao extends JpaRepository<Employee, Long> {

//    Optional<Employee> findEmployeeByUserNameIgnoreCase(String username);
//    Optional<Employee> findEmployeeByUserNameIgnoreCaseAndPassword(String username, String password);


}
