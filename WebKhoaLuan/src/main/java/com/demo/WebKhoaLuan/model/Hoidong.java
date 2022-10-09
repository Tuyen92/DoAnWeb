/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author PC
 */
@Entity
@Table(name = "hoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoidong.findAll", query = "SELECT h FROM Hoidong h"),
    @NamedQuery(name = "Hoidong.findByMaHd", query = "SELECT h FROM Hoidong h WHERE h.maHd = :maHd"),
    @NamedQuery(name = "Hoidong.findByTenHd", query = "SELECT h FROM Hoidong h WHERE h.tenHd = :tenHd"),
    @NamedQuery(name = "Hoidong.findByNgayLap", query = "SELECT h FROM Hoidong h WHERE h.ngayLap = :ngayLap"),
    @NamedQuery(name = "Hoidong.findByTinhTranghd", query = "SELECT h FROM Hoidong h WHERE h.tinhTranghd = :tinhTranghd")})
public class Hoidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_hd")
    private Integer maHd;
    @Column(name = "ten_hd")
    private String tenHd;
    @Column(name = "ngay_lap")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayLap;
    @Column(name = "tinh_tranghd")
    private Short tinhTranghd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoidong")
    private Set<Chitiethoidong> chitiethoidongSet;

    public Hoidong() {
    }

    public Hoidong(Integer maHd) {
        this.maHd = maHd;
    }

    public Integer getMaHd() {
        return maHd;
    }

    public void setMaHd(Integer maHd) {
        this.maHd = maHd;
    }

    public String getTenHd() {
        return tenHd;
    }

    public void setTenHd(String tenHd) {
        this.tenHd = tenHd;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Short getTinhTranghd() {
        return tinhTranghd;
    }

    public void setTinhTranghd(Short tinhTranghd) {
        this.tinhTranghd = tinhTranghd;
    }

    @XmlTransient
    public Set<Chitiethoidong> getChitiethoidongSet() {
        return chitiethoidongSet;
    }

    public void setChitiethoidongSet(Set<Chitiethoidong> chitiethoidongSet) {
        this.chitiethoidongSet = chitiethoidongSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maHd != null ? maHd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoidong)) {
            return false;
        }
        Hoidong other = (Hoidong) object;
        if ((this.maHd == null && other.maHd != null) || (this.maHd != null && !this.maHd.equals(other.maHd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Hoidong[ maHd=" + maHd + " ]";
    }
    
}
