/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "sinhvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinhvien.findAll", query = "SELECT s FROM Sinhvien s"),
    @NamedQuery(name = "Sinhvien.findByMaSV", query = "SELECT s FROM Sinhvien s WHERE s.maSV = :maSV"),
    @NamedQuery(name = "Sinhvien.findByNienKhoa", query = "SELECT s FROM Sinhvien s WHERE s.nienKhoa = :nienKhoa"),
    @NamedQuery(name = "Sinhvien.findByTinhTrang", query = "SELECT s FROM Sinhvien s WHERE s.tinhTrang = :tinhTrang")})
public class Sinhvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maSV")
    private String maSV;
    @Column(name = "nienKhoa")
    private String nienKhoa;
    @Column(name = "tinhTrang")
    private Short tinhTrang;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinhvien")
    private Set<Dangkykhoaluan> dangkykhoaluanSet;
    @JoinColumns({
        @JoinColumn(name = "maNganh", referencedColumnName = "maNganh"),
        @JoinColumn(name = "maKhoa", referencedColumnName = "maKhoa")})
    @ManyToOne(optional = false)
    private Nganh nganh;
    @JoinColumns({
        @JoinColumn(name = "maND", referencedColumnName = "maND"),
        @JoinColumn(name = "maCV", referencedColumnName = "maCV")})
    @ManyToOne(optional = false)
    private Nguoidung nguoidung;

    public Sinhvien() {
    }

    public Sinhvien(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public Short getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Short tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @XmlTransient
    public Set<Dangkykhoaluan> getDangkykhoaluanSet() {
        return dangkykhoaluanSet;
    }

    public void setDangkykhoaluanSet(Set<Dangkykhoaluan> dangkykhoaluanSet) {
        this.dangkykhoaluanSet = dangkykhoaluanSet;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }

    public Nguoidung getNguoidung() {
        return nguoidung;
    }

    public void setNguoidung(Nguoidung nguoidung) {
        this.nguoidung = nguoidung;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSV != null ? maSV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sinhvien)) {
            return false;
        }
        Sinhvien other = (Sinhvien) object;
        if ((this.maSV == null && other.maSV != null) || (this.maSV != null && !this.maSV.equals(other.maSV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Sinhvien[ maSV=" + maSV + " ]";
    }
    
}
