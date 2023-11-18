/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author ADMIN
 */
public class ModelKhachHang {
    
    private int MaKH;
    private String TenKH,SoDienThoai,DiaChi;
    private float TongTienMua;

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public float getTongTienMua() {
        return TongTienMua;
    }

    public void setTongTienMua(float TongTienMua) {
        this.TongTienMua = TongTienMua;
    }

    public ModelKhachHang() {
    }

    public ModelKhachHang(int MaKH, String TenKH, String SoDienThoai, String DiaChi, float TongTienMua) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.TongTienMua = TongTienMua;
    }
    
}
