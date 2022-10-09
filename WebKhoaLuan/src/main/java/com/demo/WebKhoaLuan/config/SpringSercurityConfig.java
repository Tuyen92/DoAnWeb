/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.config;

import antlr.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author PC
 */
@Configuration
@EnableWebSecurity
public class SpringSercurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private UserDetailsService u;
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().usernameParameter("username").passwordParameter("password");
        
        http.formLogin().defaultSuccessUrl("/").failureUrl("/login?error");
        
        http.exceptionHandling().accessDeniedPage("/login?accessDenied");
        
        http.logout().logoutSuccessUrl("/login");
        
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/quantri/**").access("hasRole('ROLE_QT')")
                .antMatchers("/giangvien/**").access("hasRole('ROLE_GV')")
                .antMatchers("/giaovu/**").access("hasRole('ROLE_GVU')")
                .antMatchers("/sinhvien/**").access("hasRole('ROLE_SV')").anyRequest().authenticated();
      
        http.csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(u).passwordEncoder(passwordEncoder());
    }
    
}