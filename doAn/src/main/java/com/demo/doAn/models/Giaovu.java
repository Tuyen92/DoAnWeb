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
@Table(name = "giaovu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giaovu.findAll", query = "SELECT g FROM Giaovu g"),
    @NamedQuery(name = "Giaovu.findByMaGVU", query = "SELECT g FROM Giaovu g WHERE g.maGVU = :maGVU"),
    @NamedQuery(name = "Giaovu.findByPhongBan", query = "SELECT g FROM Giaovu g WHERE g.phongBan = :phongBan")})
public class Giaovu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maGVU")
    private String maGVU;
    @Column(name = "phongBan")
    private String phongBan;
    @JoinColumns({
        @JoinColumn(name = "maND", referencedColumnName = "maND"),
        @JoinColumn(name = "maCV", referencedColumnName = "maCV")})
    @ManyToOne(optional = false)
    private Nguoidung nguoidung;

    public Giaovu() {
    }

    public Giaovu(String maGVU) {
        this.maGVU = maGVU;
    }

    public String getMaGVU() {
        return maGVU;
    }

    public void setMaGVU(String maGVU) {
        this.maGVU = maGVU;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
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
        hash += (maGVU != null ? maGVU.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giaovu)) {
            return false;
        }
        Giaovu other = (Giaovu) object;
        if ((this.maGVU == null && other.maGVU != null) || (this.maGVU != null && !this.maGVU.equals(other.maGVU))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Giaovu[ maGVU=" + maGVU + " ]";
    }
    
}
