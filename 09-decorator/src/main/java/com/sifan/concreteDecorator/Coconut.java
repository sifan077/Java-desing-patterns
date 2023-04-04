package com.sifan.concreteDecorator;

import com.sifan.component.MilkTea;
import com.sifan.decorator.Decorator;

public class Coconut extends Decorator {

    private String description = "添加椰果";

    public Coconut(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getDescription() {
        return description+milkTea.getDescription();
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice()+5;
    }
}
