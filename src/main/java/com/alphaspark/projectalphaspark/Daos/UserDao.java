package com.alphaspark.projectalphaspark.Daos;

<<<<<<< HEAD
import com.alphaspark.projectalphaspark.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

    User findUserByUserNameIgnoreCase(String username);
    User findUserByUserNameIgnoreCaseAndPassword(String username, String password);
=======
public class UserDao {

>>>>>>> EntitySetup

}
