package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> listAllTest();
    int signup(UserDto user);
    int register(UserDto user);
    int adminModify(UserDto user);
    UserDto login(String id, String pw);
//  List<UserDto> list(PagingDto paging);
    UserDto detail(String id);
    int idCheck(String id);
    int remove(String id);
}
