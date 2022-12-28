package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.FeedDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedMapperTest {
    @Autowired
    FeedMapper feedMapper;

    @Test
    void findAll() {
        System.out.println(feedMapper.findAll());
    }

    @Test
    void findById() {
        System.out.println(feedMapper.findById("1"));
    }

    @Test
    void deleteById() {
        feedMapper.deleteById("16");
    }

    @Test
    void updateById() {
        FeedDto feed = new FeedDto();
        feed.setFeedNum(16);
        feed.setTitle("수정성공");
        feed.setContents("수정test");
        feed.setUserId("user1");
        feedMapper.updateById(feed);
    }

    @Test
    void insert() {
        FeedDto feed = new FeedDto();
        feed.setFeedNum(16);
        feed.setTitle("test");
        feed.setContents("testtesttesttest");
        feed.setUserId("user1");
        feed.setPostTime(new Date());
        feedMapper.insert(feed);
    }

    @Test
    void findTrend() {
        System.out.println(feedMapper.findTrend());
    }

    @Test
    void updateViews() {

    }
}