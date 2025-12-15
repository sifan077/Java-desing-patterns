package com.sifan;

/**
 * 生产车的工厂
 *
 * @author 思凡
 * @date 2023/03/25
 */
public class Factory {

    /**
     * 使用枚举创建汽车 - 类型安全的方式
     *
     * @param type 类型
     * @return {@link Car}
     */
    public static Car createCar(CarType type) {
        if (type == null) {
            throw new IllegalArgumentException("Car type cannot be null");
        }
        
        switch (type) {
            case AUDI:
                return new AudiCar();
            case BENZ:
                return new BenzCar();
            case VW:
                return new VWCar();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
    
    /**
     * 保留原有方法，但添加更好的异常处理
     *
     * @param type 类型字符串
     * @return {@link Car}
     */
    public static Car createCar(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Car type cannot be null or empty");
        }
        
        try {
            CarType carType = CarType.valueOf(type.toUpperCase());
            return createCar(carType);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown car type: " + type, e);
        }
    }
}
