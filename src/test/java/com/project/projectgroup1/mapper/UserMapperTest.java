package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        System.out.println(userMapper.findById("test1"));
    }

    @Test
    void deleteById() {
    }

    @Test
    void updateById() throws ParseException {
        UserDto user= new UserDto();
        user.setUserId("test1");
        user.setName("안성현33");
        user.setPw("1234");
        user.setEmail("ash323@naver.com");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        user.setBirth(sdf.parse("2022-12-25"));
        System.out.println(user);
    }

    @Test
    void insert() throws ParseException {
        UserDto user= new UserDto();
        user.setUserId("test1");
        user.setName("안성현");
        user.setPw("1234");
        user.setEmail("ash@naver.com");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        user.setBirth(sdf.parse("2022-12-26"));
        System.out.println(user);
    }

}