package com.project.projectgroup1.controller;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.service.FeedService;
import com.project.projectgroup1.service.FeedServiceImp;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/feed")
public class FeedController {
    private FeedService feedService;
    private Logger log= LoggerFactory.getLogger(this.getClass().getSimpleName());

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
        List<FeedDto> feedLasterList = feedService.findLatest();
        model.addAttribute("feedtrendList",feedList);
        model.addAttribute("feedLasterList", feedLasterList);
        return "/index";
    }
    @GetMapping("/upload.do")
    public void upload(){

    }

    @PostMapping("/upload.do")
    public String upload(Model model){
        return "/upload";
    }
}
