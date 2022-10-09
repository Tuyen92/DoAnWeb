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
@Table(name = "chucvu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chucvu.findAll", query = "SELECT c FROM Chucvu c"),
    @NamedQuery(name = "Chucvu.findByMaCv", query = "SELECT c FROM Chucvu c WHERE c.maCv = :maCv"),
    @NamedQuery(name = "Chucvu.findByTenCv", query = "SELECT c FROM Chucvu c WHERE c.tenCv = :tenCv")})
public class Chucvu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma_cv")
    private String maCv;
    @Column(name = "ten_cv")
    private String tenCv;

    public Chucvu() {
    }

    public Chucvu(String maCv) {
        this.maCv = maCv;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getTenCv() {
        return tenCv;
    }

    public void setTenCv(String tenCv) {
        this.tenCv = tenCv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCv != null ? maCv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chucvu)) {
            return false;
        }
        Chucvu other = (Chucvu) object;
        if ((this.maCv == null && other.maCv != null) || (this.maCv != null && !this.maCv.equals(other.maCv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Chucvu[ maCv=" + maCv + " ]";
    }
    
}
