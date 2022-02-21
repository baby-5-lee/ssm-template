package com.example.mapper;

import com.example.domain.User;

/**
* @author Climber
* @description 针对表【tbl_user】的数据库操作Mapper
* @createDate 2022-02-21 19:45:05
* @Entity com.example.domain.User
*/
public interface UserMapper {

    String getActByName(String name);

}




