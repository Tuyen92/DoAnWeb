/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "chitiethoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chitiethoidong.findAll", query = "SELECT c FROM Chitiethoidong c"),
    @NamedQuery(name = "Chitiethoidong.findByMaGV", query = "SELECT c FROM Chitiethoidong c WHERE c.chitiethoidongPK.maGV = :maGV"),
    @NamedQuery(name = "Chitiethoidong.findByMaHD", query = "SELECT c FROM Chitiethoidong c WHERE c.chitiethoidongPK.maHD = :maHD"),
    @NamedQuery(name = "Chitiethoidong.findByChucVuHD", query = "SELECT c FROM Chitiethoidong c WHERE c.chucVuHD = :chucVuHD")})
public class Chitiethoidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChitiethoidongPK chitiethoidongPK;
    @Column(name = "chucVuHD")
    private String chucVuHD;
    @JoinColumn(name = "maGV", referencedColumnName = "maGV", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Giangvien giangvien;
    @JoinColumn(name = "maHD", referencedColumnName = "maHD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hoidong hoidong;

    public Chitiethoidong() {
    }

    public Chitiethoidong(ChitiethoidongPK chitiethoidongPK) {
        this.chitiethoidongPK = chitiethoidongPK;
    }

    public Chitiethoidong(String maGV, int maHD) {
        this.chitiethoidongPK = new ChitiethoidongPK(maGV, maHD);
    }

    public ChitiethoidongPK getChitiethoidongPK() {
        return chitiethoidongPK;
    }

    public void setChitiethoidongPK(ChitiethoidongPK chitiethoidongPK) {
        this.chitiethoidongPK = chitiethoidongPK;
    }

    public String getChucVuHD() {
        return chucVuHD;
    }

    public void setChucVuHD(String chucVuHD) {
        this.chucVuHD = chucVuHD;
    }

    public Giangvien getGiangvien() {
        return giangvien;
    }

    public void setGiangvien(Giangvien giangvien) {
        this.giangvien = giangvien;
    }

    public Hoidong getHoidong() {
        return hoidong;
    }

    public void setHoidong(Hoidong hoidong) {
        this.hoidong = hoidong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chitiethoidongPK != null ? chitiethoidongPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitiethoidong)) {
            return false;
        }
        Chitiethoidong other = (Chitiethoidong) object;
        if ((this.chitiethoidongPK == null && other.chitiethoidongPK != null) || (this.chitiethoidongPK != null && !this.chitiethoidongPK.equals(other.chitiethoidongPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Chitiethoidong[ chitiethoidongPK=" + chitiethoidongPK + " ]";
    }
    
}
