package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper extends CRUD<UserDto,String>{
    List<UserDto> findAll();

    UserDto findById(String id);

    int deleteById(String id);

    int updateById(UserDto dto);

    int insert(UserDto dto);

    UserDto findByIdAndPw (String id, String pw);
}
