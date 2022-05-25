package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Entities.Client;
import com.alphaspark.projectalphaspark.Entities.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Override
    public List<User> getAllClients() {
        return null;
    }

    @Override
    public User getClient(Long id) {
        return null;
    }

    @Override
    public User getClient(String username) {
        return null;
    }

    @Override
    public boolean addClient(User user, HttpServletRequest request, HttpServletResponse response) {
        return false;
    }

    @Override
    public boolean updateClient(User user) {
        return false;
    }

    @Override
    public boolean deleteClient(Long id) {
        return false;
    }

    @Override
    public boolean deleteClient(String username) {
        return false;
    }

    @Override
    public User logIn(Client user, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public boolean logOut(HttpServletRequest request) {
        return false;
    }
}
