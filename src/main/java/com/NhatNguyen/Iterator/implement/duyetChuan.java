package com.NhatNguyen.Iterator.implement;

import com.NhatNguyen.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class duyetChuan implements Iterator {
    private List<Integer> lst;
    int index = 0;
    public duyetChuan(List<Integer> lst) {
        this.lst = new ArrayList<>();
        lst.forEach(x ->{
            this.lst.add(x);
        });
    }
    @Override
    public void start() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < lst.size();
    }

    @Override
    public int next() {
        var x = lst.get(index);
        this.index++;
        return x;
    }
}
