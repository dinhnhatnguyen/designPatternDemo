package com.NhatNguyen.Iterator;

import com.NhatNguyen.Iterator.implement.duyetChuan;
import com.NhatNguyen.Iterator.implement.duyetSoDuong;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();

        x.add(1);
        x.add(2);
        x.add(100);
        x.add(-1340);
        x.add(135);
        x.add(12);
        x.add(-4);
        x.add(5);

        Iterator iterator;

        iterator = new duyetSoDuong(x);
        iterator.start();
        while (iterator.hasNext()) {
            int e = iterator.next();
            System.out.printf("%d ", e);
        }

    }
}
