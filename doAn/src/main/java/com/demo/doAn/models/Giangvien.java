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
@Table(name = "giangvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giangvien.findAll", query = "SELECT g FROM Giangvien g"),
    @NamedQuery(name = "Giangvien.findByMaGV", query = "SELECT g FROM Giangvien g WHERE g.maGV = :maGV"),
    @NamedQuery(name = "Giangvien.findByHocVi", query = "SELECT g FROM Giangvien g WHERE g.hocVi = :hocVi"),
    @NamedQuery(name = "Giangvien.findByHocHam", query = "SELECT g FROM Giangvien g WHERE g.hocHam = :hocHam")})
public class Giangvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maGV")
    private String maGV;
    @Column(name = "hocVi")
    private String hocVi;
    @Column(name = "hocHam")
    private String hocHam;
    @JoinColumns({
        @JoinColumn(name = "maND", referencedColumnName = "maND"),
        @JoinColumn(name = "maCV", referencedColumnName = "maCV")})
    @ManyToOne(optional = false)
    private Nguoidung nguoidung;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "giangvien")
    private Set<Chitiethoidong> chitiethoidongSet;

    public Giangvien() {
    }

    public Giangvien(String maGV) {
        this.maGV = maGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
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

    public Nguoidung getNguoidung() {
        return nguoidung;
    }

    public void setNguoidung(Nguoidung nguoidung) {
        this.nguoidung = nguoidung;
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
        hash += (maGV != null ? maGV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giangvien)) {
            return false;
        }
        Giangvien other = (Giangvien) object;
        if ((this.maGV == null && other.maGV != null) || (this.maGV != null && !this.maGV.equals(other.maGV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Giangvien[ maGV=" + maGV + " ]";
    }
    
}
