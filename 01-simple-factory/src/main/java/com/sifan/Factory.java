package com.sifan;

import java.util.Objects;

/**
 * 生产车的工厂
 *
 * @author 思凡
 * @date 2023/03/25
 */
public class Factory {

    /**
     * 创建汽车
     *
     * @param type 类型
     * @return {@link Car}
     */
    public static Car createCar(String type) {
        if (Objects.isNull(type) || type.trim().isEmpty()) throw new IllegalArgumentException();
        if (type.equals("audi")) return new AudiCar();
        else if (type.equals("benz")) return new BenzCar();
        else if (type.equals("vw")) return new VWCar();
        else return null;
    }
}
