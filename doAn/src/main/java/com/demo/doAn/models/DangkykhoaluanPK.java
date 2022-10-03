/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ADMIN
 */
@Embeddable
public class DangkykhoaluanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "maDK")
    private int maDK;
    @Basic(optional = false)
    @Column(name = "maSV")
    private String maSV;

    public DangkykhoaluanPK() {
    }

    public DangkykhoaluanPK(int maDK, String maSV) {
        this.maDK = maDK;
        this.maSV = maSV;
    }

    public int getMaDK() {
        return maDK;
    }

    public void setMaDK(int maDK) {
        this.maDK = maDK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) maDK;
        hash += (maSV != null ? maSV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DangkykhoaluanPK)) {
            return false;
        }
        DangkykhoaluanPK other = (DangkykhoaluanPK) object;
        if (this.maDK != other.maDK) {
            return false;
        }
        if ((this.maSV == null && other.maSV != null) || (this.maSV != null && !this.maSV.equals(other.maSV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.DangkykhoaluanPK[ maDK=" + maDK + ", maSV=" + maSV + " ]";
    }
    
}
