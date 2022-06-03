package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Daos.UserDao;
import com.alphaspark.projectalphaspark.Entities.Users.*;
import com.alphaspark.projectalphaspark.Enums.Authority;
import org.apache.catalina.User;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<BaseUser> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public List<Client> getAllClients() {
        return userDao.findClientBy();
//        return userdao.findAll().stream().map(x -> (x instanceof Client)?(Client)x:null)
//                .filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return userDao.findEmployeeBy();
    }

    @Override
    public List<Developer> getAllDevelopers() {
        return userDao.findDeveloperBy();
    }

    @Override
    public List<SalesPerson> getAllSales() {
        return userDao.findSalesPersonBy();
    }

    @Override
    public BaseUser getUser(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public BaseUser getUser(String username) {
        return userDao.findByUserNameIgnoreCase(username).orElse(null);
    }

    @Override
    public void addUser(BaseUser user, HttpServletRequest request, HttpServletResponse response) {
        PrintWriter writer;
        try {
            writer = response.getWriter();
            if (writer == null) throw new IOException();
        } catch (IOException e) {
            writer = new PrintWriter(System.out);
        }
        if (userDao.findByUserNameIgnoreCase(user.getUserName()).isPresent()){
            //writer.println("User with this name already exists!");
            try {
                response.sendError(304);
            } catch (IOException e) {
                response.setStatus(304);
            }
        }
//        logIn(userDao.save(user), request, response);
//        writer.printf("User %s created successfully \n", user.getUserName());
        response.setStatus(201);
        JSONObject json = new JSONObject();
        json.put("status", "success");
        json.put("message", String.format("User %s created successfully", user.getUserName()));
        json.put("user", user);
        writer.println(json.toString());
    }

    @Override
    public boolean updateUser(BaseUser user) {
        userDao.save(user);

        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        userDao.deleteById(id);

        return true;
    }

    @Override
    public boolean deleteUser(String username) {
        var deleteUser = userDao.findByUserNameIgnoreCase(username);

        if (deleteUser.isEmpty()) return false;

        userDao.delete(deleteUser.get());
        return true;
    }

    @Override
    public BaseUser logIn(BaseUser user, HttpServletRequest request, HttpServletResponse response) {
        logOut(request);
        var userObj = userDao.findByUserNameIgnoreCaseAndPassword(user.getUserName(), user.getPassword());

        if (userObj.isEmpty()) return null;

        request.getSession().setAttribute("username", userObj.get().getUserName());

        request.getSession().setAttribute("authority", userObj.get().getAccessLvl());

        try {
            request.authenticate(response);
        } catch (Exception e) {

        }
        BaseUser current = new BaseUser();
        current.setUserName(user.getUserName());
        return current;
    }

    @Override
    public boolean logOut(HttpServletRequest request) {
        try {
            request.getSession().setAttribute("username", "");

            request.getSession().setAttribute("authority", Authority.MINIMUM);

            request.logout();

            request.getSession().invalidate();

            return true;

        }catch (Exception e){
            return false;

        }
    }
}
