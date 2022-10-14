/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.util.Arrays;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author PC
 */
public class MyUserDetails implements UserDetails {

    public Nguoidung nguoidung;

    public MyUserDetails(Nguoidung nguoidung) {
        this.nguoidung = nguoidung;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority chucvu = new SimpleGrantedAuthority(nguoidung.nguoidungPK.getChucvuMaCv());
        return Arrays.asList(chucvu);
    }

    @Override
    public String getPassword() {
        return nguoidung.GetPassword();
    }

    @Override
    public String getUsername() {
        return nguoidung.GetUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
