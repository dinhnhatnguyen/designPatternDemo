package com.NhatNguyen.Adapter.ConhNhanLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class congNhanReader {
    public static List<CongNhan> readFromFile(String filename) throws IOException {
        List<CongNhan> lst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;

            // Tách chuỗi: họ tên,ngày vào làm
            String[] info = line.split(",");
            if (info.length < 2)
                continue;

            String hoTen = info[0];
            String stNgayVaoLam = info[1];

            var dmy = stNgayVaoLam.split("/");
            int d = Integer.parseInt(dmy[0]);
            int m = Integer.parseInt(dmy[1]);
            int y = Integer.parseInt(dmy[2]);
            var ngayVaoLam = LocalDate.of(y, m, d);

            CongNhan x = new CongNhan(hoTen, ngayVaoLam);
            lst.add(x);
        }
        br.close();

        return lst;
    }
}
