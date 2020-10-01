package com.stagged.auth.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    // TODO: 9/29/2020 : Add a logic to get user details from database 
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("foo","foo",new ArrayList<>());
    }
}
