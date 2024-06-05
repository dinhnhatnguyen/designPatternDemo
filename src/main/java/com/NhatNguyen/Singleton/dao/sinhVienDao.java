package com.NhatNguyen.Singleton.dao;

import com.NhatNguyen.Singleton.model.SinhVien;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class sinhVienDao {
    private String connectionString;

    public sinhVienDao(String connectionString) {
        this.connectionString = connectionString;
    }

    private Connection _cnn = null;

    private Connection getConnection() throws SQLException {
        if (_cnn == null) {
            _cnn = DriverManager.getConnection(connectionString);
        }
        return _cnn;
    }

    public List<SinhVien> getAllSinhVien() throws SQLException {
        List<SinhVien> sinhVienList = new ArrayList<>();

        // create connection
        Connection cnn= this.getConnection();
        // create statement
        Statement stmt = cnn.createStatement();

        // create query

        String sql = "SELECT * FROM sinhvien";
        // Execute query
        ResultSet rs = stmt.executeQuery(sql);

        // push query result into sinhVienList
        while (rs.next()) {
            SinhVien sinhVien = new SinhVien(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getBoolean(3),
                    rs.getDate(4)
            );
            sinhVienList.add(sinhVien);
        }
        stmt.close();
        rs.close();
        return  sinhVienList;
    }

    public boolean insertSinhVien(SinhVien sinhVien) throws SQLException {
        Connection cnn= this.getConnection();
        Statement stmt = cnn.createStatement();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String stNgaySinh = sdf.format(sinhVien.getNgaySinh());
        String query = String.format(
                "INSERT INTO SinhVien (MaSinhVien, HoTen, GioiTinhNam, NgaySinh) "
                        + "VALUES ('%s', N'%s', %d, '%s')",
                sinhVien.getMaSinhVien(),
                sinhVien.getHoTen(),
                sinhVien.isGioiTinhNam() ? 1 : 0,
                stNgaySinh// x.getNgaySinh()
        );
        int n = stmt.executeUpdate(query);

        // 4. giải phóng rsc
        stmt.close();
//		cnn.close();

        return n > 0;
    }

    public boolean deleteSinhVien(String maSinhVien) throws SQLException {
        Connection cnn = this.getConnection();

        // Sử dụng PreparedStatement thay vì Statement
        String query = "DELETE FROM sinhvien WHERE MaSinhVien = ?";
        PreparedStatement pstmt = cnn.prepareStatement(query);
        pstmt.setString(1, maSinhVien);

        int n = pstmt.executeUpdate(); // Thực thi câu lệnh DELETE với PreparedStatement
        pstmt.close(); // Đóng PreparedStatement

        return n > 0;
    }


}
