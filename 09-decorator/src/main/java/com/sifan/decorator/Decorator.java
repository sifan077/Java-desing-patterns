package com.sifan.decorator;

import com.sifan.component.MilkTea;

public abstract class Decorator implements MilkTea {

    protected MilkTea milkTea;

    public Decorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription();
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice();
    }
}
