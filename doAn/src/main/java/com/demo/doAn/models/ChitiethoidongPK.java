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
public class ChitiethoidongPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "maGV")
    private String maGV;
    @Basic(optional = false)
    @Column(name = "maHD")
    private int maHD;

    public ChitiethoidongPK() {
    }

    public ChitiethoidongPK(String maGV, int maHD) {
        this.maGV = maGV;
        this.maHD = maHD;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maGV != null ? maGV.hashCode() : 0);
        hash += (int) maHD;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChitiethoidongPK)) {
            return false;
        }
        ChitiethoidongPK other = (ChitiethoidongPK) object;
        if ((this.maGV == null && other.maGV != null) || (this.maGV != null && !this.maGV.equals(other.maGV))) {
            return false;
        }
        if (this.maHD != other.maHD) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.ChitiethoidongPK[ maGV=" + maGV + ", maHD=" + maHD + " ]";
    }
    
}
