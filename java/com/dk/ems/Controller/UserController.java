package com.dk.ems.Controller;

import com.dk.ems.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/newuser")
    public String registerUser(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("passwd") String passwd) {
        userService.createUser(name, email, passwd);
        return "Success";
    }

    @GetMapping("/olduser")
    public String loginUser(@RequestParam("email") String email,
                            @RequestParam("passwd") String passwd){
        boolean res = userService.findEmail(email);
        if(res==true){
            return "User found";
        }else{
            return "User not found";
        }
    }

}
