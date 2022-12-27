package com.project.projectgroup1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
//    @GetMapping("/login.do")
//    public void login(){
//
//    }
    @PostMapping("/login.do")
    public String login(){
        return "/feed";
    }
}
