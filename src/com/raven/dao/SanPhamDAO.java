/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.model.ModelSanPham;
import com.raven.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phand
 */
public class SanPhamDAO extends DuAnDAO<ModelSanPham, String> {

    String INSERT_SQL = "INSERT INTO SanPham (MaSP, TenSP, LoaiSanPham, GiaBan, GiaKhuyenMai, DonViTinh, SoLuongCon, MoTa, HinhAnh, MaVach) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSP=?, LoaiSanPham=?, GiaBan=?, GiaKhuyenMai=?, DonViTinh=?, SoLuongCon=?, MoTa=?, HinhAnh=?, MaVach=? WHERE MaSP=?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSP=?";

    @Override
    public void insert(ModelSanPham entity) {
        try {
            XJdbc.update(INSERT_SQL,
                    entity.getMaSP(),
                    entity.getTenSanPham(),
                    entity.getLoaiSanPham(),
                    entity.getGiaBan(),
                    entity.getGiaKhuyenMai(),
                    entity.getDonViTinh(),
                    entity.getSoLuongCon(),
                    entity.getMoTa(),
                    entity.getHinhAnh(),
                    entity.getMaVach());
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ModelSanPham entity) {
        try {
            XJdbc.update(UPDATE_SQL,
                    entity.getTenSanPham(),
                    entity.getLoaiSanPham(),
                    entity.getGiaBan(),
                    entity.getGiaKhuyenMai(),
                    entity.getDonViTinh(),
                    entity.getSoLuongCon(),
                    entity.getMoTa(),
                    entity.getHinhAnh(),
                    entity.getMaVach(),
                    entity.getMaSP());
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key);
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ModelSanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ModelSanPham selectById(String key) {
        List<ModelSanPham> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ModelSanPham> selectBySql(String sql, Object... args) {
        List<ModelSanPham> list = new ArrayList<ModelSanPham>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                ModelSanPham entity = new ModelSanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setTenSanPham(rs.getString("TenSP"));
                entity.setLoaiSanPham(rs.getString("LoaiSanPham"));
                entity.setGiaBan(rs.getDouble("GiaBan"));
                entity.setGiaKhuyenMai(rs.getDouble("GiaKhuyenMai"));
                entity.setDonViTinh(rs.getString("DonViTinh"));
                entity.setSoLuongCon(rs.getInt("SoLuongCon"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setHinhAnh(rs.getString("HinhAnh"));
                entity.setMaVach(rs.getString("MaVach"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
