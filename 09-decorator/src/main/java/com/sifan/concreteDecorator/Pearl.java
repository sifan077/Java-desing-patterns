package com.sifan.concreteDecorator;

import com.sifan.component.MilkTea;
import com.sifan.decorator.Decorator;

public class Pearl extends Decorator {

    private String description = "添加珍珠";

    public Pearl(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getDescription() {
        return description + milkTea.getDescription();
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice() + 3;
    }
}
