package com.learnspring.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username,String password){
        boolean isValidUserName = username.equalsIgnoreCase("admin");
        boolean isValidPassword = password.equalsIgnoreCase("Com@1234");

        return isValidPassword && isValidUserName;
    }
}
