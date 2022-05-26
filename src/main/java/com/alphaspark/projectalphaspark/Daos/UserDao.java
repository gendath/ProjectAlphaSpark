package com.alphaspark.projectalphaspark.Daos;

import com.alphaspark.projectalphaspark.Entities.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserDao extends JpaRepository<BaseUser, Long> {

    Optional<BaseUser> findUserByUserNameIgnoreCase(String username);
    Optional<BaseUser> findUserByUserNameIgnoreCaseAndPassword(String username, String password);


}
