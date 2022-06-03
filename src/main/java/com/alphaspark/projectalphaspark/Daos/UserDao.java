package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.Users.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<BaseUser, Long> {
    Optional<BaseUser> findByUserNameIgnoreCase(String username);
    Optional<BaseUser> findByUserNameIgnoreCaseAndPassword(String username, String password);
    Long deleteBaseUserByUserNameIgnoreCase(String username);
    List<Client> findClientBy();
    List<Employee> findEmployeeBy();
    List<Developer> findDeveloperBy();
    List<SalesPerson> findSalesPersonBy();
    Optional<Client> findClientByUserName(String username);
    Optional<Employee> findEmployeeByUserName(String username);

//    @Query("SELECT u FROM BaseUser u WHERE u.user_class = Client")
//    List<Client> getAllClients();
//    @Query("SELECT u FROM BaseUser u WHERE u.user_class = Employee")
//    List<Employee> getAllEmployees();

}
