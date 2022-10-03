/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.controllers;

import com.demo.doAn.models.Nguoidung;
import com.demo.doAn.repository.NguoidungRepository;
import com.demo.doAn.services.NguoidungService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("WebKhoaLuan")
@RestController
public class NguoidungController {

    @Autowired
    private NguoidungService nguoidungService;

    @GetMapping("/quantri/QLTaiKhoan")
    public List<Nguoidung> dsNguoidung() {
        return nguoidungService.laydsNguoidung();
    }

    @RequestMapping("/quantri/{maND}")
    public Optional<Nguoidung> xemNguoidung(@PathVariable(value = "maND") String maND) {
        return nguoidungService.layNguoidung(maND);
    }

    @PostMapping("/quantri/add")
    public String themNguoidung(@RequestBody Nguoidung nguoidung) {
        this.nguoidungService.luuNguoidung(nguoidung);
        return "Lưu người dùng thành công";
    }

//    @GetMapping("/quantri/QLTaiKhoan/{maND}")
//    public String xoaNguoidungView (@PathVariable(value = "maND") String maND){
//        return "/quantri/QLTaiKhoan";
//    }
    @RequestMapping("/quantri/QLTaiKhoan/{maND}")
    public void xoaNguoidung(@PathVariable(value = "maND") String maND) {
        this.nguoidungService.xoaNguoidung(maND);
    }

}
