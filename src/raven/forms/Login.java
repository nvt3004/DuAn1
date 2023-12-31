package raven.forms;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import com.raven.dao.NhanVienDAO;
import com.raven.model.ModelNhanVien;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import raven.components.HeaderButton;

public class Login extends JPanel {

    NhanVienDAO nvdao = new NhanVienDAO();

    JTextField txtUsername = new JTextField();
    JTextField svValue = new JTextField();
    JTextField dbValue = new JTextField();
    JLabel fogetPass = new JLabel("Quên mật khẩu");
    JPasswordField txtPassword = new JPasswordField();
    JButton cmdLogin = new JButton("Đăng nhập");
    JCheckBox chRememberMe = new JCheckBox("Ghi nhớ cho lần sau?");

    HeaderButton explore = new HeaderButton("Quên mật khẩu");

    public Login() {
        init();
        DangNhap();
    }

    private void init() {
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
        });
        setLayout(new MigLayout("wrap,fillx,insets 45 45 50 45", "[fill]"));
        JLabel title = new JLabel("Đăng nhập", SwingConstants.CENTER);
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10");
        txtUsername.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0");
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0;"
                + "showRevealButton:true");
        svValue.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0");
        dbValue.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0");
        fogetPass.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +1;"
                + "foreground:#0077CC;");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Component.accentColor;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập tài khoản");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập mật khẩu");
        svValue.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập localhost");
        dbValue.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập tên CSDL");

        add(title);
        add(new JLabel("Tên đăng nhập"), "gapy 20");
        add(txtUsername);
        add(new JLabel("Mật khẩu"), "gapy 10");
        add(txtPassword);
        add(new JLabel("Server"), "gapy 10");
        add(svValue);
        add(new JLabel("Tên Database"), "gapy 10");
        add(dbValue);
        add(chRememberMe, "gapy 10");
        add(fogetPass, "gapy 30");
        add(cmdLogin, "gapy 10");

        try (BufferedReader reader = new BufferedReader(new FileReader("connect.dat"))) {
            // Đọc dữ liệu từ file
            svValue.setText(reader.readLine());
            dbValue.setText(reader.readLine());
            txtUsername.setText(reader.readLine());
            txtPassword.setText(reader.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int arc = UIScale.scale(20);
        g2.setColor(getBackground());
        g2.setComposite(AlphaComposite.SrcOver.derive(0.6f));
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arc, arc));
        g2.dispose();
        super.paintComponent(g);
    }

    public void DangNhap() {
        cmdLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                String serverValue = svValue.getText();
                String databaseValue = dbValue.getText();

                if (chRememberMe.isSelected()) {
                    writeToFile(username, password, serverValue, databaseValue);
                }

                ModelNhanVien nhanVien = nvdao.selectByIdMK(username);
                if (nhanVien != null && password.equals(nhanVien.getMatKhau())) {
                    com.raven.main.Main.main(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
                }
            }
        });
//        fogetPass.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                explore.getActionListeners()[0].actionPerformed(null);
//            }
//        });
    }



    private static void writeToFile(String username, String password, String serverValue, String databaseValue) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("connect.dat"))) {
            // Ghi dữ liệu vào file
            writer.write(serverValue + "\n");
            writer.write(databaseValue + "\n");
            writer.write(username + "\n");
            writer.write(password + "\n");

            System.out.println("Dữ liệu đã được ghi vào userData.dat");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
