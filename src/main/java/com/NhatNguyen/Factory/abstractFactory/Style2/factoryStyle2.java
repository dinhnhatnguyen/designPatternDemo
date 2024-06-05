package com.NhatNguyen.Factory.abstractFactory.Style2;

import com.NhatNguyen.Factory.abstractFactory.dongVatAnCo;
import com.NhatNguyen.Factory.abstractFactory.dongVatAnThit;
import com.NhatNguyen.Factory.abstractFactory.dongVatFactory;

public class factoryStyle2 extends dongVatFactory {
    @Override
    public dongVatAnCo taoDongVatAnCo() {
        return new tho();
    }

    @Override
    public dongVatAnThit taoDongVatAnThit() {
        return new soi();
    }
}
