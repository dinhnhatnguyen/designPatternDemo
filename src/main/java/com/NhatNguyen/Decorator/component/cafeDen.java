package com.NhatNguyen.Decorator.component;

public class cafeDen extends Cafe{

    @Override
    public double cost() {
        return 25000;
    }

    public cafeDen() {
        this.type = "cafe Đen";
    }
}
