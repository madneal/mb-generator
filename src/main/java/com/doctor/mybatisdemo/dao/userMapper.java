package com.doctor.mybatisdemo.dao;

import com.doctor.mybatisdemo.domain.user;
import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(String id);

    int insert(user record);

    user selectByPrimaryKey(String id);

    List<user> selectAll();

    int updateByPrimaryKey(user record);
}