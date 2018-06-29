package com.vaibhav.basiclogin.Config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by kaushv5 on 6/8/2018.
 */
@Service
public class PasswordEncoder extends BCryptPasswordEncoder {

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String encoder(String password){
        return passwordEncoder.encode(password);
    }
}
