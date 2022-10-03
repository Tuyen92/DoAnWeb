/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ADMIN
 */
@Embeddable
public class NguoidungPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "maND")
    private String maND;
    @Basic(optional = false)
    @Column(name = "maCV")
    private String maCV;

    public NguoidungPK() {
    }

    public NguoidungPK(String maND, String maCV) {
        this.maND = maND;
        this.maCV = maCV;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maND != null ? maND.hashCode() : 0);
        hash += (maCV != null ? maCV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NguoidungPK)) {
            return false;
        }
        NguoidungPK other = (NguoidungPK) object;
        if ((this.maND == null && other.maND != null) || (this.maND != null && !this.maND.equals(other.maND))) {
            return false;
        }
        if ((this.maCV == null && other.maCV != null) || (this.maCV != null && !this.maCV.equals(other.maCV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.NguoidungPK[ maND=" + maND + ", maCV=" + maCV + " ]";
    }
    
}
