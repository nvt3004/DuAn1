package com.raven.ultils;

import com.raven.model.ModelNhanVien;

public class Auth {

    public static ModelNhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isAdmin() {
        return Auth.isLogin() && user.getVaiTro().equals("Quản lý");
    }

    public static boolean isThuNgan() {
        return Auth.isLogin() && user.getVaiTro().equals("Nhân viên thu ngân");
    }

    public static boolean isKho() {
        return Auth.isLogin() && user.getVaiTro().equals("Nhân viên kho");
    }
}
