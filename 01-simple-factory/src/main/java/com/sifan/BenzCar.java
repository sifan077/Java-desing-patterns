package com.sifan;

/**
 * 奔驰汽车,实现顶级类
 *
 * @author 思凡
 * @date 2023/03/25
 */
public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("奔驰汽车启动");
    }
}
