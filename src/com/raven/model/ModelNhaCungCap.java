/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import com.raven.swing.table.EventActionNCC;
import com.raven.swing.table.ModelActionNCC;
import com.raven.swing.table.ModelProfile;


/**
 *
 * @author phand
 */
public class ModelNhaCungCap {

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public ModelNhaCungCap(int maNCC, String tenNhaCungCap, String diaChi, String soDienThoai, String email, String maSoThue) {
        this.maNCC = maNCC;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maSoThue = maSoThue;
    }

    public ModelNhaCungCap() {
    }
    
    private int maNCC;
    private String tenNhaCungCap;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String maSoThue;
    
//    public Object[] toRowTable(EventActionNCC event) {
//        Object sdt = null;
//        return new Object[]{maNCC, tenNhaCungCap, diaChi, soDienThoai, email, maSoThue};
//    }
}
