package com.NhatNguyen.Iterator.implement;

import com.NhatNguyen.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class duyetVTChan implements Iterator {
    private List<Integer> lst;
    int index = 0;

    public duyetVTChan(List<Integer> lst) {
        this.lst = new ArrayList<>();
        for (int i = 0; i < lst.size(); i+=2) {
            lst.add(lst.get(i)+1);
        }
    }

    @Override
    public void start() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.lst.size() - 1;
    }

    @Override
    public int next() {
        var x = this.lst.get(this.index);
        this.index++;
        return x;
    }
}
