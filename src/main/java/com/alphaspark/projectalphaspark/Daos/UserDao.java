package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.BaseUser;
import com.alphaspark.projectalphaspark.Entities.Client;
import com.alphaspark.projectalphaspark.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository



public interface UserDao extends JpaRepository<BaseUser, Long> {
    Optional<BaseUser> findUserByUserNameIgnoreCase(String username);
    Optional<BaseUser> findUserByUserNameIgnoreCaseAndPassword(String username, String password);
    Long deleteUserByUserNameIgnoreCase(String username);
    List<Client> findClientBy();
    List<Employee> findEmployeeBy();
    Optional<Client> findClientByUserName(String username);
    Optional<Employee> findEmployeeByUserName(String username);
//    @Query("SELECT u FROM BaseUser u WHERE u.user_class = Client")
//    List<Client> getAllClients();
//    @Query("SELECT u FROM BaseUser u WHERE u.user_class = Employee")
//    List<Employee> getAllEmployees();

}
