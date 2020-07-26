package com.kurnool.librarysystem.controller;

import com.kurnool.librarysystem.model.LoginRequest;
import com.kurnool.librarysystem.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

    @InjectMocks
    private LoginController loginController;

    @Mock
    private LoginService loginService;

    @Test
    public void login() {
        LoginRequest loginRequest = LoginRequest.builder().build();
        String expectedMessage = "ABCD";
        when(loginService.login(any(LoginRequest.class))).thenReturn(expectedMessage);
        assertThat(loginController.login(loginRequest)).isEqualTo(expectedMessage);
        verify(loginService, times(1)).login(any(LoginRequest.class));
    }
}