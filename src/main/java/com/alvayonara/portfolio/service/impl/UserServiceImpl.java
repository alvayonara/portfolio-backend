package com.alvayonara.portfolio.service.impl;

import com.alvayonara.portfolio.mapper.UserMapper;
import com.alvayonara.portfolio.model.User;
import com.alvayonara.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public boolean existByUsername(String username) {
        return userMapper.existsByUsername(username);
    }

    @Override
    public boolean existByEmail(String email) {
        return userMapper.existsByEmail(email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }
}
