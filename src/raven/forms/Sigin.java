package raven.forms;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D;

public class Sigin extends JPanel {

    public Sigin() {
        init();
    }

    private void init() {
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
        });
        setLayout(new MigLayout("wrap,fillx,insets 45 45 50 45", "[fill]"));
        JLabel title = new JLabel("Đăng ký", SwingConstants.CENTER);
        JTextField txtUsername = new JTextField();
        JTextField txtEmail = new JTextField();

        JPasswordField txtPassword = new JPasswordField();
        JPasswordField txtPassword2 = new JPasswordField();

//        JCheckBox chRememberMe = new JCheckBox("Ghi nhớ cho lần sau?");
        JButton cmdLogin = new JButton("Tạo tài khoản");
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10");
        txtUsername.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0");
        txtEmail.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0");
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0;"
                + "showRevealButton:true");
        txtPassword2.putClientProperty(FlatClientProperties.STYLE, ""
                + "margin:5,10,5,10;"
                + "focusWidth:1;"
                + "innerFocusWidth:0;"
                + "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Component.accentColor;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập tài khoản");
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập địa chỉ email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập mật khẩu");
        txtPassword2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Vui lòng nhập lại mật khẩu");

        add(title);
        add(new JLabel("Tên đăng nhập"), "gapy 20");
        add(txtUsername);
        add(new JLabel("Email"), "gapy 20");
        add(txtEmail);
        add(new JLabel("Mật khẩu"), "gapy 10");
        add(txtPassword);
        add(new JLabel("Nhập lại mật khẩu"), "gapy 10");
        add(txtPassword2);
//        add(chRememberMe);
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
}
