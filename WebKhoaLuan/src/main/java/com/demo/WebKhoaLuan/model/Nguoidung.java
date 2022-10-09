/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "nguoidung")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nguoidung.findAll", query = "SELECT n FROM Nguoidung n"),
    @NamedQuery(name = "Nguoidung.deleteByMaNd", query = "DELETE FROM Nguoidung n WHERE n.nguoidungPK.maNd = :maNd"),
    @NamedQuery(name = "Nguoidung.findByMaNd", query = "SELECT n FROM Nguoidung n WHERE n.nguoidungPK.maNd = :maNd"),
    @NamedQuery(name = "Nguoidung.findByHo", query = "SELECT n FROM Nguoidung n WHERE n.ho = :ho"),
    @NamedQuery(name = "Nguoidung.findByTen", query = "SELECT n FROM Nguoidung n WHERE n.ten = :ten"),
    @NamedQuery(name = "Nguoidung.findByGioiTinh", query = "SELECT n FROM Nguoidung n WHERE n.gioiTinh = :gioiTinh"),
    @NamedQuery(name = "Nguoidung.findByNgaySinh", query = "SELECT n FROM Nguoidung n WHERE n.ngaySinh = :ngaySinh"),
    @NamedQuery(name = "Nguoidung.findByDiaChi", query = "SELECT n FROM Nguoidung n WHERE n.diaChi = :diaChi"),
    @NamedQuery(name = "Nguoidung.findBySdt", query = "SELECT n FROM Nguoidung n WHERE n.sdt = :sdt"),
    @NamedQuery(name = "Nguoidung.findByEmail", query = "SELECT n FROM Nguoidung n WHERE n.email = :email"),
    @NamedQuery(name = "Nguoidung.findByUsername", query = "SELECT n FROM Nguoidung n WHERE n.username = :username"),
    @NamedQuery(name = "Nguoidung.findByPassword", query = "SELECT n FROM Nguoidung n WHERE n.password = :password"),
    @NamedQuery(name = "Nguoidung.findByAnh", query = "SELECT n FROM Nguoidung n WHERE n.anh = :anh"),
    @NamedQuery(name = "Nguoidung.findByHoatDong", query = "SELECT n FROM Nguoidung n WHERE n.hoatDong = :hoatDong"),
    @NamedQuery(name = "Nguoidung.findByMaCv", query = "SELECT n FROM Nguoidung n WHERE n.nguoidungPK.maCv = :maCv")})
public class Nguoidung implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NguoidungPK nguoidungPK;
    @Column(name = "ho")
    private String ho;
    @Column(name = "ten")
    private String ten;
    @Column(name = "gioi_tinh")
    private String gioiTinh;
    @Column(name = "ngay_sinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "sdt")
    private String sdt;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "anh")
    private String anh;
    @Column(name = "hoat_dong")
    private Short hoatDong;

    public Nguoidung() {
    }

    public Nguoidung(NguoidungPK nguoidungPK) {
        this.nguoidungPK = nguoidungPK;
    }

    public Nguoidung(String maNd, String maCv) {
        this.nguoidungPK = new NguoidungPK(maNd, maCv);
    }

    public NguoidungPK getNguoidungPK() {
        return nguoidungPK;
    }

    public void setNguoidungPK(NguoidungPK nguoidungPK) {
        this.nguoidungPK = nguoidungPK;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Short getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(Short hoatDong) {
        this.hoatDong = hoatDong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nguoidungPK != null ? nguoidungPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nguoidung)) {
            return false;
        }
        Nguoidung other = (Nguoidung) object;
        if ((this.nguoidungPK == null && other.nguoidungPK != null) || (this.nguoidungPK != null && !this.nguoidungPK.equals(other.nguoidungPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Nguoidung[ nguoidungPK=" + nguoidungPK + " ]";
    }
    
}
