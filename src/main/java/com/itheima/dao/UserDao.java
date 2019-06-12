package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

    User findById(int id);

    List<User> findAll();
}
