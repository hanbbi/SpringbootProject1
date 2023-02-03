package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.mapper.FeedMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedServiceImpTest {

    @Autowired
    private FeedService feedService;

    @Test
    void list() {
        System.out.println(feedService.list());
    }

    @Test
    void detail() {
        feedService.detail(4);
    }

    @Test
    void modify() {
    }

    @Test
    void remove() {
    }

    @Test
    void register() {
    }

    @Test
    void trendList() {
        feedService.trendList();
    }

    @Test
    void findLatest() { System.out.println(feedService.findLatest()); }
}