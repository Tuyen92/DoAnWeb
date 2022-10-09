/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author PC
 */
@Embeddable
public class NguoidungPK implements Serializable {
    @GeneratedValue  
    @Basic(optional = false)
    @Column(name = "ma_nd")
    private String maNd;
    
    @GeneratedValue  
    @Basic(optional = false)
    @Column(name = "ma_cv")
    private String maCv;

    public NguoidungPK() {
    }

    public NguoidungPK(String maNd, String maCv) {
        this.maNd = maNd;
        this.maCv = maCv;
    }

    public String getMaNd() {
        return maNd;
    }

    public void setMaNd(String maNd) {
        this.maNd = maNd;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNd != null ? maNd.hashCode() : 0);
        hash += (maCv != null ? maCv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NguoidungPK)) {
            return false;
        }
        NguoidungPK other = (NguoidungPK) object;
        if ((this.maNd == null && other.maNd != null) || (this.maNd != null && !this.maNd.equals(other.maNd))) {
            return false;
        }
        if ((this.maCv == null && other.maCv != null) || (this.maCv != null && !this.maCv.equals(other.maCv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.NguoidungPK[ maNd=" + maNd + ", maCv=" + maCv + " ]";
    }
    
}
