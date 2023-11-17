/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import javax.swing.Icon;

/**
 *
 * @author ADMIN
 */
public class ModelNhanVien {
    private Icon icon;
    private String maNV,hoTen,matKhau,email,soDienThoai;
    private String vaiTro,hinh;

    public ModelNhanVien() {
    }

    public ModelNhanVien(Icon icon, String maNV, String hoTen, String matKhau, String email, String soDienThoai, String vaiTro,String hinh) {
        this.icon = icon;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.vaiTro = vaiTro;
        this.hinh=hinh;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

//    public Object[] toRowTable(EventAction event) {
////        DecimalFormat df = new DecimalFormat("$#,##0.00");
//        return new Object[]{new ModelProfile(icon, maNV), hoTen, vaiTro, email,soDienThoai, new ModelActionNV(this, event)};
//    }
    
}

