/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.controller;

import com.demo.WebKhoaLuan.model.Nguoidung;
import com.demo.WebKhoaLuan.model.NguoidungPK;
import com.demo.WebKhoaLuan.repository.NguoidungRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    
    @PostMapping(value = "/login")
    @ResponseStatus(HttpStatus.OK)
    public String handleNotifications(@RequestParam("notification") String itemid){
    return "result successful result";
}
    
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
