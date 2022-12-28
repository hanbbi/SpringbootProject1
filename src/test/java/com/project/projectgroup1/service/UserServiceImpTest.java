package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.UserDto;
import com.project.projectgroup1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImpTest {

    @Autowired
    private UserService userService;

    @Test
    void listAllTest() {
        System.out.println(userService.listAllTest());
    }

    @Test
    void signup() {
    }

    @Test
    void register() {
    }

    @Test
    void adminModify() {
    }

    @Test
    void login() {
        userService.login("user1","1234");
    }

    @Test
    void detail() {
    }

    @Test
    void idCheck() {
    }

    @Test
    void remove() {
    }
}