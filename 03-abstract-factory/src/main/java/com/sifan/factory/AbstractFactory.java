package com.sifan.factory;

import com.sifan.product.producta.AbstractProductA;
import com.sifan.product.productb.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
