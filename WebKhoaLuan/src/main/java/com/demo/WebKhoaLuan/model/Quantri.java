/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "quantri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quantri.findAll", query = "SELECT q FROM Quantri q"),
    @NamedQuery(name = "Quantri.findByMaQt", query = "SELECT q FROM Quantri q WHERE q.maQt = :maQt"),
    @NamedQuery(name = "Quantri.findByCongViec", query = "SELECT q FROM Quantri q WHERE q.congViec = :congViec"),
    @NamedQuery(name = "Quantri.findByMaNd", query = "SELECT q FROM Quantri q WHERE q.maNd = :maNd"),
    @NamedQuery(name = "Quantri.findByMaCv", query = "SELECT q FROM Quantri q WHERE q.maCv = :maCv")})
public class Quantri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_qt")
    private String maQt;
    @Column(name = "cong_viec")
    private String congViec;
    @Basic(optional = false)
    @Column(name = "ma_nd")
    private String maNd;
    @Basic(optional = false)
    @Column(name = "ma_cv")
    private String maCv;

    public Quantri() {
    }

    public Quantri(String maQt) {
        this.maQt = maQt;
    }

    public Quantri(String maQt, String maNd, String maCv) {
        this.maQt = maQt;
        this.maNd = maNd;
        this.maCv = maCv;
    }

    public String getMaQt() {
        return maQt;
    }

    public void setMaQt(String maQt) {
        this.maQt = maQt;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQt != null ? maQt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quantri)) {
            return false;
        }
        Quantri other = (Quantri) object;
        if ((this.maQt == null && other.maQt != null) || (this.maQt != null && !this.maQt.equals(other.maQt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Quantri[ maQt=" + maQt + " ]";
    }
    
}
