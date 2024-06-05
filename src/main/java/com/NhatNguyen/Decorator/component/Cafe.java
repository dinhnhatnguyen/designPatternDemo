package com.NhatNguyen.Decorator.component;

public abstract class Cafe {
    String type;

    public String getDescription(){
        return this.type;
    }
    public abstract double cost();
}
