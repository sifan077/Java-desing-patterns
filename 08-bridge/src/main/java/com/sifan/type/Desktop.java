package com.sifan.type;

import com.sifan.brand.Brand;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    public String info() {
        return super.info() + "台式电脑";
    }
}
