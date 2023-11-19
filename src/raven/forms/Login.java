package raven.forms;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Login extends JPanel {

    JTextField txtUsername = new JTextField();
    JTextField svValue = new JTextField();
    JTextField dbValue = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    JButton cmdLogin = new JButton("Đăng nhập");

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
        JCheckBox chRememberMe = new JCheckBox("Ghi nhớ cho lần sau?");
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
        add(cmdLogin, "gapy 30");

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
                
                writeToFile(username, password, serverValue, databaseValue);
                com.raven.main.Main.main(null);
            }
        });
    }

    private static void writeToFile(String username, String password, String serverValue, String databaseValue) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("connect.dat"))) {
            // Ghi dữ liệu vào file
            writer.write(username + "\n");
            writer.write(password + "\n");
            writer.write(serverValue + "\n");
            writer.write(databaseValue + "\n");

            System.out.println("Dữ liệu đã được ghi vào userData.dat");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
