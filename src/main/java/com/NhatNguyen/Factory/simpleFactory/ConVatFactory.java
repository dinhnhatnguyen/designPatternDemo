package com.NhatNguyen.Factory.simpleFactory;

public class ConVatFactory {
    public DongVat getConVat(String loai) {
        if (loai == "meo") {
            return new meo();
        } else if (loai == "cho") {
            return new cho();
        } else if (loai == "ga") {
            return new ga();
        }
        return null;
    }
}