package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserDao extends JpaRepository<User, Long> {

    Optional<User> findUserByUserNameIgnoreCase(String username);
    Optional<User> findUserByUserNameIgnoreCaseAndPassword(String username, String password);


}
