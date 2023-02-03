package com.project.projectgroup1.controller;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.service.FeedService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BaseController {
    private FeedService feedService;

    public BaseController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/")
    public String list(Model model,
                       HttpServletRequest req){
        List<FeedDto> feedList = feedService.trendList();
        List<FeedDto> feedLasterList = feedService.findLatest();
        model.addAttribute("feedtrendList",feedList);
        model.addAttribute("feedLasterList", feedLasterList);
        return "/index";
    }
}
