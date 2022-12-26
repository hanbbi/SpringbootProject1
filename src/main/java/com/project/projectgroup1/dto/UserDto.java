package com.project.projectgroup1.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
public class UserDto {
    String userId;
    String pw;
    String name;
    String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date signup;
}
