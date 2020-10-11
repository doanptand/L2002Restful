package com.t3h.spring.repository;

import com.t3h.spring.entities.User;

import java.util.List;

public interface UserRepository {
    int count();
    int save(User user);
    int update(User user);
    int delete(int id);
    List<User> findAllUser();
    User findUserById(int id);
}
