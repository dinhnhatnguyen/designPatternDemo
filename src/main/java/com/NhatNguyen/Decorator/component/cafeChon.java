package com.NhatNguyen.Decorator.component;

public class cafeChon extends Cafe{
    @Override
    public double cost() {
        return 50000;
    }

    public cafeChon() {
        this.type = "cafe Chồn";
    }
}
