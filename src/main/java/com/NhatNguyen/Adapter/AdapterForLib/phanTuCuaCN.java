package com.NhatNguyen.Adapter.AdapterForLib;

import com.NhatNguyen.Adapter.ConhNhanLib.CongNhan;

import java.time.LocalDate;

public class phanTuCuaCN implements PhanTu{
    private CongNhan cn;

    public phanTuCuaCN(CongNhan cn) {
        this.cn = cn;
    }

    @Override
    public String getDanhGia() {
        var ngayVaoLam = cn.getNgayVaoLam();
        var currentDate = LocalDate.now();
        var thamNien = currentDate.getYear() - ngayVaoLam.getYear() + 1;

        if (thamNien > 20)
            return "A";
        else if (thamNien > 10)
            return "B";
        else if (thamNien > 5)
            return "C";
        else if (thamNien >= 3)
            return "D";
        else
            return "X";
    }

    @Override
    public String getLoaiPhanTu() {
        return "CN";
    }

    @Override
    public String getTen() {
//		return cn.getHoTen();
        var namVaoLam = cn.getNgayVaoLam().getYear();
        return String.format("%s (%d)", cn.getHoTen(), namVaoLam);
    }
}
