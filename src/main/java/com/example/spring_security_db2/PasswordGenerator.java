package com.example.spring_security_db2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("bekmurat"));
        System.out.println(encoder.encode("creator"));
        System.out.println(encoder.encode("editor"));
        System.out.println(encoder.encode("admin"));
    }
}
