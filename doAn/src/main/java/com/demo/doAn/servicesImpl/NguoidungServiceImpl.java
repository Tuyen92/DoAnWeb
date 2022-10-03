/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.servicesImpl;

import com.demo.doAn.models.Giangvien;
import com.demo.doAn.models.Giaovu;
import com.demo.doAn.models.Nganh;
import com.demo.doAn.models.NganhPK;
import com.demo.doAn.models.Nguoidung;
import com.demo.doAn.models.NguoidungPK;
import com.demo.doAn.models.Quantri;
import com.demo.doAn.models.Sinhvien;
import com.demo.doAn.repository.GiangvienRepository;
import com.demo.doAn.repository.GiaovuRepository;
import com.demo.doAn.repository.NguoidungRepository;
import com.demo.doAn.repository.QuantriRepository;
import com.demo.doAn.repository.SinhvienRepository;
import com.demo.doAn.services.NguoidungService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class NguoidungServiceImpl implements NguoidungService {

    @Autowired
    private NguoidungRepository nguoidungRepository;

    @Autowired
    private SinhvienRepository sinhvienRepository;

    @Autowired
    private GiangvienRepository giangvienRepository;

    @Autowired
    private GiaovuRepository giaovuRepository;

    @Autowired
    private QuantriRepository quantriRepository;

    @Override
    public boolean luuNguoidung(Nguoidung user) {
        this.nguoidungRepository.save(user);
//        switch (user.getChucvu().getMaCV()) {
//            case "ROLE_QT":
//                Quantri qt = new Quantri();
//                NguoidungPK pk = new NguoidungPK();
//                qt.setMaQT(user.getUsername());
//                pk.setMaCV("ROLE_QT");
//                user.setNguoidungPK(pk);
//                qt.setNguoidung(user);
//                luuQT(qt);
//                break;
//            case "ROLE_GVU":
//                Giaovu gvu = new Giaovu();
//                NguoidungPK pk2 = new NguoidungPK();
//                pk2.setMaCV("ROLE_GVU");
//                user.setNguoidungPK(pk2);
//                gvu.setMaGVU(user.getUsername());
//                gvu.setNguoidung(user);
//                luuGVU(gvu);
//                break;
//            case "ROLE_GV":
//                Giangvien gv = new Giangvien();
//                NguoidungPK pk3 = new NguoidungPK();
//                pk3.setMaCV("ROLE_GV");
//                user.setNguoidungPK(pk3);
//                gv.setMaGV(user.getUsername());
//                gv.setNguoidung(user);
//                luuGiangvien(gv);
//                break;
//            case "ROLE_SV":
//                Sinhvien sv = new Sinhvien();
//                NguoidungPK pk4 = new NguoidungPK();
//                pk4.setMaCV("ROLE_SV");
//                user.setNguoidungPK(pk4);
//                Nganh nganh = new Nganh();
//                NganhPK nganhPK = new NganhPK();
//                sv.setMaSV(user.getUsername());
//                nganh.setNganhPK(nganhPK);
//                sv.setNienKhoa(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
//                sv.setTinhTrang(Short.parseShort("1"));
//                sv.setNganh(nganh);
//                sv.setNguoidung(user);
//                luuSV(sv);
//                break;
//        }
        return true;
    }

    //Người dùng
    @Override
    public List<Nguoidung> laydsNguoidung() {
//        List<Nguoidung> dsNguoidung = new ArrayList<>();
//        Iterable<Nguoidung> nguoidung = nguoidungRepository.findAll();
//        for(Nguoidung nguoidung1 : nguoidung){
//            dsNguoidung.add(nguoidung1);
//        }
        return nguoidungRepository.findAll();
    }

    @Override
    public void xoaNguoidung(String maND) {
        this.nguoidungRepository.deleteById(maND);
    }

    @Override
    public Optional<Nguoidung> layNguoidung(String maND) {
        return this.nguoidungRepository.findById(maND);
    }

    @Override
    public void suaNguoidung(String maND, Nguoidung nguoidung) {
        if (nguoidung.getNguoidungPK().getMaND().equals(maND)) {
            if (!nguoidung.getHo().isEmpty()) {
                nguoidung.setHo(nguoidung.getHo());
            }
            if (!nguoidung.getTen().isEmpty()) {
                nguoidung.setTen(nguoidung.getTen());
            }
            if (!nguoidung.getNgaySinh().toString().isEmpty()) {
                nguoidung.setNgaySinh(nguoidung.getNgaySinh());
            }
            if (!nguoidung.getUsername().isEmpty()) {
                nguoidung.setUsername(nguoidung.getUsername());
            }
            if (!nguoidung.getGioiTinh().isEmpty()) {
                nguoidung.setGioiTinh(nguoidung.getGioiTinh());
            }
            if (!nguoidung.getHoatDong().equals(nguoidung.getHoatDong())) {
                nguoidung.setHoatDong(Short.parseShort(nguoidung.getHoatDong().toString()));
            }
            this.nguoidungRepository.save(nguoidung);
        }
    }

    //sinh viên
    @Override
    public void luuSV(Sinhvien sinhvien) {
        this.sinhvienRepository.save(sinhvien);
    }

    @Override
    public List<Sinhvien> laydsSV() {
        return this.sinhvienRepository.findAll();

    }

    @Override
    public Optional<Sinhvien> laySV(String id) {
        return this.sinhvienRepository.findById(id);
    }

    @Override
    public void xoaSV(String maND) {
        sinhvienRepository.deleteById(maND);
    }

    //Giảng viên
    @Override
    public void luuGiangvien(Giangvien giangvien) {
        this.giangvienRepository.save(giangvien);

    }

    @Override
    public List<Giangvien> laydsGiangvien() {
        return this.giangvienRepository.findAll();
    }

    @Override
    public Optional<Giangvien> layGiangvien(String id) {
        return this.giangvienRepository.findById(id);
    }

    @Override
    public void xoaGiangvien(String maND) {
        this.giangvienRepository.deleteById(maND);
    }

    @Override
    public void luuQT(Quantri quantri) {
        this.quantriRepository.save(quantri);

    }

    @Override
    public void xoaQT(String maND) {
        this.quantriRepository.deleteById(maND);
    }

    @Override
    public void luuGVU(Giaovu giaovu) {
        this.giaovuRepository.save(giaovu);
    }

    @Override
    public void xoaGVU(String maND) {
        this.giaovuRepository.deleteById(maND);
    }

}
