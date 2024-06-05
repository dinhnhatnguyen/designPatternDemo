package com.NhatNguyen.Factory.abstractFactory;

import com.NhatNguyen.Factory.abstractFactory.Style1.factoryStyle1;
import com.NhatNguyen.Factory.abstractFactory.Style2.factoryStyle2;

public class main {
    public static void main(String[] args) {
        dongVatAnCo ac;
        dongVatAnThit at;
        dongVatFactory f;
        f = new factoryStyle2();
        at = f.taoDongVatAnThit();
        ac = f.taoDongVatAnCo();

        at.duoi(ac);
    }
}
