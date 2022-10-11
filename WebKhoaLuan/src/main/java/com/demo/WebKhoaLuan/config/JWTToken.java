/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.config;

import com.demo.WebKhoaLuan.model.Nguoidung;
import io.jsonwebtoken.*;
import org.opensaml.soap.wstrust.Claims;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 *
 * @author PC
 */
@Component
@Slf4j
public class JWTToken {
    private final String JWT_SECRET = "lodaaaaaa";

    //Thời gian có hiệu lực của chuỗi jwt
    private final long JWT_EXPIRATION = 604800000L;

    // Tạo ra jwt từ thông tin user
    public String generateToken(Nguoidung nguoidung) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
        // Tạo chuỗi json web token từ id của user.
        return Jwts.builder()
                   .setSubject((nguoidung.getNguoidungPK().getMaNd()))
                   .setIssuedAt(now)
                   .setExpiration(expiryDate)
                   .signWith((SignatureAlgorithm.HS512), JWT_SECRET)
                   .compact();
    }

    // Lấy thông tin user từ jwt
    public String getUserIdFromJWT(String token) {
        Claims claims = (Claims) Jwts.parser()
                            .setSigningKey(JWT_SECRET)
                            .parseClaimsJws(token)
                            .getBody();

        return (claims.getDialect());
    }

    public Jws<io.jsonwebtoken.Claims> validateToken(String authToken) {  
        return Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
    }
}
