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
public class DiemPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "maTC")
    private String maTC;
    @Basic(optional = false)
    @Column(name = "maKL")
    private int maKL;
    @Basic(optional = false)
    @Column(name = "maDK")
    private int maDK;
    @Basic(optional = false)
    @Column(name = "maSV")
    private String maSV;
    @Basic(optional = false)
    @Column(name = "maHD")
    private int maHD;

    public DiemPK() {
    }

    public DiemPK(String maTC, int maKL, int maDK, String maSV, int maHD) {
        this.maTC = maTC;
        this.maKL = maKL;
        this.maDK = maDK;
        this.maSV = maSV;
        this.maHD = maHD;
    }

    public String getMaTC() {
        return maTC;
    }

    public void setMaTC(String maTC) {
        this.maTC = maTC;
    }

    public int getMaKL() {
        return maKL;
    }

    public void setMaKL(int maKL) {
        this.maKL = maKL;
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

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTC != null ? maTC.hashCode() : 0);
        hash += (int) maKL;
        hash += (int) maDK;
        hash += (maSV != null ? maSV.hashCode() : 0);
        hash += (int) maHD;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiemPK)) {
            return false;
        }
        DiemPK other = (DiemPK) object;
        if ((this.maTC == null && other.maTC != null) || (this.maTC != null && !this.maTC.equals(other.maTC))) {
            return false;
        }
        if (this.maKL != other.maKL) {
            return false;
        }
        if (this.maDK != other.maDK) {
            return false;
        }
        if ((this.maSV == null && other.maSV != null) || (this.maSV != null && !this.maSV.equals(other.maSV))) {
            return false;
        }
        if (this.maHD != other.maHD) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.DiemPK[ maTC=" + maTC + ", maKL=" + maKL + ", maDK=" + maDK + ", maSV=" + maSV + ", maHD=" + maHD + " ]";
    }
    
}
