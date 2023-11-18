/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.model.ModelKhachHang;
import com.raven.model.ModelNhanVien;
import com.raven.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAO extends DuAnDAO<ModelKhachHang, Integer> {

    String INSERT_SQL = "insert into KhachHang(HoTen,SoDienThoai,DiaChi,TongTienMua)values(?,?,?,?)";
    String UPDATE_SQL = "update KhachHang set HoTen = ?, SoDienThoai = ?, DiaChi = ?, TongTienMua = ? where MaKH = ?";
    String DELETE_SQL = "delete from KhachHang where MaKH = ?";
    String SELECT_ALL_SQL = "select * from KhachHang";
    String SELECT_BY_ID = "select * from KhachHang where MaKH = ?";

    @Override
    public void insert(ModelKhachHang entity) {
        XJdbc.update(INSERT_SQL,
                entity.getTenKH(),
                entity.getSoDienThoai(),
                entity.getDiaChi(),
                entity.getTongTienMua());
    }

    @Override
    public void update(ModelKhachHang entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getTenKH(),
                entity.getSoDienThoai(),
                entity.getDiaChi(),
                entity.getTongTienMua(),
                entity.getMaKH());
    }

    @Override
    public void delete(Integer key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<ModelKhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ModelKhachHang selectById(Integer key) {
        List<ModelKhachHang> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ModelKhachHang> selectBySql(String sql, Object... args) {

        List<ModelKhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ModelKhachHang entity = new ModelKhachHang();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setTenKH(rs.getNString("HoTen"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                entity.setDiaChi(rs.getNString("DiaChi"));
                entity.setTongTienMua(rs.getFloat("TongTienMua"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public List<ModelKhachHang> selectByKeyword(String keyword) {
        String SQL = "select MaKH, HoTen,SoDienThoai,DiaChi,TongTienMua from KhachHang WHERE HoTen LIKE ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
}
