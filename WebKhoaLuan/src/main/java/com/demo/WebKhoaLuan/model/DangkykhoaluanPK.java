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
public class DangkykhoaluanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ma_dk")
    private int maDk;
    @Basic(optional = false)
    @Column(name = "ma_sv")
    private String maSv;

    public DangkykhoaluanPK() {
    }

    public DangkykhoaluanPK(int maDk, String maSv) {
        this.maDk = maDk;
        this.maSv = maSv;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) maDk;
        hash += (maSv != null ? maSv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DangkykhoaluanPK)) {
            return false;
        }
        DangkykhoaluanPK other = (DangkykhoaluanPK) object;
        if (this.maDk != other.maDk) {
            return false;
        }
        if ((this.maSv == null && other.maSv != null) || (this.maSv != null && !this.maSv.equals(other.maSv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.DangkykhoaluanPK[ maDk=" + maDk + ", maSv=" + maSv + " ]";
    }
    
}
