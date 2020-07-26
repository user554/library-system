package com.kurnool.librarysystem.controller;

import com.kurnool.librarysystem.model.LoginRequest;
import com.kurnool.librarysystem.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(value="/login")
    public String login(@RequestBody LoginRequest loginRequest){
        return loginService.login(loginRequest);
    }
}
