package com.sifan;

/**
 * 奥迪汽车,实现顶级父类车
 *
 * @author 思凡
 * @date 2023/03/25
 */
public class AudiCar implements Car{
    @Override
    public void drive() {
        System.out.println("奥迪汽车启动");
    }
}
