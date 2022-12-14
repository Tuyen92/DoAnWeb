/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.controller;
//
//import com.demo.WebKhoaLuan.config.JWTToken;
//import com.demo.WebKhoaLuan.login.LoginRequest;
//import com.demo.WebKhoaLuan.login.LoginResponse;
import com.demo.WebKhoaLuan.model.Giangvien;
import com.demo.WebKhoaLuan.model.Giaovu;
import com.demo.WebKhoaLuan.model.Nganh;
import com.demo.WebKhoaLuan.model.NganhPK;
import com.demo.WebKhoaLuan.model.Nguoidung;
import com.demo.WebKhoaLuan.model.Quantri;
import com.demo.WebKhoaLuan.model.Sinhvien;
import com.demo.WebKhoaLuan.repository.GiangvienRepository;
import com.demo.WebKhoaLuan.repository.GiaovuRepository;
import com.demo.WebKhoaLuan.repository.NguoidungRepository;
import com.demo.WebKhoaLuan.repository.QuantriRepository;
import com.demo.WebKhoaLuan.repository.SinhvienRepository;
import java.util.Calendar;
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
    @Autowired
    private SinhvienRepository sinhVienRepository;
    @Autowired
    private GiangvienRepository giangVienRepository;
    @Autowired
    private GiaovuRepository giaoVuRepository;
    @Autowired
    private QuantriRepository quanTriRepository;

    //????NG NH???P
    @PostMapping("/dangNhap")
    public String dangNhap(@RequestBody Nguoidung nguoidung){
        try {
            Nguoidung nd = nguoidungRepository.layND(nguoidung.getUsername());
            if (nd.getPassword().equals(nguoidung.getPassword())) {
                return "????ng nh???p th??nh c??ng";
            }
            else
                return "Nh???p sai m???t kh???u";
        } catch (Exception e) {
            return "T??i kho???n kh??ng hi???n c??";
        }
    }
   
    //QU???N TR??? TH??M NG?????I D??NG
    @PostMapping("/quantri/themND")
    public Nguoidung themNguoidung(@RequestBody Nguoidung nguoidung){
        nguoidung.setHoatDong(1);
        nguoidung.setUsername(nguoidung.getNguoidungPK().getMaNd());
        nguoidung.setPassword(nguoidung.getNguoidungPK().getMaNd());
        switch (nguoidung.getNguoidungPK().getChucvuMaCv()) {
            case "ROLE_QT":
                Quantri qt = new Quantri();
                qt.setNguoidung(nguoidung);
                qt.setCongViec("-");
                qt.setMaQt(nguoidung.getNguoidungPK().getMaNd());
                quanTriRepository.save(qt);
                break;
            case "ROLE_GVU":
                Giaovu gvu = new Giaovu();
                gvu.setNguoidung(nguoidung);
                gvu.setPhongBan("-");
                gvu.setMaGvu(nguoidung.getNguoidungPK().getMaNd());
                giaoVuRepository.save(gvu);
                break;
            case "ROLE_GV":
                Giangvien gv = new Giangvien();
                gv.setHocHam("-");
                gv.setHocVi("-");
                gv.setNguoidung(nguoidung);
                gv.setMaGv(nguoidung.getNguoidungPK().getMaNd());
                giangVienRepository.save(gv);
                break;
            case "ROLE_SV":
                Sinhvien sv = new Sinhvien();
                Nganh n = new Nganh();
                NganhPK nPK = new NganhPK();
                nPK.setKhoaMaKhoa("IT");
                nPK.setMaNganh("IT01");
                n.setNganhPK(nPK);
                sv.setNguoidung(nguoidung);
                sv.setMaSv(nguoidung.getNguoidungPK().getMaNd());
                sv.setTinhTrang(0);
                sv.setNienKhoa(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
                sv.setNganh(n);
                sinhVienRepository.save(sv);
                break;
            default:
                throw new AssertionError();
        } 
        return nguoidungRepository.save(nguoidung);
    }
    
    //QU???N TR??? L???Y DANH S??CH T??I KHO???N 
    @GetMapping("/quantri/qlTaiKhoan")
    public List<Nguoidung> layDSNguoidung(){
        return nguoidungRepository.findAll();
    }
    
    //QU???N TR??? L???Y TH??NG TIN T??I KHO???N M???T NG?????I D??NG
    @GetMapping("/quantri/qlTaiKhoan/{maNd}")
    public Nguoidung timNguoidung(@PathVariable(value = "maNd") String maNd){
        return nguoidungRepository.layND(maNd);
    }
    
    //NG?????I D??NG XEM TH??NG TIN T??I KHO???N C???A M??NH
    @GetMapping("/nguoidung/{maNd}")
    public Nguoidung layNguoidung(@PathVariable(value = "maNd") String maNd){
        return nguoidungRepository.layND(maNd);
    }
    
    //QU???N TR??? L???Y DANH S??CH THEO T???NG CH???C V???
    @GetMapping("/quantri/qlTaiKhoan/loai/{maCv}")
    public List<Nguoidung> layDSLoaiND(@PathVariable(value = "maCv") String maCv){
        return nguoidungRepository.layLoaiND(maCv);
    }
    
    //QU???N TR??? X??A T??I KHO???N
    @DeleteMapping("/quantri/xoaND/{maNd}")
    public String xoaNguoidung(@PathVariable(value = "maNd") String maNd){
        Nguoidung nd = nguoidungRepository.layND(maNd);
        try {
            switch (nd.getNguoidungPK().getChucvuMaCv()) {
                case "ROLE_QT":
                    quanTriRepository.deleteById(maNd);
                    break;
                case "ROLE_GVU":
                    giaoVuRepository.deleteById(maNd);
                    break;
                case "ROLE_GV":
                    giangVienRepository.deleteById(maNd);
                    break;
                case "ROLE_SV":
                    sinhVienRepository.deleteById(maNd);
                    break;
            }
            nguoidungRepository.deleteByMaNd(maNd);
        } catch (Exception e) {
            return "X??a ng?????i d??ng kh??ng th??nh c??ng";
        }
        return "???? x??a ng?????i d??ng th??nh c??ng";
    }
    
    //QU???N TR??? C???P NH???T TH??NG TIN T??I KHO???N NG?????I D??NG
    @PostMapping("/quantri/capnhatND/{maNd}")
    public String capNhatND(@PathVariable (value = "maNd") String maNd, @RequestBody Nguoidung nguoidung) {
        Nguoidung nd = nguoidungRepository.layND(maNd);
        if (nguoidung.getHo() != null)
            nd.setHo(nguoidung.getHo());
        if (nguoidung.getTen() != null)
            nd.setTen(nguoidung.getTen());
        if (nguoidung.getNgaySinh() != null)
            nd.setNgaySinh(nguoidung.getNgaySinh());
        if (nguoidung.getDiaChi()!= null)
            nd.setDiaChi(nguoidung.getDiaChi());
        if (nguoidung.getEmail() != null)
            nd.setEmail(nguoidung.getEmail());
        if (nguoidung.getGioiTinh() != null)
            nd.setGioiTinh(nguoidung.getGioiTinh());
        if (nguoidung.getSdt() != null)
            nd.setSdt(nguoidung.getSdt());            
        try {
            nguoidungRepository.save(nd);
        } catch (Exception e) {
            return "C???p nh???t ng?????i d??ng kh??ng th??nh c??ng";
        }
        return "C???p nh???t ng?????i d??ng th??nh c??ng";
    }
    
    //NG?????I D??NG C???P NH???T TH??NG TIN C??C NH??N
    @PostMapping("/capnhatND/{maNd}")
    public String capNhatNDCaNhan(@PathVariable(value = "maNd") String maNd, @RequestBody Nguoidung nguoidung){
        Nguoidung nd = nguoidungRepository.layND(maNd);
        String message = "";
        if (nguoidung.getNgaySinh() != null)
            nd.setNgaySinh(nguoidung.getNgaySinh());
        if (nguoidung.getDiaChi() != null)
            nd.setDiaChi(nguoidung.getDiaChi());
        if (nguoidung.getEmail() != null)
            nd.setEmail(nguoidung.getEmail());
        if (nguoidung.getSdt() != null)
            nd.setSdt(nguoidung.getSdt());
        if (nguoidung.getPassword() != null) {
            if(nguoidung.getPassword().equals(nguoidung.getConfirmPass()))
                nd.setPassword(nguoidung.getConfirmPass());
            else{
                message = "Nh???p sai m???t kh???u m???i";
                return message;
            }  
        }
        try {
            nguoidungRepository.save(nd);
        } catch (Exception e) {
           message = "C???p nh???t ng?????i d??ng kh??ng th??nh c??ng";
           return message;
        }
        message = "C???p nh???t ng?????i d??ng th??nh c??ng";
        return message;
    }
    
    //QU???N TR??? C???P NH???T T??NH TR???NG T??I KHO???N
    @PostMapping("/quantri/tinhTrangTK/{maNd}")
    public String capNhatTinhTrang(@PathVariable(value = "maNd") String maNd){
        Nguoidung nd = nguoidungRepository.layND(maNd);
        if (nd.getHoatDong() == 1)
            nd.setHoatDong(0);
        else
            nd.setHoatDong(1);
        try {
            nguoidungRepository.save(nd);
            return "???? c???p nh???t th??nh c??ng";
        } catch (Exception e) {
            return "C???p nh???t kh??ng th??nh c??ng";
        }   
    }
    
    //QU???N TR??? XEM DANH S??CH SINH VI??N THEO KHOA
    @GetMapping("/quantri/dsSVKhoa/{maKhoa}")
    public List<Sinhvien> dsSinhVienKhoa(@PathVariable(value = "maKhoa") String maKhoa){
        return sinhVienRepository.laySVKhoa(maKhoa);
    }
    
    //QU???N TR??? XEM DANH S??CH SINH VI??N THEO NG??NH
    @GetMapping("/quantri/dsSVNganh/{maNganh}")
    public List<Sinhvien> dsSinhVienNganh(@PathVariable(value = "maNganh") String maNganh){
        return sinhVienRepository.laySVNganh(maNganh);
    }
    
    //QU???N TR??? XEM DANH S??CH T??I KHO???N B??? V?? HI???U H??A
    @GetMapping("/quantri/dsTaiKhoanVHH")
    public List<Nguoidung> dsTaiKhoanVHH(){
        return nguoidungRepository.layDSHoatDong(0);
    }
    
    //QU???N TR??? XEM DANH S??CH T??I KHO???N ??ANG HI???U L???C
    @GetMapping("/quantri/dsTaiKhoanHLH")
    public List<Nguoidung> dsTaiKhoanHLH(){
        return nguoidungRepository.layDSHoatDong(1);
    }
    
    //QU???N TR??? C???P NH???T T??NH TR???NG SINH VI??N
    @PostMapping("/quantri/capNhatSV/{maSv}")
    public String capNhatSV(@PathVariable(value = "maSv") String maSv){
        Sinhvien s = sinhVienRepository.laySinhvien(maSv);
        try {
            if (s.getTinhTrang() == 0)
                s.setTinhTrang(1);
            else
                s.setTinhTrang(0);
            sinhVienRepository.save(s);
        } catch (Exception e) {
            return "C???p nh???t kh??ng th??nh c??ng";
        }
        return "???? c???p nh???t th??nh c??ng";
    }
    
    //QU???N TR??? C???P NH???T T??NH TR???NG HO???T ?????NG T??I KHO???N
    @PostMapping("/quantri/capNhatTK/{maNd}")
    public String capNhatTT(@PathVariable(value = "maSv") String maNd){
        Nguoidung nd = nguoidungRepository.layND(maNd);
        String message = "";
        try {
            if (nd.getHoatDong() == 0){
                nd.setHoatDong(1);
                message = "???? hi???u l???c h??a t??i kho???n";
            }
            else{
                nd.setHoatDong(0);
                message = "???? v?? hi???u h??a t??i kho???n";
            }    
            nguoidungRepository.save(nd);
        } catch (Exception e) {
            message = "C???p nh???t kh??ng th??nh c??ng";
            return message;
        }
        return message;
    }
}
