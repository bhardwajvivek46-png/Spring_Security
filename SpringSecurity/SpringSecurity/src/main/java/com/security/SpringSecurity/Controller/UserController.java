package com.security.SpringSecurity.Controller;

import com.security.SpringSecurity.Entity.Users;
import com.security.SpringSecurity.StudentService.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verify(user);
    }

}
