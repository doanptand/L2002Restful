package com.t3h.spring.service;

import com.t3h.spring.entities.User;
import com.t3h.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public int count() {
        return userRepository.count();
    }

    public int save(User user) {
        return userRepository.save(user);
    }

    public int update(User user) {
        return userRepository.update(user);
    }

    public int delete(int id) {
        return userRepository.delete(id);
    }

    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }

    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }
}
