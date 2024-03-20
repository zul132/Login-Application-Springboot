package com.fathimazulaikha.test.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fathimazulaikha.test.domain.Login;
import com.fathimazulaikha.test.domain.Register;
import com.fathimazulaikha.test.service.RegService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RegController {

    @Autowired
    private RegService regService;

    @GetMapping("/")
    public String api()
    {
 
        return "register";
    }

    @PostMapping("path")
    public String register(@ModelAttribute("user")  Register user)
    {
        Login newUser = regService.saveUser(user.getUsername(), user.getPassword(), user.getConfirm());
        
        System.out.println(newUser);
        if(Objects.nonNull(newUser)){
            return "redirect:/login";
        }else {
            return "redirect:/";
        }
    }

    @GetMapping("/login")
    public String login()
    {
        return "log";
    }
} 
