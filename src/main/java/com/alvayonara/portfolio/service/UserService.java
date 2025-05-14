package com.alvayonara.portfolio.service;

import com.alvayonara.portfolio.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

public interface UserService {
    boolean existByUsername(String username);
    boolean existByEmail(String email);
    Optional<User> findByUsername(String username);
}
