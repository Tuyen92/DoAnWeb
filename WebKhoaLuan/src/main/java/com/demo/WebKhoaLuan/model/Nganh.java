/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "nganh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nganh.findAll", query = "SELECT n FROM Nganh n"),
    @NamedQuery(name = "Nganh.findByMaNganh", query = "SELECT n FROM Nganh n WHERE n.nganhPK.maNganh = :maNganh"),
    @NamedQuery(name = "Nganh.findByTenNganh", query = "SELECT n FROM Nganh n WHERE n.tenNganh = :tenNganh"),
    @NamedQuery(name = "Nganh.findByThongTin", query = "SELECT n FROM Nganh n WHERE n.thongTin = :thongTin"),
    @NamedQuery(name = "Nganh.findByMaKhoa", query = "SELECT n FROM Nganh n WHERE n.nganhPK.maKhoa = :maKhoa")})
public class Nganh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NganhPK nganhPK;
    @Column(name = "ten_nganh")
    private String tenNganh;
    @Column(name = "thong_tin")
    private String thongTin;

    public Nganh() {
    }

    public Nganh(NganhPK nganhPK) {
        this.nganhPK = nganhPK;
    }

    public Nganh(String maNganh, String maKhoa) {
        this.nganhPK = new NganhPK(maNganh, maKhoa);
    }

    public NganhPK getNganhPK() {
        return nganhPK;
    }

    public void setNganhPK(NganhPK nganhPK) {
        this.nganhPK = nganhPK;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nganhPK != null ? nganhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nganh)) {
            return false;
        }
        Nganh other = (Nganh) object;
        if ((this.nganhPK == null && other.nganhPK != null) || (this.nganhPK != null && !this.nganhPK.equals(other.nganhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Nganh[ nganhPK=" + nganhPK + " ]";
    }
    
}
