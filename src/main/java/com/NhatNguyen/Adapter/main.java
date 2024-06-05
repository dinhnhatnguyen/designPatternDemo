package com.NhatNguyen.Adapter;

import com.NhatNguyen.Adapter.AdapterForLib.PhanTu;
import com.NhatNguyen.Adapter.AdapterForLib.phanTuCuaCN;
import com.NhatNguyen.Adapter.AdapterForLib.phanTuCuaSV;
import com.NhatNguyen.Adapter.ConhNhanLib.CongNhan;
import com.NhatNguyen.Adapter.ConhNhanLib.congNhanReader;
import com.NhatNguyen.Adapter.SinhVienLib.SinhVien;
import com.NhatNguyen.Adapter.SinhVienLib.sinhVienReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<SinhVien> lstSinhVien = sinhVienReader.readFromFile("src/main/java/com/NhatNguyen/Adapter/sinhvien.txt");
//        for (int i = 0; i < lstSinhVien.size(); i++) {
//            System.out.println(lstSinhVien.get(i).getHoTen());
//        }

        List<CongNhan> lstCongNhan = congNhanReader.readFromFile("src/main/java/com/NhatNguyen/Adapter/congnhan.txt");
//        for (var x: lstCongNhan)
//            System.out.println(x.getHoTen() + " ngày vào làm " + x.getNgayVaoLam());

        var lst = new ArrayList<PhanTu>();

        for(var cn: lstCongNhan) {
            lst.add(new phanTuCuaCN(cn));
        }

        for(var sv: lstSinhVien) {
            lst.add(new phanTuCuaSV(sv));
        }

        System.out.println("Danh sách");
        int stt = 0;

        for (var x: lst)
            System.out.printf("%4d %-40s %-10s %3s\n", ++stt, x.getTen(), x.getLoaiPhanTu(), x.getDanhGia());

//        lst.sort(Comparator.comparing(PhanTu::getDanhGia));


        System.out.println("Danh sách sau khi sắp xếp theo đánh giá");

        for (var x: lst)
            System.out.printf("%4d %-40s %-10s %3s\n", ++stt, x.getTen(), x.getLoaiPhanTu(), x.getDanhGia());
    }
}
