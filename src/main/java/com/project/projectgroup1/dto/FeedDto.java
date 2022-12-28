package com.project.projectgroup1.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FeedDto {
    private int feedNum;        // feed_num
    private String title;       // title
    private String contents;    // contents
    private int views;          // views
    private String userId;      // user_id
    private Date postTime;      // post_time
    private ImageDto feedImg;
}
