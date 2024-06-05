package com.NhatNguyen.Factory.factoryMethod;

public class main {
    public static void main(String[] args) {
        DongVat x;
        ConVatFactory f;

        f = new choFactory();

        x = f.getConVat();

        x.keu();

    }
}
