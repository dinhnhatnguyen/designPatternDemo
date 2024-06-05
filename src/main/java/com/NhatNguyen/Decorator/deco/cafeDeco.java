package com.NhatNguyen.Decorator.deco;

import com.NhatNguyen.Decorator.component.Cafe;

public abstract class cafeDeco extends Cafe {
    protected Cafe cafe;

    public Cafe getCafe() {
        return this.cafe;
    }

    public abstract String getDescription();


}

