package com.cxytiandi.sharding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.list();
    }

    @Override
    public Long add(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findByName(String name, int page, int size) {
        int offset = (page - 1) * size;
        return userRepository.findByName(name, offset, size);
    }

}
