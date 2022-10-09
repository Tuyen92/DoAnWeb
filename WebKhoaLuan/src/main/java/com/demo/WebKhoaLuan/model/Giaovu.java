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
@Table(name = "giaovu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giaovu.findAll", query = "SELECT g FROM Giaovu g"),
    @NamedQuery(name = "Giaovu.findByMaGvu", query = "SELECT g FROM Giaovu g WHERE g.maGvu = :maGvu"),
    @NamedQuery(name = "Giaovu.findByPhongBan", query = "SELECT g FROM Giaovu g WHERE g.phongBan = :phongBan"),
    @NamedQuery(name = "Giaovu.findByMaNd", query = "SELECT g FROM Giaovu g WHERE g.maNd = :maNd"),
    @NamedQuery(name = "Giaovu.findByMaCv", query = "SELECT g FROM Giaovu g WHERE g.maCv = :maCv")})
public class Giaovu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_gvu")
    private String maGvu;
    @Column(name = "phong_ban")
    private String phongBan;
    @Basic(optional = false)
    @Column(name = "ma_nd")
    private String maNd;
    @Basic(optional = false)
    @Column(name = "ma_cv")
    private String maCv;

    public Giaovu() {
    }

    public Giaovu(String maGvu) {
        this.maGvu = maGvu;
    }

    public Giaovu(String maGvu, String maNd, String maCv) {
        this.maGvu = maGvu;
        this.maNd = maNd;
        this.maCv = maCv;
    }

    public String getMaGvu() {
        return maGvu;
    }

    public void setMaGvu(String maGvu) {
        this.maGvu = maGvu;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
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
        hash += (maGvu != null ? maGvu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giaovu)) {
            return false;
        }
        Giaovu other = (Giaovu) object;
        if ((this.maGvu == null && other.maGvu != null) || (this.maGvu != null && !this.maGvu.equals(other.maGvu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Giaovu[ maGvu=" + maGvu + " ]";
    }
    
}
