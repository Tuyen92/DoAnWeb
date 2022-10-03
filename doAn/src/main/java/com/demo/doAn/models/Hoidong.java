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
@Table(name = "hoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoidong.findAll", query = "SELECT h FROM Hoidong h"),
    @NamedQuery(name = "Hoidong.findByMaHD", query = "SELECT h FROM Hoidong h WHERE h.maHD = :maHD"),
    @NamedQuery(name = "Hoidong.findByTenHD", query = "SELECT h FROM Hoidong h WHERE h.tenHD = :tenHD"),
    @NamedQuery(name = "Hoidong.findByNgayLap", query = "SELECT h FROM Hoidong h WHERE h.ngayLap = :ngayLap"),
    @NamedQuery(name = "Hoidong.findByTinhTrangHD", query = "SELECT h FROM Hoidong h WHERE h.tinhTrangHD = :tinhTrangHD")})
public class Hoidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maHD")
    private Integer maHD;
    @Column(name = "tenHD")
    private String tenHD;
    @Column(name = "ngayLap")
    private String ngayLap;
    @Column(name = "tinhTrangHD")
    private Short tinhTrangHD;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoidong")
    private Set<Chitiethoidong> chitiethoidongSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoidong")
    private Set<Khoaluan> khoaluanSet;

    public Hoidong() {
    }

    public Hoidong(Integer maHD) {
        this.maHD = maHD;
    }

    public Integer getMaHD() {
        return maHD;
    }

    public void setMaHD(Integer maHD) {
        this.maHD = maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Short getTinhTrangHD() {
        return tinhTrangHD;
    }

    public void setTinhTrangHD(Short tinhTrangHD) {
        this.tinhTrangHD = tinhTrangHD;
    }

    @XmlTransient
    public Set<Chitiethoidong> getChitiethoidongSet() {
        return chitiethoidongSet;
    }

    public void setChitiethoidongSet(Set<Chitiethoidong> chitiethoidongSet) {
        this.chitiethoidongSet = chitiethoidongSet;
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
        hash += (maHD != null ? maHD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoidong)) {
            return false;
        }
        Hoidong other = (Hoidong) object;
        if ((this.maHD == null && other.maHD != null) || (this.maHD != null && !this.maHD.equals(other.maHD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Hoidong[ maHD=" + maHD + " ]";
    }
    
}
