package com.ashish.Task.Management.service;


import com.ashish.Task.Management.dto.JwtAuthResponse;
import com.ashish.Task.Management.dto.LoginDto;
import com.ashish.Task.Management.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}
