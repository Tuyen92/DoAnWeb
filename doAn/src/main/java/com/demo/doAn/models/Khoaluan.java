/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.doAn.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "khoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoaluan.findAll", query = "SELECT k FROM Khoaluan k"),
    @NamedQuery(name = "Khoaluan.findByMaKL", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maKL = :maKL"),
    @NamedQuery(name = "Khoaluan.findByNam", query = "SELECT k FROM Khoaluan k WHERE k.nam = :nam"),
    @NamedQuery(name = "Khoaluan.findByGhiChu", query = "SELECT k FROM Khoaluan k WHERE k.ghiChu = :ghiChu"),
    @NamedQuery(name = "Khoaluan.findByNgayNop", query = "SELECT k FROM Khoaluan k WHERE k.ngayNop = :ngayNop"),
    @NamedQuery(name = "Khoaluan.findByMaSV2", query = "SELECT k FROM Khoaluan k WHERE k.maSV2 = :maSV2"),
    @NamedQuery(name = "Khoaluan.findByMaGVHD", query = "SELECT k FROM Khoaluan k WHERE k.maGVHD = :maGVHD"),
    @NamedQuery(name = "Khoaluan.findByMaGVPB", query = "SELECT k FROM Khoaluan k WHERE k.maGVPB = :maGVPB"),
    @NamedQuery(name = "Khoaluan.findByFileNop", query = "SELECT k FROM Khoaluan k WHERE k.fileNop = :fileNop"),
    @NamedQuery(name = "Khoaluan.findByMaDK", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maDK = :maDK"),
    @NamedQuery(name = "Khoaluan.findByMaSV", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maSV = :maSV"),
    @NamedQuery(name = "Khoaluan.findByMaHD", query = "SELECT k FROM Khoaluan k WHERE k.khoaluanPK.maHD = :maHD")})
public class Khoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KhoaluanPK khoaluanPK;
    @Column(name = "nam")
    private String nam;
    @Column(name = "ghiChu")
    private String ghiChu;
    @Column(name = "ngayNop")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayNop;
    @Column(name = "maSV2")
    private String maSV2;
    @Column(name = "maGVHD")
    private String maGVHD;
    @Column(name = "maGVPB")
    private String maGVPB;
    @Column(name = "fileNop")
    private String fileNop;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "khoaluan")
    private Set<Diem> diemSet;
    @JoinColumns({
        @JoinColumn(name = "maDK", referencedColumnName = "maDK", insertable = false, updatable = false),
        @JoinColumn(name = "maSV", referencedColumnName = "maSV", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Dangkykhoaluan dangkykhoaluan;
    @JoinColumn(name = "maHD", referencedColumnName = "maHD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hoidong hoidong;

    public Khoaluan() {
    }

    public Khoaluan(KhoaluanPK khoaluanPK) {
        this.khoaluanPK = khoaluanPK;
    }

    public Khoaluan(int maKL, int maDK, String maSV, int maHD) {
        this.khoaluanPK = new KhoaluanPK(maKL, maDK, maSV, maHD);
    }

    public KhoaluanPK getKhoaluanPK() {
        return khoaluanPK;
    }

    public void setKhoaluanPK(KhoaluanPK khoaluanPK) {
        this.khoaluanPK = khoaluanPK;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(Date ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getMaSV2() {
        return maSV2;
    }

    public void setMaSV2(String maSV2) {
        this.maSV2 = maSV2;
    }

    public String getMaGVHD() {
        return maGVHD;
    }

    public void setMaGVHD(String maGVHD) {
        this.maGVHD = maGVHD;
    }

    public String getMaGVPB() {
        return maGVPB;
    }

    public void setMaGVPB(String maGVPB) {
        this.maGVPB = maGVPB;
    }

    public String getFileNop() {
        return fileNop;
    }

    public void setFileNop(String fileNop) {
        this.fileNop = fileNop;
    }

    @XmlTransient
    public Set<Diem> getDiemSet() {
        return diemSet;
    }

    public void setDiemSet(Set<Diem> diemSet) {
        this.diemSet = diemSet;
    }

    public Dangkykhoaluan getDangkykhoaluan() {
        return dangkykhoaluan;
    }

    public void setDangkykhoaluan(Dangkykhoaluan dangkykhoaluan) {
        this.dangkykhoaluan = dangkykhoaluan;
    }

    public Hoidong getHoidong() {
        return hoidong;
    }

    public void setHoidong(Hoidong hoidong) {
        this.hoidong = hoidong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (khoaluanPK != null ? khoaluanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khoaluan)) {
            return false;
        }
        Khoaluan other = (Khoaluan) object;
        if ((this.khoaluanPK == null && other.khoaluanPK != null) || (this.khoaluanPK != null && !this.khoaluanPK.equals(other.khoaluanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.doAn.models.Khoaluan[ khoaluanPK=" + khoaluanPK + " ]";
    }
    
}
