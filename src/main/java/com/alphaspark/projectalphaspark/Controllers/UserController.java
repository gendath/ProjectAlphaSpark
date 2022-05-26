package com.alphaspark.projectalphaspark.Controllers;

import com.alphaspark.projectalphaspark.Entities.BaseUser;
import com.alphaspark.projectalphaspark.Services.UserService;
import org.springframework.web.bind.annotation.*;

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
    public String createUser(){
        return null;
    }

    //read all
    @GetMapping({"/", ""})
    public List<BaseUser> listAllUsers(){
        return userService.getAllUsers();
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

}
