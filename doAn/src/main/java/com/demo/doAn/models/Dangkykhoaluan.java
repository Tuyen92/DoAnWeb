/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "dangkykhoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dangkykhoaluan.findAll", query = "SELECT d FROM Dangkykhoaluan d"),
    @NamedQuery(name = "Dangkykhoaluan.findByMaDK", query = "SELECT d FROM Dangkykhoaluan d WHERE d.dangkykhoaluanPK.maDK = :maDK"),
    @NamedQuery(name = "Dangkykhoaluan.findByNgayDK", query = "SELECT d FROM Dangkykhoaluan d WHERE d.ngayDK = :ngayDK"),
    @NamedQuery(name = "Dangkykhoaluan.findByMaSV", query = "SELECT d FROM Dangkykhoaluan d WHERE d.dangkykhoaluanPK.maSV = :maSV")})
public class Dangkykhoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DangkykhoaluanPK dangkykhoaluanPK;
    @Column(name = "ngayDK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDK;
    @JoinColumn(name = "maDT", referencedColumnName = "maDT")
    @ManyToOne(optional = false)
    private Detai maDT;
    @JoinColumn(name = "maSV", referencedColumnName = "maSV", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinhvien sinhvien;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dangkykhoaluan")
    private Set<Khoaluan> khoaluanSet;

    public Dangkykhoaluan() {
    }

    public Dangkykhoaluan(DangkykhoaluanPK dangkykhoaluanPK) {
        this.dangkykhoaluanPK = dangkykhoaluanPK;
    }

    public Dangkykhoaluan(int maDK, String maSV) {
        this.dangkykhoaluanPK = new DangkykhoaluanPK(maDK, maSV);
    }

    public DangkykhoaluanPK getDangkykhoaluanPK() {
        return dangkykhoaluanPK;
    }

    public void setDangkykhoaluanPK(DangkykhoaluanPK dangkykhoaluanPK) {
        this.dangkykhoaluanPK = dangkykhoaluanPK;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public Detai getMaDT() {
        return maDT;
    }

    public void setMaDT(Detai maDT) {
        this.maDT = maDT;
    }

    public Sinhvien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }

    @XmlTransient
    public Set<Khoaluan> getKhoaluanSet() {
        return khoaluanSet;
    }

    public void setKhoaluanSet(Set<Khoaluan> khoaluanSet) {
        this.khoaluanSet = khoaluanSet;
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
        return "com.demo.doAn.models.Dangkykhoaluan[ dangkykhoaluanPK=" + dangkykhoaluanPK + " ]";
    }
    
}
