package com.NhatNguyen.Iterator.implement;

import com.NhatNguyen.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class duyetSoDuong implements Iterator {
    private List<Integer> lst;
    int index = 0;

    public duyetSoDuong(List<Integer> lst) {
        this.lst = new ArrayList<>();
        lst.forEach(x -> {
            if(x >= 0) {
                this.lst.add(x);
            }
        });
    }

    @Override
    public void start() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.lst.size()-1;
    }

    @Override
    public int next() {
        var x = this.lst.get(this.index);
        this.index++;
        return x;
    }

}
