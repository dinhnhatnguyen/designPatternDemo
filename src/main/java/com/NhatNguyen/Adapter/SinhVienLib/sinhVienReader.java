package com.NhatNguyen.Adapter.SinhVienLib;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sinhVienReader {
    public static List<SinhVien> readFromFile(String filename) throws IOException {
        List<SinhVien> lst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;

            // Tách chuỗi: mã sinh viên,họ tên,điểm trung bình
            String[] info = line.split(",");
            if (info.length < 3)
                continue;

            String maSinhVien = info[0];
            String hoTen = info[1];
            String stDiemTrungBinh = info[2];
            double diemTrungBinh = Double.parseDouble(stDiemTrungBinh);

            SinhVien x = new SinhVien(maSinhVien, hoTen, diemTrungBinh);
            lst.add(x);
        }
        br.close();

        return lst;
    }
}
