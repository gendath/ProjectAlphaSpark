package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    User getUser(String username);

    boolean addUser(User user, HttpServletRequest request, HttpServletResponse response);

    boolean updateUser(User user);

    boolean deleteUser(Long id);

    boolean deleteUser(String username);

    User logIn(User user, HttpServletRequest request, HttpServletResponse response);

    boolean logOut(HttpServletRequest request);






}
