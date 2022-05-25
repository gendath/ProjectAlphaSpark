package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository

public interface ClientDao extends JpaRepository<Client, Long> {

//    Optional<User> findUserByUserNameIgnoreCase(String username);
//    Optional<User> findUserByUserNameIgnoreCaseAndPassword(String username, String password);


}
