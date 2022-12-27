package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.UserDto;

import java.util.List;

public class UserServiceImp implements UserService {
    @Override
    public List<UserDto> listAllTest() {
        return null;
    }

    @Override
    public int signup(UserDto user) {
        return 0;
    }

    @Override
    public int register(UserDto user) {
        return 0;
    }

    @Override
    public int adminModify(UserDto user) {
        return 0;
    }

    @Override
    public UserDto login(String id, String pw) {
        return null;
    }

    @Override
    public UserDto detail(String id) {
        return null;
    }

    @Override
    public int idCheck(String id) {
        return 0;
    }

    @Override
    public int remove(String id) {
        return 0;
    }
}
