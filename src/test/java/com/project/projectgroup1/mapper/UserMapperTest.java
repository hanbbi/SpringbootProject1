package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.UserDto;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        System.out.println(userMapper.findAll());
    }

    @Test
    void findById() {
        System.out.println(userMapper.findById("gkssk"));
    }

    @Test
    void deleteById() {
        userMapper.deleteById("gkssk");
    }

    @Test
    void updateById() {
        UserDto user = new UserDto();
        user.setUserId("gkssk");
        user.setName("양한나");
        user.setEmail("gkssk2309@naver.com");
        user.setBirth(new Date());
        userMapper.updateById(user);
    }

    @Test
    void insert() {
        UserDto user = new UserDto();
        user.setUserId("gkssk");
        user.setPw("1234");
        user.setName("한나");
        user.setEmail("gkssk2309@gmail.com");
        user.setBirth(new Date());
        userMapper.insert(user);
    }

    @Test
    void findByIdAndPw() {
        System.out.println(userMapper.findByIdAndPw("a_reply_writer","1234"));
    }
}