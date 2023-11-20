package com.raven.form;

import com.raven.dao.SanPhamDAO;
import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelSanPham;
import com.raven.model.ModelStudent;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
import com.raven.ultils.Auth;
import com.raven.ultils.MsgBox;
import com.raven.ultils.XImage;
import java.awt.Color;
import java.awt.Font;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Form1SanPham extends javax.swing.JPanel {

    SanPhamDAO spdao = new SanPhamDAO();
    int row = -1;

    public Form1SanPham() {
        initComponents();
        tblSanPham.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
        init();
    }

    private void initData() {
        initTableData();
    }

    private void initTableData() {
        EventAction eventAction = new EventAction() {
            @Override
            public void delete(ModelStudent student) {
                if (showMessage("Delete Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(ModelStudent student) {
                if (showMessage("Update Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }
        };
    }

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        lblTenSanPham = new javax.swing.JLabel();
        lblLoaiSanPham = new javax.swing.JLabel();
        cboLoaiSanPham = new javax.swing.JComboBox<>();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lblGiaKhuyenMai = new javax.swing.JLabel();
        txtGiaKhuyenMai = new javax.swing.JTextField();
        lblDonViTinh = new javax.swing.JLabel();
        cboDonViTinh = new javax.swing.JComboBox<>();
        lblMaVach = new javax.swing.JLabel();
        txtMaVach = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnMoi = new com.raven.swing.Button();
        btnThem = new com.raven.swing.Button();
        btnCapNhat = new com.raven.swing.Button();
        btnXoa = new com.raven.swing.Button();
        btnDau = new com.raven.swing.Button();
        btnLui = new com.raven.swing.Button();
        btnTien = new com.raven.swing.Button();
        btnCuoi = new com.raven.swing.Button();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1614, 1080));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Đơn giá", "Phần trăm giảm giá", "Giá được giảm", "Số lượng", "Mã vạch ", "Mô tả", "Sửa/Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        lblAnh.setText("Hình ảnh");

        lblMaSP.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblMaSP.setText("Mã sản phẩm");

        lblTenSanPham.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblTenSanPham.setText("Tên sản phẩm");

        lblLoaiSanPham.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblLoaiSanPham.setText("Loại sản phẩm");

        cboLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDonGia.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblDonGia.setText("Đơn giá");

        lblGiaKhuyenMai.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblGiaKhuyenMai.setText("Giá khuyến mãi");

        lblDonViTinh.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblDonViTinh.setText("Đơn vị tính");

        cboDonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cái", "Cặp", "Bộ", " " }));

        lblMaVach.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblMaVach.setText("Mã vạch");

        lblMoTa.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblMoTa.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        lblSoLuong.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblSoLuong.setText("Số lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboDonViTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboLoaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(lblMaVach)
                            .addComponent(txtMaVach, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(lblDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGiaKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(lblMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAnh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTenSanPham)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLoaiSanPham)
                                    .addComponent(lblDonGia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGiaKhuyenMai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSoLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDonViTinh)
                            .addComponent(lblMoTa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMaVach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        btnMoi.setText("Mới");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");

        btnXoa.setText("Xóa");

        btnDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/first.png"))); // NOI18N
        btnDau.setMaximumSize(new java.awt.Dimension(18, 26));
        btnDau.setMinimumSize(new java.awt.Dimension(18, 26));
        btnDau.setPreferredSize(new java.awt.Dimension(18, 26));
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnLui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/back.png"))); // NOI18N
        btnLui.setMaximumSize(new java.awt.Dimension(18, 26));
        btnLui.setMinimumSize(new java.awt.Dimension(18, 26));
        btnLui.setPreferredSize(new java.awt.Dimension(18, 26));

        btnTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/next1.png"))); // NOI18N
        btnTien.setMaximumSize(new java.awt.Dimension(18, 26));
        btnTien.setMinimumSize(new java.awt.Dimension(18, 26));
        btnTien.setPreferredSize(new java.awt.Dimension(18, 26));

        btnCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/last.png"))); // NOI18N
        btnCuoi.setMaximumSize(new java.awt.Dimension(18, 26));
        btnCuoi.setMinimumSize(new java.awt.Dimension(18, 26));
        btnCuoi.setPreferredSize(new java.awt.Dimension(18, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDau, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLui, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLui, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Tìm kiếm sản phẩm theo mã hoặc tên");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quản lý phiếu nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

    }//GEN-LAST:event_btnThemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button btnCapNhat;
    private com.raven.swing.Button btnCuoi;
    private com.raven.swing.Button btnDau;
    private com.raven.swing.Button btnLui;
    private com.raven.swing.Button btnMoi;
    private com.raven.swing.Button btnThem;
    private com.raven.swing.Button btnTien;
    private com.raven.swing.Button btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDonViTinh;
    private javax.swing.JComboBox<String> cboLoaiSanPham;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblGiaKhuyenMai;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblLoaiSanPham;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMaVach;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSanPham;
    private com.raven.swing.table.Table tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaKhuyenMai;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaVach;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            List<ModelSanPham> list = new ArrayList<ModelSanPham>();
            for (ModelSanPham sp : list) {
                Object[] row
                        = {sp.getMaSP(), sp.getTenSanPham(), sp.getLoaiSanPham(), sp.getGiaBan(), sp.getGiaKhuyenMai(),
                            sp.getDonViTinh(), sp.getSoLuongCon(), sp.getMoTa(), sp.getHinhAnh(), sp.getMaVach()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void setForm(ModelSanPham sp) {
        txtMaSP.setText(sp.getMaSP());
        txtTenSanPham.setText(sp.getTenSanPham());
        cboLoaiSanPham.setSelectedItem(spdao.selectById(sp.getLoaiSanPham()));
        cboDonViTinh.setSelectedItem(spdao.selectById(sp.getDonViTinh()));
        txtDonGia.setText(String.valueOf(sp.getGiaBan()));
        txtGiaKhuyenMai.setText(String.valueOf(sp.getGiaKhuyenMai()));
        txtSoLuong.setText(String.valueOf(sp.getSoLuongCon()));
        txtMoTa.setText(sp.getMoTa());
        if (sp.getHinhAnh() != null) {
            lblHinhAnh.setToolTipText(sp.getHinhAnh());
            lblHinhAnh.setIcon(XImage.read(sp.getHinhAnh()));
        }
        txtMaVach.setText(sp.getMaVach());
    }

    private ModelSanPham getForm() {
        ModelSanPham sp = new ModelSanPham();
        sp.setMaSP(txtMaSP.getText());
        sp.setTenSanPham(txtTenSanPham.getText());
        sp.setLoaiSanPham(cboLoaiSanPham.getSelectedItem().toString());
        sp.setGiaBan(Double.parseDouble(txtDonGia.getText()));
        sp.setGiaKhuyenMai(Double.parseDouble(txtGiaKhuyenMai.getText()));
        sp.setDonViTinh(cboDonViTinh.getSelectedItem().toString());
        sp.setSoLuongCon(Integer.parseInt(txtSoLuong.getText()));
        sp.setMoTa(txtMoTa.getText());
        sp.setMaVach(txtMaVach.getText());
        sp.setHinhAnh(lblHinhAnh.getToolTipText());
        return sp;
    }

    private void insert() {
        if (check()) {
            if (!Auth.isAdmin() || !Auth.isThuNgan()) {
                MsgBox.alert(this, "Nhân viên kho không được thêm sẩn phẩm!");
            } else {
                ModelSanPham sp = getForm();
                try {
                    spdao.insert(sp);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Thêm mới thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Thêm mới thất bại!");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void update() {
        if (check()) {
            if (!Auth.isAdmin()) {
                MsgBox.alert(this, "Chỉ admin được cập nhật sản phẩm!");
            } else {
                ModelSanPham sp = getForm();
                try {
                    spdao.update(sp);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Thêm mới thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Thêm mới thất bại!");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void delete() {
        if (!Auth.isAdmin()) {
            MsgBox.alert(this, "Chỉ admin được xóa sản phẩm!");
        } else {
            String masp = (String) tblSanPham.getValueAt(this.row, 0);
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhà cung cấp này?")) {
                try {
                    spdao.delete(masp);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    private void clearForm() {
        ModelSanPham sp = new ModelSanPham();
        this.setForm(sp);
        this.row = -1;
        this.updateStatus();
    }

    private void edit() {
        String masp = tblSanPham.getValueAt(this.row, 0).toString();
        ModelSanPham sp = spdao.selectById(masp);
        this.setForm(sp);
        this.updateStatus();
    }

    private void first() {
        this.row = 0;
        this.edit();
    }

    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    private void next() {
        if (this.row < tblSanPham.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    private void last() {
        this.row = tblSanPham.getRowCount() - 1;
        this.edit();
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblSanPham.getRowCount() - 1);

        //Trạng thái form
        btnThem.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);

        //Trạng thái điều hướng
        btnDau.setEnabled(edit && !first);
        btnLui.setEnabled(edit && !first);
        btnTien.setEnabled(edit && !last);
        btnCuoi.setEnabled(edit && !last);
    }

    private boolean check() {
        boolean kq = true;
        Font font = new Font("SansSerif", Font.ITALIC, 12); // Tạo một font chữ nghiêng với kích cỡ 16
        String regex = "^[0-9]+(\\.[0-9]+)?$"; // Biểu thức chính quy kiểm tra xem chuỗi có chứa ký tự đặt biệt hay không

        lblMaSP.setText("Mã sản phẩm");
        lblLoaiSanPham.setText("Loại sản phẩm");
        lblGiaKhuyenMai.setText("Giá khuyến mãi");
        lblDonViTinh.setText("Đơn vị tính");
        lblMaVach.setText("Mã vạch");
        lblTenSanPham.setText("Tên sản phẩm");
        lblDonGia.setText("Đơn giá");
        lblSoLuong.setText("Số lượng");
        lblMoTa.setText("Mô tả");
        lblAnh.setText("Hình ảnh");

        lblMaSP.setForeground(Color.black);
        lblLoaiSanPham.setForeground(Color.black);
        lblGiaKhuyenMai.setForeground(Color.black);
        lblDonViTinh.setForeground(Color.black);
        lblMaVach.setForeground(Color.black);
        lblTenSanPham.setForeground(Color.black);
        lblDonGia.setForeground(Color.black);
        lblSoLuong.setForeground(Color.black);
        lblMoTa.setForeground(Color.black);
        lblAnh.setForeground(Color.black);

        if (txtMaSP.getText().isBlank()) {
            lblMaSP.setText("*Nhập mã sản phẩm");
            lblMaSP.setForeground(Color.red);
            lblMaSP.setFont(font);
            kq = false;
        }

        if (cboLoaiSanPham.getSelectedIndex() <= 0) {
            lblLoaiSanPham.setText("*Chọn loại sản phẩm");
            lblLoaiSanPham.setForeground(Color.red);
            lblLoaiSanPham.setFont(font);
            kq = false;
        }

        try {
            if (txtGiaKhuyenMai.getText().matches(regex)) {
                lblGiaKhuyenMai.setText("*Không chứa ký tự đặt biệt và chữ");
                lblGiaKhuyenMai.setForeground(Color.red);
                lblGiaKhuyenMai.setFont(font);
                kq = false;
            }
        } catch (Exception e) {
            lblGiaKhuyenMai.setText("*Giá khuyến mãi phải là số");
            lblGiaKhuyenMai.setForeground(Color.red);
            lblGiaKhuyenMai.setFont(font);
            kq = false;
        }

        if (cboDonViTinh.getSelectedIndex() <= 0) {
            lblDonViTinh.setText("*Chọn đơn vị tính");
            lblDonViTinh.setForeground(Color.red);
            lblDonViTinh.setFont(font);
            kq = false;
        }

        if (txtTenSanPham.getText().isBlank()) {
            lblTenSanPham.setText("*Nhập tên sản phẩm");
            lblTenSanPham.setForeground(Color.red);
            lblTenSanPham.setFont(font);
            kq = false;
        }

        try {
            if (txtDonGia.getText().isBlank()) {
                lblDonGia.setText("*Nhập đơn giá");
                lblDonGia.setForeground(Color.red);
                lblDonGia.setFont(font);
                kq = false;
            }

            if (txtDonGia.getText().matches(regex)) {
                lblDonGia.setText("*Không chứa ký tự đặt biệt và chữ");
                lblDonGia.setForeground(Color.red);
                lblDonGia.setFont(font);
                kq = false;
            }
        } catch (Exception e) {
            lblDonGia.setText("*Đơn giá phải là số");
            lblDonGia.setForeground(Color.red);
            lblDonGia.setFont(font);
            kq = false;
        }

        try {
            if (txtSoLuong.getText().isBlank()) {
                lblSoLuong.setText("*Nhập số lượng");
                lblSoLuong.setForeground(Color.red);
                lblSoLuong.setFont(font);
                kq = false;
            }

            if (txtSoLuong.getText().matches(regex)) {
                lblSoLuong.setText("*Không chứa ký tự đặt biệt và chữ");
                lblSoLuong.setForeground(Color.red);
                lblSoLuong.setFont(font);
                kq = false;
            }
        } catch (Exception e) {
            lblSoLuong.setText("*Số lượng phải là số");
            lblSoLuong.setForeground(Color.red);
            lblSoLuong.setFont(font);
            kq = false;
        }

        return kq;
    }
}
