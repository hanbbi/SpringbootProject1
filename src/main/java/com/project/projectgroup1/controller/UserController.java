package com.project.projectgroup1.controller;

import com.project.projectgroup1.dto.UserDto;
import com.project.projectgroup1.mapper.UserMapper;
import com.project.projectgroup1.service.UserService;
import com.project.projectgroup1.service.UserServiceImp;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }
//    @GetMapping("/login.do")
//    public void login(){
//
//    }
    @PostMapping("/login.do")
    public String login(@RequestParam(name="user_id") String userId,
                        String pw,
                        HttpSession session){
        System.out.println(userId);
        System.out.println(pw);
        UserDto user = userService.login(userId,pw);
        session.setAttribute("loginUser",user);
        System.out.println(user);
        if(user==null){
            session.setAttribute("msg","아이디 비밀번호를 확인해주세요");
            return "redirect:/";
        } else {
            session.removeAttribute("msg");
            return "redirect:/feed.do";
        }
    }
    @GetMapping("/logout.do")
    public String logout(HttpSession session){
//        session.invalidate();   //전체 만료
        session.removeAttribute("loginUser");
        return "redirect:/";

    }
}
