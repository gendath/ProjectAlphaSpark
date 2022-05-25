package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Client;
import com.alphaspark.projectalphaspark.Entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ClientService {

    List<User> getAllClients();

    User getClient(Long id);

    User getClient(String username);

    boolean addClient(User user, HttpServletRequest request, HttpServletResponse response);

    boolean updateClient(User user);

    boolean deleteClient(Long id);

    boolean deleteClient(String username);

    User logIn(Client user, HttpServletRequest request, HttpServletResponse response);

    boolean logOut(HttpServletRequest request);






}
