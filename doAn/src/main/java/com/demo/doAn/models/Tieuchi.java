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
@Table(name = "tieuchi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tieuchi.findAll", query = "SELECT t FROM Tieuchi t"),
    @NamedQuery(name = "Tieuchi.findByMaTC", query = "SELECT t FROM Tieuchi t WHERE t.maTC = :maTC"),
    @NamedQuery(name = "Tieuchi.findByNoiDung", query = "SELECT t FROM Tieuchi t WHERE t.noiDung = :noiDung"),
    @NamedQuery(name = "Tieuchi.findByPhanTram", query = "SELECT t FROM Tieuchi t WHERE t.phanTram = :phanTram")})
public class Tieuchi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maTC")
    private String maTC;
    @Column(name = "noiDung")
    private String noiDung;
    @Column(name = "phanTram")
    private String phanTram;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tieuchi")
    private Set<Diem> diemSet;

    public Tieuchi() {
    }

    public Tieuchi(String maTC) {
        this.maTC = maTC;
    }

    public String getMaTC() {
        return maTC;
    }

    public void setMaTC(String maTC) {
        this.maTC = maTC;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(String phanTram) {
        this.phanTram = phanTram;
    }

    @XmlTransient
    public Set<Diem> getDiemSet() {
        return diemSet;
    }

    public void setDiemSet(Set<Diem> diemSet) {
        this.diemSet = diemSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTC != null ? maTC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tieuchi)) {
            return false;
        }
        Tieuchi other = (Tieuchi) object;
        if ((this.maTC == null && other.maTC != null) || (this.maTC != null && !this.maTC.equals(other.maTC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Tieuchi[ maTC=" + maTC + " ]";
    }
    
}
