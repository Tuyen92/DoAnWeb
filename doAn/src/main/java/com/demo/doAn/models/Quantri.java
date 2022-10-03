/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "quantri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quantri.findAll", query = "SELECT q FROM Quantri q"),
    @NamedQuery(name = "Quantri.findByMaQT", query = "SELECT q FROM Quantri q WHERE q.maQT = :maQT"),
    @NamedQuery(name = "Quantri.findByCongViec", query = "SELECT q FROM Quantri q WHERE q.congViec = :congViec")})
public class Quantri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maQT")
    private String maQT;
    @Column(name = "congViec")
    private String congViec;
    @JoinColumns({
        @JoinColumn(name = "maND", referencedColumnName = "maND"),
        @JoinColumn(name = "maCV", referencedColumnName = "maCV")})
    @ManyToOne(optional = false)
    private Nguoidung nguoidung;

    public Quantri() {
    }

    public Quantri(String maQT) {
        this.maQT = maQT;
    }

    public String getMaQT() {
        return maQT;
    }

    public void setMaQT(String maQT) {
        this.maQT = maQT;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
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
        hash += (maQT != null ? maQT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quantri)) {
            return false;
        }
        Quantri other = (Quantri) object;
        if ((this.maQT == null && other.maQT != null) || (this.maQT != null && !this.maQT.equals(other.maQT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Quantri[ maQT=" + maQT + " ]";
    }
    
}
