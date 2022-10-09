/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "dangkykhoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dangkykhoaluan.findAll", query = "SELECT d FROM Dangkykhoaluan d"),
    @NamedQuery(name = "Dangkykhoaluan.findByMaDk", query = "SELECT d FROM Dangkykhoaluan d WHERE d.dangkykhoaluanPK.maDk = :maDk"),
    @NamedQuery(name = "Dangkykhoaluan.findByNgayDk", query = "SELECT d FROM Dangkykhoaluan d WHERE d.ngayDk = :ngayDk"),
    @NamedQuery(name = "Dangkykhoaluan.findByMaDt", query = "SELECT d FROM Dangkykhoaluan d WHERE d.maDt = :maDt"),
    @NamedQuery(name = "Dangkykhoaluan.findByMaSv", query = "SELECT d FROM Dangkykhoaluan d WHERE d.dangkykhoaluanPK.maSv = :maSv")})
public class Dangkykhoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DangkykhoaluanPK dangkykhoaluanPK;
    @Column(name = "ngay_dk")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDk;
    @Basic(optional = false)
    @Column(name = "ma_dt")
    private String maDt;

    public Dangkykhoaluan() {
    }

    public Dangkykhoaluan(DangkykhoaluanPK dangkykhoaluanPK) {
        this.dangkykhoaluanPK = dangkykhoaluanPK;
    }

    public Dangkykhoaluan(DangkykhoaluanPK dangkykhoaluanPK, String maDt) {
        this.dangkykhoaluanPK = dangkykhoaluanPK;
        this.maDt = maDt;
    }

    public Dangkykhoaluan(int maDk, String maSv) {
        this.dangkykhoaluanPK = new DangkykhoaluanPK(maDk, maSv);
    }

    public DangkykhoaluanPK getDangkykhoaluanPK() {
        return dangkykhoaluanPK;
    }

    public void setDangkykhoaluanPK(DangkykhoaluanPK dangkykhoaluanPK) {
        this.dangkykhoaluanPK = dangkykhoaluanPK;
    }

    public Date getNgayDk() {
        return ngayDk;
    }

    public void setNgayDk(Date ngayDk) {
        this.ngayDk = ngayDk;
    }

    public String getMaDt() {
        return maDt;
    }

    public void setMaDt(String maDt) {
        this.maDt = maDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dangkykhoaluanPK != null ? dangkykhoaluanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dangkykhoaluan)) {
            return false;
        }
        Dangkykhoaluan other = (Dangkykhoaluan) object;
        if ((this.dangkykhoaluanPK == null && other.dangkykhoaluanPK != null) || (this.dangkykhoaluanPK != null && !this.dangkykhoaluanPK.equals(other.dangkykhoaluanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Dangkykhoaluan[ dangkykhoaluanPK=" + dangkykhoaluanPK + " ]";
    }
    
}
