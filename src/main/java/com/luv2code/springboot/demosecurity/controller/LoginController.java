package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/showingLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }

    //  Add request mapping for / access-denied
    @RequestMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }
}
