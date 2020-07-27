package com.kurnool.librarysystem.service;

import com.kurnool.librarysystem.model.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginService {

    public String login(LoginRequest loginRequest) {
        log.info("successfuly login");
        return "Successfully logedin";
    }
}
