package com.fathimazulaikha.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fathimazulaikha.test.service.RegService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RegController {

    @Autowired
    private RegService reg_service;

    @GetMapping("/reg")
    public String api2() {
        return "register";
    }
    

}
