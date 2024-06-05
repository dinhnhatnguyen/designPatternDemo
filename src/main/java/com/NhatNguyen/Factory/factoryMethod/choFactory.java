package com.NhatNguyen.Factory.factoryMethod;

public class choFactory extends ConVatFactory {

    @Override
    public DongVat getConVat() {
        return new cho();
    }
}
