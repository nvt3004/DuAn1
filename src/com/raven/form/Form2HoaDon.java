package com.raven.form;

import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelStudent;
import com.raven.model.ModelPhieuNhapChiTiet;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
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
import com.raven.swing.table.EventActionPhieuNhapChiTiet;
import com.raven.swing.table.ModelActionPhieuNhapChiTiet;
import com.raven.swing.table.TableActionCellRender;
import javax.swing.table.DefaultTableModel;
import com.raven.swing.table.TableActionEvent;
import com.raven.swing.table.TableActionCellEditor;

public class Form2HoaDon extends javax.swing.JPanel {

    public Form2HoaDon() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
        System.out.println(table2.getRowHeight());
        table2.getColumnModel().getColumn(0).setCellRenderer(new CustomTableCellRenderer());

        table2.getColumnModel().getColumn(1).setCellRenderer(new CustomTableCellRenderer());
        table2.getColumnModel().getColumn(4).setCellRenderer(new CustomTableCellRenderer());
        table2.getColumnModel().getColumn(6).setCellRenderer(new CustomTableCellRenderer());

        table2.setBackground(Color.white);
//        table2.

    }

    private void initData() {
        initTableData();

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
        table1.addRow(new Object[]{1, "12:12:12 12-12-2023", 5, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{2, "12:12:12 12-12-2023", 10, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{3, "12:12:12 12-12-2023", 15, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{4, "12:12:12 12-12-2023", 5, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{5, "12:12:12 12-12-2023", 1, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{6, "12:12:12 12-12-2023", 2, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{7, "12:12:12 12-12-2023", 3, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{8, "12:12:12 12-12-2023", 4, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{9, "12:12:12 12-12-2023", 6, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{10, "12:12:12 12-12-2023", 2, 350000, "Tiền mặt"});
        table1.addRow(new Object[]{11, "12:12:12 12-12-2023", 3, 350000, "Tiền mặt"});
//
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), "Dara", "Male", "C++", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
//        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));

        EventActionPhieuNhapChiTiet eventActionPhieuNhapChiTiet = new EventActionPhieuNhapChiTiet() {

            @Override
            public void delete(ModelPhieuNhapChiTiet pnct) {
                if (showMessage("Delete Student : " + pnct.getMaSP())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(ModelPhieuNhapChiTiet pnct) {
                if (showMessage("Update Student : " + pnct.getMaSP())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }
        };

        table2.addRow(new Object[]{32124564, 1, "Gấu nâu", 4000, "10%",3600, 1,3600});
        table2.addRow(new Object[]{"", 2, "Móc khóa nhện", 3000, 0, 6000, 2, 6000});
        table2.addRow(new Object[]{12346578, 3, "Bình nước BP", 5000, "5%", 4500, 5, 22500});

        table2.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        table2.getColumnModel().getColumn(8).setCellEditor(new TableActionCellEditor(event));

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
        table1 = new com.raven.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        tabHoaDon1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhaCC = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnThanhToan2 = new javax.swing.JButton();
        lblSoLuong7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSoLuong8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        lblThemSanPham = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new com.raven.swing.table.Table();
        pnlHoaDon2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnThem2 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnMoi1 = new javax.swing.JButton();
        btnFirst1 = new javax.swing.JButton();
        btnPrev1 = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        btnLast1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1614, 1080));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày HĐ", "Số lượng", "Giá trị PN", "Phương thức TT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setMaximumSize(new java.awt.Dimension(700, 1000));
        table1.setMinimumSize(new java.awt.Dimension(375, 0));
        table1.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 0));
        jScrollPane1.setViewportView(table1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quản lý hóa đơn");

        tabHoaDon1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1009, 80));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1009, 80));

        jLabel1.setText("Mã hóa đơn");

        txtMaPN.setText("3");
        txtMaPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPNActionPerformed(evt);
            }
        });

        jLabel3.setText("Loại khách hàng");

        jLabel5.setText("Mã nhà cung cấp");

        txtMaNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhaCCActionPerformed(evt);
            }
        });

        txtNgayTao.setText("12:12:00 15-11-2023");
        txtNgayTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayTaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày tạo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khách vãng lai", "Khách thân thiết" }));

        jLabel6.setText("NV: Tinhbm04");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaNhaCC, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtMaNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));

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

        jTextField1.setText("GG004");

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
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThanhToan2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19))
                            .addComponent(lblSoLuong7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong8)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã vạch", "Mã SP", "Tên SP", "Đơn giá", "%giảm", "Giá được giảm", "Số lượng", "Thành tiền", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(239, 244, 255));
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

        tabHoaDon1.addTab("Hóa đơn", jPanel4);

        javax.swing.GroupLayout pnlHoaDon2Layout = new javax.swing.GroupLayout(pnlHoaDon2);
        pnlHoaDon2.setLayout(pnlHoaDon2Layout);
        pnlHoaDon2Layout.setHorizontalGroup(
            pnlHoaDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        pnlHoaDon2Layout.setVerticalGroup(
            pnlHoaDon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        tabHoaDon1.addTab("Thêm", pnlHoaDon2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 4));

        btnThem2.setText("Thêm");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem2);

        btnSua1.setText("Sửa");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua1);

        btnXoa1.setText("Xóa");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa1);

        btnMoi1.setText("Mới");
        btnMoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnMoi1);

        btnFirst1.setBackground(new java.awt.Color(204, 204, 255));
        btnFirst1.setText("|<");
        btnFirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst1);

        btnPrev1.setBackground(new java.awt.Color(204, 204, 255));
        btnPrev1.setText("<<");
        btnPrev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrev1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrev1);

        btnNext1.setBackground(new java.awt.Color(204, 204, 255));
        btnNext1.setText(">>");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext1);

        btnLast1.setBackground(new java.awt.Color(204, 204, 255));
        btnLast1.setText(">|");
        btnLast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnLast1);

        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("Tìm hóa đơn theo mã");

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
                            .addComponent(jTextField2))
                        .addGap(18, 18, 18)))
                .addComponent(tabHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPNActionPerformed

    private void txtMaNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhaCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhaCCActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
//        insert();
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
//        update();
    }//GEN-LAST:event_btnSua1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
//        delete();
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnMoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi1ActionPerformed
        // TODO add your handling code here:
//     /
    }//GEN-LAST:event_btnMoi1ActionPerformed

    private void btnFirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst1ActionPerformed
        // TODO add your handling code here:
//        first();
    }//GEN-LAST:event_btnFirst1ActionPerformed

    private void btnPrev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrev1ActionPerformed
        // TODO add your handling code here:
//        prev();
    }//GEN-LAST:event_btnPrev1ActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
//        next();
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnLast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast1ActionPerformed
//        last();
    }//GEN-LAST:event_btnLast1ActionPerformed

    private void txtNgayTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTaoActionPerformed

    private void lblThemSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemSanPhamMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblThemSanPhamMouseClicked
    public class CustomTableCellRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            ((JComponent) cellComponent).setBackground((Color.white));
            ((JComponent) cellComponent).setForeground((Color.black));
            Border border = BorderFactory.createMatteBorder(2, 2, 3, 2, new Color(51,204,255));
            ((JComponent) cellComponent).setBorder(border);
            return cellComponent;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst1;
    private javax.swing.JButton btnLast1;
    private javax.swing.JButton btnMoi1;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrev1;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnThanhToan2;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblSoLuong7;
    private javax.swing.JLabel lblSoLuong8;
    private javax.swing.JLabel lblThemSanPham;
    private javax.swing.JPanel pnlHoaDon2;
    private javax.swing.JTabbedPane tabHoaDon1;
    private com.raven.swing.table.Table table1;
    private com.raven.swing.table.Table table2;
    private javax.swing.JTextField txtMaNhaCC;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtNgayTao;
    // End of variables declaration//GEN-END:variables
}
