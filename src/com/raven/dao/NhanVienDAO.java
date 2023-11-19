/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.ultils.XJdbc;
import com.raven.model.ModelNhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienDAO extends DuAnDAO<ModelNhanVien, String> {

    String INSERT_SQL = "insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro,HinhAnh,Email,SoDienThoai) values(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update NhanVien set MatKhau=? ,HoTen=? ,VaiTro=? ,HinhAnh=? ,Email= ?,SoDienThoai=? where MaNV=?";
    String DELETE_SQL = "delete from NhanVien where MaNV=?";
    String SELECT_ALL_SQL = "select MaNV, HoTen, VaiTro, HinhAnh,Email,SoDienThoai from NhanVien";
    String SELECT_BY_ID = "select * from NhanVien where MaNV=?";

    @Override
    public void insert(ModelNhanVien entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.getVaiTro(),
                entity.getHinhAnh(),
                entity.getEmail(),
                entity.getSoDienThoai());
    }

    @Override
    public void update(ModelNhanVien entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.getVaiTro(),
                entity.getHinhAnh(),
                entity.getEmail(),
                entity.getSoDienThoai(),
                entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<ModelNhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ModelNhanVien selectById(String key) {
        List<ModelNhanVien> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public ModelNhanVien selectByIdMK(String key) {
        List<ModelNhanVien> list = selectBySqlMK(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ModelNhanVien> selectBySql(String sql, Object... args) {
        List<ModelNhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ModelNhanVien entity = new ModelNhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getString("VaiTro"));
                entity.setHinhAnh(rs.getString("HinhAnh"));
                entity.setEmail(rs.getString("Email"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    

    protected List<ModelNhanVien> selectBySqlMK(String sql, Object... args) {
        List<ModelNhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ModelNhanVien entity = new ModelNhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getString("VaiTro"));
                entity.setHinhAnh(rs.getString("HinhAnh"));
                entity.setEmail(rs.getString("Email"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public List<ModelNhanVien> selectByKeyword(String keyword) {
        String SQL = "select MaNV, HoTen, VaiTro, HinhAnh,Email,SoDienThoai from NhanVien WHERE HoTen LIKE ? or MaNV like ?";
        return this.selectBySql(SQL, "%" + keyword + "%", "%" + keyword + "%");
    }
}
