package com.NhatNguyen.Decorator.deco;

import com.NhatNguyen.Decorator.component.Cafe;

public class sugarDeco extends cafeDeco{

    @Override
    public double cost() {
        return this.cafe.cost() + 1000;
    }

    public sugarDeco(Cafe cafe) {
        this.cafe = cafe;
    }


    @Override
    public String getDescription() {
        return this.cafe.getDescription() + " đường";
    }
}
