package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.UserDto;
import com.project.projectgroup1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserMapper userMapper;

    public UserServiceImp(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> listAllTest() {
        return userMapper.findAll();
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
        int modify=0;
        modify=userMapper.updateById(user);
        return modify;
    }

    @Override
    public UserDto login(String id, String pw) {
        return userMapper.findByIdAndPw(id,pw);
    }

    @Override
    public UserDto detail(String id) {
        UserDto detail=userMapper.findById(id);
        return detail;
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
