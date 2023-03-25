package com.sifan;

/**
 * vwcar 大众汽车，实现顶级父类接口
 *
 * @author 思凡
 * @date 2023/03/25
 */
public class VWCar implements Car {
    @Override
    public void drive() {
        System.out.println("大众汽车启动");
    }
}
