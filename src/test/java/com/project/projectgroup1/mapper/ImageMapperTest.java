package com.project.projectgroup1.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ImageMapperTest {

    @Autowired
    private ImageMapper imageMapper;

    @Test
    void findByFeedNum() {
        System.out.println(imageMapper.findByFeedNum(1));
    }

    @Test
    void findOne() {
        System.out.println(imageMapper.findOne(1));
    }

    @Test
    void deleteOne() {
    }

    @Test
    void insertOne() {
    }
}