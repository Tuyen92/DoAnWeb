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
@Table(name = "tieuchi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tieuchi.findAll", query = "SELECT t FROM Tieuchi t"),
    @NamedQuery(name = "Tieuchi.findByMaTc", query = "SELECT t FROM Tieuchi t WHERE t.maTc = :maTc"),
    @NamedQuery(name = "Tieuchi.findByNoiDung", query = "SELECT t FROM Tieuchi t WHERE t.noiDung = :noiDung"),
    @NamedQuery(name = "Tieuchi.findByPhanTram", query = "SELECT t FROM Tieuchi t WHERE t.phanTram = :phanTram")})
public class Tieuchi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_tc")
    private String maTc;
    @Column(name = "noi_dung")
    private String noiDung;
    @Column(name = "phan_tram")
    private String phanTram;

    public Tieuchi() {
    }

    public Tieuchi(String maTc) {
        this.maTc = maTc;
    }

    public String getMaTc() {
        return maTc;
    }

    public void setMaTc(String maTc) {
        this.maTc = maTc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTc != null ? maTc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tieuchi)) {
            return false;
        }
        Tieuchi other = (Tieuchi) object;
        if ((this.maTc == null && other.maTc != null) || (this.maTc != null && !this.maTc.equals(other.maTc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Tieuchi[ maTc=" + maTc + " ]";
    }
    
}
