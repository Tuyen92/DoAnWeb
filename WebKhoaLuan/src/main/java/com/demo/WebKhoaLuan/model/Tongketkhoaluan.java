/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.WebKhoaLuan.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tongketkhoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tongketkhoaluan.findAll", query = "SELECT t FROM Tongketkhoaluan t"),
    @NamedQuery(name = "Tongketkhoaluan.findByMaTk", query = "SELECT t FROM Tongketkhoaluan t WHERE t.maTk = :maTk"),
    @NamedQuery(name = "Tongketkhoaluan.findByKetQua", query = "SELECT t FROM Tongketkhoaluan t WHERE t.ketQua = :ketQua"),
    @NamedQuery(name = "Tongketkhoaluan.findByDiem", query = "SELECT t FROM Tongketkhoaluan t WHERE t.diem = :diem"),
    @NamedQuery(name = "Tongketkhoaluan.findByNam", query = "SELECT t FROM Tongketkhoaluan t WHERE t.nam = :nam"),
    @NamedQuery(name = "Tongketkhoaluan.findByMaNganh", query = "SELECT t FROM Tongketkhoaluan t WHERE t.maNganh = :maNganh")})
public class Tongketkhoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_tk")
    private Integer maTk;
    @Column(name = "ket_qua")
    private String ketQua;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diem")
    private BigDecimal diem;
    @Column(name = "nam")
    private String nam;
    @Column(name = "ma_nganh")
    private String maNganh;

    public Tongketkhoaluan() {
    }

    public Tongketkhoaluan(Integer maTk) {
        this.maTk = maTk;
    }

    public Integer getMaTk() {
        return maTk;
    }

    public void setMaTk(Integer maTk) {
        this.maTk = maTk;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public BigDecimal getDiem() {
        return diem;
    }

    public void setDiem(BigDecimal diem) {
        this.diem = diem;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTk != null ? maTk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tongketkhoaluan)) {
            return false;
        }
        Tongketkhoaluan other = (Tongketkhoaluan) object;
        if ((this.maTk == null && other.maTk != null) || (this.maTk != null && !this.maTk.equals(other.maTk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.WebKhoaLuan.model.Tongketkhoaluan[ maTk=" + maTk + " ]";
    }
    
}
