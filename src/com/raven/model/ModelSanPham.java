/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author phand
 */
public class ModelSanPham {

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMaVach() {
        return maVach;
    }

    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(double giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public ModelSanPham(String maSP, String tenSanPham, String loaiSanPham, String donViTinh, String moTa, String hinhAnh, String maVach, double giaBan, double giaKhuyenMai, int soLuongCon) {
        this.maSP = maSP;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.donViTinh = donViTinh;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
        this.maVach = maVach;
        this.giaBan = giaBan;
        this.giaKhuyenMai = giaKhuyenMai;
        this.soLuongCon = soLuongCon;
    }

    public ModelSanPham() {
    }
    
    private String maSP, tenSanPham, loaiSanPham, donViTinh, moTa, hinhAnh, maVach;
    private double giaBan, giaKhuyenMai;
    private int soLuongCon;
}
