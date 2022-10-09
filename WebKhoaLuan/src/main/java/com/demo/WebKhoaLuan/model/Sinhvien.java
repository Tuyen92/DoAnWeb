/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "sinhvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinhvien.findAll", query = "SELECT s FROM Sinhvien s"),
    @NamedQuery(name = "Sinhvien.findByMaSv", query = "SELECT s FROM Sinhvien s WHERE s.maSv = :maSv"),
    @NamedQuery(name = "Sinhvien.findByNienKhoa", query = "SELECT s FROM Sinhvien s WHERE s.nienKhoa = :nienKhoa"),
    @NamedQuery(name = "Sinhvien.findByTinhTrang", query = "SELECT s FROM Sinhvien s WHERE s.tinhTrang = :tinhTrang"),
    @NamedQuery(name = "Sinhvien.findByMaNganh", query = "SELECT s FROM Sinhvien s WHERE s.maNganh = :maNganh"),
    @NamedQuery(name = "Sinhvien.findByMaKhoa", query = "SELECT s FROM Sinhvien s WHERE s.maKhoa = :maKhoa")})
public class Sinhvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_sv")
    private String maSv;
    @Column(name = "nien_khoa")
    private String nienKhoa;
    @Column(name = "tinh_trang")
    private Short tinhTrang;
    @Basic(optional = false)
    @Column(name = "ma_nganh")
    private String maNganh;
    @Basic(optional = false)
    @Column(name = "ma_khoa")
    private String maKhoa;

    public Sinhvien() {
    }

    public Sinhvien(String maSv) {
        this.maSv = maSv;
    }

    public Sinhvien(String maSv, String maNganh, String maKhoa) {
        this.maSv = maSv;
        this.maNganh = maNganh;
        this.maKhoa = maKhoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public Short getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Short tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSv != null ? maSv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sinhvien)) {
            return false;
        }
        Sinhvien other = (Sinhvien) object;
        if ((this.maSv == null && other.maSv != null) || (this.maSv != null && !this.maSv.equals(other.maSv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Sinhvien[ maSv=" + maSv + " ]";
    }
    
}
