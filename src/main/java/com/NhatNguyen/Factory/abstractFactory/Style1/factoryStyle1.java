package com.NhatNguyen.Factory.abstractFactory.Style1;

import com.NhatNguyen.Factory.abstractFactory.dongVatAnCo;
import com.NhatNguyen.Factory.abstractFactory.dongVatAnThit;
import com.NhatNguyen.Factory.abstractFactory.dongVatFactory;

public class factoryStyle1 extends dongVatFactory {
    @Override
    public dongVatAnCo taoDongVatAnCo() {
        return new De();
    }

    @Override
    public dongVatAnThit taoDongVatAnThit() {
        return new Soi();
    }
}
