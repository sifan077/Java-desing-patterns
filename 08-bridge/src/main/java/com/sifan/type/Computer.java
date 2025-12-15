package com.sifan.type;

import com.sifan.brand.Brand;

public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public String info() {
        return this.brand.info();
    }
}


