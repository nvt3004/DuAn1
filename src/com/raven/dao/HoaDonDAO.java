/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.model.ModelHoaDon;
import com.raven.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonDAO extends DuAnDAO<ModelHoaDon, Integer> {

    String INSERT_SQL = "insert into hoadon values (N'Khách lẻ',?,?,?,GETDATE(),0,0,?);";
    String UPDATE_SQL = "update hoadon set makh = ?, manv = ?, magg = ?, ngayhoadon = getdate(),phuongthucthanhtoan =? where mahd = ?";
    String DELETE_SQL = "delete from HoaDon where MaHD = ?";
    String SELECT_ALL_SQL = "select hd.*, kh.SoDienThoai  from HoaDon hd join KhachHang kh on hd.makh=kh.MaKH";
    String SELECT_BY_ID = "select hd.*, kh.SoDienThoai  from HoaDon hd join"
            + " KhachHang kh on hd.makh=kh.MaKH where MaHD = ?";

    @Override
    public void insert(ModelHoaDon entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaKhachHang(),
                entity.getMaNhanVien(),
                entity.getMaGiamGia(),
                entity.getPhuongThucThanhToan());

    }

    @Override
    public void update(ModelHoaDon entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getMaKhachHang(),
                entity.getMaNhanVien(),
                entity.getMaGiamGia(),
                entity.getPhuongThucThanhToan(),
                entity.getMaHoaDon());
    }

    @Override
    public void delete(Integer key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<ModelHoaDon> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ModelHoaDon selectById(Integer key) {
        List<ModelHoaDon> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ModelHoaDon> selectBySql(String sql, Object... args) {

        List<ModelHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ModelHoaDon entity = new ModelHoaDon();
                entity.setMaHoaDon(rs.getInt("MaHD"));
                entity.setMaKhachHang(rs.getInt("MaKH"));
                entity.setMaNhanVien(rs.getString("MaNV"));
                entity.setMaGiamGia(rs.getString("MaGG"));
                entity.setNgayHoaDon(rs.getString("NgayHoaDon"));
                entity.setTongSoLuong(rs.getInt("TongSoLuong"));
                entity.setGiaTriHD(rs.getFloat("GiaTriHD"));
                entity.setPhuongThucThanhToan(rs.getString("PhuongThucThanhToan"));

                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public List<ModelHoaDon> selectByKeyword(String keyword) {
        String SQL = "select hd.*, kh.SoDienThoai from HoaDon hd join"
                + " KhachHang kh on hd.makh=kh.MaKH where MaHD like ?";
        System.out.println("ed");

        return this.selectBySql(SQL, keyword);
    }
}
