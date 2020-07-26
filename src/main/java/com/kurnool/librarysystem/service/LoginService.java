package com.kurnool.librarysystem.service;

import com.kurnool.librarysystem.model.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String login(LoginRequest loginRequest) {
        System.out.println(loginRequest.getUsername());
        return "Success";
    }
}
