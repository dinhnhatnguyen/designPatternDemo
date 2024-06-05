package com.NhatNguyen.Factory.factoryMethod;

public class gaFactory extends ConVatFactory{
    @Override
    public DongVat getConVat() {
        return new ga();
    }
}
