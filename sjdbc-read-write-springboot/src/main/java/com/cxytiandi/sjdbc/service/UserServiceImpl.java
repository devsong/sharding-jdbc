package com.cxytiandi.sjdbc.service;

import java.util.List;

import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sjdbc.po.User;
import com.cxytiandi.sjdbc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        List<User> list = null;
        try (HintManager hitManager = HintManager.getInstance()) {
            // 强制路由主库
            // hitManager.setMasterRouteOnly();
            list = userRepository.list();
        }
        return list;
    }

    @Override
    public Long add(User user) {
        return userRepository.addUser(user);
    }

}
