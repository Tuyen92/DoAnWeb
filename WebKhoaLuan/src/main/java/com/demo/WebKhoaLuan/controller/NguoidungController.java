/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.controller;
//
//import com.demo.WebKhoaLuan.config.JWTToken;
//import com.demo.WebKhoaLuan.login.LoginRequest;
//import com.demo.WebKhoaLuan.login.LoginResponse;
import com.demo.WebKhoaLuan.model.Nguoidung;
import com.demo.WebKhoaLuan.repository.NguoidungRepository;
import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class NguoidungController {
    @Autowired
    private NguoidungRepository nguoidungRepository;
    
//    @Autowired
//    private AuthenticationManager authenticationManager;
    
//    @Autowired
//    private JWTToken tokenProvider;
//    
//    @PostMapping("/login")
//    public LoginResponse authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
//
//        // Xác thực từ username và password.
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        loginRequest.getUsername(),
//                        loginRequest.getPassword()
//                )
//        );
//
//        // Nếu không xảy ra exception tức là thông tin hợp lệ
//        // Set thông tin authentication vào Security Context
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        // Trả về jwt cho người dùng.
//        String jwt = tokenProvider.generateToken((Nguoidung) authentication.getPrincipal());
//        return new LoginResponse(jwt);
//    }

    
    @PostMapping("/quantri/add")
    public Nguoidung themNguoidung(@RequestBody Nguoidung nguoidung){
        return nguoidungRepository.save(nguoidung);
    }
    
    @GetMapping("/quantri/QLTaiKhoan")
    public List<Nguoidung> layDSNguoidung(){
        return nguoidungRepository.findAll();
    }
    
    @GetMapping("/nguoidung/{maNd}")
    public Nguoidung layNguoidung(@PathVariable(value = "maNd") String maNd){
        return nguoidungRepository.findByMaNd(maNd);
    }
    
    @DeleteMapping("nguoidung/{maNd}")
    public void xoaNguoidung(@PathVariable (value = "maNd") String maNd){
        nguoidungRepository.deleteByMaNd(maNd);
    }
       
}
