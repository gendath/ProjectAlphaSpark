package com.alphaspark.projectalphaspark.Controllers;

import com.alphaspark.projectalphaspark.Entities.Users.BaseUser;
import com.alphaspark.projectalphaspark.Entities.Users.Client;
import com.alphaspark.projectalphaspark.Entities.Users.Employee;
import com.alphaspark.projectalphaspark.Services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //create
    @PostMapping("/new")
    public void createUser(@RequestBody BaseUser baseUser, HttpServletRequest request, HttpServletResponse response) {
        userService.addUser(baseUser, request, response);
    }

    //read all
    @GetMapping({"/", ""})
    public List<BaseUser> listAllUsers(){
        return userService.getAllUsers();
    }

    public List<Client> listAllClients() {
        return userService.getAllClients();
    }

    public List<Employee> listAllEmployees() {
        return userService.getAllEmployees();
    }

    //read one
    @GetMapping("/{userID}")
    public BaseUser displaySingleUser(@PathVariable Long userID){
        return userService.getUser(userID);
    }

    //update
    @PutMapping("/update")
    public boolean updateUser(@RequestBody BaseUser user){
        return userService.updateUser(user);
    }

    //delete
    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestBody BaseUser user){
        return userService.deleteUser(user.getId());
    }

    @PostMapping("/login")
    public void loginUser(@RequestBody BaseUser user, HttpServletRequest request, HttpServletResponse response) {
        userService.logIn(user, request, response);
    }

}
