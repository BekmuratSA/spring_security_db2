package com.example.spring_security_db2.service;

import com.example.spring_security_db2.entity.MyUser;
import com.example.spring_security_db2.entity.User;
import com.example.spring_security_db2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.getUserByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("could not found user");
        }
        return new MyUser(user);
    }
}
