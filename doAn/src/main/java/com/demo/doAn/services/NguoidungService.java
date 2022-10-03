/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.doAn.services;

import com.demo.doAn.models.Giangvien;
import com.demo.doAn.models.Giaovu;
import com.demo.doAn.models.Nguoidung;
import com.demo.doAn.models.Quantri;
import com.demo.doAn.models.Sinhvien;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */

public interface NguoidungService {
    //Người dùng
    public boolean luuNguoidung(Nguoidung nguoidung); 
    public List<Nguoidung> laydsNguoidung();
    public Optional<Nguoidung> layNguoidung(String id);
    public void xoaNguoidung(String maND);
    public void suaNguoidung(String maND, Nguoidung nguoidung);
    
    //Sinh viên
    public void luuSV(Sinhvien sinhvien); 
    public List<Sinhvien> laydsSV();
    public Optional<Sinhvien> laySV(String id);
    public void xoaSV(String maND);
    
    //Quản trị
    public void luuQT(Quantri quantri); 
    public void xoaQT(String maND);

    //Giảng viên
    public void luuGiangvien(Giangvien giangvien); 
    public List<Giangvien> laydsGiangvien();
    public Optional<Giangvien> layGiangvien(String id);
    public void xoaGiangvien(String maND);

    //Giáo vụ
    public void luuGVU(Giaovu giaovu); 
    public void xoaGVU(String maND);

    
}
