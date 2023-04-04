package com.sifan.concreteComponent;

import com.sifan.component.MilkTea;

public class ChocolateMT implements MilkTea {

    private String description = "巧克力奶茶";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 15;
    }
}
