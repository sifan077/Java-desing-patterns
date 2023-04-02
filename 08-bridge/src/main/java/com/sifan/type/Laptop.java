package com.sifan.type;

import com.sifan.brand.Brand;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    public String info() {
        return super.info() + "笔记本电脑";
    }
}
