/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "detai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detai.findAll", query = "SELECT d FROM Detai d"),
    @NamedQuery(name = "Detai.findByMaDT", query = "SELECT d FROM Detai d WHERE d.maDT = :maDT"),
    @NamedQuery(name = "Detai.findByTenDT", query = "SELECT d FROM Detai d WHERE d.tenDT = :tenDT"),
    @NamedQuery(name = "Detai.findByNoiDungDT", query = "SELECT d FROM Detai d WHERE d.noiDungDT = :noiDungDT"),
    @NamedQuery(name = "Detai.findByHanNop", query = "SELECT d FROM Detai d WHERE d.hanNop = :hanNop"),
    @NamedQuery(name = "Detai.findByHanNop1", query = "SELECT d FROM Detai d WHERE d.hanNop1 = :hanNop1"),
    @NamedQuery(name = "Detai.findByNoiDungdt", query = "SELECT d FROM Detai d WHERE d.noiDungdt = :noiDungdt"),
    @NamedQuery(name = "Detai.findByMaKhoa", query = "SELECT d FROM Detai d WHERE d.maKhoa = :maKhoa")})
public class Detai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maDT")
    private String maDT;
    @Column(name = "tenDT")
    private String tenDT;
    @Column(name = "noiDungDT")
    private String noiDungDT;
    @Column(name = "hanNop")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hanNop;
    @Column(name = "han_nop")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hanNop1;
    @Column(name = "noi_dungdt")
    private String noiDungdt;
    @Basic(optional = false)
    @Column(name = "ma_khoa")
    private String maKhoa;
    @JoinColumn(name = "maKhoa", referencedColumnName = "maKhoa")
    @ManyToOne(optional = false)
    private Khoa maKhoa1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDT")
    private Set<Dangkykhoaluan> dangkykhoaluanSet;

    public Detai() {
    }

    public Detai(String maDT) {
        this.maDT = maDT;
    }

    public Detai(String maDT, String maKhoa) {
        this.maDT = maDT;
        this.maKhoa = maKhoa;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getNoiDungDT() {
        return noiDungDT;
    }

    public void setNoiDungDT(String noiDungDT) {
        this.noiDungDT = noiDungDT;
    }

    public Date getHanNop() {
        return hanNop;
    }

    public void setHanNop(Date hanNop) {
        this.hanNop = hanNop;
    }

    public Date getHanNop1() {
        return hanNop1;
    }

    public void setHanNop1(Date hanNop1) {
        this.hanNop1 = hanNop1;
    }

    public String getNoiDungdt() {
        return noiDungdt;
    }

    public void setNoiDungdt(String noiDungdt) {
        this.noiDungdt = noiDungdt;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public Khoa getMaKhoa1() {
        return maKhoa1;
    }

    public void setMaKhoa1(Khoa maKhoa1) {
        this.maKhoa1 = maKhoa1;
    }

    @XmlTransient
    public Set<Dangkykhoaluan> getDangkykhoaluanSet() {
        return dangkykhoaluanSet;
    }

    public void setDangkykhoaluanSet(Set<Dangkykhoaluan> dangkykhoaluanSet) {
        this.dangkykhoaluanSet = dangkykhoaluanSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDT != null ? maDT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detai)) {
            return false;
        }
        Detai other = (Detai) object;
        if ((this.maDT == null && other.maDT != null) || (this.maDT != null && !this.maDT.equals(other.maDT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Detai[ maDT=" + maDT + " ]";
    }
    
}
