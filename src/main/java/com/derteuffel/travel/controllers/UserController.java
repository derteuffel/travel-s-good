package com.derteuffel.travel.controllers;

import com.derteuffel.travel.entities.User;
import com.derteuffel.travel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("user",new User());

        return "user/form";
    }
}
