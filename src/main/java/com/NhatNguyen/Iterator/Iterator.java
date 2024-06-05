package com.NhatNguyen.Iterator;

public interface Iterator {
    // khởi động bộ lặp
    void start();

    // kiểm tra xem có ptử phía sau?
    boolean hasNext();

    // lấy giá trị ptử hiện tại & dịch ra sau
    int next();
}
