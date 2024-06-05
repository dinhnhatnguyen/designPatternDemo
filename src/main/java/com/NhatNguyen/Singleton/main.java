package com.NhatNguyen.Singleton;

import com.NhatNguyen.Singleton.dao.sinhVienDao;
import com.NhatNguyen.Singleton.model.SinhVien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class main {
    static String connectReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/NhatNguyen/Singleton/config.ini"));
        String st = br.readLine();
        br.close();
        return st;
    }

    static void inDanhSach(List<SinhVien> lst) {
        for (int i = 0; i < lst.size(); i++) {
            var x = lst.get(i);
            System.out.printf("%3d %6s %30s %5s %s\n",
                    i + 1,
                    x.getMaSinhVien(),
                    x.getHoTen(),
                    x.isGioiTinhNam() ? "Nam" : "Nữ",
                    x.getNgaySinh());
        }
    }
    public static void main(String[] args) throws IOException, SQLException {
        String connectionString = connectReader();
        sinhVienDao sinhVienDao = new sinhVienDao(connectionString);

        List<SinhVien> lst = sinhVienDao.getAllSinhVien();
        System.out.println("Danh Sách ");
        inDanhSach(lst);

        SinhVien sv = new SinhVien();
        sv.setMaSinhVien("hiiii");
        sv.setHoTen("Con Cac tao ne haha");
        sv.setGioiTinhNam(true);
        sv.setNgaySinh(new Date(2003,18,8));

        sinhVienDao.insertSinhVien(sv);

        lst = sinhVienDao.getAllSinhVien();
        System.out.println("Danh Sách sau khi insert ");
        inDanhSach(lst);

        sinhVienDao.deleteSinhVien("hihi");
        lst = sinhVienDao.getAllSinhVien();
        System.out.println("_______________________");
        inDanhSach(lst);

    }
}
