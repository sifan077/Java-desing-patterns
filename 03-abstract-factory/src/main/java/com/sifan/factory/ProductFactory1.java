package com.sifan.factory;

import com.sifan.product.producta.AbstractProductA;
import com.sifan.product.producta.ProductA1;
import com.sifan.product.productb.AbstractProductB;
import com.sifan.product.productb.ProductB1;

public class ProductFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
