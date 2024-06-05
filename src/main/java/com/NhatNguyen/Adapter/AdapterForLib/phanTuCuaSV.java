package com.NhatNguyen.Adapter.AdapterForLib;


import com.NhatNguyen.Adapter.SinhVienLib.SinhVien;

public class phanTuCuaSV implements PhanTu{
    private SinhVien SV;
    public phanTuCuaSV(SinhVien SV) {
        this.SV = SV;
    }

    @Override
    public String getDanhGia() {
        double dtb = SV.getDiemTrungBinh();
        if (dtb > 8.5)
            return "A";
        else if (dtb > 7.5)
            return "B";
        else if (dtb > 6.5)
            return "C";
        else if (dtb >= 4)
            return "D";
        else
            return "X";
    }

    @Override
    public String getLoaiPhanTu() {
        return "SV";
    }

    @Override
    public String getTen() {
        return String.format("%s (%.1f)", SV.getHoTen(), SV.getDiemTrungBinh());
    }
}
