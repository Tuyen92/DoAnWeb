/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "detai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detai.findAll", query = "SELECT d FROM Detai d"),
    @NamedQuery(name = "Detai.findByMaDt", query = "SELECT d FROM Detai d WHERE d.maDt = :maDt"),
    @NamedQuery(name = "Detai.findByTenDt", query = "SELECT d FROM Detai d WHERE d.tenDt = :tenDt"),
    @NamedQuery(name = "Detai.findByNoiDungdt", query = "SELECT d FROM Detai d WHERE d.noiDungdt = :noiDungdt"),
    @NamedQuery(name = "Detai.findByHanNop", query = "SELECT d FROM Detai d WHERE d.hanNop = :hanNop"),
    @NamedQuery(name = "Detai.findByMaKhoa", query = "SELECT d FROM Detai d WHERE d.maKhoa = :maKhoa")})
public class Detai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_dt")
    private String maDt;
    @Column(name = "ten_dt")
    private String tenDt;
    @Column(name = "noi_dungdt")
    private String noiDungdt;
    @Column(name = "han_nop")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hanNop;
    @Basic(optional = false)
    @Column(name = "ma_khoa")
    private String maKhoa;

    public Detai() {
    }

    public Detai(String maDt) {
        this.maDt = maDt;
    }

    public Detai(String maDt, String maKhoa) {
        this.maDt = maDt;
        this.maKhoa = maKhoa;
    }

    public String getMaDt() {
        return maDt;
    }

    public void setMaDt(String maDt) {
        this.maDt = maDt;
    }

    public String getTenDt() {
        return tenDt;
    }

    public void setTenDt(String tenDt) {
        this.tenDt = tenDt;
    }

    public String getNoiDungdt() {
        return noiDungdt;
    }

    public void setNoiDungdt(String noiDungdt) {
        this.noiDungdt = noiDungdt;
    }

    public Date getHanNop() {
        return hanNop;
    }

    public void setHanNop(Date hanNop) {
        this.hanNop = hanNop;
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
        hash += (maDt != null ? maDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detai)) {
            return false;
        }
        Detai other = (Detai) object;
        if ((this.maDt == null && other.maDt != null) || (this.maDt != null && !this.maDt.equals(other.maDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Detai[ maDt=" + maDt + " ]";
    }
    
}
