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
public class NganhPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ma_nganh")
    private String maNganh;
    @Basic(optional = false)
    @Column(name = "ma_khoa")
    private String maKhoa;

    public NganhPK() {
    }

    public NganhPK(String maNganh, String maKhoa) {
        this.maNganh = maNganh;
        this.maKhoa = maKhoa;
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
        hash += (maNganh != null ? maNganh.hashCode() : 0);
        hash += (maKhoa != null ? maKhoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NganhPK)) {
            return false;
        }
        NganhPK other = (NganhPK) object;
        if ((this.maNganh == null && other.maNganh != null) || (this.maNganh != null && !this.maNganh.equals(other.maNganh))) {
            return false;
        }
        if ((this.maKhoa == null && other.maKhoa != null) || (this.maKhoa != null && !this.maKhoa.equals(other.maKhoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.NganhPK[ maNganh=" + maNganh + ", maKhoa=" + maKhoa + " ]";
    }
    
}
