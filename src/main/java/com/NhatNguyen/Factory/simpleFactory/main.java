package com.NhatNguyen.Factory.simpleFactory;

public class main {
    public static void main(String[] args) {
        DongVat x = null;
        ConVatFactory f = new ConVatFactory();

        x = f.getConVat("ga");

        x.keu();
    }
}
