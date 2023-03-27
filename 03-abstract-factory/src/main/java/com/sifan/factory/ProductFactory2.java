package com.sifan.factory;

import com.sifan.product.producta.AbstractProductA;
import com.sifan.product.producta.ProductA2;
import com.sifan.product.productb.AbstractProductB;
import com.sifan.product.productb.ProductB2;

public class ProductFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
