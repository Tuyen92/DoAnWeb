/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author PC
 */
@Embeddable
public class KhoaluanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ma_kl")
    private int maKl;
    @Basic(optional = false)
    @Column(name = "ma_dk")
    private int maDk;
    @Basic(optional = false)
    @Column(name = "ma_sv")
    private String maSv;
    @Basic(optional = false)
    @Column(name = "ma_hd")
    private int maHd;

    public KhoaluanPK() {
    }

    public KhoaluanPK(int maKl, int maDk, String maSv, int maHd) {
        this.maKl = maKl;
        this.maDk = maDk;
        this.maSv = maSv;
        this.maHd = maHd;
    }

    public int getMaKl() {
        return maKl;
    }

    public void setMaKl(int maKl) {
        this.maKl = maKl;
    }

    public int getMaDk() {
        return maDk;
    }

    public void setMaDk(int maDk) {
        this.maDk = maDk;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getMaHd() {
        return maHd;
    }

    public void setMaHd(int maHd) {
        this.maHd = maHd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) maKl;
        hash += (int) maDk;
        hash += (maSv != null ? maSv.hashCode() : 0);
        hash += (int) maHd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhoaluanPK)) {
            return false;
        }
        KhoaluanPK other = (KhoaluanPK) object;
        if (this.maKl != other.maKl) {
            return false;
        }
        if (this.maDk != other.maDk) {
            return false;
        }
        if ((this.maSv == null && other.maSv != null) || (this.maSv != null && !this.maSv.equals(other.maSv))) {
            return false;
        }
        if (this.maHd != other.maHd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.KhoaluanPK[ maKl=" + maKl + ", maDk=" + maDk + ", maSv=" + maSv + ", maHd=" + maHd + " ]";
    }
    
}
