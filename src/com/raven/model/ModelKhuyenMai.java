/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import com.raven.swing.table.EventActionKM;
import com.raven.swing.table.ModelActionKM;
import java.util.Date;

/**
 *
 * @author phand
 */
public class ModelKhuyenMai {

    public String getMaGG() {
        return maGG;
    }

    public void setMaGG(String maGG) {
        this.maGG = maGG;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setPhanTramGiamGia(float phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ModelKhuyenMai(String maGG, String ngayBatDau, String ngayKetThuc, float phanTramGiamGia, String trangThai) {
        this.maGG = maGG;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phanTramGiamGia = phanTramGiamGia;
        this.trangThai = trangThai;
    }
    
    public ModelKhuyenMai() {
    }

    private String maGG;
    private String ngayBatDau;
    private String ngayKetThuc;
    private float phanTramGiamGia;
    private String trangThai;

    public Object[] toRowTable(EventActionKM event) {
        return new Object[]{maGG, ngayBatDau, ngayKetThuc, phanTramGiamGia, trangThai, new ModelActionKM(this, event)};
    }
}
