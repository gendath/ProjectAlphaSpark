package com.alphaspark.projectalphaspark.Services;

import com.alphaspark.projectalphaspark.Daos.UserDao;
import com.alphaspark.projectalphaspark.Entities.BaseUser;
import com.alphaspark.projectalphaspark.Enums.Authority;
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
    UserDao userdao;

    @Override
    public List<BaseUser> getAllUsers() {
        return userdao.findAll();
    }

    @Override
    public BaseUser getUser(Long id) {
        return userdao.findById(id).orElse(null);
    }

    @Override
    public BaseUser getUser(String username) {
        return userdao.findUserByUserNameIgnoreCase(username).orElse(null);
    }

    @Override
    public boolean addUser(BaseUser user, HttpServletRequest request, HttpServletResponse response) {
        PrintWriter writer;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            writer = new PrintWriter(System.out);
        }
        if (userdao.findUserByUserNameIgnoreCase(user.getUserName()).isPresent()){
            writer.println("User with this name already exists!");
            return false;
        }
        logIn(userdao.save(user), request, response);
        writer.printf("User %s created successfully \n", user.getUserName());
        return true;
    }

    @Override
    public boolean updateUser(BaseUser user) {
        userdao.save(user);

        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        userdao.deleteById(id);

        return true;
    }

    @Override
    public boolean deleteUser(String username) {
        var deleteuser = userdao.findUserByUserNameIgnoreCase(username);

        if (deleteuser.isEmpty()) return false;

        userdao.delete(deleteuser.get());
        return true;
    }

    @Override
    public BaseUser logIn(BaseUser user, HttpServletRequest request, HttpServletResponse response) {
        logOut(request);
        var userObj = userdao.findUserByUserNameIgnoreCaseAndPassword(user.getUserName(), user.getPassword());

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
