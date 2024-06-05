package com.NhatNguyen.Factory.abstractFactory.Style2;

import com.NhatNguyen.Factory.abstractFactory.dongVatAnCo;
import com.NhatNguyen.Factory.abstractFactory.dongVatAnThit;

public class soi implements dongVatAnThit {
    @Override
    public void duoi(dongVatAnCo x) {
        System.out.println("Con sói rượt ");
        x.chay();
    }
}
