package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Daos.EmployeeDao;
import com.alphaspark.projectalphaspark.Entities.Employee;
import com.alphaspark.projectalphaspark.Entities.User;
import com.alphaspark.projectalphaspark.Enums.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

@Autowired
    private final EmployeeDao employeeDao;



    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllUsers() {
        return employeeDao.findAll();
    }

    @Override
    public User getUser(Long id) {
        return employeeDao.findById(id).orElse(null);
    }

    @Override
    public User getUser(String username) {
        return null;
//        return employeeDao.findEmployeeByUserNameIgnoreCase(username).orElse(null);
    }

    @Override
    public boolean addUser(Employee user, HttpServletRequest request, HttpServletResponse response) {

        PrintWriter writer;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            writer = new PrintWriter(System.out);
        }
//        if (employeeDao.findEmployeeByUserNameIgnoreCase(user.getUserName()).isPresent()){
//            writer.println("User with this name already exists!");
//            return false;
//        }
        logIn(employeeDao.save(user), request, response);
        writer.printf("User %s created successfully \n", user.getUserName());
        return true;
    }

    @Override
    public boolean updateUser(User user) {
//        userdao.save(user);

        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        employeeDao.deleteById(id);

        return true;
    }

    @Override
    public boolean deleteUser(String username) {
//        var deleteuser = userdao.findUserByUserNameIgnoreCase(username);
//
//        if (deleteuser.isEmpty()) return false;
//
//        userdao.delete(deleteuser.get());
        return true;
    }

    @Override
    public User logIn(User user, HttpServletRequest request, HttpServletResponse response) {
//        logOut(request);
//        var userObj = employeeDao.findEmployeeByUserNameIgnoreCaseAndPassword(user.getUserName(), user.getPassword());
//
//        if (userObj.isEmpty()) return null;
//
//        request.getSession().setAttribute("username", userObj.get().getUserName());
//
//        request.getSession().setAttribute("authority", userObj.get().getAccessLvl());
//
//        try {
//            request.authenticate(response);
//        } catch (Exception e) {
//
//        }
//        User current = new User();
//        current.setUserName(user.getUserName());
//        return current;
        return null;
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