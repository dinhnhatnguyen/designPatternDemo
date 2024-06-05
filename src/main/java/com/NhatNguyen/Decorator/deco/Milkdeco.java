package com.NhatNguyen.Decorator.deco;

import com.NhatNguyen.Decorator.component.Cafe;

public class Milkdeco extends cafeDeco{
    @Override
    public double cost() {
        return this.cafe.cost() + 2000;
    }


    @Override
    public String getDescription() {
        return this.cafe.getDescription() + " Sữa";
    }

    public Milkdeco(Cafe cafe) {
        this.cafe = cafe;
    }


}
