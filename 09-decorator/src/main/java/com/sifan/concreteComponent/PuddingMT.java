package com.sifan.concreteComponent;

import com.sifan.component.MilkTea;

public class PuddingMT implements MilkTea {

    private String description = "布丁奶茶";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 12;
    }
}
