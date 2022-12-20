package com.project.projectgroup1.controller;



import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class libraryController {
    @GetMapping("library.do")
    public String Library(Model model,
                          HttpServletRequest req){

        return "/library";
    }
}
