package com.mywahh.osrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserManagementConfig {

    @Bean
    public PasswordEncoder myPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService myUserDetailsService(){
        UserDetails user = User.withUsername("bob").password(myPasswordEncoder().encode("password123")).authorities("USER").build();
        UserDetailsService userDetailsService = new InMemoryUserDetailsManager(user);
        return userDetailsService;
    }
}
