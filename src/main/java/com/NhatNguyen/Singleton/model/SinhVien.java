package com.NhatNguyen.Singleton.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private boolean gioiTinhNam;
    private Date ngaySinh;
}
