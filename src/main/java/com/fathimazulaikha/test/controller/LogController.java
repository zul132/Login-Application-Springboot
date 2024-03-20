package com.fathimazulaikha.test.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fathimazulaikha.test.domain.Login;
import com.fathimazulaikha.test.service.LogService;

@Controller
public class LogController {
 
    @Autowired
    private LogService service;
 
    @PostMapping("/log")
    public String login(@ModelAttribute("user") Login user) {
 
        Login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/login";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }
}

