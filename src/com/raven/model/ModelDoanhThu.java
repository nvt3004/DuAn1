package com.raven.model;

import javax.swing.Icon;

public class ModelDoanhThu {

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getNgayTT() {
        return NgayTT;
    }

    public void setNgayTT(String NgayTT) {
        this.NgayTT = NgayTT;
    }

    public ModelDoanhThu(String MaHD, String MoTa, String TongTien, String MaKH, String NgayTT) {
        this.MaHD = MaHD;
        this.MoTa = MoTa;
        this.TongTien = TongTien;
        this.MaKH = MaKH;
        this.NgayTT = NgayTT;
    }

    public ModelDoanhThu() {
    }

    

    private String MaHD;
    private String MoTa;
    private String TongTien;
    private String MaKH;
    private String NgayTT;

    public Object[] toDataTable() {
        return new Object[]{MaHD, MoTa, TongTien, MaKH, NgayTT};
    }
}
