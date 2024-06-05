package com.NhatNguyen.Decorator;

import com.NhatNguyen.Decorator.component.Cafe;
import com.NhatNguyen.Decorator.component.cafeChon;
import com.NhatNguyen.Decorator.deco.sugarDeco;

public class main {
    public static void main(String[] args) {
        Cafe x;
        x = new cafeChon();
//        System.out.println("giá: " + x.cost());
//        System.out.println(" mô tả: " + x.getDescription());

        x = new sugarDeco(x);
        System.out.println("giá: " + x.cost());
        System.out.println(" mô tả: " + x.getDescription());
    }
}
