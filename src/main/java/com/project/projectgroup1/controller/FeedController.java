package com.project.projectgroup1.controller;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.service.FeedService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/feed")
public class FeedController {
    private FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/feed.do")
    public String feed(){

        return "/feed";
    }

    @GetMapping("/list.do")
    public String list(Model model,
                       HttpServletRequest req){
        List<FeedDto> feedList = feedService.trendList();
        model.addAttribute("feedtrendList",feedList);
        return "/index";
    }
}
