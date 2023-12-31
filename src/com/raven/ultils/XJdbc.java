package com.raven.ultils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class XJdbc {

    static String svValue = "";
    static String dbValue = "";

//    static String driver = SQLServerDriver.class.getName();
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    static String dburl = "jdbc:sqlserver://" + svValue + ":1433;databaseName=" + dbValue + ";trustServerCertificate=true;";

//    static String dburl = "jdbc:sqlserver://;instanceName=SQLEXPRESS;databaseName=ShopQuaLuuNiem;trustServerCertificate=true";
    static String user = "sa";
    static String pass = "30042004";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        try (BufferedReader reader = new BufferedReader(new FileReader("connect.dat"))) {
            // Đọc dữ liệu từ file
            svValue = reader.readLine();
            dbValue = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        dburl = "jdbc:sqlserver://" + svValue + ":1433;databaseName=" + dbValue + ";trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }

        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = XJdbc.getStmt(sql, args);
        return stmt.executeQuery();
    }

    public static void update(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
