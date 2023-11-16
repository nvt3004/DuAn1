package com.raven.model;

import com.raven.swing.table.EventActionPhieuNhapChiTiet;
import com.raven.swing.table.ModelActionPhieuNhapChiTiet;
import com.raven.swing.table.ModelProfile;
import java.text.DecimalFormat;
import javax.swing.Icon;

public class ModelPhieuNhapChiTiet {

    private int maPN;
    private String maSP;
    private int soLuong;
    private float donGiaNhap;
    private float thanhTien;

    public ModelPhieuNhapChiTiet(int maPN, String maSP, int soLuong, float donGiaNhap, float thanhTien) {
        this.maPN = maPN;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGiaNhap = donGiaNhap;
        this.thanhTien = thanhTien;
    }

    public ModelPhieuNhapChiTiet() {
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGiaNhap() {
        return donGiaNhap;
    }

    public void setDonGiaNhap(float donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Object[] toRowTable(EventActionPhieuNhapChiTiet eventPhieuNhapChiTiet) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{maPN, maSP, soLuong, donGiaNhap, thanhTien, new ModelActionPhieuNhapChiTiet(this, eventPhieuNhapChiTiet)};
    }
}
