package com.raven.form;

import com.raven.dao.HoaDonDAO;
import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelHoaDon;
import com.raven.model.ModelKhachHang;
import com.raven.model.ModelStudent;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
//import com.raven.ultils;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import com.raven.swing.table.TableActionCellRender;
import javax.swing.table.DefaultTableModel;
import com.raven.swing.table.TableActionEvent;
import com.raven.swing.table.TableActionCellEditor;
import java.util.List;
import javax.swing.JOptionPane;
import com.raven.ultils.Auth;
public class Form2HoaDon extends javax.swing.JPanel {

    HoaDonDAO hdDao = new HoaDonDAO();
    int row = -1;

    public Form2HoaDon() {
        initComponents();
        tblHoaDon.fixTable(jScrollPane1);

        setOpaque(false);
        init();
        System.out.println(table2.getRowHeight());
        table2.getColumnModel().getColumn(0).setCellRenderer(new CustomTableCellRenderer());
        table2.getColumnModel().getColumn(1).setCellRenderer(new CustomTableCellRenderer());
        table2.getColumnModel().getColumn(4).setCellRenderer(new CustomTableCellRenderer());
        table2.getColumnModel().getColumn(6).setCellRenderer(new CustomTableCellRenderer());
        table2.setBackground(new java.awt.Color(102, 255, 102));
    }

    private void init() {
        initTableData();
        fillTableHoaDon();
    }

    private void initTableData() {

        TableActionEvent event = new TableActionEvent() {

            @Override
            public void onDelete(int row) {
                if (table2.isEditing()) {
                    table2.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                model.removeRow(row);
            }

        };

        tblHoaDon.addRow(new Object[]{1, "12:12:12 12-12-2023", 5, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{2, "12:12:12 12-12-2023", 10, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{3, "12:12:12 12-12-2023", 15, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{4, "12:12:12 12-12-2023", 5, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{5, "12:12:12 12-12-2023", 1, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{6, "12:12:12 12-12-2023", 2, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{7, "12:12:12 12-12-2023", 3, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{8, "12:12:12 12-12-2023", 4, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{9, "12:12:12 12-12-2023", 6, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{10, "12:12:12 12-12-2023", 2, 350000, "Tiền mặt"});
        tblHoaDon.addRow(new Object[]{11, "12:12:12 12-12-2023", 3, 350000, "Tiền mặt"});

        table2.addRow(new Object[]{32124564, 1, "Gấu nâu", 4000, "10%", 3600, 1, 3600});
        table2.addRow(new Object[]{"", 2, "Móc khóa nhện", 3000, 0, 6000, 2, 6000});
        table2.addRow(new Object[]{12346578, 3, "Bình nước BP", 5000, "5%", 4500, 5, 22500});

        table2.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        table2.getColumnModel().getColumn(8).setCellEditor(new TableActionCellEditor(event));

    }

    private void fillTableHoaDon() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            List<ModelHoaDon> list;
            String keyWord = txtTimKiem.getText();
            if (txtTimKiem.getText().equals("Tìm hóa đơn theo mã")||txtTimKiem.getText().equals("")) {
                list = hdDao.selectAll();
            } else {
                list = hdDao.selectByKeyword(keyWord);
            }
            for (ModelHoaDon hd : list) {
                Object[] row = {
                    hd.getMaHoaDon(), hd.getNgayHoaDon(), hd.getTongSoLuong(), hd.getGiaTriHD(), hd.getPhuongThucThanhToan()
                };
                model.addRow(row);
            }
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "lỗi");
        }
    }

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new com.raven.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        tabHoaDon = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDiaChi = new javax.swing.JLabel();
        txtMaNhaCC = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnThanhToan2 = new javax.swing.JButton();
        lblSoLuong7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSoLuong8 = new javax.swing.JLabel();
        cboPTTT = new javax.swing.JComboBox<>();
        lblThemSanPham = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaGG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new com.raven.swing.table.Table();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new com.raven.swing.Button();
        btnCapNhat = new com.raven.swing.Button();
        btnXoa = new com.raven.swing.Button();
        btnMoi = new com.raven.swing.Button();
        btnFirst = new com.raven.swing.Button();
        btnPrev = new com.raven.swing.Button();
        btnNext = new com.raven.swing.Button();
        btnLast = new com.raven.swing.Button();
        txtTimKiem = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1614, 1080));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày HĐ", "Số lượng", "Giá trị HĐ", "Phương thức TT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setMaximumSize(new java.awt.Dimension(700, 1000));
        tblHoaDon.setMinimumSize(new java.awt.Dimension(375, 0));
        tblHoaDon.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 0));
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quản lý hóa đơn");

        tabHoaDon.setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1009, 80));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1009, 80));

        lblDiaChi.setText("Địa chỉ");

        txtMaNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhaCCActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        lblSDT.setText("SĐT khách hàng");

        lblTenKH.setText("Tên khách hàng");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        lblMaNV.setText("Nhân viên");

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi)
                    .addComponent(lblSDT))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMaNV)
                        .addGap(38, 38, 38)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTenKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaNV)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiaChi)
                        .addComponent(txtMaNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(644, 127));

        btnThanhToan2.setBackground(new java.awt.Color(0, 0, 255));
        btnThanhToan2.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan2.setText("Lưu");

        lblSoLuong7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoLuong7.setText("Tổng cộng");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("24");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("54000000");

        lblSoLuong8.setText("Phương thức thanh toán");

        cboPTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));

        lblThemSanPham.setBackground(new java.awt.Color(204, 0, 255));
        lblThemSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThemSanPham.setForeground(new java.awt.Color(0, 0, 204));
        lblThemSanPham.setText("Thêm sản phẩm");
        lblThemSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255), 2));
        lblThemSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThemSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThemSanPhamMouseClicked(evt);
            }
        });

        jLabel7.setText("Mã giảm giá");

        txtMaGG.setText("GG004");

        jLabel8.setText("Tiền được giảm");

        jLabel9.setText("Tiền cần thanh toán");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("4000000");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("50000000");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblThemSanPham))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnThanhToan2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(lblSoLuong7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoLuong8)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboPTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaGG))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThemSanPham)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThanhToan2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtMaGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19))
                            .addComponent(lblSoLuong7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong8)
                    .addComponent(cboPTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã vạch", "Mã SP", "Tên SP", "Đơn giá", "%giảm", "Giá được giảm", "Số lượng", "Thành tiền", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(153, 153, 153));
        table2.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane3.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(8).setMinWidth(74);
            table2.getColumnModel().getColumn(8).setPreferredWidth(74);
            table2.getColumnModel().getColumn(8).setMaxWidth(74);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabHoaDon.addTab("Hóa đơn", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 4));

        btnThem.setBackground(new java.awt.Color(204, 204, 255));
        btnThem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnThem.setText("Thêm");
        jPanel3.add(btnThem);

        btnCapNhat.setBackground(new java.awt.Color(204, 204, 255));
        btnCapNhat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCapNhat.setText("Cập nhật");
        jPanel3.add(btnCapNhat);

        btnXoa.setBackground(new java.awt.Color(204, 204, 255));
        btnXoa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnXoa.setText("Xóa");
        jPanel3.add(btnXoa);

        btnMoi.setBackground(new java.awt.Color(204, 204, 255));
        btnMoi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnMoi.setText("Mới");
        jPanel3.add(btnMoi);

        btnFirst.setBackground(new java.awt.Color(204, 204, 255));
        btnFirst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/first.png"))); // NOI18N
        btnFirst.setMaximumSize(new java.awt.Dimension(18, 26));
        btnFirst.setMinimumSize(new java.awt.Dimension(18, 26));
        btnFirst.setPreferredSize(new java.awt.Dimension(18, 26));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst);

        btnPrev.setBackground(new java.awt.Color(204, 204, 255));
        btnPrev.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/back.png"))); // NOI18N
        btnPrev.setMaximumSize(new java.awt.Dimension(18, 26));
        btnPrev.setMinimumSize(new java.awt.Dimension(18, 26));
        btnPrev.setPreferredSize(new java.awt.Dimension(18, 26));
        jPanel3.add(btnPrev);

        btnNext.setBackground(new java.awt.Color(204, 204, 255));
        btnNext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/next1.png"))); // NOI18N
        btnNext.setMaximumSize(new java.awt.Dimension(18, 26));
        btnNext.setMinimumSize(new java.awt.Dimension(18, 26));
        btnNext.setPreferredSize(new java.awt.Dimension(18, 26));
        jPanel3.add(btnNext);

        btnLast.setBackground(new java.awt.Color(204, 204, 255));
        btnLast.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/last.png"))); // NOI18N
        btnLast.setMaximumSize(new java.awt.Dimension(18, 26));
        btnLast.setMinimumSize(new java.awt.Dimension(18, 26));
        btnLast.setPreferredSize(new java.awt.Dimension(18, 26));
        jPanel3.add(btnLast);

        txtTimKiem.setForeground(new java.awt.Color(102, 102, 102));
        txtTimKiem.setText("Tìm hóa đơn theo mã");
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimKiem))
                        .addGap(18, 18, 18)))
                .addComponent(tabHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void lblThemSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemSanPhamMouseClicked
        // TODO add your handling code here:
        table2.addRow(null);
    }//GEN-LAST:event_lblThemSanPhamMouseClicked

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtMaNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhaCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhaCCActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusGained
        if (txtTimKiem.getText().equals("Tìm hóa đơn theo mã")) {
            txtTimKiem.setText("");
        }
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        this.fillTableHoaDon();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
      if (txtTimKiem.getText().equals("")) {
            txtTimKiem.setText("Tìm hóa đơn theo mã");
        }
    }//GEN-LAST:event_txtTimKiemFocusLost
    public class CustomTableCellRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            ((JComponent) cellComponent).setBackground((Color.white));
            ((JComponent) cellComponent).setForeground((Color.black));
            Border border = BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(204, 255, 204));
            ((JComponent) cellComponent).setBorder(border);
            return cellComponent;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button btnCapNhat;
    private com.raven.swing.Button btnFirst;
    private com.raven.swing.Button btnLast;
    private com.raven.swing.Button btnMoi;
    private com.raven.swing.Button btnNext;
    private com.raven.swing.Button btnPrev;
    private javax.swing.JButton btnThanhToan2;
    private com.raven.swing.Button btnThem;
    private com.raven.swing.Button btnXoa;
    private javax.swing.JComboBox<String> cboPTTT;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblSoLuong7;
    private javax.swing.JLabel lblSoLuong8;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThemSanPham;
    private javax.swing.JTabbedPane tabHoaDon;
    private com.raven.swing.table.Table table2;
    private com.raven.swing.table.Table tblHoaDon;
    private javax.swing.JTextField txtMaGG;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNhaCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
 
    private ModelHoaDon getForm() {
        ModelHoaDon hd = new ModelHoaDon();
        
        hd.setMaNhanVien(Auth.user.getMaNV());
        hd.setMaGiamGia(txtMaGG.getText());
        hd.setPhuongThucThanhToan(cboPTTT.getSelectedItem().toString()); 
        return hd;
    }
    
//    private void insert() {
//        NhanVien nv = getForm();
//        String matKhau2 = md5.getMD5Hash(new String(txtMatKhau2.getPassword()));
//        if (!matKhau2.equals(nv.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
//            try {
//                dao.insert(nv);
//                this.fillTableHoaDon();
//                this.clearForm();
//                MsgBox.alert(this, "Thêm mới thành công!");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Thêm mới thất bại!");
//            }
//        }
//    }
    
    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblHoaDon.getRowCount() - 1);

        //Trạng thái form
//        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);

        //Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);

    }

}
