/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author buimi
 */
public class ModelHoaDon {

    private int maHoaDon;
    private String loaiKhachHang;
    private int maKhachHang;
    private String maNhanVien;
    private String maGiamGia;
    private String ngayHoaDon;
    private int tongSoLuong;
    private float giaTriHD;
    private String phuongThucThanhToan;

    public ModelHoaDon() {
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public ModelHoaDon(int maHoaDon, String loaiKhachHang, int maKhachHang, String maNhanVien, String maGiamGia, String ngayHoaDon, int tongSoLuong, float giaTriHD, String phuongThucThanhToan) {
        this.maHoaDon = maHoaDon;
        this.loaiKhachHang = loaiKhachHang;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.maGiamGia = maGiamGia;
        this.ngayHoaDon = ngayHoaDon;
        this.tongSoLuong = tongSoLuong;
        this.giaTriHD = giaTriHD;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public float getGiaTriHD() {
        return giaTriHD;
    }

    public void setGiaTriHD(float giaTriHD) {
        this.giaTriHD = giaTriHD;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

}
