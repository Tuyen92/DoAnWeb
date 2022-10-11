/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.Service;

import com.demo.WebKhoaLuan.model.Nguoidung;
import com.demo.WebKhoaLuan.repository.NguoidungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class nguoidungService implements UserDetailsService{
    
    @Autowired
    NguoidungRepository nguoidungRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Nguoidung nguoidung = nguoidungRepository.findByUsername(username);
        if(nguoidung==null)
            throw new UsernameNotFoundException("Tên người dùng không đúng");
        
        return nguoidung;
    }
    
}
