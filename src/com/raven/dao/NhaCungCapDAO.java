/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.model.ModelNhaCungCap;
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
public class NhaCungCapDAO extends DuAnDAO<ModelNhaCungCap, Integer> {

    String INSERT_SQL = "INSERT INTO NhaCungCap (TenNhaCungCap, DiaChi, SoDienThoai, Email, MaSoThue) VALUES (?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NhaCungCap SET TenNhaCungCap=?, DiaChi=?, SoDienThoai=?, Email=?, MaSoThue= WHERE MaNCC=?";
    String DELETE_SQL = "DELETE FROM NhaCungCap WHERE MaNCC=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhaCungCap";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhaCungCap WHERE MaNCC=?";

    @Override
    public void insert(ModelNhaCungCap entity) {
        try {
            XJdbc.update(INSERT_SQL,
                    entity.getTenNhaCungCap(),
                    entity.getDiaChi(),
                    entity.getSoDienThoai(),
                    entity.getEmail(),
                    entity.getMaSoThue()
            );
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ModelNhaCungCap entity) {
        try {
            XJdbc.update(UPDATE_SQL,
                    entity.getTenNhaCungCap(),
                    entity.getDiaChi(),
                    entity.getSoDienThoai(),
                    entity.getEmail(),
                    entity.getMaSoThue(),
                    entity.getMaNCC()
            );
        } catch (Exception ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<ModelNhaCungCap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ModelNhaCungCap selectById(Integer key) {
        List<ModelNhaCungCap> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ModelNhaCungCap> selectBySql(String sql, Object... args) {
        List<ModelNhaCungCap> list = new ArrayList<ModelNhaCungCap>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                ModelNhaCungCap entity = new ModelNhaCungCap();
                entity.setMaNCC(rs.getInt("MaNCC"));
                entity.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setMaSoThue(rs.getString("MaSoThue"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
