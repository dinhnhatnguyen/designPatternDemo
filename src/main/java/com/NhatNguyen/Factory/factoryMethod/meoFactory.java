package com.NhatNguyen.Factory.factoryMethod;

public class meoFactory extends ConVatFactory{
    @Override
    public DongVat getConVat() {
        return new meo();
    }
}
