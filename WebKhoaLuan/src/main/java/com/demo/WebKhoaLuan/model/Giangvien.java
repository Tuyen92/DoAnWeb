/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

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
 * @author PC
 */
@Entity
@Table(name = "giangvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giangvien.findAll", query = "SELECT g FROM Giangvien g"),
    @NamedQuery(name = "Giangvien.findByMaGv", query = "SELECT g FROM Giangvien g WHERE g.maGv = :maGv"),
    @NamedQuery(name = "Giangvien.findByHocVi", query = "SELECT g FROM Giangvien g WHERE g.hocVi = :hocVi"),
    @NamedQuery(name = "Giangvien.findByHocHam", query = "SELECT g FROM Giangvien g WHERE g.hocHam = :hocHam"),
    @NamedQuery(name = "Giangvien.findByMaNd", query = "SELECT g FROM Giangvien g WHERE g.maNd = :maNd"),
    @NamedQuery(name = "Giangvien.findByMaCv", query = "SELECT g FROM Giangvien g WHERE g.maCv = :maCv")})
public class Giangvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_gv")
    private String maGv;
    @Column(name = "hoc_vi")
    private String hocVi;
    @Column(name = "hoc_ham")
    private String hocHam;
    @Basic(optional = false)
    @Column(name = "ma_nd")
    private String maNd;
    @Basic(optional = false)
    @Column(name = "ma_cv")
    private String maCv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "giangvien")
    private Set<Chitiethoidong> chitiethoidongSet;

    public Giangvien() {
    }

    public Giangvien(String maGv) {
        this.maGv = maGv;
    }

    public Giangvien(String maGv, String maNd, String maCv) {
        this.maGv = maGv;
        this.maNd = maNd;
        this.maCv = maCv;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
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
        hash += (maGv != null ? maGv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giangvien)) {
            return false;
        }
        Giangvien other = (Giangvien) object;
        if ((this.maGv == null && other.maGv != null) || (this.maGv != null && !this.maGv.equals(other.maGv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Giangvien[ maGv=" + maGv + " ]";
    }
    
}
