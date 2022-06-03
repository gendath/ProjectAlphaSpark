package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Users.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface UserService {

    List<BaseUser> getAllUsers();
    List<Client> getAllClients();
    List<Employee> getAllEmployees();
    List<Developer> getAllDevelopers();
    List<SalesPerson> getAllSales();

    BaseUser getUser(Long id);
    BaseUser getUser(String username);
    void addUser(BaseUser user, HttpServletRequest request, HttpServletResponse response);
    boolean updateUser(BaseUser user);
    boolean deleteUser(Long id);
    boolean deleteUser(String username);

    BaseUser logIn(BaseUser user, HttpServletRequest request, HttpServletResponse response);
    boolean logOut(HttpServletRequest request);






}
