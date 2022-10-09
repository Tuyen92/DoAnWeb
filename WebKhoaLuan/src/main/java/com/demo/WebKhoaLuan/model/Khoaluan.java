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
@Table(name = "khoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoaluan.findAll", query = "SELECT k FROM Khoaluan k"),
    @NamedQuery(name = "Khoaluan.findByMaKl", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maKl = :maKl"),
    @NamedQuery(name = "Khoaluan.findByNam", query = "SELECT k FROM Khoaluan k WHERE k.nam = :nam"),
    @NamedQuery(name = "Khoaluan.findByGhiChu", query = "SELECT k FROM Khoaluan k WHERE k.ghiChu = :ghiChu"),
    @NamedQuery(name = "Khoaluan.findByNgayNop", query = "SELECT k FROM Khoaluan k WHERE k.ngayNop = :ngayNop"),
    @NamedQuery(name = "Khoaluan.findByMaSv2", query = "SELECT k FROM Khoaluan k WHERE k.maSv2 = :maSv2"),
    @NamedQuery(name = "Khoaluan.findByMaGvhd", query = "SELECT k FROM Khoaluan k WHERE k.maGvhd = :maGvhd"),
    @NamedQuery(name = "Khoaluan.findByMaGvpb", query = "SELECT k FROM Khoaluan k WHERE k.maGvpb = :maGvpb"),
    @NamedQuery(name = "Khoaluan.findByFileNop", query = "SELECT k FROM Khoaluan k WHERE k.fileNop = :fileNop"),
    @NamedQuery(name = "Khoaluan.findByTinhTrangkl", query = "SELECT k FROM Khoaluan k WHERE k.tinhTrangkl = :tinhTrangkl"),
    @NamedQuery(name = "Khoaluan.findByMaDk", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maDk = :maDk"),
    @NamedQuery(name = "Khoaluan.findByMaSv", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maSv = :maSv"),
    @NamedQuery(name = "Khoaluan.findByMaHd", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maHd = :maHd")})
public class Khoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KhoaluanPK khoaluanPK;
    @Column(name = "nam")
    private String nam;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "ngay_nop")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNop;
    @Column(name = "ma_sv2")
    private String maSv2;
    @Column(name = "ma_gvhd")
    private String maGvhd;
    @Column(name = "ma_gvpb")
    private String maGvpb;
    @Column(name = "file_nop")
    private String fileNop;
    @Column(name = "tinh_trangkl")
    private Short tinhTrangkl;

    public Khoaluan() {
    }

    public Khoaluan(KhoaluanPK khoaluanPK) {
        this.khoaluanPK = khoaluanPK;
    }

    public Khoaluan(int maKl, int maDk, String maSv, int maHd) {
        this.khoaluanPK = new KhoaluanPK(maKl, maDk, maSv, maHd);
    }

    public KhoaluanPK getKhoaluanPK() {
        return khoaluanPK;
    }

    public void setKhoaluanPK(KhoaluanPK khoaluanPK) {
        this.khoaluanPK = khoaluanPK;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(Date ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getMaSv2() {
        return maSv2;
    }

    public void setMaSv2(String maSv2) {
        this.maSv2 = maSv2;
    }

    public String getMaGvhd() {
        return maGvhd;
    }

    public void setMaGvhd(String maGvhd) {
        this.maGvhd = maGvhd;
    }

    public String getMaGvpb() {
        return maGvpb;
    }

    public void setMaGvpb(String maGvpb) {
        this.maGvpb = maGvpb;
    }

    public String getFileNop() {
        return fileNop;
    }

    public void setFileNop(String fileNop) {
        this.fileNop = fileNop;
    }

    public Short getTinhTrangkl() {
        return tinhTrangkl;
    }

    public void setTinhTrangkl(Short tinhTrangkl) {
        this.tinhTrangkl = tinhTrangkl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (khoaluanPK != null ? khoaluanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khoaluan)) {
            return false;
        }
        Khoaluan other = (Khoaluan) object;
        if ((this.khoaluanPK == null && other.khoaluanPK != null) || (this.khoaluanPK != null && !this.khoaluanPK.equals(other.khoaluanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Khoaluan[ khoaluanPK=" + khoaluanPK + " ]";
    }
    
}
