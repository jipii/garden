package com.jipescu.garden.controller;

import com.jipescu.garden.model.UserData;
import com.jipescu.garden.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getIndex() {
        return "index";
    }

    @GetMapping("/register")
    public String getRegister(Model model) {
        model.addAttribute("user", new UserData());
        return "register";
    }

    @GetMapping("/error")
    public String getError() {
        return "error";
    }

    @PostMapping("/register/save")
    public UserData registerUser(@RequestBody UserData userData) {
        return userService.register(userData);
    }
}
