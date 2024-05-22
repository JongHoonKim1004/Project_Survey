package com.survey.controller;

import com.survey.dto.GoogleDTO;
import com.survey.dto.UsersDTO;
import com.survey.security.TokenProvider;
import com.survey.service.GoogleService;
import com.survey.service.UsersService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@Slf4j
public class GoogleController {
    @Autowired
    private GoogleService googleService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private TokenProvider tokenProvider;

    // Google Login
    @GetMapping("/login/oauth/google")
    public void googleLogin1(@RequestParam("code") String code, HttpServletResponse response) throws IOException {
        String access_token = googleService.getAccessToken(code);
        log.info("ACCESS_TOKEN: {}", access_token);

        // userInfo
        GoogleDTO googleDTO = googleService.getUserInfo(access_token);
        log.info("GOOGLE DTO : {}", googleDTO);

        String name = googleDTO.getEmail();
        UsersDTO usersDTO = usersService.findByName(name);

        // JWT
        String token = tokenProvider.create(usersService.convertDTO(usersDTO));

        response.sendRedirect("http://localhost:3000/login/oauth/google?accessToken=" + access_token + "&token=" + token);


    }
}
