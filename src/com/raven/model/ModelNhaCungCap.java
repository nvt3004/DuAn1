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

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public ModelNhaCungCap(int maNCC, String tenNCC, String diaChi, String sdt, String email, String maSoThue) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.maSoThue = maSoThue;
    }

    public ModelNhaCungCap() {
    }
    
    private int maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdt;
    private String email;
    private String maSoThue;
    
    public Object[] toRowTable(EventActionNCC event) {
        return new Object[]{maNCC, tenNCC, diaChi, sdt, email, maSoThue, new ModelActionNCC(this, event)};
    }
}
