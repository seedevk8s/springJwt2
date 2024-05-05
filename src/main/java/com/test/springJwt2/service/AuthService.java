package com.test.springJwt2.service;

import com.test.springJwt2.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}